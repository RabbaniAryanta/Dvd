package BuatBaru;

public class Main {
    public static void main(String[] args) {
        // Membuat objek dari kelas Produk
        Produk produk1 = new Produk(2, "Reborn", 12, 2000.0);
        
        // Menampilkan informasi produk menggunakan metode print
        System.out.println("Produk 1:");
        produk1.print();
        
        // Membuat objek dari kelas Cd
        Cd cd1 = new Cd();
        cd1.setNumber(2);
        cd1.setName("Reborn");
        cd1.setQuantity(12);
        cd1.setPrice(19.99);
        cd1.setArtist("Lady Gaga");
        cd1.setNumSongs(10);
        cd1.setLabel("Sony Music");

        // Menampilkan informasi CD menggunakan metode print yang di-*override*
        System.out.println("\nCD 1:");
        cd1.print();
    }
}
