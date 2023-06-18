package com.mycompany.tiketkonser;

public class Tiket {

    public String jenis_tiket;
    public int harga_tiket;


    public void setJenis_tiket (String Tiket) {
        this.jenis_tiket = Tiket;

        if(Tiket == "FESTIVAL") {
            this.harga_tiket = 200000;
        } else if (Tiket == "CAT1") {
            this.harga_tiket = 180000;
        } else if (Tiket == "CAT2") {
            this.harga_tiket = 150000;
        } else if (Tiket == "CAT3") {
            this.harga_tiket = 100000;
        }
    }

    public String getJenis_tiket() {
        return this.jenis_tiket;
    }
    public int getHarga_tiket() {
        return this.harga_tiket;
    }

}
