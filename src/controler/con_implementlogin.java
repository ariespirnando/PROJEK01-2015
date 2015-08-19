/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import com.mysql.jdbc.PreparedStatement;
import java.sql.SQLException;
import model.mod_login;

/**
 *
 * @author Aries Pirnando
 */
public class con_implementlogin implements con_interfacelogin{

    @Override
    public mod_login simpan(mod_login o) throws SQLException {
         PreparedStatement st = (PreparedStatement)
               Komponen.koneksi.GetConnection().prepareStatement ("INSERT INTO login VALUES (?,?,?)");
        
        st.setString(1,o.getUsername());
        st.setString(2,o.getUser());
        st.setString(3,o.getPw());
        st.executeUpdate();
        return o;}
    
}
