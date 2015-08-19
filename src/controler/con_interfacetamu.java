/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import java.sql.SQLException;
import java.util.List;
import model.mod_tamu;

/**
 *
 * @author Aries Pirnando
 */
public interface con_interfacetamu {
    mod_tamu simpan (mod_tamu o) throws SQLException;
    void ubah(mod_tamu o) throws SQLException;
    void hapus(String No) throws SQLException;
    List<mod_tamu> tampil() throws SQLException;  
    List<mod_tamu> cari(String Nama) throws SQLException;
    List<mod_tamu> cariTanggal(String Nama) throws SQLException;
    List<mod_tamu> cariPT(String Nama) throws SQLException;
    List<mod_tamu> tampiltujuan() throws SQLException;
     
    List<mod_tamu> cariTUJUAN(String Nama) throws SQLException;
    List<mod_tamu> cariTanggalTUJUAN(String Nama) throws SQLException;
    List<mod_tamu> cariPTTUJUAN(String Nama) throws SQLException;
}
