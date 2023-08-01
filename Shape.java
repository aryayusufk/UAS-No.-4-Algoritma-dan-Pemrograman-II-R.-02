/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UAS3;

/**
 *
 * @author aryay
 */
public abstract class Shape {
    //Nama: Arya Yusuf Karan
    //NPM: 227064516066
    //Method abstract untuk menghitung luas
    public abstract double CalculateArea();
    
    //Method non abstract yang dapat dipanggil oleh semua turunan
    public void DisplayArea(){
        double area=CalculateArea();
        System.out.println("Luas: "+ area);
    }
}
