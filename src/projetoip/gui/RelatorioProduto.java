package projetoip.gui;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.JFormattedTextField;
import javax.swing.DropMode;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import java.awt.TextArea;

public class RelatorioProduto extends JDialog {
	private JTextField tf_codigoProduto;
	private JTextField tf_dataInicial;
	private JTextField tf_dataFinal;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RelatorioProduto dialog = new RelatorioProduto();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the dialog.
	 */
	public RelatorioProduto() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(RelatorioProduto.class.getResource("/projetoip/recursos/relatorioprodutos.png")));
		setTitle("Relat\u00F3rio de Produtos");
		setBounds(100, 100, 700, 500);
		getContentPane().setLayout(null);
		
		JLabel label = new JLabel("Relat\u00F3rio de Produtos");
		label.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 40));
		label.setBounds(152, 11, 418, 72);
		getContentPane().add(label);
		
		JLabel lblCdigoIdentificador = new JLabel("C\u00F3digo Identificador*");
		lblCdigoIdentificador.setBounds(48, 81, 132, 14);
		getContentPane().add(lblCdigoIdentificador);
		
		tf_codigoProduto = new JTextField();
		tf_codigoProduto.setColumns(10);
		tf_codigoProduto.setBounds(177, 78, 151, 20);
		getContentPane().add(tf_codigoProduto);
		
		JLabel label_1 = new JLabel("Data Inicial");
		label_1.setBounds(48, 112, 81, 14);
		getContentPane().add(label_1);
		
		tf_dataInicial = new JTextField();
		tf_dataInicial.setColumns(10);
		tf_dataInicial.setBounds(177, 106, 151, 20);
		getContentPane().add(tf_dataInicial);
		
		JLabel label_2 = new JLabel("Data Final");
		label_2.setBounds(376, 112, 59, 14);
		getContentPane().add(label_2);
		
		tf_dataFinal = new JTextField();
		tf_dataFinal.setColumns(10);
		tf_dataFinal.setBounds(483, 106, 151, 20);
		getContentPane().add(tf_dataFinal);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnVoltar.setIcon(new ImageIcon(RelatorioProduto.class.getResource("/projetoip/recursos/voltar.png")));
		btnVoltar.setBounds(562, 426, 132, 46);
		getContentPane().add(btnVoltar);
		
		JButton btnRelatorioProdutos = new JButton("Gerar Relat\u00F3rio");
		btnRelatorioProdutos.setBounds(264, 137, 165, 23);
		getContentPane().add(btnRelatorioProdutos);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Relatório de Produtos", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(42, 176, 598, 234);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		TextArea textArea = new TextArea();
		textArea.setBounds(6, 16, 586, 211);
		panel.add(textArea);
		textArea.setEditable(false);
		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon(RelatorioProduto.class.getResource("/projetoip/recursos/background.jpg")));
		label_3.setBounds(0, 0, 694, 472);
		getContentPane().add(label_3);

	}
}
