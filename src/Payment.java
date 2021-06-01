/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jedsadagon Mos
 */
public class Payment {
    private PayMethod p;

    public Payment(PayMethod p) {
        this.p = p;
    }
    
    public void pay(String cardN,String cv) {
        p.payment(cardN, cv);
    }
    

}
