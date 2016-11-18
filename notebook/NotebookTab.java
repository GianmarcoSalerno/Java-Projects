package notebook;


import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.JEditorPane;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.BorderLayout;

import javax.swing.SwingConstants;

import java.awt.Component;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JScrollPane;

import org.joda.time.DateTime;

import java.util.HashMap;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.File;

public class NotebookTab<E> extends JTabbedPane {

	private static final long serialVersionUID = 1L;

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public NotebookTab() {
		
		//Panel_1
		
		JPanel panel_1 = new JPanel();
		addTab("Data Entries", null, panel_1, null);
		panel_1.setLayout(new BorderLayout(20, 20));

		JPanel panel_2 = new JPanel();
		panel_1.add(panel_2, BorderLayout.NORTH);
		panel_2.setLayout(new BoxLayout(panel_2, BoxLayout.PAGE_AXIS));

		JLabel lblNewLabel_1 = new JLabel("Enter Data");
		lblNewLabel_1.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel_2.add(lblNewLabel_1);

		JPanel panel_3 = new JPanel();
		panel_1.add(panel_3, BorderLayout.CENTER);
		
		JPanel panel_4 = new JPanel();
		panel_1.add(panel_4, BorderLayout.SOUTH);
		
		
		
		//Panel_2

		JPanel panel = new JPanel();
		addTab("Previous Data Entries", null, panel, null);
		panel.setLayout(new BorderLayout(10, 10));
		
		
		JPanel panel_7 = new JPanel();
		panel.add(panel_7, BorderLayout.NORTH);

		JLabel lblNewLabel = new JLabel("Select date");
		panel_7.add(lblNewLabel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);

		JPanel panel_10 = new JPanel();
		panel.add(panel_10, BorderLayout.SOUTH);
		
		

		//Making our scrollable notepad box
		JEditorPane editorPane = new JEditorPane();
		editorPane.setPreferredSize(new Dimension(100, 800));
		panel_3.add(editorPane);
		JScrollPane scrollPane = new JScrollPane(editorPane);
		scrollPane.setPreferredSize(new Dimension(400, 230));
		panel_3.add(scrollPane);
		
		final DefaultListModel listModel;
		
		File f = new File("Notebook.ser");
		if (f.isFile() && f.canRead()&& f.exists()) {
			listModel = FileLoader.load();
		}
		else {
			listModel = new DefaultListModel();
		}
		JList list = new JList(listModel);

		//making our scrollable list
		JPanel panel_8 = new JPanel();
		panel.add(panel_8, BorderLayout.CENTER);
		list.setPreferredSize(new Dimension(100, 100));
		panel_8.add(list);
		JScrollPane scroller = new JScrollPane(list);
		scroller.setPreferredSize(new Dimension(400, 230));
		panel_8.add(scroller);

		
		
		
		//Buttons for doing various things

		HashMap<String, String> EditorPaneSavedContentHmap = new HashMap<String, String>();

		JButton btnNewButton_1 = new JButton("Load");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (!EditorPaneSavedContentHmap.isEmpty()) {
					editorPane.setText(EditorPaneSavedContentHmap.get(list
							.getSelectedValue()));
				} else {
					editorPane.setText("Select an entry.");
				}
			}
		});

		JButton button = new JButton("Save");
		button.addActionListener(new ActionListener() {
			@SuppressWarnings("unchecked")
			public void actionPerformed(ActionEvent e) {
				if (editorPane.getText() != null || editorPane.getText() != "" || editorPane.getText() != " "){
				DateTime timeEPC = new DateTime();
				 String nameOfSave = JOptionPane.showInputDialog(getParent(),
	                        "Save file name?", null);
				String time = nameOfSave+": "+ timeEPC;
				listModel.addElement(time);
				EditorPaneSavedContentHmap.put(time, editorPane.getText());
				FileSaver.saver(listModel);
				}
			}
		});
		
		panel_10.add(btnNewButton_1);

		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (!(list.getSelectedValue() == null)) {
					editorPane.setText(EditorPaneSavedContentHmap.remove(list
							.getSelectedValue()));
					listModel.remove(list.getSelectedIndex());
				}
			}
		});
		panel_10.add(btnDelete);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				editorPane.setText("");
			}
		});
		panel_4.add(btnClear);
		button.setAlignmentX(0.5f);
		panel_4.add(button);
		

	}
}
