package org.datastructures.code.Bro_Code;

/**UNDIRECTED (Example Social Media, Facebook )
 * and
 * DIRECTED GRAPH(Street Map)
 * **/

import java.util.ArrayList;

/**
 * ADJACENCY MATRIX: A 2D array to store 1's and 0's to represent edges of rows and columns of unique nodes
 * RUNTIME COMPLEXITY TO CHECK AN EDGE : O(1)
 * SPACE COMPLEXITY : O(V^2) - V= vertices**/
public class Graph {
    int [][] matrix;
    ArrayList<Node> nodes;

    Graph(int size){
        matrix=new  int[size][size];
        nodes=new ArrayList<>();
    }

    public void addNode(Node node){
        nodes.add(node);
    }
    public void  addEdge(int src, int dst){
        matrix[src][dst]=1;
    }

    public boolean checkEdge(int src,int dsc){
        return matrix[src][dsc] == 1;
    }
    public void print(){
        System.out.print("  ");
        for (Node node:nodes){
            System.out.print(node.data+" ");
        }
        System.out.println();

        for (int i = 0; i < matrix.length; i++) {
            System.out.print(nodes.get(i).data+" ");
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
