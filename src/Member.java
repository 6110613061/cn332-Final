/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jedsadagon Mos
 */
public class Member implements Login {
    private String type;

    public Member() {
        this.type = "Member";
    }
    
    public String getLoginType() {
        return type;
    }
    
}
