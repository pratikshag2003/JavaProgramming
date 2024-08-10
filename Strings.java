import java.util.*;

public class Strings {

    public static void Letters( String str)
{
    for(int i=0;i<str.length();i++){
        System.out.print(str.charAt(i) + " ");

    }
    System.out.println();
}


public static boolean isPalindrome(String str){

   int n=str.length();
    for(int i=0; i< str.length()/2;i++){
        if(str.charAt(i)!= str.charAt(n-1-i)){
            //not  a palindrome
            return false;
        }
    }
    return true;



}

public static String substring(String str, int si,int ei ){
    String substring="";
    for(int i=0;i<ei;i++){
        substring+=str.charAt(i);
    }
    return substring;
}


public static String compress(String str){
   String newStr="";
    for(int i=0;i<str.length();i++){
        Integer count=1;
        while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)) {
            count++;
            i++;
        }
        newStr+= str.charAt(i);
        if(count>1){
            newStr+= count.toString();
        }

        }
        return newStr;
    }

  




     public static void main(String args[]){
        // char arr[] ={'a','b','c','d',};
        // String str="abcd";
        // String str2 =new String("xyz");


        //Strings are immutable

        // Scanner sc= new Scanner(System.in);
        // String name;
        // name = sc.nextLine();
        // System.out.println(name);

        //String Length
        // String fullname ="Tony stark";
        // System.out.println(fullname.length());



        //concarenation
    //     String firstName="Shardha";
    //     String lastName="Khapra";
    //     String fullName=firstName+ " " + lastName;
    //     System.out.println(fullName.charAt(1) );

    //     Letters(fullName);

//     String name="racecar";
//    if( isPalindrome(name)){
//     System.out.println("String is Palindrome");
//    }else{
//     System.out.println("String is not palindrome");
//    };

// String str = "HelloWorld";
// System.out.println(str.substring(0,6));
// System.out.println(substring(str, 0, 6));


//   String fruits[] ={"apple","mango","banana"};
//   String largest=fruits[0];
//   for(int i=1;i<fruits.length;i++){
//     if(largest.compareTo(fruits[i])< 0){
//      largest=fruits[i];
//     }
//   }
//   System.out.println(largest);


// StringBuilder sb = new StringBuilder("");

// for(char ch='a';ch<='z';ch++){
//     sb.append(ch);

// }
// System.out.println(sb);

String name = "aaabbbbccccccddddd";
System.out.println(compress(name));
   }
};

