/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author harshita
 */
public class Student {
    public String name,roll,age,address;
   
    public void setName(String n){
        name=n;
    }
    public String getName()
    {
        return name;
    }
     public void setRoll(String r){
        roll=r;
    }
    public String getRoll()
    {
        return roll;
    }
     public void setAge(String a){
        age=a;
    }
    public String getAge()
    {
        return age;
    }
     public void setAddress(String ad){
        address=ad;
    }
    public String getAddress()
    {
        return address;
    }
    public int insert(String s)
    {
        int x=0;
        try{
        Class.forName("com.mysql.jdbc.Driver");
                
                Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/BeanTest","root","");
		Statement stm=cn.createStatement();
                 x=stm.executeUpdate("insert into "+s+"(name,roll,age,address) values('"+name+"','"+roll+"','"+age+"','"+address+"')");
                
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
       return x;
    } 
   
    
}
