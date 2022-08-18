package PanouPrincipal;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;

public class InspectieAngajatRS {

	protected Shell shell;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			InspectieAngajat window = new InspectieAngajat();
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
		shell.setSize(1008, 608);
		shell.setText("SWT Application");
		shell.setLayout(new GridLayout(3, false));
		new Label(shell, SWT.NONE);
		
		Label lblAngajati = new Label(shell, SWT.BORDER);
		lblAngajati.setForeground(SWTResourceManager.getColor(SWT.COLOR_DARK_RED));
		lblAngajati.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1));
		lblAngajati.setAlignment(SWT.CENTER);
		lblAngajati.setFont(SWTResourceManager.getFont("Times New Roman Baltic", 12, SWT.BOLD));
		lblAngajati.setText("Angajati");
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		
		Label lblNewLabel = new Label(shell, SWT.BORDER);
		lblNewLabel.setFont(SWTResourceManager.getFont("Times New Roman Baltic", 10, SWT.NORMAL));
		lblNewLabel.setText("Vizualizati orarul angajatului");
		
		Button btnOrarAngajat = new Button(shell, SWT.NONE);
		btnOrarAngajat.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				shell.close();
				OrarGeneric o = new OrarGeneric();
				o.open();
			}
		});
		btnOrarAngajat.setText("ORAR ANGAJAT");
		
		Button btnBack = new Button(shell, SWT.NONE);
		btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				shell.close();
				RS a = new RS();
				a.open();
			}
		});
		btnBack.setText("back");
		
		Label lblVizualizareConcediiAngajat = new Label(shell, SWT.BORDER);
		lblVizualizareConcediiAngajat.setFont(SWTResourceManager.getFont("Times New Roman Baltic", 10, SWT.NORMAL));
		lblVizualizareConcediiAngajat.setText("Vizualizare concedii angajat");
		
		Button btnConcediiAngajat = new Button(shell, SWT.NONE);
		btnConcediiAngajat.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				shell.close();
				ConcediiAngajatRS a = new ConcediiAngajatRS();
				a.open();
			}
		});
		btnConcediiAngajat.setText("CONCEDII ANGAJAT");
		new Label(shell, SWT.NONE);

	}
}
