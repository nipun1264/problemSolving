/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrankproblems;

import java.util.ArrayList;

public class graph {
    private int vertices;
    private ArrayList<Integer>[] adjacencyList;

    public graph(int vertices) {
        this.vertices = vertices;
        this.adjacencyList = new ArrayList[vertices];
        for (int i = 0; i < vertices; i++) {
            adjacencyList[i] = new ArrayList<>();
        }
    }

    public void addEdge(int source, int destination) {
        adjacencyList[source].add(destination);
        adjacencyList[destination].add(source); // for undirected graph
    }

    public void DFS(int startVertex) {
        boolean[] visited = new boolean[vertices];
        dfsRecursive(startVertex, visited);
    }

    private void dfsRecursive(int vertex, boolean[] visited) {
        visited[vertex] = true;
        System.out.print(vertex + " ");

        for (int neighbor : adjacencyList[vertex]) {
            if (!visited[neighbor]) {
                dfsRecursive(neighbor, visited);
            }
        }
    }

    public static void main(String[] args) {
        int numberOfVertices = 6;
        graph graph = new graph(numberOfVertices);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.addEdge(2, 5);

        System.out.println("Depth-First Search starting from vertex 0:");
        graph.DFS(0);
    }
}
