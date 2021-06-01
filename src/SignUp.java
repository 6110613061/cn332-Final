
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Jedsadagon Mos
 */
public class SignUp {

    static ArrayList<Account> allClients;
    static Scanner input;

    public SignUp() {
        allClients = new ArrayList<Account>();
        addAccount();
    }

    static void addAccount() {
        input = new Scanner(System.in);
        java.lang.System.out.print("enter client name : ");
        String name = input.nextLine();
        java.lang.System.out.print("enter client phone : ");
        String phone = input.nextLine();
        java.lang.System.out.print("enter client password : ");
        String password = input.nextLine();
        System.out.println("");
        System.out.println("Log in Success\n");

        Account newClient = new Account(name,phone, password);

    }

}
