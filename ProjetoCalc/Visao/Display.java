package ProjetoCalc.Visao;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
//import java.awt.Label;

import javax.swing.JLabel;
import javax.swing.JPanel;

import ProjetoCalc.Modelo.Memoria;
import ProjetoCalc.Modelo.MemoriaObservador;

@SuppressWarnings("serial")
public class Display extends JPanel implements MemoriaObservador {
	
	private final JLabel label;
	
	public Display() {
		Memoria.getInstancia().adicionarObservador(this);
		
		setBackground(new Color(46, 49, 50));
		label = new JLabel(Memoria.getInstancia().getTextoAtual());
		label.setForeground(Color.WHITE);
		label.setFont(new Font("courier", Font.PLAIN, 30));
		
		setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 25));
		
		add(label);
	}
	
	@Override
	public void valorAlterado(String novoValor) {
		label.setText(novoValor);
	}
}
