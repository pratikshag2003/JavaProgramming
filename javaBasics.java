import java.util.*;
public class javaBasics{
    public static void main (String args[]){
//   int a=10;
//   int b=5;

// System.out.println(a);
//    System.out.println(b);

//     a =106;
//    System.out.println(a);


// byte b=8;
// System.out.println(b);
// char ch='a';
// System.out.println(ch);
// boolean var=false;
// float price=10.5;
// int number=25;
// short n = 240;


// int a=10;
// int b=5;
// int sum=a+b;
// System.out.println(sum);


//Reverse the given number 

 Scanner sc = new Scanner(System.in);
int n= sc.nextInt();
// int lastDigit;
// int rev=0;
// while(n>0){
//   lastDigit=n%10;
//   rev=10*rev+lastDigit;
//   n=n/10;
 
// }
// System.out.println(rev);
//     }

// for(int i=0;i<=n;i++){
//     for(int j=1;j<=n-i+1;j++){
//         System.out.print("*");
//     }
//     System.out.println();
// }

char ch='A';
for(int line=1;line<=n;line++){
    for(int star=1;star<=line;star++){
        System.out.print(ch);
        ch++;
    }
    System.out.println();
}
}
}
//Boilerplate Code