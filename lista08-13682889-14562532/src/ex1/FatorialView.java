package ex1;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class FatorialView extends JFrame {
	
	
	


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField entrada;
    private JButton botao;
    private JLabel texto;

    public FatorialView() {
//    	configuraJanela();
    	
    	setTitle("Dark Theme Example");
        setSize(500, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.BLACK);
        
//    	componentes 
        entrada = new JTextField(10);
        entrada.setBackground(new Color(60, 63, 65)); // Cor de fundo do campo de texto
        entrada.setForeground(Color.WHITE); // Cor do texto no campo de texto
        entrada.setCaretColor(Color.WHITE); // Cor do cursor no campo de texto

        botao = new JButton("Calcular");
        botao.setBackground(new Color(75, 75, 75)); // Cor de fundo do botão
        botao.setForeground(Color.WHITE); // Cor do texto do botão

        texto = new JLabel("");
        texto.setForeground(Color.WHITE); // Cor do texto do JLabel
        
        
//    	add componentes
        botao.addActionListener(new botao());
        
        JPanel painel = new JPanel();
        painel.setBackground(Color.BLACK);
        
        JLabel caixaDetexto = new JLabel("Digite um número para calcular fatorial:");
        caixaDetexto.setForeground(Color.YELLOW);
        
        painel.add(caixaDetexto);
        painel.add(entrada);
        painel.add(botao);
        painel.add(texto);

        add(painel);   	
    }


    
    private class botao implements ActionListener{
        public botao() {
        }

        private int setEntrada() {
    	    String inputText = entrada.getText();
            int n = Integer.parseInt(inputText);
            if (n < 0) {
                throw new IllegalArgumentException("O número deve ser não negativo.");
            }
    	    return n;

		

		
		
        }
        public void actionPerformed(ActionEvent e) {
    
            try {
            	texto.setForeground(Color.WHITE);
            	int number = setEntrada();
            	
                BigDecimal result = FatorialController.fatorial(new BigDecimal(number));
                texto.setText("Resultado: " + result.toString());
            }
            catch (NumberFormatException E) {
            	texto.setForeground(Color.RED);
            	texto.setText(entrada.getText() + " não é um número inteiro válido");
                
            }
            catch (Exception E) {
            	texto.setForeground(Color.RED);
            	texto.setText(E.getMessage());
			}
        }
    }
//
//      
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FatorialView().setVisible(true);
            }
        });
    }
}

