package com.Nest.hotel;

import java.util.ArrayList;
import java.util.Scanner;

public class Coffeshop {
    static int total;




    int tea, sweetPorotta, cake, juice, iceCream;

    public Coffeshop(int tea, int sweetPorotta, int cake, int juice, int iceCream) {
        this.tea = tea;
        this.sweetPorotta = sweetPorotta;
        this.cake = cake;
        this.juice = juice;
        this.iceCream = iceCream;
    }

    public int getTea() {
        return tea;
    }

    public int getSweetPorotta() {
        return sweetPorotta;
    }

    public int getCake() {
        return cake;
    }

    public int getJuice() {
        return juice;
    }

    public int getIceCream() {
        return iceCream;
    }
    public static void main(String[] args) {

        Coffeshop food = new Coffeshop(10, 15, 20, 10, 25);
        Coffeshop takeaway = new Coffeshop(15, 20, 25, 15, 30);
        int y;

        Scanner s = new Scanner(System.in);

        System.out.println("enter the choice");

        System.out.println("1. food");
        System.out.println("2.take away");
        System.out.println("3.exit");
        y=s.nextInt();

        switch(y)

        {

            case 1:
                while (true) {
                    System.out.println("\n\n\n1.Tea " + food.getTea());
                    System.out.println("2.juice " + food.getJuice());
                    System.out.println("3.cake " + food.getCake());
                    System.out.println("4.Sweet Porotta " + food.getSweetPorotta());
                    System.out.println("5.ice cream " + food.getIceCream());
                    System.out.println("6.BILL");
                    System.out.println("7.Clear BILL");
                    System.out.println("8.exit");
                    int m = s.nextInt();

                    switch (m) {
                        case 1:
                            System.out.println("how many quantity");
                            int l = s.nextInt();
                            total = (food.tea * l) + total;
                            break;
                        case 2:
                            System.out.println("how many quantity");
                            int p = s.nextInt();
                            total = (food.juice * p) + total;
                            break;
                        case 3:
                            System.out.println("how many quantity");
                            int q = s.nextInt();
                            total = (food.cake * q) + total;
                            break;
                        case 4:
                            System.out.println("how many quantity");
                            int w = s.nextInt();
                            total = (food.sweetPorotta * w) + total;
                            break;
                        case 5:
                            System.out.println("how many quantity");
                            int e = s.nextInt();
                            total = (food.iceCream * e) + total;
                            break;
                        case 6:

                            System.out.println("Total Bill :" + total);
                            break;
                        case 7:
                            total = 0;
                            System.out.println("Bill reseted");
                            break;
                        case 8:
                            System.exit(0);
                            break;
                        default:
                            System.out.println("invalid input");


                    }
                }
            case 2:
                while (true) {
                    System.out.println("\n\n\n1.Tea " + takeaway.getTea());
                    System.out.println("2.juice " + takeaway.getJuice());
                    System.out.println("3.cake " + takeaway.getCake());
                    System.out.println("4.Sweet Porotta " + takeaway.getSweetPorotta());
                    System.out.println("5.ice cream " + takeaway.getIceCream());
                    System.out.println("6.BILL");
                    System.out.println("7.Clear BILL");
                    System.out.println("8.exit");

                    int m = s.nextInt();

                    switch (m) {
                        case 1:
                            System.out.println("how many quantity");
                            int l = s.nextInt();
                            total = (food.tea * l) + total;
                            break;
                        case 2:
                            System.out.println("how many quantity");
                            int p = s.nextInt();
                            total = (food.juice * p) + total;
                            break;
                        case 3:
                            System.out.println("how many quantity");
                            int q = s.nextInt();
                            total = (food.cake * q) + total;
                            break;
                        case 4:
                            System.out.println("how many quantity");
                            int w = s.nextInt();
                            total = (food.sweetPorotta * w) + total;
                            break;
                        case 5:
                            System.out.println("how many quantity");
                            int e = s.nextInt();
                            total = (food.iceCream * e) + total;
                            break;
                        case 6:

                            System.out.println("Total Bill :" + total);
                            break;
                        case 7:
                            total = 0;
                            System.out.println("Bill reseted");
                            break;
                        case 8:
                            System.exit(0);
                            break;
                        default:
                            System.out.println("invalid input");

                    }
                }
            case 3:
                System.exit(0);
                break;

            default:
                System.out.println("invalid input");
        }
    }}