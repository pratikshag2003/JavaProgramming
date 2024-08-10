import java.util.*;

public class LinkedList {
    

    public static class Node{
        int data;
        Node next;

        public Node (int data){
            this.data=data;
            this.next=null;
        }

    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void  addFirst(int data){
        //Step 1 - Create a new Node
        Node newNode= new Node(data);
        size++;

        //if linked list is empty then  assign new node as head and tail
        if(head==null){
            head=tail=newNode;
            return;
        }
       //Step-2  NewNode next =head
        newNode.next=head;
       //Step 3- head= newNode
        head= newNode;


    }
   public void addLast(int data){
        //step 1 -create newNode 
        Node newNode = new Node(data);
        size++;
          if(head==null){
            head=tail=newNode;
            return;
          }
        //Step 2 - tail point to new Node
        tail.next= newNode;
        //step 3- NewNode next point to null
         tail=newNode;

    }

    public void add(int idx,int data){
        if(idx==0){
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        size++;
        Node temp=head;
        int i=0;

        while(i<idx-1){
            temp= temp.next;
            i++;
        }

        newNode.next=temp.next;
        temp.next= newNode;
    }

    public void printll(){ //(n)
        if(head==null){
            System.out.println("LL is Empty");
            return;
        }
        
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data +"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    //add,remove
    public int removeFirst(){
       if(size==0){
        System.out.println("LL is empty");
        return Integer.MIN_VALUE;
       } else if(size==1){
        int val= head.data;
        head=tail=null;
        size=0;
        return val;
       }
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }

    // public int removeLast(){
    //     if(size==0){
    //         System.out.println("LL is empty");
    //         return Integer.MIN_VALUE;

    //     }else if(size==1){
    //          int val =head.data;
    //          head=tail=null;
    //          size=0;
    //          return val;
    //     }
    //     //prev: i= size-2
    //     Node prev=head;
    //     for(int i=0;i<=;i++){
             
    //     }
    // }

    public int itrSearch(int key){  //O(n)
        Node temp =head;
        int i=0;

        while(temp!=null){
            if(temp.data==key){  //key found
                return i;
            }
            temp=temp.next;
            i++;
        }
         
        //key not found 
        return -1;
    }


    public Node findMid(Node head){
        Node slow= head;
        Node fast= head;

        while(fast!=null && fast.next!=null){
            slow= slow.next;
            fast=fast.next.next;
        }
        return slow;
    }


    public boolean checkPalindrome(){
        if(head== null || head.next==null){
             return true;
        }


        Node midNode=findMid(head);

        Node prev=null;
      Node curr=midNode;

        while(curr!=null){
           Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node right=prev;
        Node left=head;

        while(right!=null){
            if(left.data !=right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }

    public static boolean isDuplicate(String str){
        Stack<Character> s= new Stack<>();

        for(int i=0;i<str.length();i++){
            char ch= str.charAt(i);


            //closing
            if(ch==')'){
                int count=0;
                while( s.peek()!='('){
                    s.pop();
                    count++;
                }
                if(count<1){
                 return true;  //duplicate
                }else{
                    s.pop();
                }

            }else{
                s.push(ch); //opening pair
            }
        }

        return false;
    }


    public static void main (String args[]){
        LinkedList ll= new LinkedList();
       
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addLast(1);
        ll.addLast(2);
       
        ll.printll();  //
        System.out.println(ll.size);

        // System.out.println(ll.itrSearch(34));

        System.out.println(ll.checkPalindrome());
       
        
    }
}
