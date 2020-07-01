import javax.imageio.ImageIO;
import javax.swing.*;

import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.swing.JPanel;


public class MainFormAppearance {

   public JPanel createContentPane() throws IOException  {
		//������� ������ ��� ���������� �����������
		
		JPanel totalGUI = new JPanel();
		totalGUI.setLayout(null);
		
		//�������� �����
		
		JLabel blueLabel = new JLabel("����� �� ������� =)");
		blueLabel.setLocation(10,10); //������� ������ �����
		blueLabel.setSize(300,100); // ������ ������� �������
		blueLabel.setHorizontalAlignment(0);
		
		//������� ������
		JButton redButton = new JButton("�������� ������ 1 :))");
		redButton.setLocation(120,200);
		redButton.setSize(200,50);
		
		//������� ���������� �������.
	    ActionListener BtnAct = new ActListin();
	    //��������� ���������� ������.
	    redButton.addActionListener(BtnAct);
	    totalGUI.add(redButton);

	        
	       BufferedImage image = ImageIO.read(new File("src/descim.jpg"));
	       Graphics g2 = image.getGraphics();
	       g2.drawImage(image, 0, 0, null);
	       g2.drawLine(50, 50, 100, 100);

	    
	    return totalGUI;
	    

		
		
		
	}


   public static void main(String[] args) {
		// TODO Auto-generated method stub
      
	}

}