package com.Nest.employee;

import java.util.ArrayList;
import java.util.Scanner;

public class employee {
    public static void main(String[] args){
        int choice;
        String empName;
        ArrayList<String> empList =new ArrayList<>();



        while(true)
        {
            System.out.println("Select an option");
            System.out.println("1.Add employee");
            System.out.println("2.View employee");
            System.out.println("5.Exit");
            Scanner opt=new Scanner(System.in);
            choice=opt.nextInt();


            switch (choice)
            {
                case 1:
                    System.out.println("enter the name of employee");
                    empName=opt.next();
                    empList.add(empName);
                    break;
                case 2:
                    if(empList.size()==0)
                    {
                        System.out.println("no employees added");
                    }
                    else {
                        System.out.println(empList);
                    }
                    break;

                case 3:
                    System.exit(0);
                    break;
            }
        }
    }
}


