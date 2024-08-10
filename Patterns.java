public class Patterns {
    public static void halfpyramid(int n){
      for(int i=0;i<=n;i++){
        //Print Spaces 
        for(int j=0;j<=n-i;j++){
            System.out.print(" ");
        }

        //Print Stars
        for(int j=0;j<=i;j++){
            System.out.print("*");
        }

        System.out.println();
      }
    }


    //half Pyramis with numbers 
    public static void halfpyramidwithnumbers(int n){
        for(int i=1;i<=n;i++){
          //Print numbers 
         
          for(int j=1;j<=n-i+1;j++){
              System.out.print(j);
             
              
          }

          System.out.println();
        }
      }


    public static void exampattern(int n){
        int count=1;
        for(int i=1;i<=n;i++){
         for(int j=1;j<=Math.pow(2,i);j++){
            System.out.print(count);
            
         }
         System.out.println();
        }
    }

    public static void floyd_triangle(int n){
        int count=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }


    public static void triangle_with_0_1(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    public static void Butterfly(int n){
        //1st half
        for(int i=1;i<=n;i++){
           
            //Stars =i
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            //Spaces = 2*(n-i)
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }

            //Stars=i
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //2nd half
for(int i=n;i>=1;i--){
 //Stars =i
 for(int j=1;j<=i;j++){
    System.out.print("*");
}

//Spaces = 2*(n-i)
for(int j=1;j<=2*(n-i);j++){
    System.out.print(" ");
}

//Stars=i
for(int j=1;j<=i;j++){
    System.out.print("*");
}
System.out.println();
        }
    
    }


    public static void solid_rhombus(int n){
        for(int i=0;i<=n;i++){
            //For Spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //for stars
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

public static void hollow_rhombus(int n){
    for(int i=1;i<=n;i++){

        //For Spaces
        for(int j=0;j<n-i;j++){
            System.out.print(" ");
        }

        //For hollow Rectangle

        for(int j=0;j<=n;j++){
            if(i==1 || i==n || j==1 || j==n){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}

public static void Diamond(int n){
    
    //For first upper half
    for(int i=0;i<=n;i++){

        //Spaces -n-i
        for(int j=0;j<=n-i;j++){
            System.out.print(" ");
        }
        //Stars
        for(int j=0;j<(2*i-1);j++) {
            System.out.print("*");
        }
        System.out.println();

    }

    //For Second lower half
    for(int i=n;i>=1;i--){

        //Spaces -n-i
        for(int j=0;j<=n-i;j++){
            System.out.print(" ");
        }
        //Stars
        for(int j=0;j<(2*i-1);j++) {
            System.out.print("*");
        }
        System.out.println();

    }

}

    public static void main(String args[]){
//    Butterfly(5);
// solid_rhombus(5);
// hollow_rhombus(5);
Diamond(5);

    }

}
