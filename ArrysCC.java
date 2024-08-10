import java.util.*;

public class ArrysCC {
    

    public static void  updateArray(int marks[]){
             for(int i=0;i<marks.length;i++){
                marks[i]=marks[i]+1;
             }
    }

    //Linear Search
    public static int linearSearch(int numbers[] ,int key){
         for(int i=0;i<numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }
         }
         return -1;
    }

    public static int largestnumber(int numbers[]){
        int largestNumber= Integer.MIN_VALUE;
        int smallest =Integer.MAX_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>largestNumber){
                largestNumber=numbers[i];
            }

            if(numbers[i] <smallest){
                smallest=numbers[i];
            }
        }

        System.out.println("Smallest value is " + smallest);
        return largestNumber;
    }

    public static int binarySearch(int numbers[], int key){
        int start=0 , end=numbers.length-1;
        
        while(start<=end){
            int mid=(start+end)/2;
          if(numbers[mid]==key){
            return mid;
          }
          if(numbers[mid]<key){
            start=mid+1;
          }else{
            end=mid-1;
          }
        }
        return -1;
    }

    public static void reversearray(int numbers[]){
        int first=0; int last= numbers.length-1;

        while(first <=last){
            int temp=numbers[last];
            numbers[last]=numbers[first];
            numbers[first]=temp;
            first++;
            last--;
        }
    }

    public static void PrintPairs(int numbers[]){
        for(int i=0;i<=numbers.length-1;i++){
            int current=numbers[i];
            for(int j=i+1;j<=numbers.length-1;j++){
                System.out.print("("+ current + " ,"+ numbers[j]+")");

            }
            System.out.println();
        }
    }

    public static void printSubarrys(int numbers[]){
      int currsum=0;
      int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            int start=i;
            for(int j=0;j<numbers.length;j++){
                int end=j; currsum=0;
                for(int k=start;k<=end;k++){
                  currsum+=numbers[k];
                  
                }
                System.out.println(currsum);
                if(maxSum< currsum){
                    maxSum=currsum;
                }
                
                
            }
        
        }
        System.out.println("maximum sum of Subarrays is " + maxSum );
    }

    //Trapping Rainwater 

    public static int trappedRainwater(int height[]){
        int n= height.length;
        
        //Calculate Left MAx boundary 
         int leftMax[] = new int [n];
         leftMax[0]=height[0];
         for(int i=0;i<n;i++){
            leftMax[i]=Math.max(height[i],leftMax[i-1]);
         }



        //calculate  Right Max Boundary
         int rightMax[] = new int[n];
         rightMax[n-1] = height[n-1];
         for(int i=n-2;i>=0;i--){
            rightMax[i]=Math.max(height[i],rightMax[i+1]);
         }

        //loop
        int waterlevel;
        int trappedrainwater=0;
        for(int i=0;i<n-1;i++){
                //water Level =min(leftMax bound , rightmax bound)
          waterlevel=Math.min(leftMax[i],rightMax[i]);


           // Trapped water = waterlevel-height[i]
  
          trappedrainwater += waterlevel - height[i];
        }
     return trappedrainwater;


    }

    public static void main(String args[]){

        // int marks[] = new int[50] ;

        // int numbers[] ={1,2,3};
         
        // int moreNumbers[] ={4,5,6};

       /* 
        int numbers[] ={2,3,6,8,10,12,14,16};
        int key=10;

        int index=linearSearch(numbers, key);
        if(index==-1){
            System.out.println("NOT Found");
        }else{
            System.out.println("Key is at index :" + index);
        }*/


        // int numbers[]={1,26,7,9,35};
        // int larger =largestnumber(numbers);

        // System.out.println("Largest Number is " + larger);


        // int numbers[] ={1,-2,6,-1,3};
    //     int key=56;
    //     int index =binarySearch(numbers,key);
    //     if(index==-1){
    //         System.out.print("Number is not present");
    //     }else{
    //     System.out.println("The present at index "+ index );
    // }

    //   reversearray(numbers);
    //   for(int i=0;i<=numbers.length-1;i++){
    //     System.out.print(numbers[i]+" ");
    //   }

    // PrintPairs(numbers);
 
    //  printSubarrys(numbers);
    int height[] ={4,2,0,6,3,5};

    System.out.println(trappedRainwater(height) );

}
}
