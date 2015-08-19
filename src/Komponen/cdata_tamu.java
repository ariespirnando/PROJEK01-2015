/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Komponen;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
/**
 *
 * @author culun fitra
 */
public class cdata_tamu extends JPanel
{
private Image image;
    public cdata_tamu()
    {
     image = new ImageIcon(getClass().getResource("/picture/DATA_TAMU CETAK.jpg")).getImage();
    }
@Override
protected void paintComponent(Graphics grphcs)
    {
      super.paintComponent(grphcs);
      Graphics2D gd = (Graphics2D) grphcs.create();
      gd.drawImage(image, 0, 0, 1055,600,null);
    }
}

