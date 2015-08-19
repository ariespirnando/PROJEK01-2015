/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.mod_petugas;

/**
 *
 * @author Aries Pirnando
 */
public class con_implementpetugas implements con_interfacepetugas{

    @Override
    public mod_petugas simpan(mod_petugas o) throws SQLException {
        PreparedStatement st = (PreparedStatement)
               Komponen.koneksi.GetConnection().prepareStatement ("INSERT INTO dt_petugas VALUES (?,?,?)");
        st.setString(1,o.getNik());
        st.setString(2,o.getNamaPetugas());
        st.setString(3,o.getJamMasuk());
        st.executeUpdate();
        return o;
    }

    @Override
    public void ubah(mod_petugas o) throws SQLException {
        PreparedStatement st = (PreparedStatement)
                Komponen.koneksi.GetConnection().prepareStatement("UPDATE dt_petugas Set NAMAPETUGAS = ?, JAM = ? WHERE NIK = ?");
        st.setString(1,o.getNamaPetugas());
        st.setString(2,o.getJamMasuk());
        st.setString(3,o.getNik());
        st.executeUpdate();
    }

    @Override
    public void hapus(String Nik) throws SQLException {
        PreparedStatement st = (PreparedStatement)
                Komponen.koneksi.GetConnection().prepareStatement
                ("Delete from dt_petugas WHERE NIK = ?");
        st.setString(1,Nik);
        st.executeUpdate();}

    @Override
    public List<mod_petugas> tampil() throws SQLException {
        Statement st = (Statement) Komponen.koneksi.GetConnection().createStatement();
        ResultSet rs = st.executeQuery("Select * From dt_petugas");
        List<mod_petugas> lpegawai = new ArrayList<>();
        while(rs.next()){
            mod_petugas pegawai = new mod_petugas();
            pegawai.setNik(rs.getString("NIK"));
            pegawai.setNamaPetugas(rs.getString("NAMAPETUGAS"));
            pegawai.setJamMasuk(rs.getString("JAM"));
            lpegawai.add(pegawai);
        }
        return lpegawai;
    }

    @Override
    public List<mod_petugas> cari(String Nik) throws SQLException {
        List<mod_petugas> lb =null;
        try {
            lb =new ArrayList<mod_petugas>();
             PreparedStatement st = (PreparedStatement)
                Komponen.koneksi.GetConnection().prepareStatement("Select * From dt_petugas Where NIK like ?");
             st.setString(1,"%"+Nik+"%");
             ResultSet rs=st.executeQuery();
             while(rs.next()){
                mod_petugas pegawai = new mod_petugas();
                pegawai.setNik(rs.getString("NIK"));
                pegawai.setNamaPetugas(rs.getString("NAMAPETUGAS"));
                pegawai.setJamMasuk(rs.getString("JAM"));
                lb.add(pegawai);
        }
        } catch (Exception e) {
        }
        return lb;
    }

    

   

    
}



    
    

