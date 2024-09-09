package BuatBaru2;

public class Main2 {
    public static void main(String[] args) {
        // Membuat objek dari kelas Produk
        
        
        // Membuat objek dari kelas Cd
        DVD Dvd1 = new DVD();
        Dvd1.setNumber(2);
        Dvd1.setName("Reborn");
        Dvd1.setQuantity(12);
        Dvd1.setPrice(2000.00);
        Dvd1.setLength(300);
        Dvd1.setRating("PG");
        Dvd1.setStudio("Newline Cinema");

        // Menampilkan informasi CD menggunakan metode print yang di-*override*
        System.out.println("\nDvd 1:");
        Dvd1.print();
    }
}
