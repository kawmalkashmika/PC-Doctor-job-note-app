/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UiSettings;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author Kawmal Kashmika
 */
public class UiSettings {
    
    public static void centerFrame(JFrame frame){
         // Get the dimension of the screen
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        
        // Get the dimension of the frame
        Dimension frameSize = frame.getSize();
        
        // Calculate the new location of the frame to center it on the screen
        int x = (screenSize.width - frameSize.width) / 2;
        int y = (screenSize.height - frameSize.height) / 2;
        
        // Set the location of the frame
        frame.setLocation(x, y);
    }
    
}
