/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package romanos;

import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel
 */
public class Romanos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String text;
        
        text = JOptionPane.showInputDialog(null, "Ingrese un numero del 1 al 1000");
        
        String u, d, c, m;
        int number;
        number = Integer.parseInt(text);
        
        int unidad, decena, dec, centena, cen, millar, mil;
        
        // Unidades
        unidad = number % 10;
        
        // Descenas
        decena = number / 10;
        dec = decena % 10;
        
        // Centena
        centena = number / 100;
        cen = centena % 10;
        
        // Millar
        millar = number / 1000;
        mil = millar % 10;
        
        switch(unidad){
            case 1: u = "I";
            break;
            case 2: u = "II";
            break;
            case 3: u = "III";
            break;
            case 4: u = "IV";
            break;
            case 5: u = "V";
            break;
            case 6: u = "VI";
            break;
            case 7: u = "VII";
            break;
            case 8: u = "VIII";
            break;
            case 9: u = "IX";
            break;
            default: u = "";
            break;
        }
        
        switch(dec){
            case 1: d = "X";
            break;
            case 2: d = "XX";
            break;
            case 3: d = "XXX";
            break;
            case 4: d = "XL";
            break;
            case 5: d = "L";
            break;
            case 6: d = "LX";
            break;
            case 7: d = "LXX";
            break;
            case 8: d = "LXXX";
            break;
            case 9: d = "XC";
            break;
            default: d = "";
            break;
        }
        
        switch(cen){
            case 1: c = "C";
            break;
            case 2: c = "CC";
            break;
            case 3: c = "CCC";
            break;
            case 4: c = "CD";
            break;
            case 5: c = "D";
            break;
            case 6: c = "DC";
            break;
            case 7: c = "DCC";
            break;
            case 8: c = "DCCC";
            break;
            case 9: c = "CM";
            break;
            default: c = "";
            break;
        }
        
        switch(mil){
            case 1: m = "M";
            break;
            default: m = "";
            break;
        }
        
        JOptionPane.showMessageDialog(null, "El numero romano es: " + m + c + d + u);
    }
    
}
