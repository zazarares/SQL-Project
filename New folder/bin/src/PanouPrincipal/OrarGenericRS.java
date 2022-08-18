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
import java.util.Date;

import org.eclipse.swt.SWT;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.DateTime;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseTrackAdapter;

public class OrarGenericRS {

	protected Shell shell;
	private Text text;
	private Text text_1;
	private Text text_2;
	private Text text_3;
	private Text text_6;
	private Text text_7;
	private Text text_4;
	private Text text_5;
	private Text text_8;
	private Text text_9;
	private Text text_10;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			OrarGeneric window = new OrarGeneric();
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
	 * @wbp.parser.entryPoint
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(937, 831);
		shell.setText("SWT Application");
		shell.setLayout(new GridLayout(3, false));
		new Label(shell, SWT.NONE);

		Label lblOrarulAngajatului = new Label(shell, SWT.CENTER);
		lblOrarulAngajatului.setBackground(SWTResourceManager.getColor(SWT.COLOR_DARK_RED));
		lblOrarulAngajatului.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1));
		lblOrarulAngajatului.setFont(SWTResourceManager.getFont("Times New Roman Baltic", 12, SWT.BOLD));
		lblOrarulAngajatului.setText("ORARUL ANGAJATULUI");
		new Label(shell, SWT.NONE);
		
		Label lblNewLabel = new Label(shell, SWT.BORDER);
		lblNewLabel.setFont(SWTResourceManager.getFont("Times New Roman Baltic", 10, SWT.NORMAL));
		lblNewLabel.setText("Nume");
		
		text = new Text(shell, SWT.BORDER);
		text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(shell, SWT.NONE);
		String nume_ang=text.getText();
		
		Label lblNewLabel_1 = new Label(shell, SWT.BORDER);
		lblNewLabel_1.setFont(SWTResourceManager.getFont("Times New Roman Baltic", 10, SWT.NORMAL));
		lblNewLabel_1.setText("Prenume");
		
		text_1 = new Text(shell, SWT.BORDER);
		text_1.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(shell, SWT.NONE);
		String prenume_ang=text_1.getText();
		
		Label lblNewLabel_2 = new Label(shell, SWT.BORDER);
		lblNewLabel_2.setFont(SWTResourceManager.getFont("Times New Roman Baltic", 10, SWT.NORMAL));
		lblNewLabel_2.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, false, false, 1, 1));
		lblNewLabel_2.setText("Functie");
		
		
		text_2 = new Text(shell, SWT.BORDER);
		text_2.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		
		Label lblLocatia = new Label(shell, SWT.BORDER);
		lblLocatia.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1));
		lblLocatia.setFont(SWTResourceManager.getFont("Times New Roman Baltic", 11, SWT.BOLD));
		lblLocatia.setText("Locatia");
		new Label(shell, SWT.NONE);
		
		Button btnAfiseaza = new Button(shell, SWT.NONE);
	    
		btnAfiseaza.setText("Afiseaza");
		
		text_3 = new Text(shell, SWT.BORDER);
		text_3.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblNewLabel_3 = new Label(shell, SWT.NONE);
		lblNewLabel_3.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblNewLabel_3.setText("Luni");
		
	
		
		text_10 = new Text(shell, SWT.BORDER);
		text_10.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(shell, SWT.NONE);
		
		Label lblNewLabel_4 = new Label(shell, SWT.NONE);
		lblNewLabel_4.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblNewLabel_4.setText("Marti");
		
		text_9 = new Text(shell, SWT.BORDER);
		text_9.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(shell, SWT.NONE);
		
		Label lblNewLabel_5 = new Label(shell, SWT.NONE);
		lblNewLabel_5.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblNewLabel_5.setText("Miercuri");
		
		text_8 = new Text(shell, SWT.BORDER);
		text_8.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(shell, SWT.NONE);
		
		Label lblNewLabel_6 = new Label(shell, SWT.NONE);
		lblNewLabel_6.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblNewLabel_6.setText("Joi");
		
		text_5 = new Text(shell, SWT.BORDER);
		text_5.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(shell, SWT.NONE);
		
		Label lblNewLabel_7 = new Label(shell, SWT.NONE);
		lblNewLabel_7.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblNewLabel_7.setText("Vineri");
		
		text_4 = new Text(shell, SWT.BORDER);
		text_4.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(shell, SWT.NONE);
		
		Label lblSambata = new Label(shell, SWT.NONE);
		lblSambata.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblSambata.setText("Sambata");
		
		text_6 = new Text(shell, SWT.BORDER);
		text_6.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(shell, SWT.NONE);
		
		Label lblDuminica = new Label(shell, SWT.NONE);
		lblDuminica.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1));
		lblDuminica.setText("Duminica");
		
		text_7 = new Text(shell, SWT.BORDER);
		text_7.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(shell, SWT.NONE);
		btnAfiseaza.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				try{Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/lant_policlinici?user=root&password=root");
				Statement st =connection.createStatement();
				ResultSet res = st.executeQuery("select * from Modul_HR_Orar");
				String nume_ang=text.getText();
				String prenume_ang=text_1.getText();
				String functie_ang=text_2.getText();
				while(res.next()) {
					System.out.println(res.getString("luni"));
					String numeV=res.getString("nume");
					String prenumeV=res.getString("prenume");
				    String functieV=res.getString("functia");
				    
				    if(numeV.equals(nume_ang) && prenumeV.equals(prenume_ang) && functieV.equals(functie_ang))
				    {
				    	text_10.setText(res.getString("luni"));
				    	text_9.setText(res.getString("marti"));
				    	text_8.setText(res.getString("miercuri"));
				    	text_5.setText(res.getString("joi"));
				    	text_4.setText(res.getString("vineri"));
				    	text_6.setText(res.getString("sambata"));
				    	text_7.setText(res.getString("duminica"));
				    	break;
				    }
				  
				}
				}
			  catch (SQLException sqlException){
                 sqlException.printStackTrace();
         }
				
			}
		});
		
		Button btnBack = new Button(shell, SWT.NONE);
		btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				shell.close();
				InspectieAngajatRS a = new InspectieAngajatRS();
				a.open();
			}
		}); 
		btnBack.setText("back");
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);

	}

}
