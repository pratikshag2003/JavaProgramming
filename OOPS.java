public class OOPS {
    

    public static void main(String args[]){
        // Pen p1 = new Pen();
        // p1.setColour("Blue");
        // System.out.println(p1.getcolor());
        // p1.setTip(5);
        // p1.setColour("Yellow");
        // System.out.println(p1.getTip());
        // System.out.println(p1.getcolor());


        // BankAcccount myAcc= new BankAcccount();
        // myAcc.username="shraddhakhapra";
        // myAcc.setPassword("abcdefhi");

        // Student s1 = new Student();
        // s1.name="shraddha";
        // s1.roll=456;
        // s1.marks[0]=100;
        // s1.marks[1]=90;
        // s1.marks[2]=80;

        // Student s2 = new Student(s1);  //copy
        // s2.password =  "xyz";
        // for(int i=0;i<3;i++){
        //     System.out.println(s2.marks[i]);
        // // }

        // Queen  q= new Queen();
        //  q.moves();

        Student s1 = new Student();
        s1.schoolName="JMV";

        Student s2= new Student();
        System.out.println(s2.schoolName);

    }
}


class Pen{
   private String color;
    private int tip;

    String getcolor(){
        return color;
    }

    int getTip(){
        return this.tip;
    }
    void setColour( String newColor){
        color=newColor;
    }

    void setTip(int newTip){
        tip=newTip;
    }
}


// class Student{
//     String name;
//     int roll;
//     String password;
//     int marks[];

//     //shallow copy consturctor
//     // Student(Student s1){
//     //     marks=new int[3];
//     //     this.name=s1.name;
//     //     this.roll=s1.roll;
//     //     this.marks=s1.marks;
//     // }

//     Student(){
//         System.out.println("Constructor is called....");
//     }


   
// }

class BankAcccount{
    public String username;
    private String password;

    public void setPassword(String pwd){
        password=pwd;
    }

}
interface Herbivore{

}

interface Carnivore{

}

class Bear implements Herbivore ,Carnivore{

}

interface ChessPlayer{
    void moves();
}

class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("up ,,down,left,right,diagonal(in all direction)");
    }
}

class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("up,down,left,right");
    }
}

class King implements ChessPlayer{
    public void moves(){
        System.out.println("up,down,left,right ,diagonal(by 1step)");
    }
}


class Student{
     String name ;
     int roll;
    
    
     static String schoolName;
   

     void setName(String name){
        this.name=name;
     }

     String getName(){
        return this.name;
     }

}