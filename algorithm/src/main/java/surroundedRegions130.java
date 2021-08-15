import java.util.LinkedList;
import java.util.Queue;

public class surroundedRegions130 {
    //宽度优先算法bfs
    public void solve(char[][] board) {
        if(board==null||board.length==0) return;
        int n=board.length;
        int m=board[0].length;
        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};

        Queue<int[]> queue = new LinkedList<int[]>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                boolean issub=i==0||j==0||i==n-1||j==m-1;
                if(issub&&board[i][j]=='O'){
                    queue.offer(new int[]{i,j});
                    board[i][j]='A';
                }
            }
        }

        while(!queue.isEmpty()){
            int[] cell=queue.poll();
            int cx=cell[0];
            int cy=cell[1];
            for(int di=0;di<dx.length;di++){
                int mx=cx+dx[di];
                int my=cy+dy[di];
                if(mx>0&&mx<n&&my>0&&my<m&&board[mx][my]=='O'){
                    queue.offer(new int[]{mx,my});
                    board[mx][my]='A';
                }
            }

        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] == 'A') {
                    board[i][j] = 'O';
                } else if (board[i][j] == 'O') {
                    board[i][j] = 'X';
                }
            }
        }
    }
}
