package main.gui;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.File;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingWorker.StateValue;

public class Application extends JFrame {

	/**  */
	private static final long serialVersionUID = -8668818312732181049L;

	private Action conversionCancelAction;
	private Action browseSourceAction;
	private Action browseTargetAction;

	private JTextField targetPathTextField;
	private JTextField sourceFilePathTextField;
	private JTextArea messagesTextArea;
	private JProgressBar conversionProgressBar;

	private ConversionWorker conversionWorker;

	public Application() {
		initActions();
		initComponents();
	}

	private void initActions() {
		browseSourceAction = new AbstractAction("Browse Source") {

			private static final long serialVersionUID = 4669650683189592364L;

			@Override
			public void actionPerformed(final ActionEvent e) {
				final File dir = new File(sourceFilePathTextField.getText()).getAbsoluteFile();
				final JFileChooser fileChooser = new JFileChooser(dir.getParentFile());
				fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
				final int option = fileChooser.showOpenDialog(Application.this);
				if (option == JFileChooser.APPROVE_OPTION) {
					final File selected = fileChooser.getSelectedFile();
					sourceFilePathTextField.setText(selected.getAbsolutePath());
				}
			}
		};

		browseTargetAction = new AbstractAction("Browse Target") {

			private static final long serialVersionUID = 4669650683189592364L;

			@Override
			public void actionPerformed(final ActionEvent e) {
				final File dir = new File(targetPathTextField.getText()).getAbsoluteFile();
				final JFileChooser fileChooser = new JFileChooser(dir.getParentFile());
				fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
				final int option = fileChooser.showOpenDialog(Application.this);
				if (option == JFileChooser.APPROVE_OPTION) {
					final File selected = fileChooser.getSelectedFile();
					targetPathTextField.setText(selected.getAbsolutePath());
				}
			}
		};

		conversionCancelAction = new AbstractAction("Convert") {

			private static final long serialVersionUID = 4669650683189592364L;

			@Override
			public void actionPerformed(final ActionEvent e) {
				if (conversionWorker == null) {
					search();
				} else {
					cancel();
				}
			}
		};
	}

	private void initComponents() {
		setLayout(new GridBagLayout());

		GridBagConstraints constraints = new GridBagConstraints();
		constraints.gridx = 0;
		constraints.gridy = 0;
		constraints.insets = new Insets(2, 2, 2, 2);
		add(new JLabel("Target Path: "), constraints);

		targetPathTextField = new JTextField();
		targetPathTextField.setText("C:\\");
		constraints = new GridBagConstraints();
		constraints.gridx = 1;
		constraints.gridy = 0;
		constraints.gridwidth = 1;
		constraints.insets = new Insets(2, 2, 2, 2);
		constraints.weightx = 1;
		constraints.fill = GridBagConstraints.BOTH;
		add(targetPathTextField, constraints);

		constraints = new GridBagConstraints();
		constraints.gridx = 2;
		constraints.gridy = 0;
		constraints.insets = new Insets(2, 2, 2, 2);
		add(new JButton(browseTargetAction), constraints);

		constraints = new GridBagConstraints();
		constraints.gridx = 0;
		constraints.gridy = 1;
		constraints.insets = new Insets(2, 2, 2, 2);
		add(new JLabel("Source File: "), constraints);

		sourceFilePathTextField = new JTextField();
		sourceFilePathTextField.setText(".\\");
		constraints = new GridBagConstraints();
		constraints.gridx = 1;
		constraints.gridy = 1;
		constraints.gridwidth = 1;
		constraints.insets = new Insets(2, 2, 2, 2);
		constraints.weightx = 1;
		constraints.fill = GridBagConstraints.BOTH;
		add(sourceFilePathTextField, constraints);

		constraints = new GridBagConstraints();
		constraints.gridx = 2;
		constraints.gridy = 1;
		constraints.insets = new Insets(2, 2, 2, 2);
		add(new JButton(browseSourceAction), constraints);

		messagesTextArea = new JTextArea();
		messagesTextArea.setEditable(false);
		constraints = new GridBagConstraints();
		constraints.gridx = 0;
		constraints.gridy = 2;
		constraints.gridwidth = 3;
		constraints.insets = new Insets(2, 2, 2, 2);
		constraints.weightx = 1;
		constraints.weighty = 1;
		constraints.fill = GridBagConstraints.BOTH;
		add(new JScrollPane(messagesTextArea), constraints);

		conversionProgressBar = new JProgressBar();
		conversionProgressBar.setStringPainted(true);
		conversionProgressBar.setVisible(false);
		constraints = new GridBagConstraints();
		constraints.gridx = 0;
		constraints.gridy = 3;
		constraints.gridwidth = 2;
		constraints.insets = new Insets(2, 2, 2, 2);
		constraints.weightx = 1;
		constraints.fill = GridBagConstraints.BOTH;
		add(conversionProgressBar, constraints);

		constraints = new GridBagConstraints();
		constraints.gridx = 2;
		constraints.gridy = 3;
		constraints.insets = new Insets(2, 2, 2, 2);
		constraints.weightx = 0;
		add(new JButton(conversionCancelAction), constraints);
	}

	private void search() {
		final File sourceFile = new File(sourceFilePathTextField.getText());
		final File targetDirectory = new File(targetPathTextField.getText());
		messagesTextArea.setText(
				"Converting File '" + sourceFile.getName() + "' to TikZ and putting the result in path '" + targetDirectory.getAbsolutePath() + "'\n");
		conversionWorker = new ConversionWorker(sourceFile, targetDirectory, messagesTextArea);
		conversionWorker.addPropertyChangeListener(new PropertyChangeListener() {
			@Override
			public void propertyChange(final PropertyChangeEvent event) {
				switch (event.getPropertyName()) {
				case "progress":
					conversionProgressBar.setIndeterminate(false);
					conversionProgressBar.setValue((Integer) event.getNewValue());
					break;
				case "state":
					switch ((StateValue) event.getNewValue()) {
					case DONE:
						conversionProgressBar.setVisible(false);
						conversionCancelAction.putValue(Action.NAME, "Convert");
						conversionWorker = null;
						break;
					case STARTED:
					case PENDING:
						conversionCancelAction.putValue(Action.NAME, "Cancel");
						conversionProgressBar.setVisible(true);
						conversionProgressBar.setIndeterminate(true);
						break;
					}
					break;
				}
			}
		});
		conversionWorker.execute();
	}

	private void cancel() {
		conversionWorker.cancel(true);
	}
}