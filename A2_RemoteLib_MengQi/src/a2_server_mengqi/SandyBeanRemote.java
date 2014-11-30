/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package a2_server_mengqi;


import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author Meng
 */
@Remote
public interface SandyBeanRemote {
    public String print(String s);
    public java.util.List<String> readTable(String tableName);
    public List<String> listPurchases(String name);
    public  void placeOrder(String customerId, String[] productIds, int[] quantities);

    List<String> excuteSQL(String sql);
}
