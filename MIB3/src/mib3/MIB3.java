/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mib3;

import java.util.logging.Level;
import java.util.logging.Logger;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author markusmirza
 */
public class MIB3 {

    private static InfDB idb;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InfException {
        
        try{
            idb = new InfDB("mibdb", "3306", "mibdba", "mibkey");
            
        } catch (InfException ex) {
            Logger.getLogger(MIB3.class.getName()).log(Level.SEVERE,null,ex);
        }
        // TODO code application logic here
    }
    
}


