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
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;

public class SuperAdmin {

	protected Shell shell;
	private Text text;
	private Text text_1;
	private Text text_2;
	private Text text_3;
	private Text text_4;
	private Text text_5;
	private Text text_6;
	private Text text_7;
	private Text text_8;
	private Text text_9;
	private Text text_10;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			UseriAdmin window = new UseriAdmin();
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
		shell.setSize(699, 456);
		shell.setText("SWT Application");
		shell.setLayout(new GridLayout(5, false));
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		
		Label lblAdaugaUtilizatori = new Label(shell, SWT.NONE);
		lblAdaugaUtilizatori.setBackground(SWTResourceManager.getColor(SWT.COLOR_DARK_RED));
		lblAdaugaUtilizatori.setFont(SWTResourceManager.getFont("Times New Roman Baltic", 13, SWT.NORMAL));
		lblAdaugaUtilizatori.setText("ADAUGA UTILIZATORI");
		new Label(shell, SWT.NONE);
		
		Label lblTipDepartament = new Label(shell, SWT.NONE);
		lblTipDepartament.setText("Tip Departament");
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		
		text = new Text(shell, SWT.BORDER);
		text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(shell, SWT.NONE);
		
		Label lblFunctia = new Label(shell, SWT.NONE);
		lblFunctia.setText("Functia");
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		
		text_10 = new Text(shell, SWT.BORDER);
		text_10.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(shell, SWT.NONE);
		
		Label lblNewLabel = new Label(shell, SWT.NONE);
		lblNewLabel.setText("Nume");
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		
		text_1 = new Text(shell, SWT.BORDER);
		text_1.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(shell, SWT.NONE);
		
		Label lblNewLabel_1 = new Label(shell, SWT.NONE);
		lblNewLabel_1.setText("Prenume");
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		
		text_2 = new Text(shell, SWT.BORDER);
		text_2.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(shell, SWT.NONE);
		
		Label lblNewLabel_2 = new Label(shell, SWT.NONE);
		lblNewLabel_2.setText("CNP");
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		
		text_3 = new Text(shell, SWT.BORDER);
		text_3.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(shell, SWT.NONE);
		
		Label lblNewLabel_3 = new Label(shell, SWT.NONE);
		lblNewLabel_3.setText("Adresa");
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		
		text_4 = new Text(shell, SWT.BORDER);
		text_4.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(shell, SWT.NONE);
		
		Label lblNewLabel_4 = new Label(shell, SWT.NONE);
		lblNewLabel_4.setText("Nr telefon");
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		
		text_5 = new Text(shell, SWT.BORDER);
		text_5.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(shell, SWT.NONE);
		
		Label lblNewLabel_5 = new Label(shell, SWT.NONE);
		lblNewLabel_5.setText("Email");
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		
		text_6 = new Text(shell, SWT.BORDER);
		text_6.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(shell, SWT.NONE);
		
		Label lblNewLabel_6 = new Label(shell, SWT.NONE);
		lblNewLabel_6.setText("Cont IBAN");
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		
		text_7 = new Text(shell, SWT.BORDER);
		text_7.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(shell, SWT.NONE);
		
		Label lblNewLabel_7 = new Label(shell, SWT.NONE);
		lblNewLabel_7.setText("Nr contract");
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		
		text_8 = new Text(shell, SWT.BORDER);
		text_8.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(shell, SWT.NONE);
		
		Label lblNewLabel_8 = new Label(shell, SWT.NONE);
		lblNewLabel_8.setText("Data Angajarii");
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		
		text_9 = new Text(shell, SWT.BORDER);
		text_9.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(shell, SWT.NONE);
		
		Button btnAdauga = new Button(shell, SWT.NONE);
		btnAdauga.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				try {
					Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/lant_policlinici?user=root&password=root");
					String nume = text_1.getText();
					String prenume = text_2.getText();
					String cnp = text_3.getText();
					int cnpp = Integer.parseInt(cnp);
					String adresa = text_4.getText();
					String nrtel = text_5.getText();
					String email = text_6.getText();
					String conti = text_7.getText();
					int contiban = Integer.parseInt(conti);
					String nrcont = text_8.getText();
					String dataA = text_9.getText();
					String tipdep = text.getText();
					String fct = text_10.getText();
	                String sql = "INSERT INTO useri_clinica (tip_departament,CNP,nume,prenume,adresa,nr_telefon,email,cont_IBAN,nr_contract,data_angajarii,functia) VALUES('" + tipdep +"','"+cnpp+"','"+nume+"','"+prenume+"','"+adresa+"','"+nrtel+"','"+email+"','"+contiban+"','"+nrcont+"','"+dataA+"','"+fct+"')";
	                Statement stat = connection.prepareStatement(sql);
	                stat.execute(sql);
	     
	                connection.close();
	            } catch (SQLException sqlException){
	                    sqlException.printStackTrace();
	            }
			}
		});
		btnAdauga.setText("ADAUGA");
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		
		Button btnBack = new Button(shell, SWT.NONE);
		btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				shell.close();
				Auten a =  new Auten();
				a.open();
			}
		});
		btnBack.setText("back");

	}

}
