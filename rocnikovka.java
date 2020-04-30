/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication110;

import java.util.Scanner;

/**
 *
 * @author vondr
 */
public class rocnikovka {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 0;
        Scanner sc = new Scanner(System.in);
        int id1 = 1;
        while(n == 0){
        String id2 = sc.nextLine();
        String id3 = sc.nextLine();
        String id4 = sc.nextLine();
        System.out.print("{\"ID\":\"");
        System.out.print(id1);
        System.out.print("\",\"CapitalName\":\"");
        System.out.print(id2);
        System.out.print("\",\"Latitude\":\"");
        System.out.print(id3);
        System.out.print("\",\"Longitude\":\"");
        System.out.print(id4);
        System.out.print("\"},");
            System.out.println("");
        id1 = id1 + 1;
    }}
    
}
