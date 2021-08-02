import java.util.LinkedList;
import java.util.Queue;

public class numIslands200 {
    //深度优先算法
    public int numIslands(char[][] grid) {
        if(grid==null||grid.length==0) return 0;
        int r=grid.length;
        int l=grid[0].length;
        int num_islands=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<l;j++){
                if(grid[i][j]=='1'){
                    num_islands++;
                    dfs(grid,i,j);
                }
            }
        }
        return num_islands;

    }

    public void dfs(char[][] grid,int r,int l){
        int[] dx={1,0,0,-1};
        int[] dy={0,1,-1,0};
        int nr=grid.length;
        int nl=grid[0].length;
        if(r<0||l<0||r>=nr||l>=nl||grid[r][l]=='0'){
            return;
        }
        grid[r][l] = '0';

        for(int x=0;x<dx.length;x++){
            int xr=r+dx[x];
            int xy=l+dy[x];
            dfs(grid,xr,xy);
        }

    }


    //广度优先算法

    //广度优先算法
    public int numIslands2(char[][] grid){
        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    bfs(grid, i, j);
                    count++;
                }
            }
        }
        return count;
    }

    private void bfs(char[][] grid,int i,int j){
        Queue<int[]> list=new LinkedList<>();
        list.add(new int[]{i,j});
        while(!list.isEmpty()){
            int[] cur=list.remove();
            i= cur[0];j=cur[1];
            if(0 <= i && i < grid.length && 0 <= j && j < grid[0].length && grid[i][j] == '1') {
                grid[i][j] = '0';
                list.add(new int[] { i + 1, j });
                list.add(new int[] { i - 1, j });
                list.add(new int[] { i, j + 1 });
                list.add(new int[] { i, j - 1 });
            }
        }
    }

}
