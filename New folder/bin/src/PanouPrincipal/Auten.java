package PanouPrincipal;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.eclipse.swt.SWT;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.custom.StackLayout;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;

public class Auten {

	protected Shell shell;
    private Program programare;
    private Composite composite;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Auten window = new Auten();
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
		shell.setSize(1351, 300);
		shell.setText("PANOU COMANDA");
		shell.setLayout(new GridLayout(12, false));
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		
		Label lblBineAtiVenit = new Label(shell, SWT.NONE);
		lblBineAtiVenit.setFont(SWTResourceManager.getFont("Times New Roman Baltic", 16, SWT.NORMAL));
		lblBineAtiVenit.setText("BINE ATI VENIT LA POLICLINICA");
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
		
		Label lblTreiFratiPatati = new Label(shell, SWT.NONE);
		lblTreiFratiPatati.setForeground(SWTResourceManager.getColor(SWT.COLOR_MAGENTA));
		lblTreiFratiPatati.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1));
		lblTreiFratiPatati.setFont(SWTResourceManager.getFont("Times New Roman Baltic", 12, SWT.NORMAL));
		lblTreiFratiPatati.setText("TREI FRATI PATATI");
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
		new Label(shell, SWT.NONE);
		
		Label lblAutentificare = new Label(shell, SWT.BORDER | SWT.WRAP | SWT.CENTER);
		lblAutentificare.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1));
		lblAutentificare.setFont(SWTResourceManager.getFont("Times New Roman Baltic", 12, SWT.BOLD));
		lblAutentificare.setText("AUTENTIFICARE");
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		composite = new Composite(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		
		Label lblSelectatiTipulDe = new Label(shell, SWT.BORDER);
		lblSelectatiTipulDe.setFont(SWTResourceManager.getFont("Times New Roman Baltic", 10, SWT.NORMAL));
		lblSelectatiTipulDe.setText("SELECTATI TIPUL DE UTILIZATOR");
		
		Button btnNewButton_2 = new Button(shell, SWT.NONE);
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				String Text = btnNewButton_2.getText();
				try { Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/lant_policlinici?user="+Text+"&password=root");  ///USER = TEXT BOX, PASSWORD = TEXTBOX
						}
						
						 catch(SQLException sqlex) {
						 System.err.println("An SQL Exception occured. Details below:");
						sqlex.printStackTrace(System.err);
						 }
				shell.close();
				Medic m = new Medic();
				m.open();
			}
		});
		btnNewButton_2.setText("MEDIC");
		
		Button btnNewButton_1 = new Button(shell, SWT.NONE);
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				String Text = btnNewButton_1.getText();
				try { Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/lant_policlinici?user="+Text+"&password=root");  ///USER = TEXT BOX, PASSWORD = TEXTBOX
						}
						
						 catch(SQLException sqlex) {
						 System.err.println("An SQL Exception occured. Details below:");
						sqlex.printStackTrace(System.err);
						 }
				shell.close();
				AsistentMedical a = new AsistentMedical();
				a.open();
				
			}
		});
		btnNewButton_1.setText("ASISTENT MEDICAL");
		
		Button btnNewButton_3 = new Button(shell, SWT.NONE);
		btnNewButton_3.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1));
		btnNewButton_3.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnNewButton_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				String Text = btnNewButton_3.getText();
				try { Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/lant_policlinici?user="+Text+"&password=root");  ///USER = TEXT BOX, PASSWORD = TEXTBOX
						}
						
						 catch(SQLException sqlex) {
						 System.err.println("An SQL Exception occured. Details below:");
						sqlex.printStackTrace(System.err);
						 }
			shell.close();
			RS a = new RS();
			a.open();
			}
		});
		btnNewButton_3.setText("RESURSE UMANE");
		Button btnNewButton_4 = new Button(shell, SWT.NONE);
		btnNewButton_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				String Text = btnNewButton_4.getText();
				try { Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/lant_policlinici?user="+Text+"&password=root");  ///USER = TEXT BOX, PASSWORD = TEXTBOX
						}
						
						 catch(SQLException sqlex) {
						 System.err.println("An SQL Exception occured. Details below:");
						sqlex.printStackTrace(System.err);
						 }
				shell.close();
				FC f = new FC();
				f.open();
			}
		});
		btnNewButton_4.setText("FINANCIAR-CONTABIL");
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		
		Button btnAdministrator = new Button(shell, SWT.NONE);
		btnAdministrator.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				String Text = btnAdministrator.getText();
				try { Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/lant_policlinici?user="+Text+"&password=root");  ///USER = TEXT BOX, PASSWORD = TEXTBOX
						}
						
						 catch(SQLException sqlex) {
						 System.err.println("An SQL Exception occured. Details below:");
						sqlex.printStackTrace(System.err);
						 }
				shell.close();
				SuperAdmin a = new SuperAdmin();
				a.open();
			}
		});
		btnAdministrator.setText("ADMINISTRATOR");
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		
		Button btnNewButton = new Button(shell, SWT.NONE);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				String Text = btnNewButton.getText();
				try { Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/lant_policlinici?user="+Text+"&password=root");  ///USER = TEXT BOX, PASSWORD = TEXTBOX
						}
						
						 catch(SQLException sqlex) {
						 System.err.println("An SQL Exception occured. Details below:");
						sqlex.printStackTrace(System.err);
						 }
				shell.close();
				SuperAdmin a = new SuperAdmin();
				a.open();
			}
		});
		btnNewButton.setText("SUPERADMIN");
		
		

	
	}
}
