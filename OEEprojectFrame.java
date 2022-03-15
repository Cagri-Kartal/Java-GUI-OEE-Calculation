import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class OEEprojectFrame implements ActionListener{
	
	JTextField vardiyaAdet; 
	JTextField vardiyaSaat;
	JTextField molaAdet; 
	JTextField molaSaat; 
	JTextField parcaBasiSure; 
	JTextField plansizDurma; 
	JTextField uretilenUrun; 
	JTextField kaliteliUrun; 
	JButton button; 
	JFrame frame; 

	double e4;
	double e5;
	double e6;
	double e8;
	double d9;
	double e9;
	double e16;
	double e17;
	
	int vardiyaAdetNum;
	int vardiyaSaatNum;
	int molaAdetNum;
	int molaSaatNum;
	int parcaBasiSureNum; 	
	int plansizDurmaNum;
	
	public OEEprojectFrame(){
	
	frame = new JFrame("OEE HESAPLAMA");
	button = new JButton("HESAPLA");
	button.setFocusable(false);
	button.addActionListener(this);
	
	JLabel label1 = new JLabel("Vardiya Adet:");	
	vardiyaAdet = new JTextField("0"); 
	
	JLabel label2 = new JLabel("Vardiya Saat:");
	vardiyaSaat = new JTextField("0");
	
	JLabel label3 = new JLabel("Mola Adet:");
	molaAdet = new JTextField("0");
	
	JLabel label4 = new JLabel("Mola Saat:");
	molaSaat = new JTextField("0");

	JLabel label5 = new JLabel("Parça Baþi Süre:(sn)");
	parcaBasiSure = new JTextField("0");
	
	JLabel label6 = new JLabel("Plansiz Durma:(saat)");
	plansizDurma = new JTextField("0"); // saat cinsinden
	
	//JLabel label7 = new JLabel("Üretilen Ürün:");
	//uretilenUrun = new JTextField("0"); // adet cinsinden
	
	//JLabel label8 = new JLabel("Kaliteli Ürün:");
	//kaliteliUrun = new JTextField("0"); // adet cinsinden 
	
	JPanel panel1 = new JPanel();
	panel1.add(label1);
	panel1.add(vardiyaAdet);
//  panel1.setBounds(50,50,150,40);
	
	JPanel panel2 = new JPanel();
	panel2.add(label2);
	panel2.add(vardiyaSaat);
//	panel2.setBounds(100,50,150,40);
	
	JPanel panel3 = new JPanel();
	panel3.add(label3);
	panel3.add(molaAdet);
//	panel3.setBounds(50,100,150,40);
	
	JPanel panel4 = new JPanel();
	panel4.add(label4);
	panel4.add(molaSaat);
//	panel4.setBounds(100,100,150,40);
		
	JPanel panel5 = new JPanel();
	panel5.add(label5);
	panel5.add(parcaBasiSure);
//	panel5.setBounds(50,150,150,40);
		
	JPanel panel6 = new JPanel();
	panel6.add(label6);
	panel6.add(plansizDurma);
//	panel6.setBounds(100,150,150,40);
	
	//JPanel panel7 = new JPanel();
	//panel7.add(label2);
	//panel7.add(uretilenUrun);
//	panel7.setBounds(50,200,150,40);

	//JPanel panel8 = new JPanel();
	//panel8.add(label2);
	//panel8.add(kaliteliUrun);
//	panel8.setBounds(100,200,150,40);

	JPanel panel9 = new JPanel();
	panel9.add(button);
    panel9.setBounds(100,200,150,60);
	
	vardiyaAdet.setPreferredSize(new Dimension(80,30));
	vardiyaSaat.setPreferredSize(new Dimension(80,30));
	molaAdet.setPreferredSize(new Dimension(80,30));
	molaSaat.setPreferredSize(new Dimension(80,30));
	parcaBasiSure.setPreferredSize(new Dimension(80,30));
	plansizDurma.setPreferredSize(new Dimension(80,30));
	
	//uretilenUrun.setPreferredSize(new Dimension(80,30));
	//kaliteliUrun.setPreferredSize(new Dimension(80,30));
		
	
	// int g =integer.valueOf(uretilenUrun.getText());
	// int h =integer.valueOf(kaliteliUrun.getText());
		
	frame.add(panel1);
	frame.add(panel2);
	frame.add(panel3);
	frame.add(panel4);
	frame.add(panel5);
	frame.add(panel6);
	//frame.add(panel7);
	//frame.add(panel8);
	frame.add(panel9);
		
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(600,500);
	frame.setLayout(new GridLayout(2,4,10,10));
	frame.setVisible(true);
		
	/*
	e4 = vardiyaAdetNum*vardiyaSaatNum;
	e5 = molaAdetNum*molaSaatNum;
	e6 = e4-e5;
	e8 = plansizDurmaNum;
	d9 = parcaBasiSureNum;
	e9 = d9*3600;
	e16 = 444; // Üretilen Ürün Sayisi
	e17 = 333; // Kaliteli Ürün Sayisi
	
	
	System.out.println("e4: " + e4 + "e5: " + e5 + "e6: " + "e8: " + e8 + "d9: " + d9 + "e9: " + e9 + "e16: " + e16 + "e17: " + e17  );
	*/
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			
			vardiyaAdetNum = Integer.valueOf(vardiyaAdet.getText());
			vardiyaSaatNum = Integer.valueOf(vardiyaSaat.getText());
			molaAdetNum = Integer.valueOf(molaAdet.getText());
			molaSaatNum = Integer.valueOf(molaSaat.getText());
			parcaBasiSureNum = Integer.valueOf(parcaBasiSure.getText());
			plansizDurmaNum = Integer.valueOf(plansizDurma.getText());
			
			OEEprojectResults resultWindow = new OEEprojectResults (vardiyaAdetNum,
																	vardiyaSaatNum,
																	molaAdetNum,
																	molaSaatNum,
																	parcaBasiSureNum,
																	plansizDurmaNum);
			frame.dispose();
		}
	}
	
	
	
}
