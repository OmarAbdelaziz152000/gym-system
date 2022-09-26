package javaapplication21;

import java.util.*;

public class JavaApplication21 {

    public static void main(String[] args) {
 admin admin1=new admin();
        trainer trainer1 = new trainer();
        members member1 = new members();
        
          for(int i =0 ; i<5 ;i++)
        {
            trainer1.x[i]=new trainer();
        }
         
        classes class1 = new classes();
        
         for(int i=0;i<5;i++)
        {
            class1.classes1[i]=new classes();
        }
         
          for(int i=0;i<8;i++)
        {
            member1.members1[i]=new members();
        }
   
        
        class1.initialize();
        
        
        admin1.add("ahmed", "zumba", 10, 10, "sunday");
        admin1.add("mohamed", "zumba", 10, 10, "sunday");
      
      
        System.out.println(trainer.x[0].members);
       employee employee1= new employee();
       employee1.add_member("mohamed", 101, "1-month","ahmed", "zumba");
       class1.change();
       employee1.edit_member("mohamedd", "mohamed", 101, "2-month", "ahmed", "zumba");
        System.out.println(classes.classes1[0].no_members);
       employee1.delete("mohamed");
       employee1.remove_fromclass("mohamed");
       System.out.println(classes.classes1[0].no_members);
       
 
        System.out.println(trainer.x[0].name);
        System.out.println(trainer.x[0].classes);
        System.out.println(trainer.x[0].avilable_time);
        System.out.println(trainer.x[0].avilable_day);
      
        
       System.out.println(trainer.x[1].name);
       System.out.println(trainer.x[1].classes);
       System.out.println(trainer.x[1].avilable_time);
       System.out.println(trainer.x[1].avilable_day);
       
       System.out.println(trainer.x[2].name);
       System.out.println(trainer.x[2].classes);
       System.out.println(trainer.x[2].avilable_time);
       System.out.println(trainer.x[2].avilable_day);

      admin1.display_members_by_membership("1");
       
    admin1.assign_trainer("ali", "ahmed");
       
      System.out.println(trainer.x[0].members);
   
      System.out.println(members.members1[0].id);
      System.out.println(members.members1[0].member_ship);
      System.out.println(members.members1[0].trainer);
      System.out.println(members.members1[0].classes);
         System.out.println(members.members1[0].name);
       admin1.display_members_by_class("zumba"); 
         admin1.display_members_by_membership("1-month");
        admin1.display_all_members();
                }

        }
 
