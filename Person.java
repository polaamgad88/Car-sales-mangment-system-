/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Carsales;

/**
 *
 * @author moham
 */
public abstract class Person {
    String username;
    char[] password;
    public Person(String username,char[] password){
    this.username=username;
    this.password=password;
    }
    
    public abstract void Login();
    
    
    
    public abstract void Register();
    
    
    
}
