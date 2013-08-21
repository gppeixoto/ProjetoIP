package projetoip.gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.TextField;
import java.awt.Button;
import javax.swing.JTextField;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RemoverPedido extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField tf_nome;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		try {
			RemoverPedido dialog = new RemoverPedido();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}*/

	/**
	 * Create the dialog.
	 */
	public RemoverPedido() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(RemoverPedido.class.getResource("/projetoip/recursos/removerpedido.png")));
		setTitle("Remover Pedido");
		setResizable(false);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblRemoverCliente = new JLabel("Remover Pedido");
		lblRemoverCliente.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 25));
		lblRemoverCliente.setBounds(123, 11, 201, 37);
		contentPanel.add(lblRemoverCliente);
		
		JLabel lblTelefone = new JLabel("C\u00F3digo");
		lblTelefone.setBounds(35, 69, 79, 14);
		contentPanel.add(lblTelefone);
		
		TextField tf_telefone = new TextField();
		tf_telefone.setBounds(149, 61, 258, 22);
		contentPanel.add(tf_telefone);
		
		JButton btnRemoverCliente = new JButton("");
		btnRemoverCliente.setIcon(new ImageIcon(RemoverPedido.class.getResource("/projetoip/recursos/remover.png")));
		btnRemoverCliente.setBounds(166, 139, 103, 57);
		contentPanel.add(btnRemoverCliente);
		
		JLabel label = new JLabel("Nome");
		label.setBounds(35, 102, 46, 14);
		contentPanel.add(label);
		
		tf_nome = new JTextField();
		tf_nome.setBounds(149, 94, 258, 22);
		contentPanel.add(tf_nome);
		tf_nome.setColumns(10);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
			}
		});
		btnVoltar.setIcon(new ImageIcon(RemoverPedido.class.getResource("/projetoip/recursos/voltar.png")));
		btnVoltar.setBounds(302, 215, 132, 46);
		contentPanel.add(btnVoltar);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(RemoverPedido.class.getResource("/projetoip/recursos/background.jpg")));
		label_1.setBounds(0, 0, 444, 272);
		contentPanel.add(label_1);
		
		JLabel lblBg = new JLabel("");
		lblBg.setBounds(0, 0, 444, 272);
		contentPanel.add(lblBg);
	}
}
