import java.util.*;
import java.util.LinkedList;
public class QueueB {

    // static class Stack{
    //     Deque<Integer>deque= new LinkedList<>();

    //     public void push(int data){
    //         deque.addLast(data);
    //     }

    //     public int pop(){
    //         return deque.removeLast();
    //     }

    //     public int peek(){
    //         return deque.getLast();
    //     }
    // }

    // static class Queue{
    //     Deque<Integer>deque= new LinkedList<>();

    //     public void add (int data){
    //         deque.addLast(data);
    //     }

    //     public int remove(){
    //         return deque.removeFirst();
    //     }

    //     public int peek(){
    //         return deque.getFirst();
    //     }
    // }

    static class  Stack{
        static Queue<Integer> q1= new LinkedList<>();
        static Queue<Integer> q2= new LinkedList<>();

          public  static boolean isEmpty(){
            return q1.isEmpty() && q2.isEmpty();
          }


          public static void push(int data){
            if(!q1.isEmpty()){
                q1.add(data);
            }else{
                q2.add(data);
            }
          }


          public static int pop(){
            if(isEmpty()){
                System.out.println("Empty stack");
                return -1;
            }
            int top=-1;

            if(!q1.isEmpty()){
                while(!q1.isEmpty()){
                    top=q1.remove();
                    if(q1.isEmpty()){
                        break;
                    }
                    q2.add(top);
                }
            }else{
                while(!q2.isEmpty()){
                    top=q2.remove();
                    if(q2.isEmpty()){
                        break;
                    }
                    q1.add(top);
                }
            }


            return top;
          }


          public static int peek(){
            if(isEmpty()){
                System.out.println("Empty stack");
                return -1;
            }
            int top=-1;

            if(!q1.isEmpty()){
                while(!q1.isEmpty()){
                    top=q1.remove();
                    q2.add(top);
                }
            }else{
                while(!q2.isEmpty()){
                    top=q2.remove();
                    q1.add(top);
                }
            }


            return top;
          }

    }

    

    


    //queue using stack
    // static class Queue{
    //     static Stack<Integer>s1= new Stack<>();
    //     static Stack<Integer>s2= new Stack<>();


    //     public static boolean isEmpty(){
    //         return s1.isEmpty();
    //     }

    //     public static void add(int data){
    //         while(!s1.isEmpty()){
    //             s2.push(s1.pop());
    //         }

    //         s1.push(data);


    //         while(!s2.isEmpty()){
    //             s1.push(s2.pop());
    //         }
    //     }

    //     //remove
    //     public static int remove(){
    //         if(isEmpty()){
    //             System.out.println("queue empty");
    //             return -1;
    //         }

    //         return s1.pop();
    //     }


    //     //peek
    //     public static int peek(){
    //         if(isEmpty()){
    //             System.out.println("queue empty");
    //             return -1;
    //         }

    //         return s1.peek();
    //     }


    // }

    public static void main(String args[]){
Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
