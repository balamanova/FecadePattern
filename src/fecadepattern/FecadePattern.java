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
public class FecadePattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        FecadeClass newOrder = new FecadeClass();
        newOrder.orderCaramel();
        newOrder.getTotalCost();
        
        newOrder.orderEcspresso();

        newOrder.getTotalCost();
    }

}
