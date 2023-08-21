/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group1;
/**
 *
 * @authors 
 * Anjelo Gana
 * Rafid Karim
 * Ansar Yonis 
 */
public class Customer {
   
    private CustomerStatus status;
    private String user; 
    private double point; 
    private String pass;

       
    public Customer(String username, String password, double points){
        this.pass = password;
        this.point = points;
        this.user = username;
    }
   
    public void ChangeStatus(){
        status.changeStatus(this);  
    }

       
    public void setPassword(String password){
        this.pass = password;
    }
    
    public void setUsername(String username){
        this.user = username;
    }    
   
      
    public CustomerStatus getStatus(){
        return status;
    }
    
    
    public String getPassword(){
        return pass;
    }
    
       
    public String getUsername(){
        return user;
    }
   
   
    public double getPoints(){
        return point;
    }
   
    public void setPoints(double points){
        this.point = points;
    } 
   
    public double BuyWithPoints(double TotalCost){ 
        // buy using all points, if not enough then rest is cash
        if (TotalCost < getPoints()/100 ){
            point = point - TotalCost*100;
            checkStatus();
            return 0;
        }
        else{
            double LeftOverCost = TotalCost - getPoints()/100; 
            point = 0;
            point = LeftOverCost*10;  
            checkStatus();
            return LeftOverCost;
        }
       
    }

    public void BuyWithCash(double TotalCost){ 
       // buy using cash
       // earn points: 10 points for 1 CAD
       point = point + TotalCost*10;
       checkStatus();
    }
   
    //responsible for updating status
    public void checkStatus(){
        //if points >= 1000 and is a SilverCustomer, than change status to Gold
        if((status instanceof SilverConsumer) && getPoints()>=1000){ // changed the order of the > to <
            status.changeStatus(this);
        }
        //else if points < 1000 and is a GoldCustomer, than change status to Silver
        else if((status instanceof GoldConsumer) && getPoints()<1000){
            status.changeStatus(this);
        }
    }
   
    public void setState(CustomerStatus s){
        this.status = s;
    }
}
