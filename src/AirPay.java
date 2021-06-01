/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jedsadagon Mos
 */
public class AirPay implements PayMethod{
    public void payment(String cardN, String cv) {
        System.out.println("\npay with Airpay");
        System.out.println("your number : "+cardN);
        System.out.println("your cv : "+cv);
        System.out.println("Success payment");
    }
}
