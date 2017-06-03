import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import java.awt.FlowLayout;
import javax.swing.JLayeredPane;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Ordering extends JFrame {

	private JPanel contentPane;
	private JTextField txtChooseAMenu;
	private JTextField txtTotalPrice;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ordering frame = new Ordering();
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
	public Ordering() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JLayeredPane layeredPane = new JLayeredPane();
		contentPane.add(layeredPane, BorderLayout.SOUTH);
		layeredPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		txtTotalPrice = new JTextField();
		txtTotalPrice.setText("total price : ");
		layeredPane.add(txtTotalPrice);
		txtTotalPrice.setColumns(10);
		
		JButton btnFinish = new JButton("finish");
		layeredPane.add(btnFinish);
		
		txtChooseAMenu = new JTextField();
		txtChooseAMenu.setEnabled(false);
		txtChooseAMenu.setText("Choose a menu");
		contentPane.add(txtChooseAMenu, BorderLayout.NORTH);
		txtChooseAMenu.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		contentPane.add(comboBox, BorderLayout.CENTER);
	}

}
