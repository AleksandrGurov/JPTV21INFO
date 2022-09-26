/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptv21info;

import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class JPTV21INFO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    System.out.println("Vvedite imya");
    Scanner input= new Scanner(System.in);
    String name= input.nextLine();
    System.out.println("vvedite familiyu");
    String surname= input.nextLine();
    System.out.println("vvedite ID");
    String code= input.nextLine();
    String DateYear= (code.substring(1,3));
    String DateMonth= (code.substring(3,5));
    String DateDay= (code.substring(5,7));
    System.out.println(name+" "+surname+ " rodilsa "+ DateYear +"."+DateMonth+"."+DateDay);
            
    
      
    }
    
}
