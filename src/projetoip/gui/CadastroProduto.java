package projetoip.gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class CadastroProduto extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField tf_codigo;
	private JTextField tf_nome;
	private JTextField tf_descricao;
	private JTextField tf_valor;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		try {
			CadastroProduto dialog = new CadastroProduto();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}*/

	/**
	 * Create the dialog.
	 */
	public CadastroProduto() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(CadastroProduto.class.getResource("/projetoip/recursos/adcionarproduto.png")));
		setTitle("Cadastro do Produto");
		setResizable(false);
		setBounds(100, 100, 700, 500);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel label = new JLabel("Cadastro do Produto");
			label.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 40));
			label.setBounds(181, 11, 389, 51);
			contentPanel.add(label);
		}
		{
			JLabel lblCodigo = new JLabel("C\u00F3digo");
			lblCodigo.setBounds(72, 148, 46, 14);
			contentPanel.add(lblCodigo);
		}
		{
			tf_codigo = new JTextField();
			tf_codigo.setBounds(181, 142, 206, 20);
			contentPanel.add(tf_codigo);
			tf_codigo.setColumns(10);
		}
		{
			JLabel lblNome = new JLabel("Nome");
			lblNome.setBounds(72, 185, 46, 14);
			contentPanel.add(lblNome);
		}
		{
			tf_nome = new JTextField();
			tf_nome.setBounds(181, 179, 206, 20);
			contentPanel.add(tf_nome);
			tf_nome.setColumns(10);
		}
		{
			JLabel lblDescricao = new JLabel("Descri\u00E7\u00E3o");
			lblDescricao.setBounds(72, 227, 69, 14);
			contentPanel.add(lblDescricao);
		}
		{
			tf_descricao = new JTextField();
			tf_descricao.setBounds(181, 221, 206, 20);
			contentPanel.add(tf_descricao);
			tf_descricao.setColumns(10);
		}
		{
			JLabel lblValor = new JLabel("Valor");
			lblValor.setBounds(72, 275, 46, 14);
			contentPanel.add(lblValor);
		}
		{
			tf_valor = new JTextField();
			tf_valor.setBounds(181, 269, 86, 20);
			contentPanel.add(tf_valor);
			tf_valor.setColumns(10);
		}
		{
			JLabel lblTamanho = new JLabel("Tamanho");
			lblTamanho.setBounds(72, 318, 69, 14);
			contentPanel.add(lblTamanho);
		}
		{
			JButton btnCadastrarProduto = new JButton("Cadastrar");
			btnCadastrarProduto.setBounds(143, 388, 132, 46);
			contentPanel.add(btnCadastrarProduto);
		}
		{
			JButton btnVoltar = new JButton("Voltar");
			btnVoltar.setIcon(new ImageIcon(CadastroProduto.class.getResource("/projetoip/recursos/voltar.png")));
			btnVoltar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					setVisible(false);
				}
			});
			btnVoltar.setBounds(418, 388, 132, 46);
			contentPanel.add(btnVoltar);
		}
		{
			JLabel label = new JLabel("");
			label.setIcon(new ImageIcon(CadastroProduto.class.getResource("/projetoip/recursos/background.jpg")));
			label.setBounds(0, 0, 694, 472);
			contentPanel.add(label);
		}
	}

}
