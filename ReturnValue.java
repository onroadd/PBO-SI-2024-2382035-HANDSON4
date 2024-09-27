public class ReturnValue {

    public static int tambah(int a, int b){
        int hasil = a + b;
        return hasil;
    }
    public static boolean apakahGenap(int angka){
        return angka % 2 == 0;
    }
    public static String sapaan(String nama){
        return "Halo, " + nama + "!";
    }

    public static void main(String[] args) {
        int hasilPenjumlahan = tambah(3,5);
        System.out.println("3 + 5 = " + hasilPenjumlahan);
    }
}
