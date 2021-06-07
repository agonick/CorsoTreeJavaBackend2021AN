package Isola;

public class Island {
 public static int area=0;
 public static int areaTemp=0;

    public static void main(String[] args) {
        int[][] mat= new int[][]{{0,0,0},{0,1,1},{0,0,0}};
        System.out.println(maxAreaOfIsland(mat));
    }
        public static int maxAreaOfIsland(int[][] grid) {
            for (int i=0;i<grid.length;i++){
                for(int j=0;j<grid[0].length;j++){
                    if(grid[i][j]==1)
                        area=Math.max(area,controllaAdiacenti(grid,i,j));



                }
            }
            return area;
        }

        public static int controllaAdiacenti(int[][] grid,int riga, int colonna){
            if (riga <0 || riga >= grid.length || colonna < 0 || colonna >= grid[0].length || grid[riga][colonna]==0)
                return 0;

            grid[riga][colonna]=0;

            return 1+ controllaAdiacenti(grid,riga+1,colonna)+controllaAdiacenti(grid,riga,colonna+1)+controllaAdiacenti(grid,riga-1,colonna)+controllaAdiacenti(grid,riga,colonna-1);


    }



}
