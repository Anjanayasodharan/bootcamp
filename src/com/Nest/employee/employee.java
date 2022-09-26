package com.Nest.employee;

import java.util.Scanner;

public class employee {
    public static void main(String[] args){
        int choice;
        while(true)
        {
            System.out.println("Select an option");
            System.out.println("1.Add employees");
            System.out.println("2.View employee");
            System.out.println("5.Exit");
            Scanner opt=new Scanner(System.in);
            choice=opt.nextInt();

            switch (choice)
            {
                case 1:
                    System.out.println("add employee");
                    break;
                case 2:
                    System.out.println("view employee");
                    break;
                case 3:
                    System.exit(0);
                    break;
            }
        }
    }
}


