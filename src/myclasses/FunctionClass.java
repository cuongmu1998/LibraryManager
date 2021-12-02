/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myclasses;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author hieu0
 */
public class FunctionClass {
    
    //Create a function to display the image in Jlabel
    public void displayImage(int width, int height, String imagePath, JLabel label){
        // Get the image
        ImageIcon imgIco = new ImageIcon(getClass().getResource(imagePath));
        
        // make the image fit to jLabel
        Image image = imgIco.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        
        // Set the image into jlabel
        label.setIcon(new ImageIcon(image));
    }
    
}
