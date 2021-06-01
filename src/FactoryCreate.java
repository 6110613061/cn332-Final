/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jedsadagon Mos
 */
public class FactoryCreate {

    public static AbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("Login")) {
            return new Factory();
        }
        
        return null;
    }
}
