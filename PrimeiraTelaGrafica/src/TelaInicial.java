import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.SWT;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class TelaInicial {

	protected Shell tfTitulo;
	private Text txtOiMundo;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			TelaInicial window = new TelaInicial();
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
		tfTitulo.open();
		tfTitulo.layout();
		while (!tfTitulo.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		tfTitulo = new Shell();
		tfTitulo.setSize(450, 300);
		tfTitulo.setText("Primeiro Programa");
		
		txtOiMundo = new Text(tfTitulo, SWT.BORDER);
		txtOiMundo.setFont(SWTResourceManager.getFont("Segoe UI", 40, SWT.NORMAL));
		txtOiMundo.setText("Oi Mundo!");
		txtOiMundo.setBounds(78, 63, 278, 111);
		
		Button btnOk = new Button(tfTitulo, SWT.NONE);
		btnOk.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnOk.setBounds(176, 204, 75, 25);
		btnOk.setText("OK");

	}
}
