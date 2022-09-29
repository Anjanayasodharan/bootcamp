package com.Nest.hotel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Coffeshop {
    public static void main(String[] args) {
        Items fooditems = new Items(10, 12, 8, 15);
        Items TakeAway = new Items(10, 12, 15, 14);
        // ArrayList<String> buyed = new ArrayList<>();
        ArrayList<String> items = new ArrayList<>();
        ArrayList<Integer> pro = new ArrayList<>();
        // ArrayList<Integer> pro1 = new ArrayList<>();
        HashMap<String, String> map = new HashMap<String, String>();
        ArrayList<String> transaction = new ArrayList<>();
        int choice;
        int choice1;
        // int p; string.value.int
        // int total = 0;
        items.add("1: tea");
        items.add("2: coffee");
        items.add("3: idli");
        items.add("4: dosa");
        items.add("5: exit");
        // System.out.println("1 : dinning");
        // System.out.println("2 : takeaway");
        // System.out.println("3 : Billing");

        // System.out.println(items);
        outer:
        while (true) {
            System.out.println("1 : dinning");
            System.out.println("2 : takeaway");
            System.out.println("3 : Billing");

            System.out.println(items);
            Scanner obj = new Scanner(System.in);
            System.out.println("enter the option you need above");
            choice = obj.nextInt();
            // choice1 = obj.nextInt();
            Scanner name = new Scanner(System.in);
            // System.out.println("enter the name of customer");
            // String names = name.next();
            // map.put("CustomerName:", names);

            Random rand = new Random();
            int customerNumber = rand.nextInt(10000, 100000);
            map.put("CustomerNumber:", String.valueOf(customerNumber));

            switch (choice) {
                case 1:
                    System.out.println("Dinning");
                    while (true) {
                        // System.out.println("Dinning");
                        System.out.println("enter the items you need");
                        choice1 = obj.nextInt();
                        switch (choice1) {
                            case 1:
                                // Scanner pur = new Scanner(System.in);
                                System.out.println("enter the quantity");
                                int buy = obj.nextInt();
                                int p = buy * fooditems.getTea();
                                // System.out.println(p);
                                // total = total + p;
                                pro.add(p);
                                // buyed.add("tea");
                                // map.put("Total:", String.valueOf(p));
                                // transaction.add(String.valueOf(map));
                                // System.out.println("item purchased" + buyed);
                                // System.out.println("item total price" + pro);
                                break;
                            case 2:
                                System.out.println("enter the quantity");

                                buy = obj.nextInt();
                                p = buy * fooditems.getCoffee();
                                // total = total + p;
                                pro.add(p);
                                // buyed.add("coffee");
                                //map.put("Total:", String.valueOf(p));
                                //transaction.add(String.valueOf(map));
                                // System.out.println("item purchased" + buyed);
                                // System.out.println("item total price" + pro);
                                break;
                            case 3:
                                System.out.println("enter the quantity");

                                buy = obj.nextInt();
                                p = buy * fooditems.getDosa();
                                // total = total + p;
                                pro.add(p);
                                // buyed.add("dosa");
                                //map.put("Total:", String.valueOf(p));
                                //transaction.add(String.valueOf(map));
                                // transaction.add(String.)
                                // System.out.println("item purchased" + buyed);
                                // System.out.println("item total price" + pro);
                                break;
                            case 4:
                                System.out.println("enter the quantity");
                                buy = obj.nextInt();
                                p = buy * fooditems.getIdli();
                                // total = total + p;
                                pro.add(p);
                                // buyed.add("idli");
                                //map.put("Total:", String.valueOf(p));
                                //transaction.add(String.valueOf(map));
                                // System.out.println("item purchased" + buyed);
                                // System.out.println("item total price" + pro);
                            case 5:
                                System.out.println("enter the name of customer");
                                String names = name.next();
                                map.put("CustomerName:", names);
                                System.out.println("Bill for "+ names);
                                int num = 0;
                                if (pro.size() == 0)
                                {
                                    System.out.println(pro.get(0));
                                    map.put("Total: ",String.valueOf(pro.get(0)));
                                    transaction.add(String.valueOf(map));

                                }
                                else {

                                    for (int i=0 ; i < pro.size() ; i++)
                                    {
                                        num = num + pro.get(i);
                                    }
                                    map.put("Total: ",String.valueOf(num) );
                                    transaction.add(String.valueOf(map));
                                    pro.clear();
                                    System.out.println(num);
                                }
                                // pro.clear();
                                continue outer;
                                // System.exit(0);
                            default:
                                System.out.println("Invalid Choice");
                                break;

                        }
                    }//break;
                    //break;
                case 2:
                    System.out.println("takeaway");
                    while(true)
                    {
                        System.out.println("enter the items you need");
                        choice1 = obj.nextInt();
                        switch (choice1) {
                            case 1:
                                System.out.println("enter the quantity");
                                // Scanner pur = new Scanner(System.in);
                                int buy = obj.nextInt();

                                int p = buy * TakeAway.getTea();
                                // total = total + p;
                                pro.add(p);
                                // buyed.add("tea");
                                //map.put("Total:", String.valueOf(p));
                                //transaction.add(String.valueOf(map));
                                //System.out.println("item purchased" + buyed);
                                // System.out.println("item total price" + pro);
                                break;
                            case 2:
                                System.out.println("enter the quantity");

                                buy = obj.nextInt();
                                p = buy * TakeAway.getCoffee();
                                // total = total + p;
                                pro.add(p);
                                // buyed.add("coffee");
                                //map.put("Total:", String.valueOf(p));
                                //transaction.add(String.valueOf(map));
                                // System.out.println("item purchased" + buyed);
                                // System.out.println("item total price" + pro);
                                break;
                            case 3:
                                System.out.println("enter the quantity");

                                buy = obj.nextInt();
                                p = buy * TakeAway.getDosa();
                                // total = total + p;
                                pro.add(p);
                                // buyed.add("dosa");
                                //map.put("Total:", String.valueOf(p));
                                //transaction.add(String.valueOf(map));
                                // System.out.println("item purchased" + buyed);
                                // System.out.println("item total price" + pro);
                                break;
                            case 4:
                                System.out.println("enter the quantity");
                                // Scanner pur = new Scanner(System.in);
                                buy = obj.nextInt();
                                p = buy * TakeAway.getIdli();
                                // total = total + p;
                                pro.add(p);
                                // buyed.add("idle");
                                //map.put("Total:", String.valueOf(p));
                                //transaction.add(String.valueOf(map));
                                // System.out.println("item purchased" + buyed);
                                // System.out.println("item total price" + pro);
                            case 5:
                                System.out.println("enter the name of customer");
                                String names = name.next();
                                map.put("CustomerName:", names);
                                System.out.println("Bill for "+ names);
                                int num = 0;
                                if (pro.size() == 0)
                                {
                                    System.out.println(pro.get(0));
                                    map.put("Total: ",String.valueOf(pro.get(0)));
                                    transaction.add(String.valueOf(map));

                                }
                                else {

                                    for (int i=0 ; i < pro.size() ; i++)
                                    {
                                        num = num + pro.get(i);
                                    }
                                    map.put("Total: ",String.valueOf(num));
                                    transaction.add(String.valueOf(map));
                                    pro.clear();
                                    System.out.println(num);
                                }
                                // pro.clear();
                                continue outer;
                            default:
                                System.out.println("Invalid Choice");
                                break;
                            // System.exit(0);
                        }
                    }
                case 3:
                    System.out.println("********** Total Billing **********");


                    System.out.println(transaction);

                    System.out.println(" ********* Visit again with the smile ********* ");
                    System.out.println(" ** Have a nice day ** ");

                    System.exit(0);
            }
        }
    }
}
