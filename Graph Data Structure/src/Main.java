/* Brandon Gurley
 * 5/6/2023
 * CSC 258
 * Graph Main Class
 * Time Taken: 10 Minutes
 */


import java.util.Arrays;
import java.util.List;

class Main {
		
		public static void main (String[] args)
		{
			// defines the edges of the graph
			List<Edge> edges = Arrays.asList(new Edge(0, 1, 2), new Edge(0, 2,3), new Edge(1,2,3), new Edge(2, 1, 5), new Edge(2, 0, 5),
					new Edge(3, 2, 4), new Edge(3,1,5), new Edge(4,1, 5));
			
			// Calls Graph Constructor Class
			Graph graph = new Graph(edges);
			
			// Prints the Graph as undirected adjacency list
			Graph.printGraph(graph);
		}

	}