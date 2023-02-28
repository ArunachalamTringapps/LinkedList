package org.example;

import java.util.Scanner;

class SNode
{
    int data;
    SNode next;
    SNode(int d)
    {
        data=d;
    }

}

class Stack
{
    SNode push(int d, SNode head){

        SNode tmp1 = new SNode(d);

        if(head!=null) {
            tmp1.next=head;
        }

        head=tmp1;
        return head;
    }


    SNode pop(SNode head){

        if(head==null)
            System.out.println("underflow");
        else
            head=head.next;
        return head;
    }


    void display(SNode head){

        System.out.println("\n list is : ");
        if(head==null){

            System.out.println("no LNodes");

            return;
        }

        SNode tmp=head;

        while(tmp!=null){

            System.out.print(tmp.data+" ");

            tmp=tmp.next;


        }
    }

    boolean isEmpty(SNode head)
    {
        return head == null;
    }

    int peek(SNode head)
    {
        if(head==null)
            return -1;
        return head.data;
    }

}


public class StackMain {

    public static void firstname()
    {
        Stack s=new Stack();
        SNode head=null;
        Scanner in=new Scanner(System.in);

        do
        {System.out.println("\n******** MENU *******");
            System.out.println("\n1.PUSH");
            System.out.println("\n2.POP");
            System.out.println("\n3.PEEK");
            System.out.println("\n4 IS EMPTY");
            System.out.println("\n5 DISPLAY");
            System.out.println("\n6.EXIT");
            System.out.println("\n enter ur choice : ");
            switch (in.nextInt()) {
                case 1 -> {
                    System.out.println("\nenter the value ");
                    head = s.push(in.nextInt(), head);
                }
                case 2 -> head = s.pop(head);
                case 3 -> System.out.println("\n top element : " + s.peek(head));
                case 4 -> System.out.println("\n is empty : " + s.isEmpty(head));
                case 5 -> s.display(head);
                case 6 -> System.exit(0);
                default -> System.out.println("\n Wrong Choice!");
            }
            System.out.println("\n do u want to cont... ");
        }while(in.nextInt()==1);

    }
}

