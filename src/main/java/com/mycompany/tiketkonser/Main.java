package com.mycompany.tiketkonser;

public class Main {
    public static void main(String[] args) {

            TransaksiTiket beli1 = new TransaksiTiket();
            beli1.setPembeli("Orang");
            beli1.setNIK(12864037);
            beli1.setBanyakBeli(2);
            
            System.out.println(beli1.getNama());

    }
}
