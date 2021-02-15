/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Fibbo {
    
    int Fibo1(int m, int j){ 
        
       for (int i = 0; i < j;) {
            System.out.println(i);
            int k = i + m;
            i = m;
            m = k;
         }
       return j;
    }
       
    }

