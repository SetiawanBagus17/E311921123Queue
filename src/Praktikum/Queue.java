package Praktikum;

public class Queue {
    
    // pertama, kita inisialisasikan variabel-variabel yang dibutuhkan 
    int data[];
    int head = 0;
    int tail = -1;
    
    // method ini berfungsi untuk menentukan size atau batasan array yang digunakan
    public Queue(int size) {
        data = new int[size];
    }
    
    // method ini berfungsi untuk melakukan pengecekan apabila data di dalam queue masih kosong
    public boolean isEmpty() {
        if (tail == -1) {
            return true;
        } else {
            return false;
        }
    }

    // method ini berfungsi untuk melakukan pengecekan apabila data di dalam queue sudah terisi penuh 
    public boolean isFull() {
        if (tail == data.length - 1) {
            return true;
        } else {
            return false;
        }
    }
    
    /* 
    method ini berisi fungsi untuk memasukan data ke dalam queue, Ada dua kondisi 
    apabila data belum penuh maka akan menambahkan data tersubut kedalam array,
    apabila array penuh maka akan menampilkan "antrian sudah penuh"
    */
    public void Enqueue(int dataBaru) {
        if (isEmpty()) {
            tail = head;
            data[tail] = dataBaru;
            System.out.println("Data sudah ditambahkan");
        } else if (!isFull()) {
            tail++;
            data[tail] = dataBaru;
            System.out.println("Data sudah ditambahkan");
        } else if (isFull()) {
            System.out.println("antrian sudah penuh");
        }
    }
    
    /*
    Method yang berfungsi untuk menghapus data terlama atau data paling awal 
    ditambahkan di dalam array Queue
    */
    public int Dequeue() {
        int temp = data[head];
        for (int i = head; i <= tail - 1; i++) {
            data[i] = data[i + 1];
        }
        tail--;
        System.out.println("Data sudah dihapus");
        return temp;
    }
    
    // method untuk menampilkan data yang ada di dalam array queue
    public void tampilkan() {
        if (!isEmpty()) {
            int index = head;
            while (index <= tail) {
                System.out.print("|" + data[index] + "| ");
                index++;
            }
            System.out.println();
        } else {
            System.out.println("Kosong");
        }
    }
}
