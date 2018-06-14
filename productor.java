package pop;

import java.util.Random;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;



public class productor extends Thread{

JTextField textF;
	
	JTextArea text;
	JScrollPane scrollP = new JScrollPane(text);
	
	private barra buffer;
	private String alfabeto = "abcdefghijklmnñopqrstuvwxyz";
	private char c;
	
	String nombre;
	
	private Random random = new Random();
	
	
	
	public void productor1(JTextField tf) {
		this.nombre = tf.getText();
	}
	
	public void setTextA(JTextArea ta) {
		this.text = ta;
	}
	public void setScroll(JScrollPane sp) {
		this.scrollP = sp;
		
	}
	
	
	public productor (barra b){
		this.buffer = b;
	}
	
public void run (){
		
		for (int i = 0; i < 25 ; i++){
			c = alfabeto.charAt(random.nextInt(26));
			buffer.poner(c);
			text.append(this.nombre+": "+c+"\n");
			
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
	}
}


