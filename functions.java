public class functions{

public static int multiply(int a, int b){
    int product=a*b;
    return product;
}


public static int factorial(int n){
    int fact=1;
    for(int i=1;i<=n;i++){
        fact=fact*i;
    }
    return fact;
}

public static int bincoff(int n,int r){

  int  n_fact=factorial(n);
    int  r_fact=factorial(r);
     int nmr=factorial(n-r);
    return n_fact/(r_fact*nmr);
}

public static boolean isPrime(int n){
    boolean isPrime=true;

    for(int i=2;i<=n-1;i++){
        if(n%i==0){
            isPrime=false;
            break;
        }
    }
    
    return isPrime;

    
}
public static void primesInRange(int n){
    for(int i=2;i<=n;i++){
        if(isPrime(i)){
            System.out.print(i+" ");
        }
    }
    System.out.println();
}

//Binary to Decimal 
//Binary Number Sytem 

public static void binToDec(int binNum){
    int myNum=binNum;
    int pow=0;
    int decNum=0;

    while(binNum>0){
        int lastDigit=binNum%10;
         decNum=decNum +(int)(lastDigit*Math.pow(2,pow));
         pow++;
         binNum /=10;
    }
    System.out.println("Decimal of " +myNum + "=" +decNum);
}

public static void DecTobin(int n){
int myNum=n;
int pow =0;
int binNum=0;
while(n>0){
    int rem=n%2;
    binNum=binNum+(int)(rem*Math.pow(10,pow));
    pow++;
    n=n/2;
}
System.out.println("Binary of " +  myNum +" is = " +binNum );
}
 public static void hollow_rectangle(int totRows,int totCols){
    for(int i=1;i<=totRows;i++){
        for(int j=1;j<=totCols;j++){
            if(i==1 || i==totRows || j==1  || j==totCols){
                //boundary cells
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
 }


public static void main(String args[]){
 int a=3;

//  int prod=multiply(a,b);
//  System.out.println("a*b=" + prod);
 int factorial=factorial(a);
 System.out.println("Factorial :"+ factorial);
 System.out.println(bincoff(5, 2));
 System.out.println(isPrime(5));
 primesInRange(20);
 binToDec(101);
 DecTobin(5);
 hollow_rectangle(5, 4);
    }
}