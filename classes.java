/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication21;


public class classes extends admin {
    
    static classes classes1[]=new classes[5];
    String class_name;
    String description;
    String trainerx;
    int no_members;
    String members_names[]=new String[10];
    int max_no=10;
    
    
    
   public void initialize()
   {
              
        classes1[0].class_name="zumba";
        classes1[1].class_name="fitness";
        classes1[2].class_name="boxing";
        classes1[3].class_name="body building";
        classes1[4].class_name="yoga";
        
        classes1[0].no_members=1;
        classes1[1].no_members=2;
        classes1[2].no_members=3;
        classes1[3].no_members=4;
        classes1[4].no_members=5;

        
   }  
       
   public void change()
   {
       for(int i=0;i<5;i++)
    {
        
        for(int j=0;j<8;j++)
        {
          
            if(members.members1[j].classes==classes1[i].class_name)
            {      
                classes1[i].members_names[classes1[i].no_members]=members.members1[j].name;
                classes1[i].no_members++;
               
            }   
        }
    }
        for(int i=0;i<5;i++)
        {
            for(int j=0 ; j<5 ; j++)
             if(classes1[i].class_name==trainer.x[j].classes)
             {
                 classes1[i].trainerx=trainer.x[j].name;
             }
        }

         
      
   }

 
}
