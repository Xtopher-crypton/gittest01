package Telas;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;


public class TelaCadastro extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtfDesc;
	private JTextField txtfPreco;
	private JTextField txtfQuant;
	public static ArrayList<String[]> listaProdutos = new ArrayList<>();

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
		setTitle("Tela Cadastro de Produtos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 528, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JTextField txtfCod = new JTextField();
		txtfCod.setBounds(359, 54, 119, 20);
		contentPane.add(txtfCod);
		txtfCod.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Código:");
		lblNewLabel.setBounds(303, 54, 46, 18);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Produto:");
		lblNewLabel_1.setBounds(35, 53, 70, 20);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(lblNewLabel_1);
		
		txtfDesc = new JTextField();
		txtfDesc.setBounds(103, 54, 129, 20);
		contentPane.add(txtfDesc);
		txtfDesc.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Preço:");
		lblNewLabel_2.setBounds(47, 110, 46, 14);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(lblNewLabel_2);
		
		txtfPreco = new JTextField();
		txtfPreco.setBounds(103, 108, 129, 20);
		contentPane.add(txtfPreco);
		txtfPreco.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Quantidade:");
		lblNewLabel_3.setBounds(274, 110, 75, 14);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(lblNewLabel_3);
		
		txtfQuant = new JTextField();
		txtfQuant.setBounds(359, 108, 119, 20);
		contentPane.add(txtfQuant);
		txtfQuant.setColumns(10);
		
		JComboBox comboCategoria = new JComboBox();
		comboCategoria.setBounds(359, 165, 119, 22);
		comboCategoria.addItem("Alimentos");
		comboCategoria.addItem("Limpeza");
		comboCategoria.addItem("Eletrônicos");
		comboCategoria.addItem("Bebidas");
		comboCategoria.addItem("Higiene");
		comboCategoria.addItem("Vestimenta");
		comboCategoria.addItem("Informática");
		comboCategoria.addItem("Outros");
		contentPane.add(comboCategoria);
		
		JRadioButton rbSim = new JRadioButton("Sim");
		rbSim.setBounds(139, 165, 52, 23);
		contentPane.add(rbSim);
		
		JRadioButton rbNao = new JRadioButton("Não");
		rbNao.setBounds(193, 165, 60, 23);
		contentPane.add(rbNao);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.setBounds(202, 227, 110, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 if (txtfCod.getText().trim().isEmpty() ||
				            txtfDesc.getText().trim().isEmpty() ||
				            txtfPreco.getText().trim().isEmpty() ||
				            txtfQuant.getText().trim().isEmpty()) {
				            JOptionPane.showMessageDialog(null, "Preencha todos os campos!", "Erro", JOptionPane.ERROR_MESSAGE);
				            return;
				        }
				        if (!rbSim.isSelected() && !rbNao.isSelected()) {
				            JOptionPane.showMessageDialog(null, "Selecione se o produto está em estoque!", "Erro", JOptionPane.ERROR_MESSAGE);
				            return;
				        }
				        String estoque = rbSim.isSelected() ? "Sim" : "Não";
				        String categoria = comboCategoria.getSelectedItem().toString();
				        
				        String[] dados = {
				        	    txtfCod.getText(),
				        	    txtfDesc.getText(),
				        	    txtfPreco.getText(),
				        	    txtfQuant.getText()
				        	};

				        	listaProdutos.add(dados);
				
				TelaConfirmacao telaCon = new TelaConfirmacao();
				telaCon.setVisible(true);
			}
			
		});
		contentPane.add(btnNewButton);

		ButtonGroup grupoEstoque = new ButtonGroup();
		grupoEstoque.add(rbSim);
		grupoEstoque.add(rbNao);
		
		JLabel lblNewLabel_5 = new JLabel("Produto em Estoque:");
		lblNewLabel_5.setBounds(10, 166, 142, 18);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Categoria do Produto:");
		lblNewLabel_6.setBounds(343, 139, 143, 18);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_4 = new JLabel("Cadastro do Produto");
		lblNewLabel_4.setFont(new Font("Cascadia Mono", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_4.setBounds(178, 11, 212, 20);
		contentPane.add(lblNewLabel_4);

	}
}
