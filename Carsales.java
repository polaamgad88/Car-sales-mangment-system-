/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Carsales;
import java.util.*;

/**
 *
 * @author moham
 */
public class Carsales {
   public static void main(String args[]){
   char[]p={'a','d','m','i','n'};
   Person a=new Admin("admin",p );
   //Two Cars added by default
   car c=new car("820i","BMW",2020,1000000,10000);
   car c1=new car("DBX","Aston Martin",2021,2500000,80000);
   carList.cars.add(c);
   carList.cars.add(c1);
   Login L=new Login();
   L.setVisible(true);
   }
}