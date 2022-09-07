package algorithms;

public class GridDfs {

    private static final int n = 3, m = 3;
    private static final boolean[][] vis = new boolean[4][4];
    private static final int[] dx = {-1, 0, 1, 0}; // UP, RT, DO, LE
    private static final int[] dy = {0, 1, 0, -1}; // UP, RT, DO, LE

    public static void main(String[] args) {
        //dfs(1,1);
        shortDfs(1,1);
    }

    private static boolean isValid(int x, int y) {
        if(x < 1 || x > n || y < 1 || y > m)
            return false;
        return !vis[x][y];
    }

    private static void dfs(int x, int y) {
        vis[x][y] = true;
        System.out.println(x + "--" + y);

        // UP
        if (isValid(x, y))
            dfs(x-1, y);

        // RIGHT
        if (isValid(x, y+1))
            dfs(x, y+1);

        // DOWN
        if (isValid(x+1, y))
            dfs(x+1, y);

        // LEFT
        if (isValid(x, y-1))
            dfs(x, y-1);
    }

    private static void shortDfs(int x, int y) {
        vis[x][y] = true;
        System.out.println(x+","+y);

        for (int i = 0; i < 4; i++) {
            if (isValid(x + dx[i], y + dy[i]))
                shortDfs(x + dx[i], y + dy[i]);
        }
    }
}
