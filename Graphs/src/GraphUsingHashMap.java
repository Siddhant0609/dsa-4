import java.util.HashMap;
import java.util.Map;

class Vertex {
	HashMap<String, Integer> neighbors = new HashMap<String, Integer>();
}

class Graph {
	HashMap<String, Vertex> vertices = new HashMap<String, Vertex>();
	
	public void addVertex(String vertexName) {
		Vertex vertex = new Vertex();
		vertices.put(vertexName, vertex);
	}
	
	public boolean isEdgeExist(String firstVertexName, String secondVertexName) {
		Vertex first = vertices.get(firstVertexName);
		Vertex second = vertices.get(secondVertexName);
		if(first == null || second == null || !first.neighbors.containsKey(secondVertexName)) {
			return false;
		}
		return true;
	}
	
	public void addEdge(String firstVertexName, String secondVertexName, int weight) {
		if(isEdgeExist(firstVertexName, secondVertexName)) {
			System.out.println("Edge Already Exists Between " + firstVertexName + " " + secondVertexName);
		}
		else {
			Vertex first = vertices.get(firstVertexName);
			Vertex second = vertices.get(secondVertexName);
			first.neighbors.put(secondVertexName, weight);
			second.neighbors.put(firstVertexName, weight);
		}
	}
	
	public void print() {
		for(Map.Entry<String, Vertex> currentVertex : vertices.entrySet()) {
			System.out.println("VName : " + currentVertex.getKey() + " Neighbour : " + currentVertex.getValue().neighbors);
		}
	}
	
}

public class GraphUsingHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph graph = new Graph();
		graph.addVertex("A");
		graph.addVertex("B");
		graph.addVertex("C");
		graph.addVertex("D");
		
		graph.addEdge("A", "B", 3);
		graph.addEdge("B", "C", 2);
		graph.addEdge("A", "D", 4);
		graph.addEdge("C", "D", 5);
		
		graph.print();
		
	}

}
