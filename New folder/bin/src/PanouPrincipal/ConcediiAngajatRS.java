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
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;

public class ConcediiAngajatRS {

	protected Shell shell;
	private Text text;
	private Text text_1;
	private Text text_3;
	private Text text_2;
	private Text text_4;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			ConcediiAngajat window = new ConcediiAngajat();
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
		shell.setSize(985, 595);
		shell.setText("SWT Application");
		shell.setLayout(new GridLayout(4, false));
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		
		Label lblConcediiAngajat = new Label(shell, SWT.NONE);
		lblConcediiAngajat.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1));
		lblConcediiAngajat.setBackground(SWTResourceManager.getColor(SWT.COLOR_DARK_RED));
		lblConcediiAngajat.setForeground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_FOREGROUND));
		lblConcediiAngajat.setFont(SWTResourceManager.getFont("Times New Roman Baltic", 12, SWT.NORMAL));
		lblConcediiAngajat.setText("CONCEDII ANGAJAT");
		new Label(shell, SWT.NONE);
		
		Label lblNume = new Label(shell, SWT.BORDER);
		lblNume.setFont(SWTResourceManager.getFont("Times New Roman Baltic", 10, SWT.NORMAL));
		lblNume.setText("Nume");
		new Label(shell, SWT.NONE);
		
		text = new Text(shell, SWT.BORDER);
		text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		
		Label lblPrenume = new Label(shell, SWT.BORDER);
		lblPrenume.setFont(SWTResourceManager.getFont("Times New Roman Baltic", 10, SWT.NORMAL));
		lblPrenume.setText("Prenume");
		new Label(shell, SWT.NONE);
		
		text_1 = new Text(shell, SWT.BORDER);
		text_1.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		
		Label lblNewLabel_1 = new Label(shell, SWT.BORDER);
		lblNewLabel_1.setFont(SWTResourceManager.getFont("Times New Roman Baltic", 10, SWT.NORMAL));
		lblNewLabel_1.setText("Functia");
		new Label(shell, SWT.NONE);
		
		text_3 = new Text(shell, SWT.BORDER);
		text_3.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(shell, SWT.NONE);
		
		Label lblDataInceput = new Label(shell, SWT.BORDER);
		lblDataInceput.setFont(SWTResourceManager.getFont("Times New Roman Baltic", 10, SWT.NORMAL));
		lblDataInceput.setText("Data inceput");
		new Label(shell, SWT.NONE);
		
		text_2 = new Text(shell, SWT.BORDER);
		text_2.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(shell, SWT.NONE);
		
		Label lblNewLabel = new Label(shell, SWT.BORDER);
		lblNewLabel.setFont(SWTResourceManager.getFont("Times New Roman Baltic", 10, SWT.NORMAL));
		lblNewLabel.setText("Data final");
		new Label(shell, SWT.NONE);
		
		text_4 = new Text(shell, SWT.BORDER);
		text_4.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		
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
		
		Button btnAfiseaza = new Button(shell, SWT.NONE);
		btnAfiseaza.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				try {
					Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/lant_policlinici?user=root&password=root");
					String nume_ang=text.getText();
					String prenume_ang=text_1.getText();
					String functie_ang = text_3.getText();
					Statement st =connection.createStatement();
					ResultSet res = st.executeQuery("select * from Modul_HR_Concedii");
					while(res.next()) {
						String numeV=res.getString("nume");
						String prenumeV=res.getString("prenume");
					    String functieV=res.getString("functia");
					    if(numeV.equals(nume_ang) && prenumeV.equals(prenume_ang) && functieV.equals(functie_ang))
					    {
					    	//nume, prenume,functi amodul_financiar contabil_salarii, data_inceput, data_sfarsit
					    	text_2.setText(res.getString("data_inceput"));
					    	text_4.setText(res.getString("data_sfarsit"));
					    	
					    	
					    	break;
					    }
					}
					}
				catch(SQLException sqlException) {
					sqlException.printStackTrace();
				}
			}
		});
		btnAfiseaza.setText("Afiseaza");
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		
		Label label = new Label(shell, SWT.NONE);
		label.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, true, 1, 1));
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);

	}

}
