
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Jedsadagon Mos
 */
public class Client {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Login 
        System.out.print("Sign in with\n");
        System.out.print("1) Email\n");
        System.out.print("2) Facebook\n");
        System.out.print("3) Google\n");
        System.out.print("4) Member\n");
        System.out.print("or 5) Signup\n");
        System.out.print("\nEnter the type of Login(number) : ");
        String typeName = br.readLine();
        if (typeName.equals("5")) {
            System.out.print("\n");
            SignUp acc = new SignUp();
        } else {
            AbstractFactory typeFactory = FactoryCreate.getFactory("Login");
            Login b = typeFactory.getLogin(typeName);

            System.out.print("You Log in by " + b.getLoginType() + "\n\n");
        }

        // Rental
        int sum = 0;
        SumPlan planFactory = new SumPlan();
        System.out.println("Please choose your bed");
        System.out.println("1 or 2 bed (answer 1 or 2)");
        System.out.print("your answer : ");
        String pbed = br.readLine();
        Plan bed = planFactory.getSum(pbed);
        System.out.println("");
        sum += bed.getMoney();

        System.out.println("Please choose your Wifi");
        System.out.println("yes or no (answer yes or no)");
        System.out.print("your answer : ");
        String pwifi = br.readLine();
        if (pwifi.equals("yes")) {
            Plan wifi = planFactory.getSum("3");
            System.out.println("");
            sum += wifi.getMoney();
        }

        System.out.println("\nYour payment is : "+sum+"\n");

        // Payment method
        System.out.println("Please choose your way to pay");
        System.out.println("1) Airpay");
        System.out.println("2) ShoppeePay");
        System.out.println("3) Visa");
        System.out.print("You choose (number) : ");
        String typePay = br.readLine();
        System.out.print("\nPlease enter your credit card number : ");
        String cardN = br.readLine();
        System.out.print("Please enter your cv number : ");
        String cv = br.readLine();

        if (typePay.equals("1")) {
            Payment pay = new Payment(new AirPay());
            pay.pay(cardN, cv);
        } else if (typePay.equals("2")) {
            Payment pay = new Payment(new ShoppeePay());
            pay.pay(cardN, cv);
        } else if (typePay.equals("3")) {
            Payment pay = new Payment(new Visa());
            pay.pay(cardN, cv);
        }

    }
}
