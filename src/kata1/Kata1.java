/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kata1;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author usuario
 */
public class Kata1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Hola"); 
        Person p1;
        //Date f=new Date(64,7,3);
  Calendar f1;
  f1=GregorianCalendar.getInstance();
  f1.set(1964,7,3);
  
        p1=new Person("Enrique","Ramon",f1);
        System.out.println(p1.fullname()); 
        System.out.println(p1.getBirth().getTime()); 
        System.out.println(p1.getage()); 
        System.out.println("....."); 
        System.out.println(""); 
        System.out.println("Adios");        
        
    }
}
