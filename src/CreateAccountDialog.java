import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CreateAccountDialog extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField nameTextField;
	private JTextField textField;
	private CreateAccountDialog reference = null;

	/**
	 * Launch the application.
	 */
	/*
	public static void main(String[] args) {
		try {
			CreateAccountDialog dialog = new CreateAccountDialog();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	*/

	/**
	 * Create the dialog.
	 */
	public CreateAccountDialog() {
		reference = this;
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JPanel panel = new JPanel();
			contentPanel.add(panel, BorderLayout.NORTH);
			panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
			{
				JLabel lblName = new JLabel("Name: ");
				panel.add(lblName);
			}
			{
				nameTextField = new JTextField();
				panel.add(nameTextField);
				nameTextField.setColumns(10);
			}
		}
		{
			JPanel panel = new JPanel();
			contentPanel.add(panel, BorderLayout.CENTER);
			panel.setLayout(new BorderLayout(0, 0));
			{
				JPanel panel_1 = new JPanel();
				panel.add(panel_1, BorderLayout.NORTH);
				panel_1.setLayout(new BoxLayout(panel_1, BoxLayout.X_AXIS));
				{
					JLabel lblAmount = new JLabel("Amount: ");
					panel_1.add(lblAmount);
				}
				{
					textField = new JTextField();
					panel_1.add(textField);
					textField.setColumns(10);
				}
			}
			{
				JPanel panel_1 = new JPanel();
				panel.add(panel_1, BorderLayout.CENTER);
				panel_1.setLayout(new BorderLayout(0, 0));
				{
					JPanel panel_2 = new JPanel();
					panel_1.add(panel_2, BorderLayout.NORTH);
					panel_2.setLayout(new BoxLayout(panel_2, BoxLayout.X_AXIS));
					{
						JLabel lblType = new JLabel("Type: ");
						panel_2.add(lblType);
					}
					{
						JComboBox comboBox = new JComboBox(Constants.ACCOUNT_LIST);
						panel_2.add(comboBox);
					}
				}
			}
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseReleased(MouseEvent arg0) 
					{
						
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

}
