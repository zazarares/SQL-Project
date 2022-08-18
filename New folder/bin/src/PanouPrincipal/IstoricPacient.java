package PanouPrincipal;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Text;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;

public class IstoricPacient {

	protected Shell shell;
	private Text text;
	private Text text_1;
	private Text text_2;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			IstoricPacient window = new IstoricPacient();
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
		shell.setSize(953, 541);
		shell.setText("SWT Application");
		shell.setLayout(new GridLayout(4, false));
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		
		Label lblNume = new Label(shell, SWT.NONE);
		lblNume.setText("Nume");
		new Label(shell, SWT.NONE);
		
		text = new Text(shell, SWT.BORDER);
		text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(shell, SWT.NONE);
		
		Label lblPrenume = new Label(shell, SWT.NONE);
		lblPrenume.setText("Prenume");
		new Label(shell, SWT.NONE);
		
		text_1 = new Text(shell, SWT.BORDER);
		text_1.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		
		Label lblIstoric = new Label(shell, SWT.NONE);
		lblIstoric.setText("Istoric");
		new Label(shell, SWT.NONE);
		
		text_2 = new Text(shell, SWT.BORDER);
		GridData gd_text_2 = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
		gd_text_2.heightHint = 153;
		text_2.setLayoutData(gd_text_2);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		
		Button btnAfiseazaIstoric = new Button(shell, SWT.NONE);
		btnAfiseazaIstoric.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				try {
					Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/lant_policlinici?user=root&password=root");
					String numep =text.getText();
					String prenumep = text_1.getText();
					Statement st =connection.createStatement();
					ResultSet res = st.executeQuery("select * from Modul_GestionareActivitati_IstoricMedical" );
					while(res.next()) {
						String numeV=res.getString("nume_pacient");
						String prenumeV = res.getString("prenume_pacient");
					    if(numeV.equals(numep) && (prenumeV.equals(prenumep)))
					    {
					    	
					    	text_2.setText(res.getString("descriere_simptome") + " " +res.getString("diagnostic") +  " " +res.getString("denumire_analize")
					    	+" "+res.getString("rezultate")+ " "+res.getString("medicamentatie") +" "+ res.getString("observatii"));
					    		
					    	//res.next();
					    	break;
					    }
					}
					}
				catch(SQLException sqlException) {
					sqlException.printStackTrace();
				}
			}
		});
		btnAfiseazaIstoric.setText("afiseaza istoric");
		new Label(shell, SWT.NONE);
		
		Button btnBack = new Button(shell, SWT.NONE);
		btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				shell.close();
				RaportMedical a = new RaportMedical();
				a.open();
			}
		});
		btnBack.setText("back");

	}

}
