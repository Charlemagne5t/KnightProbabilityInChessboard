public class Solution {
    public double knightProbability(int n, int k, int row, int column) {

        return dfs(n, k, row, column);
    }

    private double dfs(int n, int k, int i, int j){
        if(i < 0 || i > n - 1 || j < 0 || j > n - 1){
            return 0.0;
        }
        if(k == 0){
            return 1.0;
        }

        double probability = 0.0;
        int[][] directions = {{-2, 1}, {-1, 2}, {1, 2}, {2, 1}, {2, -1}, {1, -2}, {-1, -2}, {-2, -1}};
        for (int[] direction: directions) {
            int nextI = i + direction[0];
            int nextJ = j + direction[1];
            probability += dfs(n, k - 1, nextI, nextJ);
        }

        return probability / 8;

    }
}
