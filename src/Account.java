/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jedsadagon Mos
 */
public class Account {
    private String name;
    private String phone;
    private String password;

    public Account(String name, String phone, String password)
    {
        this.name = name;
  
        this.phone = phone;
        this.password = password;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getPhone()
    {
        return phone;
    }

    public void setPhone(String phone)
    {
        this.phone = phone;
    }
    
    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    
    public void view(){
        java.lang.System.out.println("name : "+name);
        java.lang.System.out.println("phone : "+phone);
        java.lang.System.out.println("passwoed : "+password);
       // account.view();
    }
    
}
