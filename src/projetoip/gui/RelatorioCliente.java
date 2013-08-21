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
import javax.swing.JFormattedTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import javax.swing.JTextArea;
import java.awt.TextArea;
import javax.swing.border.TitledBorder;

public class RelatorioCliente extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField tf_nome;
	private JTextField tf_DataInicial;
	private JTextField tf_dataFinal;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		try {
			RelatorioCliente dialog = new RelatorioCliente();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}*/

	/**
	 * Create the dialog.
	 */
	public RelatorioCliente() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(RelatorioCliente.class.getResource("/projetoip/recursos/relatoriocliente.png")));
		setTitle("Relat\u00F3rio de Clientes");
		setBounds(100, 100, 700, 500);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel label = new JLabel("Relat\u00F3rio de Clientes");
			label.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 40));
			label.setBounds(156, 11, 396, 72);
			contentPanel.add(label);
		}
		{
			JLabel lblNomeDoCliente = new JLabel("Nome do Cliente");
			lblNomeDoCliente.setBounds(72, 88, 92, 14);
			contentPanel.add(lblNomeDoCliente);
		}
		{
			tf_nome = new JTextField();
			tf_nome.setBounds(193, 79, 405, 20);
			contentPanel.add(tf_nome);
			tf_nome.setColumns(10);
		}
		{
			JLabel lblDataInicial = new JLabel("Data Inicial");
			lblDataInicial.setBounds(72, 119, 81, 14);
			contentPanel.add(lblDataInicial);
		}
		{
			tf_DataInicial = new JTextField();
			tf_DataInicial.setBounds(193, 113, 120, 20);
			contentPanel.add(tf_DataInicial);
			tf_DataInicial.setColumns(10);
		}
		{
			JLabel lblDataFinal = new JLabel("Data Final");
			lblDataFinal.setBounds(381, 119, 59, 14);
			contentPanel.add(lblDataFinal);
		}
		{
			tf_dataFinal = new JTextField();
			tf_dataFinal.setColumns(10);
			tf_dataFinal.setBounds(478, 113, 120, 20);
			contentPanel.add(tf_dataFinal);
		}
		{
			JButton btnRelatorioClientes = new JButton("Gerar Relat\u00F3rio");
			btnRelatorioClientes.setBounds(264, 144, 165, 23);
			contentPanel.add(btnRelatorioClientes);
		}
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setIcon(new ImageIcon(RelatorioCliente.class.getResource("/projetoip/recursos/voltar.png")));
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
			}
		});
		btnVoltar.setBounds(562, 426, 132, 46);
		contentPanel.add(btnVoltar);
		{
			JPanel panel = new JPanel();
			panel.setBorder(new TitledBorder(null, "Relatório de Clientes", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel.setBounds(49, 178, 598, 234);
			contentPanel.add(panel);
			panel.setLayout(null);
			
			TextArea textArea = new TextArea();
			textArea.setBounds(6, 16, 586, 211);
			panel.add(textArea);
			textArea.setEditable(false);
		}
		{
			JLabel label = new JLabel("");
			label.setIcon(new ImageIcon(RelatorioCliente.class.getResource("/projetoip/recursos/background.jpg")));
			label.setBounds(0, 0, 694, 472);
			contentPanel.add(label);
		}
	}
}
