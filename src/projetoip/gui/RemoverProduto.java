package projetoip.gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RemoverProduto extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		try {
			RemoverProduto dialog = new RemoverProduto();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}*/

	/**
	 * Create the dialog.
	 */
	public RemoverProduto() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(RemoverProduto.class.getResource("/projetoip/recursos/removerproduto.png")));
		setResizable(false);
		setTitle("Remover Produto");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JButton btnVoltar = new JButton("Voltar");
			btnVoltar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					setVisible(false);
				}
			});
			btnVoltar.setIcon(new ImageIcon(RemoverProduto.class.getResource("/projetoip/recursos/voltar.png")));
			btnVoltar.setBounds(302, 215, 132, 46);
			contentPanel.add(btnVoltar);
		}
		{
			JLabel label = new JLabel("Nome");
			label.setBounds(27, 70, 79, 14);
			contentPanel.add(label);
		}
		{
			TextField tf_nome = new TextField();
			tf_nome.setBounds(141, 62, 258, 22);
			contentPanel.add(tf_nome);
		}
		{
			JLabel label = new JLabel("C\u00F3digo Identificador\r\n");
			label.setBounds(27, 98, 108, 14);
			contentPanel.add(label);
		}
		{
			TextField tf_codigo = new TextField();
			tf_codigo.setBounds(141, 90, 258, 22);
			contentPanel.add(tf_codigo);
		}
		{
			JLabel label = new JLabel("Remover Produto");
			label.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 25));
			label.setBounds(121, 11, 201, 37);
			contentPanel.add(label);
		}
		{
			JButton btnRemoverProduto = new JButton("");
			btnRemoverProduto.setIcon(new ImageIcon(RemoverProduto.class.getResource("/projetoip/recursos/remover.png")));
			btnRemoverProduto.setBounds(170, 130, 103, 57);
			contentPanel.add(btnRemoverProduto);
		}
		{
			JLabel label = new JLabel("");
			label.setIcon(new ImageIcon(RemoverProduto.class.getResource("/projetoip/recursos/background.jpg")));
			label.setBounds(0, 0, 444, 272);
			contentPanel.add(label);
		}
	}

}
