/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lec1;

/**
 *
 * @author User
 */
public class foor {
    
    public static long power(int x, int y) {
    long result = x;

    for (int i = 1; i < y; i++) {
      result = result * x;
    }

    return result;
  }

}
