/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jedsadagon Mos
 */
public class Facebook implements Login {
    private String type;

    public Facebook() {
        this.type = "Facebook";
    }
    
    public String getLoginType() {
        return type;
    }
    
}
