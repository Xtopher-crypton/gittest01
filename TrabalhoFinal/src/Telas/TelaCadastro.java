package Telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaCadastro extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtfDesc;
	private JTextField txtfPreco;
	private JTextField txtfQuant;
	private JTextField txtfValorTotal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastro frame = new TelaCadastro();
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
	public TelaCadastro() {
		setTitle("Tela Cadastro de Materiais");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 528, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextField txtfCod = new JTextField();
		txtfCod.setBounds(95, 22, 110, 20);
		contentPane.add(txtfCod);
		txtfCod.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Código:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setBounds(46, 22, 46, 18);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Descrição:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(236, 22, 70, 20);
		contentPane.add(lblNewLabel_1);
		
		txtfDesc = new JTextField();
		txtfDesc.setBounds(330, 22, 129, 20);
		contentPane.add(txtfDesc);
		txtfDesc.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Preço:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(46, 84, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		txtfPreco = new JTextField();
		txtfPreco.setBounds(95, 82, 110, 20);
		contentPane.add(txtfPreco);
		txtfPreco.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Quantidade:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_3.setBounds(236, 86, 75, 14);
		contentPane.add(lblNewLabel_3);
		
		txtfQuant = new JTextField();
		txtfQuant.setBounds(310, 84, 103, 20);
		contentPane.add(txtfQuant);
		txtfQuant.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Valor Total:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_4.setBounds(22, 139, 70, 14);
		contentPane.add(lblNewLabel_4);
		
		txtfValorTotal = new JTextField();
		txtfValorTotal.setBounds(101, 137, 86, 20);
		contentPane.add(txtfValorTotal);
		txtfValorTotal.setColumns(10);
		
		JComboBox comboPagamento = new JComboBox();
		comboPagamento.addItem("À vista");
		comboPagamento.addItem("Cartão de Crédito");
		comboPagamento.addItem("Cartão de Débito");
		comboPagamento.setBounds(264, 179, 119, 22);
		contentPane.add(comboPagamento);
		
		JRadioButton rbSim = new JRadioButton("Sim");
		rbSim.setBounds(357, 136, 60, 23);
		contentPane.add(rbSim);
		
		JRadioButton rbNao = new JRadioButton("Não");
		rbNao.setBounds(430, 136, 70, 23);
		contentPane.add(rbNao);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaConfirmacao telaCon = new TelaConfirmacao();
				telaCon.setVisible(true);
			}
		});
		btnNewButton.setBounds(141, 227, 110, 23);
		contentPane.add(btnNewButton);

		ButtonGroup grupoEstoque = new ButtonGroup();
		grupoEstoque.add(rbSim);
		grupoEstoque.add(rbNao);
		
		JLabel lblNewLabel_5 = new JLabel("Produto em Estoque:");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_5.setBounds(209, 137, 142, 18);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Formas de Pagamento:");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_6.setBounds(111, 180, 143, 18);
		contentPane.add(lblNewLabel_6);
		
		
		String txt = "=== Dados do Produto Cadastrado ===\n"
                + "Código: " + txtfCod.getText() + "\n"
                + "Descrição: " + txtfDesc.getText() + "\n"
                + "Preço: " + txtfPreco.getText() + "\n"
                + "Quantidade: " + txtfQuant.getText() + "\n"
                + "Valor Total: " + txtfValorTotal.getText() + "\n"
                + "Meio de Pagamento: " + comboPagamento.getSelectedItem() + "\n"
                + "Produto em Estoque: " + (rbSim.isSelected() ? "Sim" : "Não");

	}
}
