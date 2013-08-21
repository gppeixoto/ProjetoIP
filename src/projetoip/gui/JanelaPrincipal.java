package projetoip.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JRadioButtonMenuItem;
import java.awt.Scrollbar;
import java.awt.Choice;
import javax.swing.JMenuItem;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import java.awt.Button;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Canvas;
import javax.swing.UIManager;
import java.awt.Toolkit;

public class JanelaPrincipal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaPrincipal frame = new JanelaPrincipal();
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
	public JanelaPrincipal() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(JanelaPrincipal.class.getResource("/projetoip/recursos/clone-old-icon.png")));
		setBackground(SystemColor.activeCaption);
		setResizable(false);
		setTitle("Delivery");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 500);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("MenuBar.background"));
		contentPane.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 12));
		contentPane.setName("\r\n");
		contentPane.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblDelivery = new JLabel("Gerenciamento de Delivery");
		lblDelivery.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 40));
		lblDelivery.setBounds(112, 11, 498, 71);
		contentPane.add(lblDelivery);

		JButton btnRemoverCliente = new JButton("");
		btnRemoverCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				abrirRemoverCliente();
			}
		});
		btnRemoverCliente.setIcon(new ImageIcon(JanelaPrincipal.class.getResource("/projetoip/recursos/removercliente.png")));
		btnRemoverCliente.setBounds(127, 162, 65, 65);
		contentPane.add(btnRemoverCliente);

		JButton btnProcurarCliente = new JButton("");
		btnProcurarCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				abrirProcurarCliente();
			}
		});
		btnProcurarCliente.setIcon(new ImageIcon(JanelaPrincipal.class.getResource("/projetoip/recursos/buscarcliente.png")));
		btnProcurarCliente.setBounds(209, 162, 65, 65);
		contentPane.add(btnProcurarCliente);

		JButton btnProcurarProduto = new JButton("");
		btnProcurarProduto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				abrirProcurarProduto();
			}
		});
		btnProcurarProduto.setIcon(new ImageIcon(JanelaPrincipal.class.getResource("/projetoip/recursos/buscarproduto.png")));
		btnProcurarProduto.setBounds(565, 162, 65, 65);
		contentPane.add(btnProcurarProduto);

		JButton btnCadastrarProduto = new JButton("");
		btnCadastrarProduto.setIcon(new ImageIcon(JanelaPrincipal.class.getResource("/projetoip/recursos/adcionarproduto.png")));
		btnCadastrarProduto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				abrirCadastroProduto();
			}
		});
		btnCadastrarProduto.setBounds(393, 162, 65, 65);
		contentPane.add(btnCadastrarProduto);

		JButton btnRemoverProduto = new JButton("");
		btnRemoverProduto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				abrirRemoverProduto();
			}
		});
		btnRemoverProduto.setIcon(new ImageIcon(JanelaPrincipal.class.getResource("/projetoip/recursos/removerproduto.png")));
		btnRemoverProduto.setBounds(480, 162, 65, 65);
		contentPane.add(btnRemoverProduto);

		JButton btnProcurarPedido = new JButton("");
		btnProcurarPedido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				abrirProcurarPedido();
			}
		});
		btnProcurarPedido.setIcon(new ImageIcon(JanelaPrincipal.class.getResource("/projetoip/recursos/buscarpedido.png")));
		btnProcurarPedido.setBounds(209, 322, 65, 65);
		contentPane.add(btnProcurarPedido);

		JButton btnEfetuarPedido = new JButton("");
		btnEfetuarPedido.setIcon(new ImageIcon(JanelaPrincipal.class.getResource("/projetoip/recursos/cadastrarpedido.png")));
		btnEfetuarPedido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				abrirCadastroPedido();
			}
		});
		btnEfetuarPedido.setBounds(45, 322, 65, 65);
		contentPane.add(btnEfetuarPedido);

		JButton btnRemoverPedido = new JButton("");
		btnRemoverPedido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				abrirRemoverPedido();
			}
		});
		btnRemoverPedido.setIcon(new ImageIcon(JanelaPrincipal.class.getResource("/projetoip/recursos/removerpedido.png")));
		btnRemoverPedido.setBounds(127, 322, 65, 65);
		contentPane.add(btnRemoverPedido);

		JLabel lblCliente = new JLabel("Cliente");
		lblCliente.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 25));
		lblCliente.setBounds(127, 128, 100, 29);
		contentPane.add(lblCliente);

		JLabel lblProduto = new JLabel("Produto");
		lblProduto.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 25));
		lblProduto.setBounds(468, 131, 108, 22);
		contentPane.add(lblProduto);

		JLabel label = new JLabel("Pedido");
		label.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 25));
		label.setBounds(127, 289, 94, 22);
		contentPane.add(label);

		JLabel lblRelatorios = new JLabel("Relat\u00F3rios");
		lblRelatorios.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 25));
		lblRelatorios.setBounds(459, 289, 129, 29);
		contentPane.add(lblRelatorios);

		JButton btnRelatorioProdutos = new JButton("");
		btnRelatorioProdutos.setIcon(new ImageIcon(JanelaPrincipal.class.getResource("/projetoip/recursos/relatorioprodutos.png")));
		btnRelatorioProdutos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				abrirRelatorioProdutos();
			}
		});
		btnRelatorioProdutos.setBounds(541, 322, 65, 65);
		contentPane.add(btnRelatorioProdutos);
		
		JButton btnRelatorioClientes = new JButton("");
		btnRelatorioClientes.setIcon(new ImageIcon(JanelaPrincipal.class.getResource("/projetoip/recursos/relatoriocliente.png")));
		btnRelatorioClientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				abrirRelatorioCliente();
			}
		});
		btnRelatorioClientes.setBounds(427, 322, 65, 65);
		contentPane.add(btnRelatorioClientes);
		
		JLabel lblCadastro = new JLabel("Cadastro");
		lblCadastro.setBounds(52, 233, 58, 14);
		contentPane.add(lblCadastro);
		
		JLabel lblRemover = new JLabel("Remover");
		lblRemover.setBounds(134, 233, 58, 14);
		contentPane.add(lblRemover);
		
		JLabel lblProcurar = new JLabel("Procurar");
		lblProcurar.setBounds(219, 233, 58, 14);
		contentPane.add(lblProcurar);
		
		JButton btnCadastro = new JButton("");
		btnCadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				abrirCadastroCliente();
			}
		});
		btnCadastro.setIcon(new ImageIcon(JanelaPrincipal.class.getResource("/projetoip/recursos/clone-old-icon.png")));
		btnCadastro.setBounds(45, 162, 65, 65);
		contentPane.add(btnCadastro);
		
		JLabel label_1 = new JLabel("Cadastro");
		label_1.setBounds(403, 233, 58, 14);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("Remover");
		label_2.setBounds(490, 233, 58, 14);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("Procurar");
		label_3.setBounds(575, 233, 58, 14);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("Cadastro");
		label_4.setBounds(52, 396, 58, 14);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("Remover");
		label_5.setBounds(134, 396, 58, 14);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("Procurar");
		label_6.setBounds(216, 396, 58, 14);
		contentPane.add(label_6);
		
		JLabel lblRelatorioClientes = new JLabel("Clientes");
		lblRelatorioClientes.setBounds(437, 396, 58, 14);
		contentPane.add(lblRelatorioClientes);
		
		JLabel lblRelatorioProdutos = new JLabel("Produtos");
		lblRelatorioProdutos.setBounds(548, 396, 58, 14);
		contentPane.add(lblRelatorioProdutos);
		
		JLabel label_7 = new JLabel("");
		label_7.setIcon(new ImageIcon(JanelaPrincipal.class.getResource("/projetoip/recursos/background.jpg")));
		label_7.setBounds(0, 0, 694, 472);
		contentPane.add(label_7);
	}

	private void abrirCadastroCliente() {
		CadastroCliente cc = new CadastroCliente();
		cc.setModal(true);
		cc.setVisible(true);
	}
	
	private void abrirCadastroProduto() {
		CadastroProduto cp = new CadastroProduto();
		cp.setModal(true);
		cp.setVisible(true);
	}
	
	private void abrirCadastroPedido() {
		CadastroPedido cp = new CadastroPedido();
		cp.setModal(true);
		cp.setVisible(true);
	}
	
	private void abrirRelatorioCliente() {
		RelatorioCliente rc = new RelatorioCliente();
		rc.setModal(true);
		rc.setVisible(true);
	}
	
	private void abrirRelatorioProdutos(){
		RelatorioProduto rp = new RelatorioProduto();
		rp.setModal(true);
		rp.setVisible(true);
	}
	
	private void abrirRemoverPedido(){
		RemoverPedido rp = new RemoverPedido();
		rp.setModal(true);
		rp.setVisible(true);
	}
	
	private void abrirRemoverCliente(){
		RemoverCliente rc = new RemoverCliente();
		rc.setModal(true);
		rc.setVisible(true);
	}
	
	private void abrirRemoverProduto(){
		RemoverProduto rp = new RemoverProduto();
		rp.setModal(true);
		rp.setVisible(true);
	}
	
	private void abrirProcurarCliente(){
		ProcurarCliente pc = new ProcurarCliente();
		pc.setModal(true);
		pc.setVisible(true);
	}
	
	private void abrirProcurarProduto(){
		ProcurarProduto pp = new ProcurarProduto();
		pp.setModal(true);
		pp.setVisible(true);
	}
	
	private void abrirProcurarPedido(){
		ProcurarPedido ppe = new ProcurarPedido();
		ppe.setModal(true);
		ppe.setVisible(true);
	}
}
