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
public class Admin extends Person {
    public static final String username="admin";
    public static final char[] password={'a','d','m','i','n'};

    public Admin(String username, char[] password) {
        super(username, password);
    }
    

    @Override
    public void Login() {
        WelcomeAdmin w=new WelcomeAdmin();
        w.setVisible(true);
    }

    @Override
    public void Register() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
