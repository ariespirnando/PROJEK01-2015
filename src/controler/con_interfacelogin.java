/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import java.sql.SQLException;
import model.mod_login;

/**
 *
 * @author Aries Pirnando
 */
public interface con_interfacelogin {
    mod_login simpan (mod_login o) throws SQLException;
}
