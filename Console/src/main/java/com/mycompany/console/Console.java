/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.console;

/**
 *
 * @author mac
 */
public class Console {
    
    
    public static void main(String[] args) {
        
        sales();
         
    }
    public  static void sales(){
        gameReport();
        String []cities = {"CAPETOWN","PORT ELIZABETH","PRETORIA"};
    String []consoles = {"PS5","XBOX","SWITCH"};
    int[][]Sales = {{1000,2000,1500},//Ps5
                   {2000,3000,1100},//Xbox
                   {3000,4000,1200}};//Switch}
    
    for(int i =0;i<1;i++){
    
      System.out.print(cities[0]);
      System.out.println(Sales[0][0]+" "+" "+Sales[0][1]+" "+Sales[0][2]);
       System.out.println(Sales[1][0]+" "+" "+Sales[1][1]+" "+Sales[1][2]);
    
      System.out.println(cities[1]);
      System.out.println(Sales[1][0]+" "+" "+Sales[1][1]+" "+Sales[1][2]);
      System.out.println(cities[2]);
      System.out.println(Sales[2][0]+" "+" "+Sales[2][1]+" "+Sales[2][2]);
        
    }
    
        consoleSales();
        System.out.println("""
          ====================CITY WITH THE MOST SALES:PORT ELIZABETH======================
                           """);
    }
    
    public static void gameReport(){
    
    System.out.print("""
                    ======================GAMING CONSOLE REPORT=======================
                     """);
    
    }
    public static void consoleSales(){
    
    System.out.print("""
                    ======================CONSOLE SALES TOTAL FOR EACH CITY =======================
                     """);
    
    
    }
    
    
    
    
    
}
