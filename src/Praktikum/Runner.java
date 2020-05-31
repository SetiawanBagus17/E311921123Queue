package Praktikum;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        // inisialisasi variabel-variabel yang diperlukan
        int pilihan;
        int data;
        
        Queue result = new Queue(5);
        
        //"Do" untuk melakukan perintah yang pertama kali dijalankan sebelum melanjutkan ke perulangan while
        do {
            System.out.println("===PILIHAN===");
            System.out.println("1. ENQUEUE");
            System.out.println("2. DEQUEUE");
            System.out.println("3. LIHAT ISI DATA");
            System.out.println("4. KELUAR");
            System.out.print("Masukkan pilihan : ");
            
            Scanner in = new Scanner(System.in);
            pilihan = in.nextInt();
            
            //Pilihan menu dalam Program Queue, dimana tiap menu mengambil dari Class Queue yang diberi nama objek baru disini sebagai result
            if (pilihan == 1) { //Menu input/Enqueue
                System.out.print("Data yang ditambahkan : ");
                data = in.nextInt();
                result.Enqueue(data);
                System.out.println("");
            } else if (pilihan == 2){ //Menu Dequeue/hapus data
                result.Dequeue();
                System.out.println("");
            } else if (pilihan ==3){ //Menu untuk melihat isi data
                result.tampilkan();
                System.out.println("");
            } else if (pilihan == 4) { // menu untuk keluar dari program
                System.exit(0);
            } else { 
                System.out.println("pilihan tidak ada"); //Output yang keluar apabila salah memasukkan pilihan menu
            }
        } while (pilihan != 0); //Perulangan terjadi sampai inputan pilihan menu/pilih bernilai tidak kosong atau salah input
    }
}
