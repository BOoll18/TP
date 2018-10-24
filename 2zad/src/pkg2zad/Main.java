/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2zad;

import java.util.Scanner;

/**
 *
 * @author BOoll18
 */
public class Main {

    public static void num(int number){
        int n1,n2,n3;
        n1=number/100;
        n2=number/10%10;
        n3=number%10;
        if(n1==7 || n2==7 || n3==7)
        {
           System.out.println("Yes");
        }
        else
        {
            System.out.println("NO");
        }
    }
            
    public static void main(String[] args) {
        int a;
        Scanner enter = new Scanner(System.in);
        a=enter.nextInt();
        num(a);
                
    }
    
}
