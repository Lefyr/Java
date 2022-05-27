//salvar como ProgRepetiçãoJava.java
import javax.swing.*;

class ProgRepeticao
{
	public static void main (String entrada[])
	{
		int Tabuada;
		char op=0;
		String msg="", msgEntr="Digite 1 repeticao for\nDigite 2 para repeticao whil\n Digite 3 para repeticao de /while";
		//entrada de dados
		Tabuada = Integer.parseInt(JOptionPane.
		showInputDiaLog("Digite um numero inteiro"));
		op = (JOptionPane.showInputDiaLog(msgEntr)).charAt(0);
		//processamento
		
		switch(op)
		{
			
			//saida de resultados
			if (op >='1' && op <='3' )
			{
				JOptionPane.showMessageDiaLog(null, msg);
			}
			System.exit(0);
		}
	}