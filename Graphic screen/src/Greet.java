import java.awt.BorderLayout;

import java.awt.EventQueue;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class Greet extends JFrame {

	private JPanel contentPane;
	private JTextField txtWelcomeToThe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Greet frame = new Greet();
					frame.setTitle("Screw Bar!");
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
	public Greet() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JButton btnOrder = new JButton("order");
		btnOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				  
			}
		});
		contentPane.add(btnOrder, BorderLayout.SOUTH);
		
		txtWelcomeToThe = new JTextField();
		txtWelcomeToThe.setEditable(false);
		txtWelcomeToThe.setText("Welcome to the Screw Bar!!");
		contentPane.add(txtWelcomeToThe, BorderLayout.NORTH);
		txtWelcomeToThe.setColumns(10);
		
		ImageIcon start = new ImageIcon("resource/ScrewBar.jpg");
		JLabel Photo = new JLabel (start);
		contentPane.add(Photo, BorderLayout.CENTER);
		
	}

}
