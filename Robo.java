/*
 * We can see that at every position robo can reach either from above or from left,
 * so ways at i, j will be equal to sum of ways (i+j)
 * from  i, j-1 and  and ways from  i-1, j
 */

/**
 *
 * @author ankit sharan
 */
 
 class Robo{
    public static void main(String args[]){
		
		RoboMovement roboMove = new RoboMovement();
		roboMove.movement(4,4);	
	}
 }
 
 class RoboMovement{
	 public void movement(int m, int n){
		 
        int[][] ways = new int[m][n];
        for (int i = 0; i < m; ++i)
         {
          for (int j = 0; j < n; ++j)
           {
             if(i == 0 && j == 0)
                ways[i][j] = 1;
             else if(i == 0)
                ways[i][j] = ways[i][j-1];
             else if(j == 0)
                ways[i][j] = ways[i-1][j];
             else
                ways[i][j] = ways[i-1][j] + ways[i][j-1];
           }
         }
		 //lets display the solution now
		 System.out.println("Number of unique ways for the robot to reach its destination is :  " +ways[m-1][n-1]);
		 System.out.println(" The unique number of ways to reach out each cell in grid  :");		 
   		 for (int row = 0; row < m; row ++)
		    {		 
              for (int col = 0; col < n; col++)
			   {
		         System.out.print(" " +ways[row][col]);
			   }
			  System.out.println("");
			}							
   }
 }
