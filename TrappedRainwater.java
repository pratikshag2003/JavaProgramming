public class TrappedRainwater {
    

   /*  public static int trappedRainwater(int height[]){
        int n= height.length;
        
        //Calculate Left MAx boundary 
         int leftMax[] = new int [n];
         leftMax[0]=height[0];
         for(int i=1;i<n-1;i++){
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
    */


     public static int buyAndsellStocks(int prices[]){
        int buyPrice =Integer.MAX_VALUE;
        int maxprofit =0;

        for(int i=0;i<prices.length;i++){
            if(buyPrice <prices[i]){
                int profit=prices[i]-buyPrice;
                maxprofit=Math.max(maxprofit,profit);
            }else{
                buyPrice=prices[i];
            }

        }
        return maxprofit;

     }

    public static void main(String args[]){
          //  printSubarrys(numbers);
    // int height[] ={4,2,0,6,3,2,5};

    // System.out.print(trappedRainwater(height) );


    int  prices[] ={7,1, 5,3,6,4};
    System.out.println(buyAndsellStocks(prices));
}
}
