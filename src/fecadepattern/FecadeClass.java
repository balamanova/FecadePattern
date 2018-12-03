/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fecadepattern;

/**
 *
 * @author пк
 */
public class FecadeClass {

    Order ecspreso;
    Order caramel;
    Order tea;

    public static int cost = 0;

    public FecadeClass() {
        ecspreso = new Ecspreso();
        caramel = new Caramel();
        tea = new Tea();
    }

    public void orderCaramel() {
        caramel.totalCost();
    }

    public void orderEcspresso() {
        ecspreso.totalCost();
        
    }

    public void orderTea() {
        tea.totalCost();
    }

    public void getTotalCost(){
        
        System.out.println("Your total order costs: " + cost);
    }
}
