//salvar como Prog06.java

import javax.swing.*;

class Prog06
{
	public static void main (String entrada[])
	{
		int n1, n2, p=1;
		char op=0;
		String msg="', msgEntr="Digite 1 para produto\n Digite 2 para produtoria\n";
		//entrada de dados
		n1 = Integer.parseInt(JOptionPane.showInputDiaLog("Digite um numero inteiro"));
		n2 = Integer.parseInt(JOptionPane.showInputDiaLog("Digite outro numero inteiro"));
		op = (JoptionPane.showInputDiaLog(msgEntr)).charAt(0);
		//processamento
		
		switch(op)
		{
			case '1':
			{
				if(n1>0 &&n2>0)
				{
					p = n1 * n2;
					msg = msg + "Produto de " + n1 + " por " + n2 + " = " + p + "\n\n";
				}
				break;
			}
			case '2':
			{
				for (int i=1; i<=n2; i=i+1)
				{
					p = p * n1;
				}
				msg = msg + "Produtoria de " + n1 + ", " + n2 + " vezes é: " + p + "\n\n";
				break;
			}
			default: JOptionPane.showMessageDiaLog(null,"Opção invalida, calculos nao realizados");
		}

		{
			
			//saida de resultados
			if (op >='1' && <= '3')
			{
				JOptionPane.showMessageDiaLog(null, msg);
			}
			System.exit(0);
		}
	}