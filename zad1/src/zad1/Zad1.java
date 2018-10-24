/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad1;

import java.util.Scanner;

/**
 *
 * @author BOoll18
 */
public class Zad1 {

   public static void p(boolean inshumen){
        int num= 0;
        Scanner enter2 = new Scanner(System.in);
        num=enter2.nextInt();

        if((num ==6 || num == 7) && inshumen == true)
        {
            System.out.println("Play");
        }
       

        else if((num ==6 || num == 7) && inshumen == false)
        {
            System.out.println("drinking");

        }
       else 
        {
            System.out.println("not play");
        }


    }

    public static void main(String[] args) {
        p(true);
        p(false);
    }
    
}
