
package javaapplication21;


public abstract class view_members 
{
    
        public void display_members_by_class (String class_name)
        {
            
            for(int i = 0 ; i < 5 ; i++)
            {
                
                if(classes.classes1[i].class_name==class_name)
                {                     
                       for (int j=0 ; j<10 ; j++)
                    {
                        if(classes.classes1[i].members_names[j]!=null)
                        System.out.println("name is "+classes.classes1[i].members_names[j]);
                    
                    }
                }
            }
        }
        
        
        public void display_members_by_membership (String membership)
        {
            boolean success=false;
            for (int i = 0 ; i<8;i++)
            {
                if(membership==members.members1[i].member_ship)
                {
                    success = true;
                     System.out.println("id is  "+ members.members1[i].id);
                     System.out.println("name is " + members.members1[i].name);
                }
            }
            if(success==false)
            {
                System.out.println("Wrong membership");
            }
        }
        
        public void display_all_members ()
        {
             for (int i = 0 ; i<8;i++)
             {
                if(members.members1[i].name!=null || members.members1[i].id != 0 ) 
                {
                    System.out.println("name is "+members.members1[i].name);
                    System.out.println("id is "+members.members1[i].id);
                }
             }
            
        }
        
        
       
}
