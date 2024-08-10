public class Sorting {

    public static void  bubbleSort(int arr[]){
           for(int i =0;i<=arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] =temp;
                }
            }
           }
    }

    public static void selectionSort(int arr[] ){
        for(int i=0;i<arr.length;i++){
            int minpos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minpos] >arr[j]){
                    minpos=j;
                }
            }

            int temp=arr[minpos];
            arr[minpos]=arr[i];
            arr[i]=temp;
        }
    }


    public static void CountingSort(int arr[]){
        int largest =Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest=Math.max(largest,arr[i]);
        }

        int count[] = new  int[largest+1];
        for(int i=0;i<arr.length;i++){
                   count[arr[i]]++;
        }

        int j=0;
        for(int i=0;i<count.length;i++){
             while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
             }
        }
    }

    public static void Insertionsort(int arr[]){
         for(int i=0;i<arr.length;i++){
            int curr=arr[i];
            int prev=i-1;


            //finding out the correct position to insert 
            while(prev >=0 && arr[prev] >curr){
                arr[prev+1] =arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
         }
    }
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    

    public static void main(String args[]){
        int arr[] ={5,4,1,3,2};
        CountingSort(arr);
        printArr(arr);
    }
}