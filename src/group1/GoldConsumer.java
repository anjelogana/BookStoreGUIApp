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
public class GoldConsumer extends CustomerStatus{

    private String statustxt; 

    public GoldConsumer(){
        statustxt="Gold";
    }


    @Override
    public String currentStatus(){
        return statustxt;
    } 

    @Override
    public void changeStatus(Customer c){
        c.setState(new SilverConsumer());
    }

}
