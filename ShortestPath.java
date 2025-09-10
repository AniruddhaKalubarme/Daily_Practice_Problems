import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ShortestPath {
    public static int findShortestPath(int v, int[][] edges, int start, int end) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }

        int[] distance = new int[v];
        Arrays.fill(distance, -1);

        Queue<Integer> queue = new LinkedList<>();

        distance[start] = 0;
        queue.add(start);

        while (!queue.isEmpty()) {
            int currentNode = queue.poll();

            if (currentNode == end) {
                return distance[end];
            }

            for (int neighbor : adj.get(currentNode)) {
                if (distance[neighbor] == -1) {
                    distance[neighbor] = distance[currentNode] + 1;
                    queue.add(neighbor);
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int v = 5;
        int[][] edges = {{0, 1}, {0, 2}, {1, 3}, {2, 3}, {3, 4}};
        int start = 0;
        int end = 4;

        int shortestPathLength = findShortestPath(v, edges, start, end);

        System.out.println("V = " + v);
        System.out.println("Edges = " + Arrays.deepToString(edges));
        System.out.println("Start = " + start);
        System.out.println("End = " + end);
        System.out.println("Output: " + shortestPathLength); // Expected output: 3
    }
}
