/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package des;

import java.util.*;

public class Des {

    
    public static void main(String[] args) {
        llave caja = new llave();
        Scanner scan= new Scanner(System.in);
        System.out.println("clave");
        String dato = scan.next();
        
        caja.aBinario(dato);
        
        //System.out.println(caja.binario);
        
        for(int i=1;i<=16;i++){
            System.out.println("R"+(i-1)+" "+caja.iz+" | "+caja.de);
            System.out.println("K"+(i)+" "+caja.meter(i));
            
        }
        
    }
    
}
