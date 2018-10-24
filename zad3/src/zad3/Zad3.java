/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad3;

import java.util.Scanner;

/**
 *
 * @author BOoll18
 */
public class Zad3 {

    public static void square(int a){
        int v=a*a*a;
        System.out.println("V= " + v);
        
    }
    public static void square2(int a){
        int s=6*a*a;
        System.out.println("S= " + s);
        
    }
    public static void main(String[] args) {
        int a2;
        Scanner enter = new Scanner(System.in);
        a2=enter.nextInt();
        square(a2);
        square2(a2);
    }
    
}
