/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import java.sql.SQLException;
import java.util.List;
import model.mod_petugas;

/**
 *
 * @author Aries Pirnando
 */
public interface con_interfacepetugas {
    mod_petugas simpan (mod_petugas o) throws SQLException;
    void ubah(mod_petugas o) throws SQLException;
    void hapus(String Nik) throws SQLException;
    List<mod_petugas> tampil() throws SQLException;  
    List<mod_petugas> cari(String Nik) throws SQLException;
            
}
