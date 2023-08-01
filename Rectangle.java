/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UAS3;

/**
 *
 * @author aryay
 */
class Rectangle extends Shape {
    //Nama: Arya Yusuf Karan
    //NPM: 227064516066
    //Atribut panjang dan lebar
    private double panjang;
    private double lebar;
    
    //Konstruktor untuk Rectangle
    public Rectangle(double panjang, double lebar){
        this.panjang=panjang;
        this.lebar=lebar;
    }
    
    //Implementasi method CalculateArea untuk rectangle
    @Override
    public double CalculateArea(){
        return panjang*lebar;
    }
}
