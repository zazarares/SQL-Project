package PanouPrincipal;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Label;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.eclipse.swt.SWT;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseTrackAdapter;

public class RaportMedicalAsistent {

	protected Shell shell;
	private Text text;
	private Text text_1;
	private Text text_2;
	private Text text_3;
	private Text text_4;
	private Text text_5;
	private Text text_6;
	private Text text_7;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			RaportMedical window = new RaportMedical();
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
	    Connection connection = null;
        Statement statement = null;
		shell = new Shell();
		shell.setSize(1292, 764);
		shell.setText("SWT Application");
		shell.setLayout(new GridLayout(5, false));
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		
		Label lblRaportMedical = new Label(shell, SWT.BORDER);
		lblRaportMedical.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1));
		lblRaportMedical.setBackground(SWTResourceManager.getColor(SWT.COLOR_DARK_RED));
		lblRaportMedical.setFont(SWTResourceManager.getFont("Times New Roman Baltic", 12, SWT.NORMAL));
		lblRaportMedical.setText("RAPORT MEDICAL");
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		
		Label lblNewLabel = new Label(shell, SWT.NONE);
		lblNewLabel.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblNewLabel.setFont(SWTResourceManager.getFont("Times New Roman Baltic", 10, SWT.NORMAL));
		lblNewLabel.setText("Nume");
		new Label(shell, SWT.NONE);
		
		text = new Text(shell, SWT.BORDER);
		text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		
		Label lblNewLabel_1 = new Label(shell, SWT.NONE);
		lblNewLabel_1.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblNewLabel_1.setFont(SWTResourceManager.getFont("Times New Roman Baltic", 10, SWT.NORMAL));
		lblNewLabel_1.setText("Prenume");
		new Label(shell, SWT.NONE);
		
		text_1 = new Text(shell, SWT.BORDER);
		text_1.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		
		Label lblNewLabel_2 = new Label(shell, SWT.NONE);
		lblNewLabel_2.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblNewLabel_2.setFont(SWTResourceManager.getFont("Times New Roman Baltic", 10, SWT.NORMAL));
		lblNewLabel_2.setText("Medic");
		new Label(shell, SWT.NONE);
		
		text_2 = new Text(shell, SWT.BORDER);
		text_2.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		
		Label lblNewLabel_3 = new Label(shell, SWT.NONE);
		lblNewLabel_3.setFont(SWTResourceManager.getFont("Times New Roman Baltic", 10, SWT.NORMAL));
		lblNewLabel_3.setText("Medic asistent");
		new Label(shell, SWT.NONE);
		
		text_3 = new Text(shell, SWT.BORDER);
		text_3.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		
		Label lblNewLabel_4 = new Label(shell, SWT.NONE);
		lblNewLabel_4.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblNewLabel_4.setFont(SWTResourceManager.getFont("Times New Roman Baltic", 10, SWT.NORMAL));
		lblNewLabel_4.setText("Data consultarii");
		new Label(shell, SWT.NONE);
		
		text_4 = new Text(shell, SWT.BORDER);
		text_4.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		
		Label lblNewLabel_5 = new Label(shell, SWT.NONE);
		lblNewLabel_5.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblNewLabel_5.setFont(SWTResourceManager.getFont("Times New Roman Baltic", 10, SWT.NORMAL));
		lblNewLabel_5.setText("Simptome");
		new Label(shell, SWT.NONE);
		
		text_5 = new Text(shell, SWT.BORDER);
		text_5.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		
		Label lblIstoric = new Label(shell, SWT.NONE);
		lblIstoric.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblIstoric.setFont(SWTResourceManager.getFont("Times New Roman Baltic", 10, SWT.NORMAL));
		lblIstoric.setText("Istoric");
		new Label(shell, SWT.NONE);
		
		Button btnVizionatiIstoriculPacientului = new Button(shell, SWT.BORDER);
		btnVizionatiIstoriculPacientului.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				shell.close();
				IstoricPacientA a = new IstoricPacientA();
				a.open();
			}
		});
		btnVizionatiIstoriculPacientului.setText("Vizionati istoricul pacientului");
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		
		Label lblInvestigatii = new Label(shell, SWT.NONE);
		lblInvestigatii.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblInvestigatii.setFont(SWTResourceManager.getFont("Times New Roman Baltic", 10, SWT.NORMAL));
		lblInvestigatii.setText("Investigatii");
		new Label(shell, SWT.NONE);
		
		text_6 = new Text(shell, SWT.BORDER);
		text_6.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		
		Button btnAdaugare = new Button(shell, SWT.NONE);
		btnAdaugare.setText("ADAUGARE");
		new Label(shell, SWT.NONE);
		
		Button btnStergere = new Button(shell, SWT.NONE);
		btnStergere.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				shell.close();
				RaportMedical r = new RaportMedical();
				r.open();
			}
		});
		btnStergere.setText("STERGERE");
		new Label(shell, SWT.NONE);
		
		Label lblParafa = new Label(shell, SWT.NONE);
		lblParafa.setFont(SWTResourceManager.getFont("Times New Roman Baltic", 10, SWT.NORMAL));
		lblParafa.setText("Parafa");
		
		Button btnFinalizareraport = new Button(shell, SWT.NONE);
		btnFinalizareraport.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				try {
					
					Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/lant_policlinici?user=root&password=root");
					String nume = text.getText();
					String prenume = text_1.getText();
					String medic= text_2.getText();
					String medic_asistent= text_3.getText();
					String DataConsultarii= text_4.getText();
					String Simptome= text_5.getText();
					String Investigatii= text_6.getText();
				    String sql = "INSERT INTO raport_medical (nume ,prenume,medic,medic_asistent,dataconsultarii,simptome,investigatii) VALUES('" + nume +"','"+prenume+"','"+medic+"','"+medic_asistent+"','"+DataConsultarii+"','"+Simptome+"','"+Investigatii+"')";
				    Statement stat = connection.prepareStatement(sql);
	                stat.execute(sql);
	                connection.close();
	                
				}
				catch(SQLException sqlException)
				{
					sqlException.printStackTrace();
				}
			}
		});
		btnFinalizareraport.setText("FinalizareRaport");
		
		text_7 = new Text(shell, SWT.BORDER);
		text_7.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		
		Button btnBack = new Button(shell, SWT.NONE);
		btnBack.addMouseListener(new MouseAdapter() {
			public void mouseDown(MouseEvent e) {
				shell.close();
				AsistentMedical m = new AsistentMedical();
				m.open();
			}
		});
		btnBack.setText("back");

	}

}
