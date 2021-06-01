/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jedsadagon Mos
 */
class Factory extends AbstractFactory {  
   public Login getLogin(String type){  
      if(type == null){  
         return null;  
      }  
      if(type.equalsIgnoreCase("1")){  
         return new Email();  
      } else if(type.equalsIgnoreCase("2")){  
         return new Facebook();  
      } else if(type.equalsIgnoreCase("3")){  
         return new Google();  
      } else if(type.equalsIgnoreCase("4")){
         return new Member();  
      }  
      return null;  
   }  
}
