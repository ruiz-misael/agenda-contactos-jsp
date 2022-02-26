/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Config;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Misael
 */
public class Connection {
    
    Connection con;
    public Connection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (Exception e) {
            System.err.println("Error"+e);
        }
        try{
        }catch (Exception e){
        }
    
    }
    public Connection getConnection(){
    
        return con;
    }
    
}
