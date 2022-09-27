package com.Nest.hotel;

import java.util.Scanner;

    public class Items {
        static int total = 0;
        int tea;
        int juice;
        int cake;
        int Ice_cream;

        public static int getTotal() {
            return total;
        }

        public static void setTotal(int total) {
            Items.total = total;
        }

        public int getTea() {
            return tea;
        }

        public void setTea(int tea) {
            this.tea = tea;
        }

        public int getJuice() {
            return juice;
        }

        public void setJuice(int juice) {
            this.juice = juice;
        }

        public int getCake() {
            return cake;
        }

        public void setCake(int cake) {
            this.cake = cake;
        }

        public int getIce_cream() {
            return Ice_cream;
        }

        public void setIce_cream(int ice_cream) {
            Ice_cream = ice_cream;
        }

        public Items(int tea, int juice, int cake) {
            this.tea = tea;
            this.juice = juice;
            this.cake = cake;
        }
    }
