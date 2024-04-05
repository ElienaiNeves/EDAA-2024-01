/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tad;

import Interfaces.UmMonteDeNumero;
import classes.FabricaDeLista;
import classes.Lista;
import classes.Vetor;

/**
 *
 * @author elienai.neves
 */
public class TAD {

    public static void main(String[] args) {
       
              
        /*Vetor vt = new Vetor(10);
        
        vt.inserir(10);
        vt.imprimir();
        
        Lista ls = new Lista(10);
        ls.inserir(5);
        ls.inserir(20);
        ls.imprimir();*/
        
        UmMonteDeNumero obj = FabricaDeLista.getLista();
        
        obj.inserir(10);
        obj.inserir(15);
        obj.inserir(25);
        obj.imprimir();
        
        
        
        

        
       
        
        
    }
}
