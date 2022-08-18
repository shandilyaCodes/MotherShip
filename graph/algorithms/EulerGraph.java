package graph.algorithms;

import graph.GraphMaker;

import java.util.ArrayList;

public class EulerGraph {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> euler = GraphMaker.makeEulerGraph();
        ArrayList<ArrayList<Integer>> semiEuler = GraphMaker.makeSemiEulerGraph();
        ArrayList<ArrayList<Integer>> nonEuler = GraphMaker.makeNonEulerGraph();

        findIfEuler(euler);
        findIfEuler(semiEuler);
        findIfEuler(nonEuler);
    }

    private static void findIfEuler(ArrayList<ArrayList<Integer>> adj) {
        int res = findEuler(adj);
        if (res == 0)
            System.out.println("Non Euler");
        else if (res == 1)
            System.out.println("Semi Euler");
        else
            System.out.println("Euler");
    }

    private static int findEuler(ArrayList<ArrayList<Integer>> adj) {
        if (!isConnected(adj))
            return 0;

        int odd = 0;
        for (int i = 0; i < adj.size(); i++) {
            if (adj.get(i).size() % 2 != 0) {
                odd++;
            }
        }

        if (odd > 2) {
            return 0;
        }

        return (odd == 0) ? 2 : 1;
    }

    private static boolean isConnected(ArrayList<ArrayList<Integer>> adj) {
        boolean[] vis = new boolean[adj.size()];
        int node = -1;

        for (int i = 0; i < adj.size(); i++) {
            if (adj.get(i).size() > 0) {
                node = i;
                break;
            }
        }

        if (node == -1)
            return true;

        dfs(node, adj, vis);

        for (int i = 0; i < adj.size(); i++) {
            if (!vis[i] && adj.get(i).size() > 0) {
                return false;
            }
        }
        return true;
    }

    private static void dfs(int node, ArrayList<ArrayList<Integer>> adj, boolean[] vis) {
        vis[node] = true;
        for (Integer it : adj.get(node)) {
            if (!vis[it]) {
                dfs(it, adj, vis);
            }
        }
    }
}
