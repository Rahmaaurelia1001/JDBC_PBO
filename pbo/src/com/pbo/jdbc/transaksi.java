package com.pbo.jdbc;

import java.util.Scanner;


public class transaksi {
    
    private static String username = "Aurel";
    private static String password = "Rahma123";
    private static String captcha = "Zami";

    public static void main(String[] args) {
        config.connection();
        
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Username: ");
        String un = scanner.next();
        System.out.print("Password: ");
        String pw = scanner.next();

        if (un.equals(username) && pw.equals(password)) {
           
            System.out.print("Masukkan captcha: ");
            String inputCaptcha = scanner.next();

        
            if (inputCaptcha.equalsIgnoreCase(captcha)) {
                System.out.println("Otentikasi berhasil. HALLO!, " + un + "!");
            
            while(true){

            System.out.print("\n====== MENU ======\n"
            + "A. Tambah Transaksi\n"
            + "B. Lihat Data Barang\n"
            + "C. Hapus Data Barang\n"
            + "D. Update Data Barang\n"
            + "0. Exit\n"
            + "Pilih[A/B/C/D/0] : ");

            
            String pilihan = scanner.next();

            if( pilihan.equalsIgnoreCase("0") ){
                System.out.println("Terimakasih!!");
                break;
            }

            switch (pilihan) {
                case "A" :
                    try {
                    
                    view.tambahData();

                } catch (Exception e) {
                    System.err.println("Inputan anda  tidak valid. Pastikan inputan sesuai dengan tipe data yang diminta.");
                } 
                    
                    
                    break;
                case "B" :
                    view.getAllData();
                    break;
                case "C" :
                    view.deleteData();
                    break;
                case "D" :
                    view.updateData();
                    break;
                default:
                    System.out.println("Pilihan salah!!");
                    break;
                    
            }
       
        }
           scanner.close();     
            } else {
                System.out.println("Captcha tidak valid. Autentikasi anda gagal.");
            }
        } else {
            System.out.println("Username atau Password tidak valid. Periksa Kembali.");
        }
    }
    
}
