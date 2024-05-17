/* Brandon Gurley
 * 5/6/2023
 * CSC 258
 * Graph Constructor Class
 * Time Taken: 30 Minutes
 */


import java.util.*;

// class for storing the edges of graph
class Edge {
	int source, dest, weight;
	Edge(int source, int dest, int weight) 
	{
		this.source = source;
		this.dest = dest;
		this.weight = weight;
	}
}

	// Graph Class
	class Graph {
		// ADJACENCY LIST NODE
		static class Node {
			int value;
			int weight;
			Node (int value, int weight)
			{
				this.value = value;
				this.weight = weight;
			}
		};
	//defining the actual adjanceny list
	List<List<Node>> adj_list = new ArrayList<>();
	
		// Graph Constructor
		public Graph(List<Edge> edges)
		{
			// adjacency list index/memory allocation
			for (int i = 0; i < edges.size(); i++)
			{
				adj_list.add(i, new ArrayList<>());
			}
			
			// adds edges to the graph
			for (Edge e : edges)
			{
				// allocates new node from source to destination node in the adjacency list
				adj_list.get(e.source).add(new Node(e.dest, e.weight));
			}
		}
	
		// Basic Print Function that prints from the edges of the Graph/ Adjacency List
		public static void printGraph(Graph graph)
		{
			int source_vertex = 0;
			int list_size = graph.adj_list.size();
			
			System.out.println(" This Graph Contains: ");
			while (source_vertex < list_size)
			{
				
				for (Node edge : graph.adj_list.get(source_vertex))
				{
					System.out.print("Vertex: " + source_vertex + " ==== " + edge.value + " (" + edge.weight + ")\t");
				}
				System.out.println();
				source_vertex++;
			}
		}
	}
	

	