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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ProcurarPedido extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField tf_codigo;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		try {
			ProcurarPedido dialog = new ProcurarPedido();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}*/

	/**
	 * Create the dialog.
	 */
	public ProcurarPedido() {
		setTitle("Procurar Pedido");
		setIconImage(Toolkit.getDefaultToolkit().getImage(ProcurarPedido.class.getResource("/projetoip/recursos/buscarpedido.png")));
		setResizable(false);
		setBounds(100, 100, 611, 424);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel label = new JLabel("Procurar Pedido");
		label.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 25));
		label.setBounds(205, 11, 194, 37);
		contentPanel.add(label);
		
		JLabel label_2 = new JLabel("C\u00F3digo");
		label_2.setBounds(120, 72, 68, 14);
		contentPanel.add(label_2);
		
		tf_codigo = new JTextField();
		tf_codigo.setColumns(10);
		tf_codigo.setBounds(308, 69, 176, 20);
		contentPanel.add(tf_codigo);
		
		TextArea textArea = new TextArea();
		textArea.setEditable(false);
		textArea.setBounds(97, 132, 410, 184);
		contentPanel.add(textArea);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnVoltar.setIcon(new ImageIcon(ProcurarPedido.class.getResource("/projetoip/recursos/voltar.png")));
		btnVoltar.setBounds(473, 350, 132, 46);
		contentPanel.add(btnVoltar);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(ProcurarPedido.class.getResource("/projetoip/recursos/background.jpg")));
		label_1.setBounds(0, 0, 605, 396);
		contentPanel.add(label_1);
	}

}
