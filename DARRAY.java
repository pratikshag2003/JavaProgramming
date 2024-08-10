import java.util.*;
public class DARRAY {
    
   public static boolean search (int matrix[][] ,int key ){
    
    for(int i=0;i< matrix.length;i++){
        for(int j=0;j<matrix[0].length;j++){
           if(matrix[i][j] ==key){
            System.out.println("found at index cell  (" +i+ "," + j +")");
            return true;
           }
        }
   }
   System.out.println("key not found");
   return false;

}

public static void SpriralMatrix(int matrix[][]){
    int startRow=0;
    int endRow=matrix.length-1;
    int startCol=0;
    int endCol=matrix[0].length-1;
    
    while(startRow <=endRow &&  startCol <=endCol){
   

    //top
    for(int i=startCol;i<=endCol;i++){
        System.out.print(matrix[startRow][i]+ " ");
    }
     
    //Right
    for(int i=startRow+1;i<=endRow;i++){
        System.out.print(matrix[i][endCol]+ " ");
    }


    //Bottom
    for(int i=endCol-1;i>=startCol;i--){
        if(startRow==endRow){
            break;
        }
        System.out.print(matrix[endRow][i]+ " ");
    }

    //Left
    for(int i=endRow-1;i>=startRow+1;i--){
        if(startCol==endCol){
            break;
        }
        System.out.print(matrix[i][startCol]+ " ");
    }
    startCol++;
    startRow++;
    endRow--;
    endCol--;

    }
};

    


 public static boolean SearchwithKey(int matrix[][] , int key ){
    int row =0;
    int col=matrix[0].length-1;


      while(row <matrix.length && col >=0){
        if(matrix[row][col]==key){
            System.out.println("Found Key at  (" + row + "," +col +")");
             return true;
        }
        else if (key < matrix[row][col]){
            col--;
        }
        else{
            row++;
        }
      }

      System.out.println("Key Not Found!");
    return false;
 }
    public static void main(String args[]){
           

        // int matrix[][] = new int[3][3];
        // Scanner sc= new Scanner(System.in);
        // int n =matrix.length;
        // int m=matrix[0].length;
        // System.out.print("Enter the elements int the array :");
        // for(int i=0;i< n;i++){
        //     for(int j=0;j<m;j++){
        //         matrix[i][j]= sc.nextInt();
        //     }
        // }
 

        // System.out.println("You have entered the elements in the array :");
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<m;j++){
        //         System.out.print(matrix[i][j]+ " ");
        //     }
        //     System.out.println();
        // }


        // search(matrix, 5);


        int matrix[][]={{10,20,30,40},
                        {15,25,35,45},
                        {27,29,37,48},
                        {32,33,39,50}
                            };

        // SpriralMatrix(matrix);

        SearchwithKey(matrix, 33);
    }
}
