package projetoip.gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class CadastroPedido extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField tf_codigo;
	private JTextField tf_data;
	private JTextField textField;
	private JTextField tf_cliente;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		try {
			CadastroPedido dialog = new CadastroPedido();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}*/

	/**
	 * Create the dialog.
	 */
	public CadastroPedido() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(CadastroPedido.class.getResource("/projetoip/recursos/cadastrarpedido.png")));
		setTitle("Cadastro do Pedido");
		setBounds(100, 100, 700, 500);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel label = new JLabel("Cadastro do Pedido");
			label.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 40));
			label.setBounds(168, 11, 370, 46);
			contentPanel.add(label);
		}
		{
			JLabel lblCodigo = new JLabel("C\u00F3digo");
			lblCodigo.setBounds(68, 138, 61, 14);
			contentPanel.add(lblCodigo);
		}
		{
			JLabel lblCliente = new JLabel("Cliente");
			lblCliente.setBounds(68, 202, 46, 14);
			contentPanel.add(lblCliente);
		}
		{
			JLabel lblProdutos = new JLabel("Produtos");
			lblProdutos.setBounds(416, 202, 46, 14);
			contentPanel.add(lblProdutos);
		}
		{
			JLabel lblData = new JLabel("Data");
			lblData.setBounds(416, 138, 46, 14);
			contentPanel.add(lblData);
		}
		{
			JButton btnCadastrarProduto = new JButton("Cadastrar");
			btnCadastrarProduto.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					cadastrarPedido();
				}
			});
			btnCadastrarProduto.setBounds(127, 385, 132, 46);
			contentPanel.add(btnCadastrarProduto);
		}
		{
			JButton btnVoltar = new JButton("Voltar");
			btnVoltar.setIcon(new ImageIcon(CadastroPedido.class.getResource("/projetoip/recursos/voltar.png")));
			btnVoltar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					setVisible(false);
				}
			});
			btnVoltar.setBounds(402, 385, 132, 46);
			contentPanel.add(btnVoltar);
		}
		
		tf_codigo = new JTextField();
		tf_codigo.setBounds(197, 132, 151, 20);
		contentPanel.add(tf_codigo);
		tf_codigo.setColumns(10);
		
		tf_data = new JTextField();
		tf_data.setBounds(530, 132, 86, 20);
		contentPanel.add(tf_data);
		tf_data.setColumns(10);
		
		JLabel lblQuantidade = new JLabel("Quantidade");
		lblQuantidade.setBounds(68, 261, 76, 17);
		contentPanel.add(lblQuantidade);
		
		textField = new JTextField();
		textField.setBounds(197, 258, 86, 20);
		contentPanel.add(textField);
		textField.setColumns(10);
		
		JLabel lblValor = new JLabel("Valor");
		lblValor.setBounds(416, 262, 46, 14);
		contentPanel.add(lblValor);
		{
			tf_cliente = new JTextField();
			tf_cliente.setColumns(10);
			tf_cliente.setBounds(197, 199, 151, 20);
			contentPanel.add(tf_cliente);
		}
		{
			JLabel label = new JLabel("");
			label.setIcon(new ImageIcon(CadastroPedido.class.getResource("/projetoip/recursos/background.jpg")));
			label.setBounds(0, 0, 694, 472);
			contentPanel.add(label);
		}
	}
	
	private void cadastrarPedido(){
		
	}
}
