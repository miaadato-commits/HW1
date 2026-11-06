public class Assignment01Q05 {
    public static int findShortestPath(int[][] m, int i, int j) {
        int[] visited_nodes = new int [m[0].length];
        visited_nodes[i] = 1;
        int[] curr_neighbors = new int [m[0].length];
        curr_neighbors[i] = 1;
        int[] potential_neighbors = new int [m[0].length];
        int layer = 1;
        if (i==j) {
            return 0;
        }
        while(layer < m[0].length) {
            for(int v = 0; v < m[0].length; v++) {
                if(curr_neighbors[v] == 0) {
                    continue;
                }
                for(int g = 0; g < m[0].length; g++) {
                    if(m[v][g] == 1) {
                        if(visited_nodes[g] == 1) {
                            continue;
                        }
                        if(g == j) {
                            return layer;
                        }
                        potential_neighbors[g] = 1;
                        visited_nodes[g] = 1;
                    }  
                }
                curr_neighbors = potential_neighbors;
                potential_neighbors = new int[m[0].length];
            }
            layer++;
    }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 0, 1)); // -1
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 1, 1)); // 0
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,0}, {0,0,1,0}, {0,0,0,1}, {1,0,0,0}}, 0, 2)); // 2
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,1}, {0,0,0,1}, {0,0,0,0}, {0,0,1,0}}, 0, 2)); // 2
    }
}