package com.company;

import java.util.Scanner;

public class Main {
    int pilihan, harga, total, jumlah, bayar, kembalian;

    int MenghitungPembayaran ( int jumlah){
        switch (pilihan) {
            case 0:
                System.exit();
                break;

            case 1:
                harga = 20000;
                total = total + (harga * jumlah);
                break;

            case 2:
                harga = 10000;
                total = total + (harga * jumlah);
                break;

            case 3:
                harga = 15000;
                total = total + (harga * jumlah);
                break;

            case 4:
                harga = 17000;
                total = total + (harga * jumlah);
                break;

            case 5:
                harga = 18000;
                total = total + (harga * jumlah);
                break;

            case 6:
                break;

            default:
                System.out.println("Mohon maaf, pilihan anda salah!");
                break;
        }
        return total;
    }

    void MenampilkanTotal () {
        System.out.println("=================================================");
        System.out.println("Total : Rp. " + total);
    }

    int MengitungKembalian (int kembalian){
        kembalian = bayar - total;
        return kembalian;
    }

    void MenampilkanKembalian(){
        System.out.println("Kembalian : Rp. " + kembalian);
        System.out.println("================== TERIMAKASIH ==================");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Main in = new Main();

        do {
            System.out.println("================== Menu Bobba ===================");
            System.out.println("1. Hazelnut Chocolate Milk Tea [Rp. 20.000]");
            System.out.println("2. Taro Milk [Rp. 10.000]");
            System.out.println("3. Pure Cocoa [Rp. 15.000]");
            System.out.println("4. Oreo Shake [Rp. 17.000]");
            System.out.println("5. Manggo Milk [Rp. 18.000]");
            System.out.println("6. Hitung pembayaran");
            System.out.println("=================================================");
            System.out.print("Masukkan pilihan : ");
            in.pilihan = input.nextInt();

            if (pilihan >= 1 && pilihan <= 5) {
                System.out.print("Masukkan Jumlah : ");
                in.jumlah = input.nextInt();
            } else {
                System.out.println("Mohon maaf, pilihan anda salah!");
            }
            in.MenghitungPembayaran(in.jumlah);
        } while (in.pilihan != 6);

        in.MenampilkanTotal();

        System.out.print("Bayar : Rp. ");
        in.bayar = input.nextInt();
        in.MengitungKembalian();
        in.MenampilkanKembalian();

    }
}
