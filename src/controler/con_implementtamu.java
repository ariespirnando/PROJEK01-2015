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
import model.mod_tamu;

/**
 *
 * @author Aries Pirnando
 */
public class con_implementtamu implements con_interfacetamu{

    @Override
    public mod_tamu simpan(mod_tamu o) throws SQLException {
        
        try {
            PreparedStatement st = (PreparedStatement)
               Komponen.koneksi.GetConnection().prepareStatement ("INSERT INTO dt_tamu VALUES (Null,?,?,"
                       + "?,?,?,?,?,?,?,?)");
       
            st.setString(1,o.getNamaTamu());
            st.setString(2,o.getTanggal());
            st.setString(3,o.getJamMasuk());
            st.setString(4,o.getJamKeluar());
            st.setString(5,o.getYangDituju());
            st.setString(6,o.getNoId());
            st.setString(7,o.getWarnaid());
            st.setString(8,o.getIdTukar());
            st.setString(9,o.getPt());
            st.setString(10,o.getPesan());
            st.executeUpdate();
        } catch (Exception e) {
            System.out.print("kenapa");
        }
       
        return o; 
    }

    @Override
    public void ubah(mod_tamu o) throws SQLException {
        try {
            PreparedStatement st = (PreparedStatement)
                Komponen.koneksi.GetConnection().prepareStatement("UPDATE dt_tamu Set NAMATAMU = ?, TANGGAL = ?, MASUK = ?, KELUAR = ?, DITUJU = ?, NOID = ?, WarnaID = ?, IDDITUKAR = ?, PT = ?, PESAN = ? WHERE NO = ?");
            try {
                
            } catch (Exception e) {
            }
        st.setString(1,o.getNamaTamu());
        st.setString(2,o.getTanggal());
        st.setString(3,o.getJamMasuk());
        st.setString(4,o.getJamKeluar());
        st.setString(5,o.getYangDituju());
        st.setString(6,o.getNoId());
        st.setString(7,o.getWarnaid());
        st.setString(8,o.getIdTukar());
        st.setString(9,o.getPt());
        st.setString(10,o.getPesan());
        st.setInt(11,o.getNo());
        st.executeUpdate();
        } catch (Exception e) {
            System.out.println("ping");
        }
        
    }

    @Override
    public void hapus(String No) throws SQLException {
        PreparedStatement st = (PreparedStatement)
                Komponen.koneksi.GetConnection().prepareStatement
                ("Delete from dt_tamu WHERE  NO = ?");
        st.setString(1,No);
        st.executeUpdate();
    }
        

    @Override
    public List<mod_tamu> tampil() throws SQLException {
        Statement st = (Statement) Komponen.koneksi.GetConnection().createStatement();
        ResultSet rs = st.executeQuery("Select * From dt_tamu");
        List<mod_tamu> ltamu = new ArrayList<>();
        while(rs.next()){
            mod_tamu tamu = new mod_tamu();
            tamu.setNo(rs.getInt("NO"));
            tamu.setNamaTamu(rs.getString("NAMATAMU"));
            tamu.setTanggal(rs.getString("TANGGAL"));
            tamu.setJamMasuk(rs.getString("MASUK"));
            tamu.setJamKeluar(rs.getString("KELUAR"));
            tamu.setYangDituju(rs.getString("DITUJU"));
            tamu.setNoId(rs.getString("NOID"));
            tamu.setWarnaid(rs.getString("WarnaID"));
            tamu.setIdTukar(rs.getString("IDDITUKAR"));
            tamu.setPt(rs.getString("PT"));
            tamu.setPesan(rs.getString("PESAN"));
            ltamu.add(tamu);
        }
        return ltamu;
    }

    @Override
    public List<mod_tamu> cari(String Nama) throws SQLException {
     List<mod_tamu> lb =null;
        try {
            lb =new ArrayList<mod_tamu>();
             PreparedStatement st = (PreparedStatement)
                Komponen.koneksi.GetConnection().prepareStatement("Select * From dt_tamu Where NAMATAMU like ?");
             st.setString(1,"%"+Nama+"%");
             ResultSet rs=st.executeQuery();
             while(rs.next()){
                mod_tamu tamu = new mod_tamu();
                tamu.setNo(rs.getInt("NO"));
                tamu.setNamaTamu(rs.getString("NAMATAMU"));
                tamu.setTanggal(rs.getString("TANGGAL"));
                tamu.setJamMasuk(rs.getString("MASUK"));
                tamu.setJamKeluar(rs.getString("KELUAR"));
                tamu.setYangDituju(rs.getString("DITUJU"));
                tamu.setNoId(rs.getString("NOID"));
                tamu.setWarnaid(rs.getString("WarnaID"));
                tamu.setIdTukar(rs.getString("IDDITUKAR"));
                tamu.setPt(rs.getString("PT"));
                tamu.setPesan(rs.getString("PESAN"));
                lb.add(tamu);
             }
        } catch (Exception e) 
                {
        }
        return lb;   
    }

    @Override
    public List<mod_tamu> cariTanggal(String Nama) throws SQLException {
        List<mod_tamu> lb =null;
        try {
            lb =new ArrayList<mod_tamu>();
             PreparedStatement st = (PreparedStatement)
                Komponen.koneksi.GetConnection().prepareStatement("Select * From dt_tamu Where TANGGAL like ?");
             st.setString(1,"%"+Nama+"%");
             ResultSet rs=st.executeQuery();
             while(rs.next()){
                mod_tamu tamu = new mod_tamu();
                tamu.setNo(rs.getInt("NO"));
                tamu.setNamaTamu(rs.getString("NAMATAMU"));
                tamu.setTanggal(rs.getString("TANGGAL"));
                tamu.setJamMasuk(rs.getString("MASUK"));
                tamu.setJamKeluar(rs.getString("KELUAR"));
                tamu.setYangDituju(rs.getString("DITUJU"));
                tamu.setNoId(rs.getString("NOID"));
                tamu.setWarnaid(rs.getString("WarnaID"));
                tamu.setIdTukar(rs.getString("IDDITUKAR"));
                tamu.setPt(rs.getString("PT"));
                tamu.setPesan(rs.getString("PESAN"));
                lb.add(tamu);
             }
        } catch (Exception e) 
                {
        }
        return lb;  
    }

    @Override
    public List<mod_tamu> cariPT(String Nama) throws SQLException {
        List<mod_tamu> lb =null;
        try {
            lb =new ArrayList<mod_tamu>();
             PreparedStatement st = (PreparedStatement)
                Komponen.koneksi.GetConnection().prepareStatement("Select * From dt_tamu Where PT like ?");
             st.setString(1,"%"+Nama+"%");
             ResultSet rs=st.executeQuery();
             while(rs.next()){
                mod_tamu tamu = new mod_tamu();
                tamu.setNo(rs.getInt("NO"));
                tamu.setNamaTamu(rs.getString("NAMATAMU"));
                tamu.setTanggal(rs.getString("TANGGAL"));
                tamu.setJamMasuk(rs.getString("MASUK"));
                tamu.setJamKeluar(rs.getString("KELUAR"));
                tamu.setYangDituju(rs.getString("DITUJU"));
                tamu.setNoId(rs.getString("NOID"));
                tamu.setWarnaid(rs.getString("WarnaID"));
                tamu.setIdTukar(rs.getString("IDDITUKAR"));
                tamu.setPt(rs.getString("PT"));
                tamu.setPesan(rs.getString("PESAN"));
                lb.add(tamu);
             }
        } catch (Exception e) 
                {
        }
        return lb;  
    }

    @Override
    public List<mod_tamu> tampiltujuan() throws SQLException {
        Statement st = (Statement) Komponen.koneksi.GetConnection().createStatement();
        ResultSet rs = st.executeQuery("Select * From dt_tamu WHERE DITUJU = 'IT'");
        List<mod_tamu> ltamu = new ArrayList<>();
        while(rs.next()){
            mod_tamu tamu = new mod_tamu();
            tamu.setNo(rs.getInt("NO"));
            tamu.setNamaTamu(rs.getString("NAMATAMU"));
            tamu.setTanggal(rs.getString("TANGGAL"));
            tamu.setJamMasuk(rs.getString("MASUK"));
            tamu.setJamKeluar(rs.getString("KELUAR"));
            tamu.setYangDituju(rs.getString("DITUJU"));
            tamu.setNoId(rs.getString("NOID"));
            tamu.setWarnaid(rs.getString("WarnaID"));
            tamu.setIdTukar(rs.getString("IDDITUKAR"));
            tamu.setPt(rs.getString("PT"));
            tamu.setPesan(rs.getString("PESAN"));
            ltamu.add(tamu);
        }
        return ltamu;}

    @Override
    public List<mod_tamu> cariTUJUAN(String Nama) throws SQLException {
        List<mod_tamu> lb =null;
        try {
            lb =new ArrayList<mod_tamu>();
             PreparedStatement st = (PreparedStatement)
                Komponen.koneksi.GetConnection().prepareStatement("Select * From dt_tamu Where NAMATAMU like ? AND DITUJU = 'IT'");
             st.setString(1,"%"+Nama+"%");
             ResultSet rs=st.executeQuery();
             while(rs.next()){
                mod_tamu tamu = new mod_tamu();
                tamu.setNo(rs.getInt("NO"));
                tamu.setNamaTamu(rs.getString("NAMATAMU"));
                tamu.setTanggal(rs.getString("TANGGAL"));
                tamu.setJamMasuk(rs.getString("MASUK"));
                tamu.setJamKeluar(rs.getString("KELUAR"));
                tamu.setYangDituju(rs.getString("DITUJU"));
                tamu.setNoId(rs.getString("NOID"));
                tamu.setWarnaid(rs.getString("WarnaID"));
                tamu.setIdTukar(rs.getString("IDDITUKAR"));
                tamu.setPt(rs.getString("PT"));
                tamu.setPesan(rs.getString("PESAN"));
                lb.add(tamu);
             }
        } catch (Exception e) 
                {
        }
        return lb;
       }

    @Override
    public List<mod_tamu> cariTanggalTUJUAN(String Nama) throws SQLException {
        List<mod_tamu> lb =null;
        try {
            lb =new ArrayList<mod_tamu>();
             PreparedStatement st = (PreparedStatement)
                Komponen.koneksi.GetConnection().prepareStatement("Select * From dt_tamu Where TANGGAL like ? AND DITUJU = 'IT'");
             st.setString(1,"%"+Nama+"%");
             ResultSet rs=st.executeQuery();
             while(rs.next()){
                mod_tamu tamu = new mod_tamu();
                tamu.setNo(rs.getInt("NO"));
                tamu.setNamaTamu(rs.getString("NAMATAMU"));
                tamu.setTanggal(rs.getString("TANGGAL"));
                tamu.setJamMasuk(rs.getString("MASUK"));
                tamu.setJamKeluar(rs.getString("KELUAR"));
                tamu.setYangDituju(rs.getString("DITUJU"));
                tamu.setNoId(rs.getString("NOID"));
                tamu.setWarnaid(rs.getString("WarnaID"));
                tamu.setIdTukar(rs.getString("IDDITUKAR"));
                tamu.setPt(rs.getString("PT"));
                tamu.setPesan(rs.getString("PESAN"));
                lb.add(tamu);
             }
        } catch (Exception e) 
                {
        }
        return lb;  
    }

    @Override
    public List<mod_tamu> cariPTTUJUAN(String Nama) throws SQLException {
        List<mod_tamu> lb =null;
        try {
            lb =new ArrayList<mod_tamu>();
             PreparedStatement st = (PreparedStatement)
                Komponen.koneksi.GetConnection().prepareStatement("Select * From dt_tamu Where PT like ?");
             st.setString(1,"%"+Nama+"%");
             ResultSet rs=st.executeQuery();
             while(rs.next()){
                mod_tamu tamu = new mod_tamu();
                tamu.setNo(rs.getInt("NO"));
                tamu.setNamaTamu(rs.getString("NAMATAMU"));
                tamu.setTanggal(rs.getString("TANGGAL"));
                tamu.setJamMasuk(rs.getString("MASUK"));
                tamu.setJamKeluar(rs.getString("KELUAR"));
                tamu.setYangDituju(rs.getString("DITUJU"));
                tamu.setNoId(rs.getString("NOID"));
                tamu.setWarnaid(rs.getString("WarnaID"));
                tamu.setIdTukar(rs.getString("IDDITUKAR"));
                tamu.setPt(rs.getString("PT"));
                tamu.setPesan(rs.getString("PESAN"));
                lb.add(tamu);
             }
        } catch (Exception e) 
                {
        }
        return lb;  
    }
    
}
