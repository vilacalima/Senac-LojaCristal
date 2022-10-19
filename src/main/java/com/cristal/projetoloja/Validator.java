/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cristal.projetoloja;

import java.awt.event.KeyEvent;
import java.util.InputMismatchException;
import javax.swing.JOptionPane;

/**
 *
 * @author robso
 */
public class Validator {

    public void validaMonetarioTxtBox(java.awt.event.KeyEvent evt, String campo) {
        char c = evt.getKeyChar();

        if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE) && ((c != ','))) {
            evt.consume();
            JOptionPane.showMessageDialog(null,"Campo " + campo + " permite somente números!");
        }
        
    }
    

}
