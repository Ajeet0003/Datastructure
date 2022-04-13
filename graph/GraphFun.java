package graph;

import java.io.*;
import java.util.*;

public class GraphFun {

	
	private int V;
	private LinkedList<Integer> adj[];

	GraphFun(int v) {
		V = v;
		adj = new LinkedList[v];
		for (int i = 0; i < v; ++i)
			adj[i] = new LinkedList();
	}

	void addEdge(int v, int y) {
		adj[v].add(y);
	}

	void breadthFirstSearch(int c) {
		boolean vst[] = new boolean[V];
		LinkedList<Integer> queue = new LinkedList<Integer>();
		vst[c] = true;
		queue.add(c);
		while (queue.size() != 0) {
			c = queue.poll();
			System.out.print(c + " ");
			Iterator<Integer> i = adj[c].listIterator();
			while (i.hasNext()) {
				int n = i.next();
				if (!vst[n]) {
					vst[n] = true;
					queue.add(n);
				}
			}
		}
	}

	public static void main(String args[]) {
		GraphFun g = new GraphFun(4);
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 2);
		g.addEdge(2, 0);
		g.addEdge(2, 3);
		g.addEdge(3, 3);
		System.out.println("Breadth First Traversal is " + "(starts from vertex Second)");
		g.breadthFirstSearch(2);
	}
}
