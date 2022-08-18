package PanouPrincipal;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Label;

import java.sql.Connection;
import java.sql.DriverManager;
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

public class Program {

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



	

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Program window = new Program();
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
		shell.setSize(832, 621);
		shell.setText("Receptioner-Porgramare");
		shell.setLayout(new GridLayout(4, false));
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		
		Label lblProgramarePacient = new Label(shell, SWT.BORDER);
		lblProgramarePacient.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1));
		lblProgramarePacient.setAlignment(SWT.CENTER);
		lblProgramarePacient.setBackground(SWTResourceManager.getColor(SWT.COLOR_DARK_CYAN));
		lblProgramarePacient.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLACK));
		lblProgramarePacient.setFont(SWTResourceManager.getFont("Times New Roman Baltic", 11, SWT.NORMAL));
		lblProgramarePacient.setText("Programare Pacient");
		new Label(shell, SWT.NONE);
		
		Label lblId = new Label(shell, SWT.NONE);
		lblId.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1));
		lblId.setText("Id");
		new Label(shell, SWT.NONE);
		
		text_5 = new Text(shell, SWT.BORDER);
		text_5.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(shell, SWT.NONE);
		
		Label lblNewLabel = new Label(shell, SWT.NONE);
		lblNewLabel.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1));
		lblNewLabel.setText("Nume");
		new Label(shell, SWT.NONE);
		
		text = new Text(shell, SWT.BORDER);
		text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(shell, SWT.NONE);
		
		Label lblNewLabel_1 = new Label(shell, SWT.NONE);
		lblNewLabel_1.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1));
		lblNewLabel_1.setAlignment(SWT.CENTER);
		lblNewLabel_1.setText("Prenume");
		new Label(shell, SWT.NONE);
		
		text_1 = new Text(shell, SWT.BORDER);
		text_1.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(shell, SWT.NONE);
		
		Label lblNewLabel_2 = new Label(shell, SWT.NONE);
		lblNewLabel_2.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1));
		lblNewLabel_2.setAlignment(SWT.CENTER);
		lblNewLabel_2.setText("CNP");
		new Label(shell, SWT.NONE);
		
		text_2 = new Text(shell, SWT.BORDER);
		text_2.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(shell, SWT.NONE);
		
		Label lblNewLabel_3 = new Label(shell, SWT.NONE);
		lblNewLabel_3.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1));
		lblNewLabel_3.setText("Varsta");
		new Label(shell, SWT.NONE);
		
		text_3 = new Text(shell, SWT.BORDER);
		text_3.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(shell, SWT.NONE);
		
		Label lblNewLabel_4 = new Label(shell, SWT.NONE);
		lblNewLabel_4.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1));
		lblNewLabel_4.setText("Cabinet");
		new Label(shell, SWT.NONE);
		
		text_6 = new Text(shell, SWT.BORDER);
		text_6.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(shell, SWT.NONE);
		
		Label lblMedicl = new Label(shell, SWT.NONE);
		lblMedicl.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1));
		lblMedicl.setText("Specializare");
		new Label(shell, SWT.NONE);
		
		text_4 = new Text(shell, SWT.BORDER);
		text_4.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(shell, SWT.NONE);
		
		Label lblNewLabel_5 = new Label(shell, SWT.NONE);
		lblNewLabel_5.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1));
		lblNewLabel_5.setText("Data");
		new Label(shell, SWT.NONE);
		
		text_8 = new Text(shell, SWT.BORDER);
		text_8.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(shell, SWT.NONE);
		
		Label lblNewLabel_6 = new Label(shell, SWT.NONE);
		lblNewLabel_6.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1));
		lblNewLabel_6.setText("Ora");
		new Label(shell, SWT.NONE);
		
		text_7 = new Text(shell, SWT.BORDER);
		GridData gd_text_7 = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
		gd_text_7.widthHint = 259;
		text_7.setLayoutData(gd_text_7);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		
		Button btnInregistrare = new Button(shell, SWT.NONE);
		btnInregistrare.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				try {
					Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/lant_policlinici?user=root&password=root");
					//Statement statement = connection.createStatement();
	                String nume_pacientINGO = text.getText();
	                String prenume_PacientINGO = text_1.getText();
	                String ido = text_5.getText();
	                String CNPP=text_2.getText();
	                String varstaP =text_3.getText();
	                int varstaPO=Integer.parseInt(varstaP);
	                String cabinetP=text_6.getText();
	                int idcab=Integer.parseInt(cabinetP);
	                int idp = Integer.parseInt(ido);
	                String specializareP=text_4.getText();
	               // DateTime DateP =(DateTime) dateTime.getData();
	                String DataProg = text_8.getText();
	                String oraInceput=text_7.getText();
	                int oraP=Integer.parseInt(oraInceput);
	                String sql = "INSERT INTO programare (ID ,nume_pacient,prenume_pacient,CNP,varsta,ID_Cabinet,Specializare, Data_programarii, ora_inceput) VALUES('" + idp +"','"+nume_pacientINGO+"','"+prenume_PacientINGO+"','"+CNPP+"','"+varstaP+"','"+idcab+"','"+specializareP+"','"+DataProg+"','"+oraP+"')";
	                //statement.executeUpdate(sql);
	                Statement stat = connection.prepareStatement(sql);
	                stat.execute(sql);
	      //          statement.executeUpdate("INSERT INTO programare ('nume_pacient') VALUES (nume_pacient)");
	                connection.close();
	            } catch (SQLException sqlException){
	                    sqlException.printStackTrace();
	            }
				shell.close();
				ConfirmareInregistrare p = new ConfirmareInregistrare();
				p.open();
			}
		});
		btnInregistrare.setText("Inregistrare");
		new Label(shell, SWT.NONE);
		
		Button btnAnulare = new Button(shell, SWT.NONE);
		btnAnulare.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				shell.close();
				Program p = new Program();
				p.open();
			}
		});
		btnAnulare.setText("Anulare");
		
		Button btnNewButton = new Button(shell, SWT.NONE);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				shell.close();
				FC f = new FC();
				f.open();
			}
		});
		btnNewButton.setText("back");
		
		

	}

}
