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

public class CadastroCliente extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField tf_nome;
	private JTextField tf_telefone;
	private JTextField tf_logradouro;
	private JTextField tf_bairro;
	private JTextField tf_cidade;
	private JTextField tf_cep;
	private JTextField tf_numero;
	private JTextField tf_cpf;
	private JTextField tf_observacoes;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		try {
			CadastroCliente dialog = new CadastroCliente();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}*/

	/**
	 * Create the dialog.
	 */
	public CadastroCliente() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(CadastroCliente.class.getResource("/projetoip/recursos/cadastrarcliente.png")));
		setTitle("Cadastro do Cliente");
		setResizable(false);
		setBounds(100, 100, 700, 500);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblCadastroCliente = new JLabel("Cadastro do Cliente");
			lblCadastroCliente.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 40));
			lblCadastroCliente.setBounds(180, 11, 371, 58);
			contentPanel.add(lblCadastroCliente);
		}
		{
			JLabel lblNome = new JLabel("Nome");
			lblNome.setBounds(67, 109, 46, 14);
			contentPanel.add(lblNome);
		}
		
		tf_nome = new JTextField();
		tf_nome.setBounds(180, 106, 447, 20);
		contentPanel.add(tf_nome);
		tf_nome.setColumns(10);
		
		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setBounds(67, 146, 68, 14);
		contentPanel.add(lblTelefone);
		
		tf_telefone = new JTextField();
		tf_telefone.setBounds(180, 140, 120, 20);
		contentPanel.add(tf_telefone);
		tf_telefone.setColumns(10);
		
		JLabel lblLogradouro = new JLabel("Logradouro");
		lblLogradouro.setBounds(67, 188, 68, 14);
		contentPanel.add(lblLogradouro);
		
		tf_logradouro = new JTextField();
		tf_logradouro.setBounds(180, 182, 447, 20);
		contentPanel.add(tf_logradouro);
		tf_logradouro.setColumns(10);
		
		JLabel lblBairro = new JLabel("Bairro");
		lblBairro.setBounds(67, 304, 46, 14);
		contentPanel.add(lblBairro);
		
		tf_bairro = new JTextField();
		tf_bairro.setBounds(180, 298, 253, 20);
		contentPanel.add(tf_bairro);
		tf_bairro.setColumns(10);
		
		JLabel lblCidade = new JLabel("Cidade");
		lblCidade.setBounds(67, 265, 46, 14);
		contentPanel.add(lblCidade);
		
		tf_cidade = new JTextField();
		tf_cidade.setBounds(180, 259, 253, 20);
		contentPanel.add(tf_cidade);
		tf_cidade.setColumns(10);
		
		JLabel lblCep = new JLabel("CEP");
		lblCep.setBounds(291, 226, 46, 14);
		contentPanel.add(lblCep);
		
		tf_cep = new JTextField();
		tf_cep.setBounds(347, 220, 86, 20);
		contentPanel.add(tf_cep);
		tf_cep.setColumns(10);
		
		JLabel lblNumero = new JLabel("Numero");
		lblNumero.setBounds(67, 226, 46, 14);
		contentPanel.add(lblNumero);
		
		tf_numero = new JTextField();
		tf_numero.setBounds(180, 220, 86, 20);
		contentPanel.add(tf_numero);
		tf_numero.setColumns(10);
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setBounds(324, 146, 46, 14);
		contentPanel.add(lblCpf);
		
		tf_cpf = new JTextField();
		tf_cpf.setBounds(366, 140, 120, 20);
		contentPanel.add(tf_cpf);
		tf_cpf.setColumns(10);
		
		JLabel lblObservacoes = new JLabel("Observacoes");
		lblObservacoes.setBounds(67, 345, 76, 14);
		contentPanel.add(lblObservacoes);
		
		tf_observacoes = new JTextField();
		tf_observacoes.setBounds(180, 339, 447, 20);
		contentPanel.add(tf_observacoes);
		tf_observacoes.setColumns(10);
		
		JLabel lblComplemento = new JLabel("Complemento");
		lblComplemento.setBounds(455, 226, 91, 14);
		contentPanel.add(lblComplemento);
		
		JTextField tf_complemento = new JTextField();
		tf_complemento.setBounds(541, 220, 86, 20);
		contentPanel.add(tf_complemento);
		tf_complemento.setColumns(10);
		
		JButton btnCadastrarCliente = new JButton("Cadastrar");
		btnCadastrarCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cadastrarCliente();
			}
		});
		btnCadastrarCliente.setBounds(143, 403, 132, 46);
		contentPanel.add(btnCadastrarCliente);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setIcon(new ImageIcon(CadastroCliente.class.getResource("/projetoip/recursos/voltar.png")));
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnVoltar.setBounds(418, 403, 132, 46);
		contentPanel.add(btnVoltar);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(CadastroCliente.class.getResource("/projetoip/recursos/background.jpg")));
		label.setBounds(0, 0, 694, 472);
		contentPanel.add(label);
	}
	
	public void cadastrarCliente(){
		
	}
	
}
