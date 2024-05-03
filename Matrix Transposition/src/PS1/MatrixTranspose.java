/*
Brandon Gurley
2/6/2023
CIS 481
Problem 1-5 Java Code
*/

package PS1;

import java.util.concurrent.atomic.AtomicInteger;

public class MatrixTranspose implements Runnable {
    private static AtomicInteger finish = new AtomicInteger(0);
    private int taskID;

    public MatrixTranspose() {}
    public MatrixTranspose(int i) { taskID = i; }

    public void run() {
        String s = "";
        long begTest = new java.util.Date().getTime();
        System.out.println("Start Worker Process " + taskID);

        for (int i = 0; i < 35000; i++) s = s + 'x';

        Double secs = new Double((new java.util.Date().getTime() - begTest)*0.001);
        System.out.println("End Worker " + taskID + " [Run time " + secs + " secs]");
        finish.getAndAdd(1);  // atomic action
    }

    public static void main(String[] args) {
        int P = 4;
        int n = 12;
        //int row =2, column=3;
        int[][] matrixA = { {2,3,4}, {5,6,4} };
        int[][] matrixB = { {2,3,4}, {5,6,4} };
        
        //int[][] transposed = new int[column][row];
        Thread[] worker = new Thread[P+1]; // worker[0] is not used
        long begTest = new java.util.Date().getTime();

        for (int w=1; w<=P; w++) {
            worker[w] = new Thread(new MatrixTranspose(w));
            worker[w].start();
            int first = (w*1)*(n/P);
            int last = (first+(n/P)-1);
            int[][] transposed = new int[n][n];
            for(int i = first; i<=last; i++)
            {
            	for(int j = 0; j<n; j++)
            	{
            		transposed[i][j] = 0;
            		for (int k = 0; k<n; k++)
            		{
            			transposed[i][j] = transposed[i][j]+(matrixA[i][k]*matrixB[k][j]);
            		}
            	}
            	
            }
        }

        // Wait until all threads have finished
        while (finish.get() != P) { Thread.yield(); }

        Double secs = new Double((new java.util.Date().getTime() - begTest)*0.001);
        System.out.println("** Total run time " + secs + " secs");
    }
}