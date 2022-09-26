/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication21;

import java.time.Clock;

/**
 *
 * @author user
 */
public class admin extends view_members
{
    
    
    
    public void add (String name , String classes , int members_no , int time , String day)
    {
          for (int i =0 ; i<5 ;i++)
        {
         
            if(trainer.x[i].name==null)
            { 
            trainer.x[i].name=name;
          
            trainer.x[i].members=members_no;
        
            Check_avalibilty(name, classes, day,time,i);
            break;
            }
            else if(i==4 && trainer.x[i].name!=null )
          {
              System.out.println("Max number");
          }
         
        }
    }

            
       public void edit (String name_test, String name , String classes , int members_no , int time , String day)
       {
           boolean sucssess=false;
            for (int i =0 ; i<5 ;i++)
         {
            if(trainer.x[i].name != name_test)
            {
                if(i==4)
                {
                System.out.println("user not found try again");
                }
                continue;
            }
             if(trainer.x[i].name==name_test)
            {
                sucssess=true;
                
            }
             
           
       
           Check_avalibilty(name, classes, day,time,i);
            
            
            if(sucssess==true)
            {
                trainer.x[i].name=name; 
                trainer.x[i].classes=classes;
                trainer.x[i].avilable_time=time;
                trainer.x[i].avilable_day=day;
                trainer.x[i].members=members_no;
                break;
            }
         }
            
       }
       
       public void delete (String name_test) {
           boolean sucssess=false;
            for (int i =0 ; i<5 ;i++)
         {
            if(trainer.x[i].name!=name_test)
            {
                if(i==4&&sucssess==false)
                {
                System.out.println("user not found try again");
                }
                continue;
            }
             if(trainer.x[i].name==name_test)
            {
                sucssess=true;
            }
            trainer.x[i].name=null;
            trainer.x[i].classes=null;
            trainer.x[i].members=0;
            trainer.x[i].avilable_time=0;
            trainer.x[i].avilable_day=null;
            if(sucssess==true)
            {
            break;
            }
         }
       }
       
       
       public void edit_class (String name , String description , String trainer , int no_of_mem ,int max ,String[] members)
       {
           
        boolean success=false;
          for (int i =0 ; i<5 ;i++)
           {
           
             if(classes.classes1[i].class_name==name)
            {
                success=true;
                classes.classes1[i].class_name=name;
                classes.classes1[i].description=description;
                classes.classes1[i].trainerx=trainer;
                classes.classes1[i].no_members=no_of_mem;
                classes.classes1[i].max_no=max;
                  for (int j=0 ; j<10 ; j++)
                {
                    classes.classes1[i].members_names[j]=members[j];
                    
                }
            }
            if(success==true)
            {
            break;
            }
           }
            
       }
       
           public void delete_class (String name)
       {
           
      
          for (int i =0 ; i<5 ;i++)
           {
           
             if(classes.classes1[i].class_name==name)
            {
                
                classes.classes1[i].class_name=null;
                classes.classes1[i].description=null;
                classes.classes1[i].trainerx=null;
                classes.classes1[i].no_members=0;
                classes.classes1[i].max_no=0;
                  for (int j=0 ; j<10 ; j++)
                {
                    classes.classes1[i].members_names[j]=null;
                    
                }
                  break;
            }
            
           }
            
       }
       
           
           
           public void display_class(String name)
           {
               
               for (int i =0 ; i<5 ;i++)
            {
           
             if(classes.classes1[i].class_name==name)
            {
                
                System.out.println(classes.classes1[i].class_name);
                System.out.println(classes.classes1[i].description);
                System.out.println(classes.classes1[i].trainerx);
                System.out.println(classes.classes1[i].no_members);
                System.out.println(classes.classes1[i].max_no);
                  for (int j=0 ; j<10 ; j++)
                {
                    System.out.println(classes.classes1[i].members_names[j]);
                    
                }
                  break;
            }
            
          }   
               
         }
           
           
       
       public void Check_avalibilty(String check_name, String check_class, String check_day,int check_time,int index){
    for(int i=0;i<5;i++)
    {
        
        if(check_class == classes.classes1[i].class_name)
        {
           
           if(check_day == trainer.x[i].avilable_day && check_time == trainer.x[i].avilable_time )
           {
               System.out.println("Try a different Time");
                 break;
           }
          
           else
           {
            trainer.x[index].name=check_name; 
            trainer.x[index].classes=check_class;
            trainer.x[index].avilable_time=check_time;
            trainer.x[index].avilable_day=check_day;
            break;
            }
        }
        else if(check_name == trainer.x[i].name && check_class !=classes.classes1[i].class_name)
        { 
            if(check_day == trainer.x[i].avilable_day && check_time == trainer.x[i].avilable_time )
           {
               System.out.println("Try a different Time");
                 break;
            }    
           
        }
        else if(i==4 && check_class !=classes.classes1[i].class_name)
            {
                System.out.println("Class Not Found");
                
            }
        else 
        {
            continue;
        }
        
        
    }
}

     public void assign_trainer(String member_name,String trainer_name)
    {
         for(int i=0;i<5;i++)
        {
            if(trainer_name==trainer.x[i].name)
            {
              trainer.x[i].members++;
            }
      
        }
        for(int j=0;j<8;j++)
        {
           
            if(member_name==members.members1[j].name)
            {        
              members.members1[j].trainer=trainer_name;
                
                
            }   
        }
    }  
    
}
