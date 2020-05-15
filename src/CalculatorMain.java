import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class CalculatorMain implements ActionListener {
	JFrame jf;
	JLabel displab;
	JTextField textField;
	JButton clearb;
	JButton bracb;
	JButton percentb;
	JButton backb;
	JButton mulb;
	JButton divb;
	JButton addb;
	JButton equalb;
	JButton sevenb;
	JButton eightb;
	JButton nineb;
	JButton fourb;
	JButton fiveb;
	JButton sixb;
	JButton oneb;
	JButton twob;
	JButton threeb;
	JButton dotb;
	JButton zerob;
	JButton minusb;
	
	boolean flag=false;
	 int calculation;
	 double number,ans;
	
	public CalculatorMain()
	{
		jf=new JFrame("C A L C U L A T O R");
		jf.setLayout(null);
		jf.setSize(325, 500);
		jf.setLocation(1040,50);
		jf.getContentPane().setLayout(null);
		jf.getContentPane().setBackground(Color.black);
	   
		
		displab=new JLabel();
		displab.setBounds(4, 13, 317, 140);
		displab.setBackground(Color.yellow);
		displab.setOpaque(true);
		displab.setFont(new Font("Arial", Font.PLAIN, 30));
		displab.setHorizontalAlignment(SwingConstants.RIGHT);
		jf.add(displab);
		

		clearb=new  JButton("C");
		clearb.setBounds(3, 160, 76,60);
		clearb.setFont(new Font("Arial", Font.PLAIN, 30));
		clearb.setBackground(Color.lightGray);
		clearb.addActionListener(this);
		jf.add(clearb);
		
		bracb=new  JButton("√");
		bracb.setBounds(81, 160, 76,60);
		bracb.setFont(new Font("Arial", Font.PLAIN, 30));
		bracb.setBackground(Color.lightGray);
		bracb.addActionListener(this);
		jf.add(bracb);
		
		percentb=new  JButton("x\u00B2");
		percentb.setBounds(159, 160, 76,60);
		percentb.setFont(new Font("Arial", Font.PLAIN, 25));
		percentb.setBackground(Color.lightGray);
		percentb.addActionListener(this);
		jf.add(percentb);
		
		backb=new  JButton("<<");
		backb.setBounds(237, 160, 82,59);
		backb.setFont(new Font("Arial", Font.PLAIN, 30));
		backb.setBackground(Color.lightGray);
		backb.addActionListener(this);
		jf.add(backb);
		
		mulb=new  JButton("X");
		mulb.setBounds(237, 221, 82,59);
		mulb.setFont(new Font("Arial", Font.PLAIN, 30));
		mulb.setBackground(Color.lightGray);
		mulb.addActionListener(this);
		jf.add(mulb);
		
		divb=new  JButton("/");
		divb.setBounds(237, 282, 82,59);
		divb.setFont(new Font("Arial", Font.PLAIN, 30));
		divb.setBackground(Color.lightGray);
		divb.addActionListener(this);
		jf.add(divb);
		
		addb=new  JButton("+");
		addb.setBounds(237, 343, 82,59);
		addb.setFont(new Font("Arial", Font.PLAIN, 30));
		addb.setBackground(Color.lightGray);
		addb.addActionListener(this);
		jf.add(addb);
		
		equalb=new  JButton("=");
		equalb.setBounds(237, 404, 82,58);
		equalb.setFont(new Font("Arial", Font.PLAIN, 30));
		equalb.setBackground(Color.gray);
		equalb.addActionListener(this);
		jf.add(equalb);
		
		sevenb=new  JButton("7");
		sevenb.setBounds(3, 222, 76,58);
		sevenb.setFont(new Font("Arial", Font.PLAIN, 25));
		sevenb.setBackground(Color.lightGray);
		sevenb.addActionListener(this);
		jf.add(sevenb);
		
		eightb=new  JButton("8");
		eightb.setBounds(81, 222, 76,58);
		eightb.setFont(new Font("Arial", Font.PLAIN, 25));
		eightb.setBackground(Color.lightGray);
		eightb.addActionListener(this);
		jf.add(eightb);
		
		nineb=new  JButton("9");
		nineb.setBounds(159, 222, 76,58);
		nineb.setFont(new Font("Arial", Font.PLAIN, 25));
		nineb.setBackground(Color.lightGray);
		nineb.addActionListener(this);
		jf.add(nineb);
		
		fourb=new  JButton("4");
		fourb.setBounds(3, 282, 76,58);
		fourb.setFont(new Font("Arial", Font.PLAIN, 25));
		fourb.setBackground(Color.lightGray);
		fourb.addActionListener(this);
		jf.add(fourb);
		
		fiveb=new  JButton("5");
		fiveb.setBounds(81, 282, 76,58);
		fiveb.setFont(new Font("Arial", Font.PLAIN, 25));
		fiveb.setBackground(Color.lightGray);
		fiveb.addActionListener(this);
		jf.add(fiveb);
		
		sixb=new  JButton("6");
		sixb.setBounds(159, 282, 76,58);
		sixb.setFont(new Font("Arial", Font.PLAIN, 25));
		sixb.setBackground(Color.lightGray);
		sixb.addActionListener(this);
		jf.add(sixb);
		
		oneb=new  JButton("1");
		oneb.setBounds(3, 342, 76,58);
		oneb.setFont(new Font("Arial", Font.PLAIN, 25));
		oneb.setBackground(Color.lightGray);
		oneb.addActionListener(this);
		jf.add(oneb);
		
		twob=new  JButton("2");
		twob.setBounds(81, 342, 76,58);
		twob.setFont(new Font("Arial", Font.PLAIN, 25));
		twob.setBackground(Color.lightGray);
		twob.addActionListener(this);
		jf.add(twob);
		
		threeb=new  JButton("3");
		threeb.setBounds(159, 342, 76,58);
		threeb.setFont(new Font("Arial", Font.PLAIN, 25));
		threeb.setBackground(Color.lightGray);
		threeb.addActionListener(this);
		jf.add(threeb);
		
		dotb=new  JButton(".");
		dotb.setBounds(3, 402, 76,60);
		dotb.setFont(new Font("Arial", Font.PLAIN, 40));
		dotb.setBackground(Color.lightGray);
		dotb.addActionListener(this);
		jf.add(dotb);
		
		zerob=new  JButton("0");
		zerob.setBounds(81, 402, 76,60);
		zerob.setFont(new Font("Arial", Font.PLAIN, 25));
		zerob.setBackground(Color.lightGray);
		zerob.addActionListener(this);
		jf.add(zerob);
		
		minusb=new  JButton("-");
		minusb.setBounds(159, 402, 76,60 );
		minusb.setFont(new Font("Arial", Font.PLAIN, 30));
		minusb.setBackground(Color.lightGray);
		minusb.addActionListener(this);
		jf.add(minusb);
		
	
		
		
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
	}

	public static void main(String[] args) {
		new CalculatorMain();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) { 
		
		if(e.getSource()== minusb)
		{
			 number = Double.parseDouble(displab.getText());
	            displab.setText("");
	            calculation = 2;
		}	
		else if(e.getSource()== zerob)
		{
			if(displab.getText().equals("0"))
			{return;}
			else {
			displab.setText(displab.getText( )+"0");
		}}
		else if(e.getSource()== dotb)
		{
			if(displab.getText().contains(".")) {
				return; }
			else {
			displab.setText(displab.getText( )+".");
		}}
		else if(e.getSource()== threeb)
		{
			displab.setText(displab.getText( )+"3");
		}
		else if(e.getSource()== twob)
		{
			displab.setText(displab.getText( )+"2");
		}
		else if(e.getSource()== oneb)
		{
			displab.setText(displab.getText( )+"1");
		}
		else if(e.getSource()== sixb)
		{
			displab.setText(displab.getText( )+"6");
		}
		else if(e.getSource()== fiveb)
		{
			displab.setText(displab.getText( )+"5");
		}
		else if(e.getSource()== fourb)
		{
			displab.setText(displab.getText( )+"4");
		}
		else if(e.getSource()== nineb)
		{
			displab.setText(displab.getText( )+"9");
		}
		else if(e.getSource()== eightb)
		{
			displab.setText(displab.getText( )+"8");
		}
		else if(e.getSource()== sevenb)
		{
			displab.setText(displab.getText( )+"7");
		}
		else if(e.getSource()== addb)
		{
			
	            number = Double.parseDouble(displab.getText());
	            displab.setText("");
	            calculation = 1;
		}
		else if(e.getSource()== divb)
		{
			 number = Double.parseDouble(displab.getText());
	            displab.setText("");
	            calculation = 4;
		}
		else if(e.getSource()== mulb)
		{
			 number = Double.parseDouble(displab.getText());
	            displab.setText("");
	            calculation = 3;
		}
		else if(e.getSource()==backb)
		{
			int len=displab.getText().length();
			int num=len - 1;
			if(len>0) 
			{
				StringBuilder back = new StringBuilder(displab.getText());
				back.deleteCharAt(num);
				displab.setText(back.toString());
			}
				//if(displab.getText().endsWith(""))
		}
		else if(e.getSource()== percentb)
		{
            number = Double.parseDouble(displab.getText());
            displab.setText( Math.round( number)+"^2");
            calculation=6;
            
		}
		else if(e.getSource()== bracb)
		{
			 number = Double.parseDouble(displab.getText());
			 displab.setText("√"+Math.round(number) );
	            calculation = 5;
		}
		else if(e.getSource()== clearb)
		{
			displab.setText("");
		}
		else if(e.getSource()==equalb) 
		{
			switch (calculation) {
            case 1:
                ans = number + Double.parseDouble(displab.getText());
                if (Double.toString(ans).endsWith(".0")) {
                	displab.setText(Double.toString(ans).replace(".0", ""));
                } else {
                	displab.setText(Double.toString(ans));
                }
               
                break;
            case 2:
            	ans = number - Double.parseDouble(displab.getText());
                if (Double.toString(ans).endsWith(".0")) {
                	displab.setText(Double.toString(ans).replace(".0", ""));
                } else {
                	displab.setText(Double.toString(ans));
                }
              
                break;
            case 3:
            	ans = number * Double.parseDouble(displab.getText());
                if (Double.toString(ans).endsWith(".0")) {
                	displab.setText(Double.toString(ans).replace(".0", ""));
                } else {
                	displab.setText(Double.toString(ans));
                }
           
                break;
            case 4:
            	ans = number / Double.parseDouble(displab.getText());
                if (Double.toString(ans).endsWith(".0")) {
                	displab.setText(Double.toString(ans).replace(".0", ""));
                } else {
                	displab.setText(Double.toString(ans));
                }
              
                break;
            case 5:
            	  Double sqrt = Math.sqrt(number);
            	  if (Double.toString(sqrt).endsWith(".0")) {
                  	displab.setText(Double.toString(sqrt).replace(".0", ""));
                  } else {
                  	displab.setText(Double.toString(sqrt));
                  }
  	            break;
  	            
            case 6:
            	 double square = Math.pow(number, 2);
                 String string = Double.toString(square);
                 if (string.endsWith(".0")) {
                 	displab.setText(string.replace(".0", ""));
                 } else {
                 	displab.setText(string);
                 }
                 break;
            	
            	

        }

		
		}
		
	}
}
