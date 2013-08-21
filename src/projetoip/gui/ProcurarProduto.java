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
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.TextArea;
import javax.swing.border.TitledBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ProcurarProduto extends JDialog {
	private JTextField tf_nome;
	private JTextField tf_codigo;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		try {
			ProcurarProduto dialog = new ProcurarProduto();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}*/

	/**
	 * Create the dialog.
	 */
	public ProcurarProduto() {
		setTitle("Procurar Produto");
		setIconImage(Toolkit.getDefaultToolkit().getImage(ProcurarProduto.class.getResource("/projetoip/recursos/buscarproduto.png")));
		setResizable(false);
		setBounds(100, 100, 611, 424);
		getContentPane().setLayout(null);
		{
			JLabel label = new JLabel("Procurar Produto");
			label.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 25));
			label.setBounds(205, 11, 194, 37);
			getContentPane().add(label);
		}
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnVoltar.setIcon(new ImageIcon(ProcurarProduto.class.getResource("/projetoip/recursos/voltar.png")));
		btnVoltar.setBounds(473, 350, 132, 46);
		getContentPane().add(btnVoltar);
		
		JLabel label = new JLabel("Nome");
		label.setBounds(63, 62, 46, 14);
		getContentPane().add(label);
		
		tf_nome = new JTextField();
		tf_nome.setColumns(10);
		tf_nome.setBounds(172, 59, 368, 20);
		getContentPane().add(tf_nome);
		
		JLabel label_1 = new JLabel("C\u00F3digo");
		label_1.setBounds(63, 98, 68, 14);
		getContentPane().add(label_1);
		
		tf_codigo = new JTextField();
		tf_codigo.setColumns(10);
		tf_codigo.setBounds(172, 95, 176, 20);
		getContentPane().add(tf_codigo);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Resultados da Busca", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(91, 126, 422, 207);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		TextArea buscaProdutotextArea = new TextArea();
		buscaProdutotextArea.setEditable(false);
		buscaProdutotextArea.setBounds(6, 16, 410, 184);
		panel.add(buscaProdutotextArea);
		{
			JLabel lblBackground = new JLabel("");
			lblBackground.setIcon(new ImageIcon(ProcurarProduto.class.getResource("/projetoip/recursos/background.jpg")));
			lblBackground.setBounds(0, 0, 605, 396);
			getContentPane().add(lblBackground);
		}
	}

}
