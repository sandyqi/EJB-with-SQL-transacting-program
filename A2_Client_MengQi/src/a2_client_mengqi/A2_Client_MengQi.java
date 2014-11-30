/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a2_client_mengqi;

import a2_client_mengqi.gui.mainGUI;
import a2_server_mengqi.SandyBeanRemote;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author Meng
 */
public class A2_Client_MengQi {

    public static SandyBeanRemote sandyRemote;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here

            //find the ejb object
            InitialContext ic = new InitialContext();
            sandyRemote = (SandyBeanRemote) ic.lookup("java:global/project_A2_Server_MengQi/SandyBean!a2_server_mengqi.SandyBeanRemote");
            System.out.println(sandyRemote.print("Info: "));
          //  System.out.println("TEST new library: "+sandyRemote.excuteSQL("Select * from Orders").get(2));
            mainGUI main = new mainGUI();
            main.setVisible(true);
            main.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        } catch (NamingException ex) {
            Logger.getLogger(A2_Client_MengQi.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
