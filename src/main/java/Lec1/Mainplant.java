/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lec1;

/**
 *
 * @author User
 */
public class Mainplant {
    
    public static void main(String[] args){
        
        SUPEEEEER animal = new SUPEEEEER();
        
        animal.Kind1 = "Cilantro";
        animal.Name1 = "Coriandrum Sativum";
        animal.Owner1 = "Crister Canitan- Ain't Tisoy";
        animal.Lifespan1 = "6 to 7 weeks";
        animal.Age1 = 4;
        animal.Environment1 = "Hot Weather Environment";
        
        System.out.println(animal.Type1 + "\n" + animal.Kind1);
        System.out.println(animal.Name1 + "\n" + animal.Owner1);
        System.out.println(animal.Lifespan1 + "\n" + animal.Age1);
        System.out.println(animal.Environment1);
       
        System.out.println(" ");
        System.out.println("Private Modifier.Getchuchu:---------- ");
        System.out.println(" ");
        
        System.out.println("Type: " + animal.GetType());
        System.out.println("Name: " + animal.GetName());
        System.out.println("Kind: " + animal.GetKind());
        System.out.println("Owner: " + animal.GetOwner());
        System.out.println("Lifespan: " + animal.GetLifespan());
        System.out.println("Age: " + animal.GetAge());
        System.out.println("Environment: " + animal.GetEnvironment());
       

        System.out.println(" ");
        System.out.println("Private Modifier.Setchuchu:---------- ");
        System.out.println(" ");
        
        System.out.println("Type: " + animal.setType("Tagetes patula"));
        System.out.println("Name: " + animal.setName("Annual"));
        System.out.println("Kind: " + animal.setKind("French Marigold"));
        System.out.println("Owner: " + animal.setOwner("Crister Canitan- Ain't Tisoy"));
        System.out.println("Lifespan: " + animal.setLifespan("Less than a Year"));
        System.out.println("Age: " + animal.setAge( 5 ));
        System.out.println("Environment: " + animal.setEnvironment("Loose and well-drained garden loam"));
        
        System.out.println(" ");
        System.out.println("Printchuchu:-----------");
        System.out.println(" ");
        
        animal.PrintName();
        animal.PrintType();
        
        System.out.println(" ");
        System.out.println("Overidechuchu:-----------");
        System.out.println(" ");
        
        animal.PrintPrice();
        
    }
}
