package notebook;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

import javax.swing.DefaultListModel;

public class FileLoader {
	@SuppressWarnings("rawtypes")
	public static DefaultListModel load() {
		File f = new File("Notebook.ser");
		if (f.isFile() && f.canRead()) {
			try {
				@SuppressWarnings("resource")
				ObjectInputStream is = new ObjectInputStream(
						new FileInputStream("Notebook.ser"));
				DefaultListModel notebookRestore = (DefaultListModel) is
						.readObject();
				System.out.println("Notebook type "
						+ notebookRestore.getClass());
				return notebookRestore;
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
		return null;
	}
}
