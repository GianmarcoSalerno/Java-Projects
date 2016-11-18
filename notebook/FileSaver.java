package notebook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.DefaultListModel;

public class FileSaver {
	@SuppressWarnings("resource")
	public  static void saver(@SuppressWarnings("rawtypes") DefaultListModel x) {
		try {
			ObjectOutputStream os = new ObjectOutputStream(
					new FileOutputStream("Notebook.ser"));
			os.writeObject(x);
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		x = null;
	}
}
