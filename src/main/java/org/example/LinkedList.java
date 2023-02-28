package org.example;


import java.util.Scanner;

class LLNode{

    int data;
    LLNode next;

    LLNode(int data)
    {
        this.data=data;
        this.next=null;

    }
}


class LinkedList {

    LLNode head;


    LLNode insertInBeg(int key,LLNode head)
    {
        LLNode ttmp=new LLNode(key);

        if(head!=null) {
            ttmp.next=head;
        }

        head=ttmp;
        return head;
    }


    LLNode insertInEnd(int key,LLNode head)
    {
        LLNode ttmp=new LLNode(key);
        LLNode ttmp1=head;

        if(ttmp1==null)
            head=ttmp;
        else
        {
            while(ttmp1.next!=null)
                ttmp1=ttmp1.next;
            ttmp1.next=ttmp;

        }

        return head;

    }


    LLNode insertAtPos(int key,int pos,LLNode head)
    {
        LLNode ttmp=new LLNode(key);

        if(pos==1)
        {
            ttmp.next=head;
            head=ttmp;
        }
        else
        {
            LLNode ttmp1=head;
            for(int i=1;ttmp1!=null && i<pos;i++)
                ttmp1=ttmp1.next;
            if (ttmp1 != null) {
                ttmp.next=ttmp1.next;
                ttmp1.next=ttmp;
            }
        }

        return head;
    }


    LLNode delete(int pos,LLNode head)
    {
        LLNode ttmp=head;
        if(pos==1)
            head=ttmp.next;
        else
        {
            for(int i=1;ttmp!=null && i<pos-1;i++)
                ttmp=ttmp.next;
            if (ttmp != null) {
                ttmp.next=ttmp.next.next;
            }
        }
        return head;
    }

    int length(LLNode head)
    {
        LLNode ttmp=head;
        int c=0;
        if(ttmp==null)
            return 0;
        else
        {
            while(ttmp!=null)
            {	ttmp=ttmp.next;
                c++;
            }
        }
        return c;
    }



    void display(LLNode head)
    {
        LLNode ttmp=head;
        while(ttmp!=null)
        {System.out.print(ttmp.data+" ");
            ttmp=ttmp.next;
        }
    }

    public static void firstname()
    {
        LinkedList l=new LinkedList();
        l.head=null;
        Scanner in=new Scanner(System.in);
        do
        {
            System.out.println("\n********* MENU *********");
            System.out.println("\n1.Insert In End");
            System.out.println("\n2.Insert In Beg");
            System.out.println("\n3.Insert At A  Particular Pos");
            System.out.println("\n4.Delete At a Pos");
            System.out.println("\n5.Length");
            System.out.println("\n6.Display");
            System.out.println("\n7.EXIT");
            System.out.println("\nenter ur choice : ");
            int n=in.nextInt();
            switch (n) {
                case 1 -> {
                    System.out.println("\nenter the value ");
                    l.head = l.insertInEnd(in.nextInt(), l.head);
                }
                case 2 -> {
                    System.out.println("\nenter the value");
                    l.head = l.insertInBeg(in.nextInt(), l.head);
                }
                case 3 -> {
                    System.out.println("\nenter the value");
                    l.head = l.insertAtPos(in.nextInt(), in.nextInt(), l.head);
                }
                case 4 -> l.head = l.delete(in.nextInt(), l.head);
                case 5 -> System.out.println(l.length(l.head));
                case 6 -> l.display(l.head);
                case 7 -> System.exit(0);
                default -> System.out.println("\n Wrong Choice!");
            }
            System.out.println("\n do u want to cont...  Press 1" );
        }while(in.nextInt()==1);

    }
}
