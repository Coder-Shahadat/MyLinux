import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.swing.*;
import javax.imageio.*;

public class Image extends JFrame  {
	  private JLabel label1;
	  private  JLabel label2;
	  
	  Image() throws IOException{
	  setLayout(new FlowLayout());
	 
	  File file = new
	  File("D:\\Study_Object\\3_2_Course\\networkprogramming\\ICE_logo.jpg");
	  BufferedImage image1 = ImageIO.read(file); 
	  ImageIcon imageIcon = new ImageIcon(image1); 
	  label1 = new JLabel(imageIcon); 
	  add(label1);
	 
	  File file2 = new File("D:\\Study_Object\\3_2_Course\\networkprogramming\\Pust_logo.png");
	  BufferedImage image2 = ImageIO.read(file2);
	  ImageIcon imageIcon2 = new ImageIcon(image2);
	  label2 = new JLabel(imageIcon2);
	  add(label2);
  }
public static void main(String args[]) throws IOException {
  Image gui = new Image();
  gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  gui.setVisible(true);
  gui.setSize(500,500);
  gui.setTitle("Image Program");
}
}