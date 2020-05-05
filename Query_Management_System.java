import java.io.*;
import java.util.*;  
interface A{                                            //Creatig Interface
    void AcceptData();                                  //Declaring method
}
interface B extends A{                                  //Creating interface and inherits A interface i.e Inheritance
    void DisplayData();
}
class sample implements B{                              //class implements interface
    Scanner in = new Scanner(System.in);                //Scanner object for accepting the data from user 
    public String name,query;
    public long mob;
    public void AcceptData(){                           //overridden method 1
        System.out.println("-------------Welcome to Query Management System-------------");
        System.out.println("Your Query : ");
        query = in.nextLine();
        System.out.println("Enter your Name : ");
        name = in.nextLine();  
        System.out.println("Enter your Mob No : ");
        mob = in.nextLong();
        long len = String.valueOf(mob).length();        //calculates digits of mob no
        try{                                            //Exception Handling (Try Catch)
            if(len!=10){
                throw new Exception();                  //throws a exception if no is invalid
            }
            else{
                DisplayData();                          //calls to a method
            }
        }
        catch(Exception e){                             //program flowcomes here if mob no is not a valid
            System.out.println("Invalid Mob No:");
        }
    }
    public void DisplayData(){                          //overridden method 2
        System.out.println("Name : "+name);
        System.out.println("Mob No. : "+mob);
        System.out.println("Your Query has been recorded. We will connect with you via call soon, Thank you.");
    }
    public static void main(String args[]){
        sample obj = new sample();                      //class object to call overriden methods
        obj.AcceptData();                               //callig overridden methods
    }
}