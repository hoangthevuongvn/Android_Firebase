package com.example.mylibrary;

public class Minmax {
    public int a;
    public int b;

    public Minmax(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public int Max(){
        if(a > b ) return a;
        else return b;
    }
}
