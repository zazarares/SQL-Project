package PanouPrincipal;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Label;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.eclipse.swt.SWT;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.DateTime;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;

public class Salariul {

	protected Shell shell;
	private Text text;
	private Text text_1;
	private Text text_2;
	private Text text_3;
	private Text text_4;
	private Text text_5;
	
	  public double StringToDouble(String S)
	    {
	        double x=0;
	        x=S.charAt(0)*10+S.charAt(1);
	        x=x+S.charAt(3)*0.1+S.charAt(4)*0.01;
	        return x;
	        
	    }
	
	  public int profit_medic(Connection c,String nume,String prenume) throws SQLException
	    {
		  return 0;/*
	        if(!c.isClosed())
	        {Statement st=c.createStatement();
	        ResultSet rsi=st.executeQuery("Select ora,nume_medic,prenume_medic from programare p left join analize an on  p.ID=an.ID_programare left join diagnostic di on di.ID_Parafa=an.ID_Parafa left join medic m on m.codul_de_parafa=di.ID_parafa");
	        Statement st1 = c.createStatement();
	        Statement st2 = c.createStatement();
	        ResultSet rsp=st1.executeQuery("Select * from preturi_extra p left join medic m on p.specializare=m.codul_de_parafa ");
	       String s;
	       String n;
	       String p;
	        while(rsi.next())
	        { 
	            s=rsi.getString("ora");
	            n=rsi.getString("nume_medic");
	            p=rsi.getString("prenume_medic");
	        if(p.equals(prenume) && n.equals(nume))
	        {
	            ResultSet rsf=st2.executeQuery("Select ora_final,nume_medic,prenume_medic from diagnostic d left join medic m on d.ID_parafa=m.codul_de_parafa");

	            while(rsf.next())
	            {
	            n=rsf.getString("nume_medic");
	            p=rsf.getString("prenume_medic");
	            String s2;
	            System.out.println("nu");
	            if(p!=null && n!=null)
	            if(nume.equals(n) && prenume.equals(p))
	                {
	                s2=rsf.getString("ora_final");
	                double o1,o2;
	                o1=StringToDouble(s);
	                o2=StringToDouble(s2);
	                double e=o2-o1-2;
	                System.out.println("aiciBA");
	                //rsf.close();
	                return (int)e*rsp.getInt("pret_extra");

	                }
	            }
	            rsf.close();
	            st2.close();
	        }
	        else
	        ;
	        }
	        }
	     throw new RuntimeException("EROARE");*/
	    }
	
    
    

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Salariul window = new Salariul();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(1270, 758);
		shell.setText("SWT Application");
		shell.setLayout(new GridLayout(7, false));
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		
		Label lblSectiuneaSalarii = new Label(shell, SWT.NONE);
		lblSectiuneaSalarii.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1));
		lblSectiuneaSalarii.setBackground(SWTResourceManager.getColor(SWT.COLOR_DARK_RED));
		lblSectiuneaSalarii.setFont(SWTResourceManager.getFont("Times New Roman Baltic", 12, SWT.BOLD));
		lblSectiuneaSalarii.setText("SECTIUNEA SALARII");
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		
		Label lblNewLabel = new Label(shell, SWT.BORDER);
		lblNewLabel.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblNewLabel.setFont(SWTResourceManager.getFont("Times New Roman Baltic", 10, SWT.NORMAL));
		lblNewLabel.setText("Nume");
		
		text_2 = new Text(shell, SWT.BORDER);
		text_2.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		
		Label lblNewLabel_1 = new Label(shell, SWT.BORDER);
		lblNewLabel_1.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblNewLabel_1.setFont(SWTResourceManager.getFont("Times New Roman Baltic", 10, SWT.NORMAL));
		lblNewLabel_1.setText("Prenume");
		
		text_3 = new Text(shell, SWT.BORDER);
		text_3.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		
		Label lblSelecteazaLuna = new Label(shell, SWT.BORDER);
		lblSelecteazaLuna.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblSelecteazaLuna.setFont(SWTResourceManager.getFont("Times New Roman Baltic", 10, SWT.NORMAL));
		lblSelecteazaLuna.setText("Luna");
		
		text_4 = new Text(shell, SWT.BORDER);
		text_4.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		
		Label lblSalariu = new Label(shell, SWT.BORDER);
		lblSalariu.setFont(SWTResourceManager.getFont("Times New Roman Baltic", 10, SWT.NORMAL));
		lblSalariu.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblSalariu.setText("Salariu");
		
		text = new Text(shell, SWT.BORDER);
		text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		
		Label lblProfit = new Label(shell, SWT.BORDER);
		lblProfit.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblProfit.setFont(SWTResourceManager.getFont("Times New Roman Baltic", 10, SWT.NORMAL));
		lblProfit.setText("Profit");
		
		text_1 = new Text(shell, SWT.BORDER);
		text_1.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		
		Label lblComision = new Label(shell, SWT.BORDER);
		lblComision.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblComision.setFont(SWTResourceManager.getFont("Times New Roman Baltic", 10, SWT.NORMAL));
		lblComision.setText("Comision");
		
		text_5 = new Text(shell, SWT.BORDER);
		text_5.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		
		Button btnBack = new Button(shell, SWT.NONE);
		btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				shell.close();
				Auten a = new Auten();
				a.open();
			}
		});
		btnBack.setText("back");
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		
		Button btnAfiseazaSalariu = new Button(shell, SWT.NONE);
		btnAfiseazaSalariu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				try {
					Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/lant_policlinici?user=root&password=root");
					String nume_ang=text_2.getText();
					String prenume_ang=text_3.getText();
					Statement st =connection.createStatement();
					ResultSet res = st.executeQuery("select * from Modul_FinanciarContabil_Salarii");
					while(res.next()) {
						String numeV=res.getString("nume");
						String prenumeV=res.getString("prenume");
					    String functieV=res.getString("functia");
					    if(numeV.equals(nume_ang) && prenumeV.equals(prenume_ang))
					    {
					    	text.setText(res.getString("salariu"));
					    	text_5.setText(res.getString("comision"));
					    	System.out.println("aici");
					    	int x = profit_medic(connection,numeV,prenumeV);
					    	System.out.println(x);
                            String xt = String.valueOf(x);
					    	text_1.setText(xt);
                            
					    		    	
					    	break;
					    }
					}
					}
				catch(SQLException sqlException) {
					sqlException.printStackTrace();
				}
				
			}
		});
		btnAfiseazaSalariu.setText("afiseaza salariu");
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);

	}

}
