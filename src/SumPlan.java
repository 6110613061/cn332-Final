/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jedsadagon Mos
 */
public class SumPlan {

    public Plan getSum(String type) {
        if (type == null) {
            return null;
        }
        if (type.equalsIgnoreCase("1")) {
            return new Bed1();
        } else if (type.equalsIgnoreCase("2")) {
            return new Bed2();
        } else if (type.equalsIgnoreCase("3")) {
            return new Wifi();
        }
        return null;
    }
}
