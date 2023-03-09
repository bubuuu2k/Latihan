package kegiatan1;

public class Main {
    public static void main(String[] args) {
        Kota<Integer> jumlahkota = new Kota<Integer>(9);
        Kota<String> namakota = new Kota<String>("Malang");

        System.out.println("Jumlah kota dijawa timur : " +jumlahkota.getElement()+"kota");
        System.out.println("Salah Satu kota dijawa timur : kota "+namakota.getElement());
    }

}
