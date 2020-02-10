/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fontes;

/**
 *
 * @author vinicius.reif
 */
public abstract class Automacao implements Runnable {
    
    protected String makeLogText(String text) {
        String printText = "";
        for(int i = 0; i < text.length(); i++) {
            if(i > 1000) {
                break;
            }
            printText += text.charAt(i);
        }
        return printText;
    }
    
}
