package Telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaConfirmacao extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaConfirmacao frame = new TelaConfirmacao();
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
	public TelaConfirmacao() {
		setTitle("Tela Confirmação");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Deseja realmente cadastrar este produto?");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(86, 30, 283, 49);
		contentPane.add(lblNewLabel);
		
		JRadioButton rbS = new JRadioButton("Sim");
		rbS.setBounds(133, 114, 59, 23);
		contentPane.add(rbS); 
		
		JRadioButton rbN = new JRadioButton("Não");
		rbN.setBounds(252, 114, 59, 23);
		contentPane.add(rbN);
		
		ButtonGroup btngrup = new ButtonGroup();
		btngrup.add(rbS);
		btngrup.add(rbN);
		
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rbS.isSelected()) {
					TelaInicio ti = new TelaInicio();
					ti.setVisible(true);
					dispose();
                }
				else if (rbN.isSelected()) {
                    dispose();
                }
			}
		});
		btnConfirmar.setBounds(165, 183, 115, 28);
		contentPane.add(btnConfirmar);

	}
}
