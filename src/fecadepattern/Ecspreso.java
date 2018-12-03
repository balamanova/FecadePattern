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
public class Ecspreso implements Order{

    @Override
    public void totalCost() {
       FecadeClass.cost+=7;
     }
    
}
