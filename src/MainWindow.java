import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.BoxLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;

public class MainWindow extends JFrame {

	private JPanel contentPane;
	private ArrayList<Account> accounts;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow frame = new MainWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainWindow() {
		
		/*
		 * Initialize finance data structures
		 */
		accounts = new ArrayList<Account>();
		
		setTitle("Personal Finance Tracker");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent arg0) {
				System.exit(0);
			}
		});
		
		JMenuItem mntmManageAccounts = new JMenuItem("Manage Accounts");
		mntmManageAccounts.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent arg0) 
			{
				
			}
		});
		mnFile.add(mntmManageAccounts);
		mnFile.add(mntmExit);
		
		JMenu mnAccounts = new JMenu("Accounts");
		menuBar.add(mnAccounts);
		
		JMenuItem mntmCreateNewAccount = new JMenuItem("Create New Account");
		mntmCreateNewAccount.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) 
			{
				//CreateAccount newAccount = new CreateAccount();
				//newAccount.setVisible(true);
				
				CreateAccountDialog dialog = new CreateAccountDialog();
				dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
				dialog.setModal(true);
				dialog.setVisible(true);
				
				System.out.println("test");
				/*
				JFrame createNewAccountFrame = new JFrame("Create New Account");
				JPanel newAccountPanel = new JPanel();
				createNewAccountFrame.setSize(300, 300);
				newAccountPanel.setLayout(new BoxLayout(newAccountPanel, BoxLayout.Y_AXIS));
				JLabel nameLabel = new JLabel("Name: ");
				JLabel amountLabel = new JLabel("Amount: ");
				JLabel typeLabel = new JLabel("Type: ");
				
				newAccountPanel.add(nameLabel);
				newAccountPanel.add(amountLabel);
				newAccountPanel.add(typeLabel);
				
				createNewAccountFrame.add(newAccountPanel);
				
				createNewAccountFrame.setVisible(true);
				*/
			}
		});
		mnAccounts.add(mntmCreateNewAccount);
		
		JMenuItem mntmViewAccounts = new JMenuItem("View Accounts");
		mnAccounts.add(mntmViewAccounts);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JButton btnUpdateAccountTotals = new JButton("Update Account Totals");
		contentPane.add(btnUpdateAccountTotals, BorderLayout.EAST);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.WEST);
		panel.setLayout(new GridLayout(0, 2, 0, 0));
		
		JButton btnAddDeposit = new JButton("Add Deposit");
		panel.add(btnAddDeposit);
		
		JButton btnAddWithdrawl = new JButton("Add Withdrawl");
		btnAddWithdrawl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		panel.add(btnAddWithdrawl);
	}

}
