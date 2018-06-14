package pop;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.JScrollBar;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;
import java.awt.ComponentOrientation;
import java.awt.Component;

public class proyeccion {

	
	
	private JFrame frame;
barra buffer = new barra();
	
	productor pro1 = new productor(buffer);
	productor pro2 = new productor(buffer);
	consumidor con1 = new consumidor (buffer);
	consumidor con2 = new consumidor (buffer);
	private JTextField txtProductor1;
	private JTextField txtProductor2;
	private JButton btnNewButton;
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					proyeccion window = new proyeccion();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public proyeccion() {
		initialize();
	}

	
	private void initialize() {
		
		
		frame = new JFrame();
		frame.setBounds(100, 100, 697, 397);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		btnNewButton = new JButton("New button");		
		frame.getContentPane().add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(214, 22, 255, 215);
		frame.getContentPane().add(scrollPane);
	
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		pro1.setTextA(textArea);
		pro2.setTextA(textArea);
		
		JButton inicio1 = new JButton("INICIAR");
			
		inicio1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pro1.productor1(txtProductor1);
				pro1.start();
				inicio1.setEnabled(false);
				
				
			}
		});
		inicio1.setBounds(100, 11, 104, 23);
		frame.getContentPane().add(inicio1);
		
		JButton continuar1 = new JButton("CONTINUAR");
		continuar1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pro1.resume();
			}
		});
		
		continuar1.setBounds(100, 64, 104, 23);
		frame.getContentPane().add(continuar1);
		
		JButton continuar2 = new JButton("CONTINUAR");

		continuar2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pro2.resume();
			}
		});
		continuar2.setBounds(100, 235, 104, 23);
		frame.getContentPane().add(continuar2);
		
		JButton inicio2 = new JButton("INICIAR");
	
		inicio2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				pro2.productor1(txtProductor2);
				pro2.start();
				inicio2.setEnabled(false);
				
			}
		});
		inicio2.setBounds(100, 182, 104, 23);
		frame.getContentPane().add(inicio2);
		
		JButton inicio3 = new JButton("INICIAR");
		
		inicio3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				con1.Nom(1);
				con1.start();
				
				
			}
		});
		inicio3.setBounds(479, 11, 96, 23);
		frame.getContentPane().add(inicio3);
		
		JButton continuar3 = new JButton("CONTINUAR");
	
		continuar3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			con1.resume();
			}
		});
		continuar3.setBounds(479, 64, 96, 23);
		frame.getContentPane().add(continuar3);
		
		JButton inicio4 = new JButton("INICIAR");
		
		inicio4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				con2.start();
			}
		});
		inicio4.setBounds(479, 182, 96, 23);
		frame.getContentPane().add(inicio4);
		
		JButton continuar4 = new JButton("CONTINUAR");
		
		continuar4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				con2.resume();
			}
		});
		continuar4.setBounds(479, 235, 96, 23);
		frame.getContentPane().add(continuar4);
		
		JLabel lblConsumidor_1 = new JLabel("consumidor1");
		lblConsumidor_1.setBounds(572, 101, 82, 14);
		frame.getContentPane().add(lblConsumidor_1);
		
		JLabel lblConsumidor = new JLabel("consumidor2");
		lblConsumidor.setBounds(572, 269, 82, 14);
		frame.getContentPane().add(lblConsumidor);
		
		txtProductor1 = new JTextField();
		txtProductor1.setText("Cmamut");
		txtProductor1.setBounds(20, 98, 86, 20);
		frame.getContentPane().add(txtProductor1);
		txtProductor1.setColumns(10);
		
		txtProductor2 = new JTextField();
		txtProductor2.setText("Cnicienta");
		txtProductor2.setBounds(19, 266, 86, 20);
		frame.getContentPane().add(txtProductor2);
		txtProductor2.setColumns(10);
		
		JButton pausar1 = new JButton("PAUSAR");
		
		pausar1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pro1.suspend();
			}
		});
		pausar1.setBounds(100, 38, 104, 23);
		frame.getContentPane().add(pausar1);
		
		JButton pausar2 = new JButton("PAUSAR");
		pausar2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pro2.suspend();
			}
		});
		
		
		pausar2.setBounds(100, 209, 104, 23);
		frame.getContentPane().add(pausar2);
		
		JButton pausar3 = new JButton("PAUSAR");
		
		pausar3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				con1.suspend();
			}
		});
		pausar3.setBounds(479, 38, 96, 23);
		frame.getContentPane().add(pausar3);
		
		JButton pausar4 = new JButton("PAUSAR");
		
		pausar4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				con2.suspend();
			}
		});
		pausar4.setBounds(479, 209, 96, 23);
		frame.getContentPane().add(pausar4);
		
		JTextArea textArea1 = new JTextArea();
		textArea1.setBounds(299, 264, 89, 33);
		frame.getContentPane().add(textArea1);		
		
		JLabel lblAlexanderSerranoPilco = new JLabel("Alexander Serrano Pilco");
		lblAlexanderSerranoPilco.setBounds(552, 333, 119, 14);
		frame.getContentPane().add(lblAlexanderSerranoPilco);
		
	}
}

