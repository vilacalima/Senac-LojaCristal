/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cristal.projetoloja.view;

import java.awt.event.KeyEvent;
import java.util.InputMismatchException;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author robso
 */
public class Validador {

    public void validaMonetarioTxtBox(java.awt.event.KeyEvent evt, String campo) {
        char c = evt.getKeyChar();

        if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE) && ((c != ','))) {
            evt.consume();
            JOptionPane.showMessageDialog(null,"Campo " + campo + " permite somente números!");
        }
        
    }
    
    public void validaPalavra(java.awt.event.KeyEvent evt, JTextField texto, int numero){
        if(texto.getText().length()>=numero)
        {
            evt.consume();
            JOptionPane.showMessageDialog(null,"Máximo de " + numero + " caracteres atingido!");
        }
    }
    
    public void validaEntradaPalavra(java.awt.event.ActionEvent evt, JTextField txt, String texto){
        if(txt.getText().trim().equals("")){
            JOptionPane.showMessageDialog(null, "Digite " + texto);
        }
    }

}
