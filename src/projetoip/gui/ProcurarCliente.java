package projetoip.gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.TextArea;
import javax.swing.border.TitledBorder;
import java.awt.Label;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ProcurarCliente extends JDialog {
	private JTextField tf_nome;
	private JTextField tf_telefone;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		try {
			ProcurarCliente dialog = new ProcurarCliente();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}*/

	/**
	 * Create the dialog.
	 */
	public ProcurarCliente() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(ProcurarCliente.class.getResource("/projetoip/recursos/buscarcliente.png")));
		setTitle("Procurar Cliente");
		setResizable(false);
		setBounds(100, 100, 611, 424);
		getContentPane().setLayout(null);
		{
			JLabel label = new JLabel("Procurar Cliente");
			label.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 25));
			label.setBounds(205, 11, 194, 37);
			getContentPane().add(label);
		}
		{
			JLabel lblNome = new JLabel("Nome");
			lblNome.setBounds(63, 59, 46, 14);
			getContentPane().add(lblNome);
		}
		{
			JLabel lblTelefone = new JLabel("Telefone");
			lblTelefone.setBounds(63, 95, 68, 14);
			getContentPane().add(lblTelefone);
		}
		{
			tf_nome = new JTextField();
			tf_nome.setBounds(172, 56, 368, 20);
			getContentPane().add(tf_nome);
			tf_nome.setColumns(10);
		}
		{
			JPanel panel = new JPanel();
			panel.setBorder(new TitledBorder(null, "Resultados da Busca", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel.setBounds(89, 126, 426, 210);
			getContentPane().add(panel);
			panel.setLayout(null);
			{
				TextArea buscaClienteTextArea = new TextArea();
				buscaClienteTextArea.setEditable(false);
				buscaClienteTextArea.setBounds(6, 16, 410, 184);
				panel.add(buscaClienteTextArea);
			}
		}

		tf_telefone = new JTextField();
		tf_telefone.setBounds(172, 92, 176, 20);
		getContentPane().add(tf_telefone);
		tf_telefone.setColumns(10);

		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnVoltar.setIcon(new ImageIcon(ProcurarCliente.class.getResource("/projetoip/recursos/voltar.png")));
		btnVoltar.setBounds(473, 350, 132, 46);
		getContentPane().add(btnVoltar);

		JLabel lblBackground = new JLabel("");
		lblBackground.setIcon(new ImageIcon(ProcurarCliente.class.getResource("/projetoip/recursos/background.jpg")));
		lblBackground.setBounds(0, 0, 605, 396);
		getContentPane().add(lblBackground);
	}
}
