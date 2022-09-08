package br.senai.sp.jandira.gui;

	import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import br.senai.sp.jandira.model.Tabuada;

	public class FrameTabuada {
	
		public String titulo;
		public int altura;
		public int largura;
		
		public Color azulCiano = new Color(123, 139, 154);
		public Color roxo = new Color(200, 162, 200);
		public Color corBotao = new Color(200, 162, 200);
		public Color corPainel = new Color(200, 162, 200);
		public Font fontTitulo = new Font ("Arial", Font.BOLD, 30);
		public Font fontLabel = new Font ("Arial narrow", Font.ITALIC, 15);
			
		
		public void criarTela() {

			JFrame tela = new JFrame();
			
			//Configuração da tela
			tela.setTitle(titulo);
			tela.setSize(largura, altura);
			tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			tela.setLayout(null);
		
			//Pegar o container para colocar componentes dentro dele
			Container painel = tela.getContentPane();

			//Criando os componentes e configurando para o container

			//Componente Tabuada
			JLabel labelTabuada = new JLabel();
			Font fTabuada = new Font("SansSerif", Font.BOLD, 30);
			labelTabuada.setText("Tabuada 1.0");
			labelTabuada.setBounds(100, 20, 200, 30);
			labelTabuada.setForeground(azulCiano);
			labelTabuada.setFont(fTabuada);

			//Componente Multiplicando
			JLabel labelMultiplicando = new JLabel();
			Font fMultiplicadores = new Font("SansSerif", Font.PLAIN , 23);
			JTextField textFieldMultiplicando = new JTextField();
			labelMultiplicando.setText("Multiplicando: ");
			labelMultiplicando.setBounds(120, 120, 150, 35);
			labelMultiplicando.setForeground(Color.black);
			labelMultiplicando.setFont(fMultiplicadores);
			textFieldMultiplicando.setBounds(270, 122, 160, 35);
			textFieldMultiplicando.setBorder(BorderFactory.createLineBorder(Color.black));

			//Componente Minimo Multiplicador
			JLabel labelMinimoMultiplicador = new JLabel();
			JTextField textFieldMinimoMultiplicador = new JTextField();
			labelMinimoMultiplicador.setText("Mínimo Multiplicador: ");
			labelMinimoMultiplicador.setBounds(44, 175, 250 , 35);
			labelMinimoMultiplicador.setForeground(Color.black);
			labelMinimoMultiplicador.setFont(fMultiplicadores);
			textFieldMinimoMultiplicador.setBounds(270, 178, 160, 35);
			textFieldMinimoMultiplicador.setBorder(BorderFactory.createLineBorder(Color.black));

			//Componente Maximo Multiplicador
			JLabel labelMaximoMultiplicador = new JLabel();
			JTextField textFieldMaximoMultiplicador = new JTextField();
			labelMaximoMultiplicador.setText("Maximo Multiplicador: ");
			labelMaximoMultiplicador.setBounds(39, 230, 250, 35);
			labelMaximoMultiplicador.setForeground(Color.black);
			labelMaximoMultiplicador.setFont(fMultiplicadores);
			textFieldMaximoMultiplicador.setBounds(270, 233, 160, 35);
			textFieldMaximoMultiplicador.setBorder(BorderFactory.createLineBorder(Color.black));

			//Componente Botão Calcular
			JButton buttonCalcular = new JButton();
			Color corCalcular = new Color(203,224,233);
			buttonCalcular.setText("Calcular");
			buttonCalcular.setBounds(39, 310, 230, 35);
			buttonCalcular.setForeground(Color.black);
			buttonCalcular.setBackground(corCalcular);

			//Componente Botão Limpar
			JButton buttonLimpar = new JButton();
			Color corLimpar = new Color(238,173,45);
			buttonLimpar.setText("Limpar");
			buttonLimpar.setBounds(275,310,150,35);
			buttonLimpar.setForeground(Color.white);
			buttonLimpar.setBackground(corLimpar);

			//Componente Resultado
			JLabel labelResultado = new JLabel();
			Font fResultado = new Font("SansSerif", Font.BOLD , 16);
			JTextField textFieldResultado = new JTextField();
			Color corResultado = new Color(255,255,200);
			labelResultado.setText("Resultado:");
			labelResultado.setBounds(39, 360, 100, 35);
			labelResultado.setFont(fResultado);
			textFieldResultado.setBounds(39, 400, 400, 200);
			textFieldResultado.setBackground(corResultado);

			//Painel de aparição dos Labels
			painel.add(labelTabuada);
			painel.add(labelMultiplicando);
			painel.add(labelMinimoMultiplicador);
			painel.add(labelMaximoMultiplicador);
			painel.add(labelResultado);

			//Painel de aparição dos TextField
			painel.add(textFieldMultiplicando);
			painel.add(textFieldMinimoMultiplicador);
			painel.add(textFieldMaximoMultiplicador);
			painel.add(textFieldResultado);

			//Painel de aparição dos Botões
			painel.add(buttonCalcular);
			painel.add(buttonLimpar);

			//Definindo que Tela é visivel ou não
			tela.setVisible(true);

			//Definindo ActionListener(Ouvinte)

			buttonCalcular.addActionListener(new ActionListener() {
				

				@Override
				public void actionPerformed(ActionEvent e) {

					Tabuada tabuada = new Tabuada();
					tabuada.multiplicadorMaximo = Integer.parseInt(textFieldMultiplicando.getText());
					tabuada.multiplicadorMinimo = Integer.parseInt(textFieldMultiplicando.getText());
					tabuada.multiplicadorMaximo = Integer.parseInt(textFieldMultiplicando.getText());

				}

			});
	
		}
}
