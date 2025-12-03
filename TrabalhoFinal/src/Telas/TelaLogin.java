package Telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaLogin extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtfUsuario;
	private JTextField txtfSenha;
	
	Usuario usuario = new Usuario(getWarningString(), getName());
	private String user = usuario.getUsuario();
	private String senha = usuario.getSenha();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLogin frame = new TelaLogin();
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
	public TelaLogin() {
		setTitle("Tela Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Usuario:");
		lblNewLabel.setBounds(96, 95, 50, 14);
		contentPane.add(lblNewLabel);
		
		txtfUsuario = new JTextField();
		txtfUsuario.setBounds(151, 92, 165, 20);
		contentPane.add(txtfUsuario);
		txtfUsuario.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Senha:");
		lblNewLabel_1.setBounds(100, 155, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		txtfSenha = new JTextField();
		txtfSenha.setBounds(151, 152, 165, 20);
		contentPane.add(txtfSenha);
		txtfSenha.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Login");
		lblNewLabel_2.setFont(new Font("DialogInput", Font.BOLD | Font.ITALIC, 22));
		lblNewLabel_2.setBounds(188, 25, 79, 38);
		contentPane.add(lblNewLabel_2);
		
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				if(txtfUsuario.getText().trim().isEmpty() || txtfSenha.getText().trim().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Preencha os campos!!", "Erro", JOptionPane.ERROR_MESSAGE);
					return;
				}
				String usuarioDigitado = txtfUsuario.getText().trim();
		        String senhaDigitada = txtfSenha.getText().trim();
				if(usuarioDigitado.equals(user) && senhaDigitada.equals(senha)) {
		            JOptionPane.showMessageDialog(null, "Bem vindo " + usuarioDigitado);
		            TelaInicio telaInicio = new TelaInicio();
		            telaInicio.setVisible(true);
		            dispose();
		        } else {
		            JOptionPane.showMessageDialog(null,
		                "Usuário ou senha incorretos!",
		                "Erro",
		                JOptionPane.ERROR_MESSAGE);
				
				JOptionPane.showMessageDialog(null, "Bem vindo " + txtfUsuario.getText().trim());
				TelaInicio telaInicio = new TelaInicio();
				telaInicio.setVisible(true);
				dispose();
			}
		});
		btnConfirmar.setBounds(179, 213, 103, 23);
		contentPane.add(btnConfirmar);

	}
}
