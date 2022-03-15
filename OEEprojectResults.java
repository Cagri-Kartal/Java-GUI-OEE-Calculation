import javax.swing.*;
import java.awt.*;

public class OEEprojectResults {
		
		JFrame frame = new JFrame();
		
		JTextField textfield1 = new JTextField();
		JTextField textfield2 = new JTextField();
		JTextField textfield3 = new JTextField();
		JTextField textfield4 = new JTextField();
				
		OEEprojectResults(
				int vardiyaAdetNum,
				int vardiyaSaatNum,
				int molaAdetNum,
				int molaSaatNum,
				int parcaBasiSureNum,
				int plansizDurmaNum){
			
			System.out.println(
					vardiyaAdetNum+ " "+
					vardiyaSaatNum+ " "+
					molaAdetNum+ " "+
					molaSaatNum+ " "+
					parcaBasiSureNum+ " "+
					plansizDurmaNum);
			
			double e4 = vardiyaAdetNum*vardiyaSaatNum;
			double e5 = molaAdetNum*molaSaatNum;
			double e6 = e4-e5;
			double e8 = plansizDurmaNum;
			double d9 = parcaBasiSureNum;
			double e9 = d9/3600;
			double e16 = 444; // Üretilen Ürün Sayisi
			double e17 = 333; // Kaliteli Ürün Sayisi
			double e10 = e6-e8;

			double availability = (e10/e4);
			double performance = ( (e9*e16) / e10);
			double quality = (e17/e16);
			double oee = availability*performance*quality;
			
			System.out.println(
					availability + " " +
					performance + 
					quality + 
					oee);
			
			textfield1.setText("Availability: " + availability);
			textfield2.setText("Performance: " + performance);		
			textfield3.setText("Quality: " + quality);
			textfield4.setText("OEE: " + oee);

			textfield1.setPreferredSize(new Dimension(250,50));
			textfield2.setPreferredSize(new Dimension(250,50));
			textfield3.setPreferredSize(new Dimension(250,50));
			textfield4.setPreferredSize(new Dimension(250,50));
			
			frame.add(textfield1);
			frame.add(textfield2);
			frame.add(textfield3);
			frame.add(textfield4);
			
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setSize(600,600);
			frame.setLayout(new FlowLayout());
			frame.setVisible(true);
					
	}
}
