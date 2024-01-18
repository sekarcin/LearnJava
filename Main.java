import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jumlah,pilihan,total,bayar,total1,harga = 0;//deklarasi integer
        String nama,namamakanan;

        System.out.println("Menu Makanan \n");
        System.out.println("1. Nasi Goreng ........... Rp.15.000\n");
        System.out.println("2. Mie Ayam .............. Rp.10.000\n");
        System.out.println("3. Bakso ................. Rp.13.000\n");

        System.out.println("Masukkan nama: ");
        nama = input.nextLine();

        System.out.print("Silahkan pilih yang anda pesan : \n");
        pilihan = input.nextInt();
        if(pilihan == 1){
            harga = 15000;
            System.out.println("Nasi Goreng" + "Rp. " + harga);
        }else if(pilihan == 2){
            harga = 10000;
            System.out.println("Mie Ayam " + "Rp. " + harga);
        }else if(pilihan == 3){
            harga = 13000;
            System.out.println("Bakso " + "Rp. " + harga);
        }else{
            System.out.println("Maaf Pilihan yang Anda Pilih Salah !");
        }

        System.out.print("Jumlah Pesan : \n");
        jumlah = input.nextInt();
        // perhitungan total
        total = harga * jumlah;
        System.out.println("Anda harus membayar : Rp. " + total);

        // Tampilkan output
        System.out.println("\n------------------------------------------");
        System.out.println("Nama Pemesan: " + nama);
        System.out.println("Pesanan: " + pilihan);
        System.out.println("Harga: Rp." + harga);
        System.out.println("Jumlah Pesan: " + jumlah);
        System.out.println("Total Bayar: Rp." + total);
        System.out.print("Bayar : Rp. ");
        bayar = input.nextInt();
        total1 = (int) (bayar - total);
        System.out.println("Kembaliannya : Rp. " +total1);

        return;
    }
}