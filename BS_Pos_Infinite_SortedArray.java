class Main {
  public static void main(String[] args) {
    System.out.println("2-D Array");
 
    System.out.println("Spiral Matrix!");
    int matrix[][]={
      {1,2,3,4},
      {5,6,7,8},
      {9,10,11,12},
      {13,14,15,16}
    };
    int n=matrix.length;
    int sr=0;
    int sc=0;
    int er=n-1;
    int ec=n-1;

    while(sr<=er && sc<=ec)
    {
      //top
      for(int c=sc;c<=ec;c++)
        {
          System.out.println(matrix[sr][c]+" ");
        }
      //side
      for(int r=sr;r<=er;r++)
        {
          System.out.println(matrix[r][ec]+" ");
        }
      for(int c=ec-1;c>=sc;c--)
        {
          System.out.println(matrix[er][c]+" ");
        }
      for(int r=er-1;r>=sr+1;r--)
        {
          System.out.println(matrix[r][sc]+" ");
        }
      sr++;
      sc++;
      ec--;
      er--;
        
    }


    System.out.println("Diagonal Sum!");
    int sum=0;
    for(int i=0;i<matrix.length;i++)
      {
        sum+=matrix[i][i];
        if(i!=matrix.length-i-1){
          sum+=matrix[i][matrix.length];
        }
      }System.out.println(sum);
      

    System.out.println("Search in sorted matrix!");
    int row=0;
    int col=matrix[0].length;
    while(row<matrix.length && col>=0)
      {
        if(matrix[row][col]==key){
          System.out.println("Got the key");
        }
        else if(key<matrix[row][col]){
          col--;
        }
        else{
          row++;
        }
      }   
  }

}