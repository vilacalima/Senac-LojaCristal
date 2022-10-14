/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cristal.projetoloja;

import java.awt.event.KeyEvent;

/**
 *
 * @author robso
 */
public class Validator {

    public void validaMonetarioTxtBox(java.awt.event.KeyEvent evt) {
        char c = evt.getKeyChar();

        if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE) && ((c != ','))) {
            evt.consume();

        }
        //FAZER COM QUE O CAMPO ACEITE SOMENTE NUMEROS E VIRGULA
    }

}
