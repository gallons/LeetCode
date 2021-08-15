import java.util.LinkedList;
import java.util.Queue;

public class shortestPathBinaryMatrix1091 {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n=grid.length;
        if(grid==null||grid.length==0||grid[0][0]!=0||grid[n-1][n-1]!=0) return -1;
        //定义8个方向
        int[][] dir={{1,-1},{1,0},{1,1},{0,-1},{0,1},{-1,-1},{-1,0},{-1,1}};
        //bfs
        Queue<int[]> queue=new LinkedList<>();
        queue.add(new int[]{0,0});//起点放入队列
        grid[0][0]=1;//阻塞起点
        int path=1;//层数
        while(!queue.isEmpty()){
            int size=queue.size();
            while(size-->0){
                int[] cur=queue.poll();
                int x=cur[0];
                int y=cur[1];
                //能放进队列里的都是为0可以走的（这一点在后面保证了）
                // 如果等于终点则返回
                if(x==n-1&&y==n-1){
                    return path;
                }
                for(int[] d:dir){
                    int x1=x+d[0];
                    int y1=y+d[1];
                    //过滤，判断是否能放入队列
                    if(x1<0||x1>=n||y1<0||y1>=n|| grid[x1][y1]==1){
                        continue;
                    }
                    queue.add(new int[]{x1,y1});
                    grid[x1][y1]=1;
                }
            }
            path++;
        }

        return -1;
    }
}
