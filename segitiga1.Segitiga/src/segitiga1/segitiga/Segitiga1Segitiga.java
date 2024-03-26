/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package segitiga1.segitiga;

// Class Segitiga
class Segitiga {
    private double alas;
    private double tinggi;
    private double sisi;

    // Constructor tanpa parameter
    public Segitiga() {
        this.alas = 1;
        this.tinggi = 1;
        this.sisi = 1;
    }

    // Constructor dengan parameter
    public Segitiga(double alasBaru, double tinggiBaru, double sisiBaru) {
        this.alas = alasBaru;
        this.tinggi = tinggiBaru;
        this.sisi = sisiBaru;
    }

    // Getter untuk luas segitiga
    public double getLuas() {
        return 0.5 * alas * tinggi;
    }

    // Getter untuk keliling segitiga
    public double getKeliling() {
        return 3 * sisi;
    }

    // Setter untuk alas
    public void setAlas(double alasBaru) {
        this.alas = alasBaru;
    }

    // Setter untuk tinggi
    public void setTinggi(double tinggiBaru) {
        this.tinggi = tinggiBaru;
    }

    // Setter untuk sisi
    public void setSisi(double sisiBaru) {
        this.sisi = sisiBaru;
    }
}

// Class Main
public class Segitiga1Segitiga {
    public static void main(String[] args) {
        // Membuat objek segitiga dengan nilai yang sudah diketahui
        Segitiga segitiga1 = new Segitiga(30, 10, 90);
        Segitiga segitiga2 = new Segitiga(1, 1, 1);
        Segitiga segitiga3 = new Segitiga(20, 30, 60); 

        // Menghitung luas dan keliling segitiga
        double luas1 = segitiga1.getLuas();
        double keliling1 = segitiga1.getKeliling();

        double luas2 = segitiga2.getLuas();
        double keliling2 = segitiga2.getKeliling();

        double luas3 = segitiga3.getLuas();
        double keliling3 = segitiga3.getKeliling();

        // Menampilkan hasil
        System.out.println("Segitiga 1");
        System.out.println("Luas Segitiga 1: " + luas1);
        System.out.println("Keliling Segitiga 1: " + keliling1);
        
        System.out.println("Segitiga 2");
        System.out.println("Luas Segitiga 2: " + luas2);
        System.out.println("Keliling Segitiga 2: " + keliling2);
        
        System.out.println("Segitiga 3");
        System.out.println("Luas Segitiga 3: " + luas3);
        System.out.println("Keliling Segitiga 3: " + keliling3);
    }
}