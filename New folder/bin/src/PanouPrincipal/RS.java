package PanouPrincipal;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;

public class RS {

	protected Shell shell;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Medic window = new Medic();
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
		shell.setSize(469, 148);
		shell.setText("SWT Application");
		shell.setLayout(new GridLayout(3, false));
		
		Label lblEstiLogatCa = new Label(shell, SWT.BORDER);
		lblEstiLogatCa.setFont(SWTResourceManager.getFont("Times New Roman Baltic", 10, SWT.NORMAL));
		lblEstiLogatCa.setAlignment(SWT.CENTER);
		lblEstiLogatCa.setText("ESTI LOGAT CA SI:");
		
		Label lblMedic = new Label(shell, SWT.BORDER);
		lblMedic.setBackground(SWTResourceManager.getColor(SWT.COLOR_DARK_GREEN));
		lblMedic.setFont(SWTResourceManager.getFont("Times New Roman Baltic", 10, SWT.NORMAL));
		lblMedic.setText("RESURSE UMANE");
		new Label(shell, SWT.NONE);
		
		Button btnNewButton = new Button(shell, SWT.NONE);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				shell.close();
				InspectieAngajatRS a = new InspectieAngajatRS();
				a.open();
			}
		});
		btnNewButton.setText("Inspectie");
		
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
		
		Button btnVizualizareSalariul = new Button(shell, SWT.NONE);
		btnVizualizareSalariul.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				shell.close();
				Salariul a = new Salariul();
				a.open();
			}
		});
		btnVizualizareSalariul.setText("vizualizare salariu");
		

	}
}
