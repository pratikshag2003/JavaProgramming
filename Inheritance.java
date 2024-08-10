public class Inheritance{

    public static void main(String args[]){
        //  Dog dobby = new Dog();
        //  dobby.eat();

        //  Calculator cal = new Calculator();
        //  System.out.println(cal.sum(1,2));
        //  System.out.println(cal.sum(5.7f, 8.5f));
        //  System.out.println(cal.sum(1,4,7));

        Deer d = new Deer();
            d.eat();
        
        
    }
}


//Base class    
class Animal{
    String color;

    void eat(){
        System.out.println("eats");
    }

    void breathe(){
        System.out.println("breathes");
    }
}

class Deer extends  Animal{
      void eat(){
        System.out.println("eat grasp");
      }
}
// //Derived class  /subclass
// class Fish extends Animal{
//    int fins;

//    void swim(){
//     System.out.println("Swim");
//    }

// }

class Mammal extends Animal{
   void walk(){
    System.out.println("walks");
   }
}

class Fish extends Animal{
    void swim(){
        System.out.println("swim");
    }
}

class Bird extends Animal{
    void Fly(){
        System.out.println("Fly");
    }
}
class Dog extends Mammal{
    String breed;
}


class Calculator{
      int sum(int a ,int b){
          return a+b;
      }

      float sum(float a, float b){
        return a+b;
      }

      int sum(int a, int b, int c){
        return a+b+c;
      }
}

