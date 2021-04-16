/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midterm;

import java.util.ArrayList;

/**
 *
 * @author it
 */
public class Employee {
    private String Name;
    private String CNIC;
    private String MNumber;
    
    public String getName(){
        return this.Name;
    }
    public boolean SetName(String name1)
    {
        
        for(int i=0;i<name1.length();i++)
            
        {
            if(name1.charAt(i)>='A'&&name1.charAt(i)>='Z')
            {
               this.Name=name1;
               return true;
            }
        }
        return false;
    }
    public String getCnic(){
        return this.CNIC;
    }
    public boolean SetCNIC(String Id)
    {
        if(Id.length()==13)
        {
            
        
        for(int i=0;i<Id.length();i++)
        {
            if(Id.charAt(i)>='1'&& Id.charAt(i)>='9')
            {
                this.CNIC=Id;
                return true;
            }
        }
        }
        return false;
    }
    
    public String getMNumber(){
        return this.MNumber;
    }
    public boolean SetMNumber(String num)
    {
        if(num.length()==11)
        {
        for(int i=0;i<num.length();i++)
        {
            if(num.charAt(i)>='1'&&num.charAt(i)<='9')
            {
              this.MNumber=num;
              return true;
            }
        }
        }
            return false;
        
    }
}
    
    
   
      
    
        
      