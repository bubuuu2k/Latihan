package Kegiatan2;

import java.util.ArrayList;
public class Drivers {
    public static void main(String[] args) {
        ArrayList<konsumsi>ListKonsumsi= new ArrayList<>();
        konsumsi<Makanan, Minuman>Breakfast = new konsumsi<>();
        konsumsi<Makanan,Minuman>Lunch = new konsumsi<>();

        Makanan roti = new Makanan();
        roti.setNamaHidangan("Roti Tawar");
        Minuman susu = new Minuman();
        susu.setNamaHidangan("Susu Sapi");
        Breakfast.setKonsumsi(roti, susu);
        ListKonsumsi.add(Breakfast);

        Makanan Nasi = new Makanan();
        Nasi.setNamaHidangan("Nasi Putih");
        Minuman air = new Minuman();
        air.setNamaHidangan("Air putih");

        System.out.println("Menu Konsumsi : ");
        for (konsumsi<Makanan,Minuman> konsumsi : ListKonsumsi){
            Makanan makanan = konsumsi.getM();
            Minuman minuman = konsumsi.getI();

            System.out.println(makanan.disantap());
            System.out.println(minuman.disantap());
        }

    }
}
