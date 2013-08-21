package projetoip.gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.TextField;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RemoverCliente extends JDialog {

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		try {
			RemoverCliente dialog = new RemoverCliente();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}*/

	/**
	 * Create the dialog.
	 */
	public RemoverCliente() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(RemoverCliente.class.getResource("/projetoip/recursos/removercliente.png")));
		setTitle("Remover Cliente");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnVoltar.setIcon(new ImageIcon(RemoverCliente.class.getResource("/projetoip/recursos/voltar.png")));
		btnVoltar.setBounds(302, 216, 132, 46);
		getContentPane().add(btnVoltar);
		{
			JLabel label = new JLabel("Remover Cliente");
			label.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 25));
			label.setBounds(116, 11, 201, 37);
			getContentPane().add(label);
		}
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(32, 65, 79, 14);
		getContentPane().add(lblNome);
		
		TextField tf_nome = new TextField();
		tf_nome.setBounds(146, 57, 258, 22);
		getContentPane().add(tf_nome);
		
		JButton btnCancelarPedido = new JButton("");
		btnCancelarPedido.setIcon(new ImageIcon(RemoverCliente.class.getResource("/projetoip/recursos/remover.png")));
		btnCancelarPedido.setBounds(165, 116, 103, 57);
		getContentPane().add(btnCancelarPedido);
		
		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setBounds(32, 93, 79, 14);
		getContentPane().add(lblTelefone);
		
		TextField tf_telefone = new TextField();
		tf_telefone.setBounds(146, 85, 258, 22);
		getContentPane().add(tf_telefone);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(RemoverCliente.class.getResource("/projetoip/recursos/background.jpg")));
		label.setBounds(0, 0, 444, 272);
		getContentPane().add(label);
	}
}
