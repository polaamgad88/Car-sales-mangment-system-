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
public class User{
    public  String username;
    public  char[] password;
    public  String firstName;
    public  String lastName;
    public  String phoneNumber;
   
    
    public User() {
    }

    public User(String username, char[] password,String firstName,  String lastName,  String phoneNumber) {
        this.username=username;
        this.password=password;
        this.firstName=firstName;
        this.lastName=lastName;
        this.phoneNumber=phoneNumber;
        UserList.numOfUsers++;
    }
    

    
    public void Login() {
        WelcomeUser w=new WelcomeUser();
        w.setVisible(true);
    }

    public void Register() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
