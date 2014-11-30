/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package a2_server_mengqi;

import java.util.List;
import javax.ejb.Stateless;
import mengQidbllib.Sandy;


/**
 *
 * @author Meng
 */
@Stateless
public class SandyBean implements SandyBeanRemote, SandyBeanLocal {
    private Sandy sandy;
    public SandyBean(){
        sandy= new Sandy("OrdersDB", "ism6236", "ism6236bo");
    }
    @Override
    public String print(String s) {
       return s+" Meng Qi   35526649";
    }

    @Override
    public java.util.List<String> readTable(String tableName) {
       return sandy.readTable(tableName);
    }

    @Override
    public List<String> listPurchases(String name) {
        return sandy.listPurchases(name);
    }
    
    @Override
    public  void placeOrder(String customerId, String[] productIds, int[] quantities){
    sandy.placeOrder(customerId, productIds, quantities);
    }

    @Override
    public List<String> excuteSQL(String sql) {
        return sandy.excuteSQL(sql);
    }
    
   
}
