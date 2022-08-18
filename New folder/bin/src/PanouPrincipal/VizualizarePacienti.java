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
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.widgets.List;

public class VizualizarePacienti {

	protected Shell shell;
	private Text text;
	private Text text_1;
	private Text text_2;
	private Text text_3;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			VizualizarePacienti window = new VizualizarePacienti();
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
		shell.setSize(935, 418);
		shell.setText("SWT Application");
		shell.setLayout(new GridLayout(5, false));
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		
		Label lblPacienti = new Label(shell, SWT.NONE);
		lblPacienti.setBackground(SWTResourceManager.getColor(SWT.COLOR_DARK_GREEN));
		lblPacienti.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1));
		lblPacienti.setFont(SWTResourceManager.getFont("Times New Roman Baltic", 13, SWT.NORMAL));
		lblPacienti.setText("PACIENTI");
		new Label(shell, SWT.NONE);
		
		Label lblDataProgramarii = new Label(shell, SWT.NONE);
		lblDataProgramarii.setText("Data programarii");
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		
		text = new Text(shell, SWT.BORDER);
		text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(shell, SWT.NONE);
		
		Label lblProgramare = new Label(shell, SWT.NONE);
		lblProgramare.setText("Programare1");
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		
		text_1 = new Text(shell, SWT.BORDER);
		text_1.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(shell, SWT.NONE);
		
		Label lblProgramare_1 = new Label(shell, SWT.NONE);
		lblProgramare_1.setText("Programare2");
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		
		text_2 = new Text(shell, SWT.BORDER);
		text_2.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(shell, SWT.NONE);
		
		Label lblProgramare_2 = new Label(shell, SWT.NONE);
		lblProgramare_2.setText("Programare3");
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		
		text_3 = new Text(shell, SWT.BORDER);
		text_3.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(shell, SWT.NONE);
		
		Button btnAfiseazaProgramarile = new Button(shell, SWT.NONE);
		btnAfiseazaProgramarile.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				try {
					Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/lant_policlinici?user=root&password=root");
					String dataP =text.getText();
					Statement st =connection.createStatement();
					ResultSet res = st.executeQuery("select * from Modul_GestionareActivitati_Programari");
					while(res.next()) 
					{
						String dataV=res.getString("data_programarii");
						List list = new List(shell, SWT.BORDER);
					    if(dataV.equals(dataP))
					    {
					    	//text_1.setText(res.getString())
					    	//res.next();
					    	//break;
					    }
					}
					}
				catch(SQLException sqlException) {
					sqlException.printStackTrace();
				}
			}
		});
		btnAfiseazaProgramarile.setText("afiseaza programarile");
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		
		Button btnBack = new Button(shell, SWT.NONE);
		btnBack.setText("back");
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		
		//List list = new List(shell, SWT.BORDER);

	}

}
