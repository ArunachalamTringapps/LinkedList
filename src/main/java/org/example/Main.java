package org.example;

import java.util.Scanner;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Logger l=Logger.getLogger(Main.class.getName());
        int ch;
        l.info("Welcome Guys");
        l.info("\n1.LinkedList\n2.Queue\n3.Stack");
        l.info("Enter your choice: ");
        ch=sc.nextInt();
        switch (ch){
            case 1 -> LinkedList.firstname();
            case 2 -> QueueDemoLL.firstname();
            case  3-> StackMain.firstname();
            default -> l.info("Thank you guys:)");
        }
    }
}
