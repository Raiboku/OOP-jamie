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
public class Plants {
    //modifier
     String Name1;
     String Type1;
     String Kind1;
     String Owner1;
     String Lifespan1;
     int Age1;
     String Environment1;
    
    
    
    private String Name = "Coriandrum Sativum";
    private String Type = "HERB";
    private String Kind  = "Cilantro";
    private String Owner = "Crister Canitan- Ain't Tisoy";
    private String Lifespan  = "6 to 7 weeks";
    private int Age = 4;
    private String Environment  = "Hot Weather Environment";
    private String Price = "Php 20.00";
    
    //Constructors
              
    public Plants() {
    }
    
                  //Parameters
    public Plants(String name, String type) {
        Name = name;
        Type = type;
    }

    public Plants(String Name, String Type, String Kind, String Owner, String Lifespan, int Age, String Environment) {
       
        this.Name = Name;
        this.Type = Type;
        this.Kind = Kind;
        this.Owner = Owner;
        this.Lifespan = Lifespan;
        this.Age = Age;
        this.Environment = Environment;
    }
    //---------lahi napud ni nga lesson--------
    //methods
    
    void Fibbo(int num1){
        
        
        
    }
    void Fibbo2(int num2){
        
        if (num2 == 34){
           
        } 
     
    }
    
    String GetName(){
     return this.Name;
    }
    String GetType(){
        return this.Type;
    }
    String GetKind(){
        return this.Kind;
    }
    String GetOwner(){
        return this.Owner;
    }
    String GetLifespan(){
        return this.Lifespan;
    }
    int GetAge(){
        return this.Age;
    }
    String GetEnvironment(){
        return this.Environment;
    }
    
    String setName(String name){
        this.Name=name;
        return Name;
    }
    String setType(String type){
        this.Type=type;
        return Type;
    }
    String setKind(String kind){
        this.Kind=kind;
        return Kind;
    }
    String setOwner(String owner){
        this.Owner=owner;
        return Owner;
    }
    String setLifespan(String lifespan){
        this.Lifespan=lifespan;
        return Lifespan;
    }
    int setAge(int age){
        this.Age=age;
        return Age;
    }
    String setEnvironment(String environment){
        this.Environment=environment;
        return Environment;
    }
    
    void PrintType(){
        System.out.println("Type: " + this.Type);
    }
   void PrintName(){
        System.out.println("Name: " + this.Name);
    }
    void PrintKind(){
        System.out.println("Kind: " + this.Kind);
    }
   void PrintPrice(){
       System.out.println(this.Price);
   }
}
