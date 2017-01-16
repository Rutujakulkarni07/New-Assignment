import javax.swing.*;
import java.awt.*;
public class MyTable extends JFrame
	{
		MyTable()
		{
			String data[][]={{"101","Rutuja","67000"},
				{"102","Chetan","700000"},
				{"103","Yogini","50000"},
				{"102","Chetan","700000"},
				{"103","Yogini","50000"},
				{"102","Chetan","700000"},
				{"103","Yogini","50000"},
				{"102","Chetan","700000"},
				{"102","Chetan","700000"},
				{"103","Yogini","50000"},
				{"102","Chetan","700000"},
				{"103","Yogini","50000"},
				{"102","Chetan","700000"},
				{"103","Yogini","50000"},
				{"102","Chetan","700000"},
				{"103","Yogini","50000"},
				{"102","Chetan","700000"},
				{"103","Yogini","50000"},
				{"102","Chetan","700000"},
				{"102","Chetan","700000"},
				{"103","Yogini","50000"},
				{"102","Chetan","700000"},
				{"103","Yogini","50000"},
				{"102","Chetan","700000"},
				{"103","Yogini","50000"},
				{"102","Chetan","700000"},
				{"103","Yogini","50000"},
				{"102","Chetan","700000"},
				{"103","Yogini","50000"},
				{"102","Chetan","700000"},
				{"103","Yogini","50000"},
				{"102","Chetan","700000"},
				{"103","Yogini","50000"},
				{"102","Chetan","700000"},
				{"103","Yogini","50000"},
				{"102","Chetan","700000"},
				
				{"102","Chetan","700000"},
				{"103","Yogini","50000"},
				{"102","Chetan","700000"},
				{"103","Yogini","50000"},
				{"102","Chetan","700000"},
				{"103","Yogini","50000"},
				{"102","Chetan","700000"},
				{"103","Yogini","50000"},
				{"102","Chetan","700000"},
				{"103","Yogini","50000"},
				{"102","Chetan","700000"},
				{"103","Yogini","50000"},
				{"102","Chetan","700000"},
				{"103","Yogini","50000"},{"102","Chetan","700000"},
				{"103","Yogini","50000"},{"102","Chetan","700000"},
				{"103","Yogini","50000"},
				{"103","Yogini","50000"}};
			String column[]={"ID","NAME","SALARY"};
			JTable jt=new JTable(data,column);
			jt.setBounds(40,40,200,300);
			JScrollPane sp=new JScrollPane(jt);
			add(sp);
			setSize(300,400);
			setLayout(new FlowLayout());
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setVisible(true);
		}
			public static void main(String args[])
		{
				new MyTable();
		}
	}



			