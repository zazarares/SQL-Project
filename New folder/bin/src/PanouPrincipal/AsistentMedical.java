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

public class AsistentMedical {

	protected Shell shell;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			AsistentMedical window = new AsistentMedical();
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
		shell.setSize(450, 300);
		shell.setText("SWT Application");
		shell.setLayout(new GridLayout(5, false));
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		
		Label lblEstiLogatCa = new Label(shell, SWT.NONE);
		lblEstiLogatCa.setText("ESTI LOGAT CA SI:");
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		
		Label lblAsistentMedical = new Label(shell, SWT.NONE);
		lblAsistentMedical.setBackground(SWTResourceManager.getColor(SWT.COLOR_DARK_GREEN));
		lblAsistentMedical.setText("ASISTENT MEDICAL");
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		
		Button btnCompletareRaportMedical = new Button(shell, SWT.NONE);
		btnCompletareRaportMedical.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				shell.close();
				RaportMedicalAsistent r = new RaportMedicalAsistent();
				r.open();
			}
		});
		btnCompletareRaportMedical.setText("COMPLETARE RAPORT MEDICAL");
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		
		Button btnVizualizareSalariu = new Button(shell, SWT.NONE);
		btnVizualizareSalariu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				shell.close();
				Salariul a = new Salariul();
				a.open();
			}
		});
		btnVizualizareSalariu.setText("vizualizare salariu");
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);

	}
}
