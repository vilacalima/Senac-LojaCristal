/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cristal.projetoloja.view;

import com.toedter.calendar.JDateChooser;
import java.awt.event.KeyEvent;
import java.util.InputMismatchException;
import javax.swing.JComboBox;
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
    
    public void validaEntradaTexto(java.awt.event.ActionEvent evt, String txt, String texto){
        if(txt.equals("")){
            JOptionPane.showMessageDialog(null, "Digite " + texto);
        }
    }
    
    public void validaEntradaNumero(java.awt.event.ActionEvent evt, JComboBox txt, String texto){
        if(txt.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(null, "Digite " + texto);
        }
    }
    
    public void validaData(java.awt.event.ActionEvent evt, JDateChooser data, String texto){
        if(data.getDate() == null){
            JOptionPane.showMessageDialog(null, "Digite " + texto);
        }
    }

}
