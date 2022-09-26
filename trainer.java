/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication21;

public class trainer {
    String name;
    String classes;
    int members;
    int avilable_time;
    String avilable_day;
    static trainer x[]=new trainer[5];
    
    //the empty constructor is used to create an object
    public trainer()
    {
    }
    //this constructor is used to give values for staic trainer array
    public trainer(String name ,  String classes , int members ,int avilable_time , String avilable_day )
    {
        this.name=name;
        this.classes=classes;
        this.members=members;
        this.avilable_time=avilable_time;
        this.avilable_day=avilable_day;
        
        
    }

}
