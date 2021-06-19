# Trabalho-Algoritimos
import java.util.Scanner;

public class Jatiboca {

	public static void main(String[] args){

			Scanner ler = new Scanner(System.in);

			String nome;

			int options=1,num=0, estJ, estP, quantidade, transfJP, transfPJ, cont=0, i = 1;

			System.out.println("Entre com o estoque inicial de açúcar na empresa Jatiboca:");
    		estJ=ler.nextInt();
   		 	System.out.println("Entre com o estoque inicial de açúcar na empresa Pontal:");
    		estP=ler.nextInt();
    		System.out.print("");
		    System.out.println("----------------------------------------------------------------");

    		while (options!=5)
		    {
		        System.out.println("O que deseja fazer: \n1 – Entrada de Estoque \n2 – Saída de Estoque \n3 – Transferência de Estoque \n4 – Consulta Estoque \n5 – Finalizar");
		        options=ler.nextInt();
		        if (options == 1)
		        {
		            System.out.println("Qual empresa: \n1-Jatiboca \n2-Pontal");
		            options=ler.nextInt();
		            if (options == 1)
		            {
			            System.out.println("Qual a quantidade de entrada de açúcar em Jatiboca: ");
			            quantidade=ler.nextInt();
			            estJ+=quantidade;
			            System.out.println("O estoque foi atualizado em Jatiboca: " + estJ+"kg");
			            System.out.print("");
			            System.out.println("----------------------------------------------------------------");
		            }
		            else
		            {
			            System.out.println("Qual a quantidade de entrada de açúcar em Pontal: ");
			            quantidade=ler.nextInt();
			            estP+=quantidade;
			            System.out.println("O estoque foi atualizado em Pontal: " + estP+"kg");
			            System.out.print("");
			            System.out.println("----------------------------------------------------------------");
		            }
		        }
		        else if (options == 2)
		        {
		            System.out.println("Qual empresa: \n1-Jatiboca \n2-Pontal");
		            options=ler.nextInt();
		            if (options == 1)
		            {
		            System.out.println("Qual a quantidade de Saída de açúcar em Jatiboca: ");
		            quantidade=ler.nextInt();
			            if(quantidade>estJ)
			            {
			            	System.out.println("Impossível realizar saída de Jatiboca, estoque insuficiente!");
			            	System.out.print("");
		            		System.out.println("----------------------------------------------------------------");
			            }
			            else
			            {
				            estJ-=quantidade;
				            System.out.println("O estoque foi atualizado em Jatiboca, agora é -> " + estJ+"kg");
				            System.out.print("");
			            	System.out.println("----------------------------------------------------------------");
			            }
		        	}
		            else
		            {
		            System.out.println("Qual a quantidade de Saída de açúcar em Pontal: ");
		            quantidade=ler.nextInt();
		            	if(quantidade>estP)
			            {
			            	System.out.println("Impossível realizar saída de Pontal, estoque insuficiente!");
			            	System.out.print("");
		            		System.out.println("----------------------------------------------------------------");
			            }
			            else
			            {
				            estP-=quantidade;
				            System.out.println("O estoque foi atualizado em Pontal, agora é -> "+estP+"kg");
				            System.out.print("");
			            	System.out.println("----------------------------------------------------------------");
			            }
		            }
		        }
		        else if (options == 3)
		        {
		            System.out.println("Qual empresa: \n1 - Jatiboca -> Pontal \n2 - Pontal -> Jatiboca");
		            options=ler.nextInt();
		            if (options == 1)
		            {
		            System.out.println("Qual a quantidade de açúcar deseja tranferir de Jatiboca para Pontal? ");
		            quantidade=ler.nextInt();
		            	if(quantidade>estJ)
			            {
			            	System.out.println("Impossível transferir de Jatiboca para Pontal, estoque insuficiente!");
			            	System.out.print("");
		            		System.out.println("----------------------------------------------------------------");
			            }
			            else
			            {
				            estJ-=quantidade;
				            estP+=quantidade;
				            System.out.println("Transferência realizada com sucesso!");
				            System.out.println("Estoque atualizado em Jatiboca -> " + estJ+"kg");
				            System.out.println("Estoque atualizado em Pontal -> " + estP+"kg");
				            System.out.print("");
		            		System.out.println("----------------------------------------------------------------");
			            }
		            }
		            else
		            {
		            System.out.println("Qual a quantidade de açúcar deseja tranferir da Pontal para Jatiboca? ");
		            quantidade=ler.nextInt();
		            	if(quantidade>estP)
			            {
			            	System.out.println("Impossível transferir de Pontal para Jatiboca, estoque insuficiente!");
			            	System.out.print("");
		            		System.out.println("----------------------------------------------------------------");
			            }
			            else
			            {
				            estP-=quantidade;
				            estJ+=quantidade;
				            System.out.println("Transferência realizada com sucesso!");
				            System.out.println("Estoque atualizado em Jatiboca -> "+estJ+"kg");
				            System.out.println("Estoque atualizado em Pontal -> "+estP+"kg");
				            System.out.print("");
		            		System.out.println("----------------------------------------------------------------");
			            }
		            }
		        }
		        else if (options == 4)
		        {
					System.out.println("Estoque em Jatiboca -> "+estJ+"kg" );
					System.out.println("Estoque em Pontal -> "+estP+"kg");
					System.out.print("");
		            System.out.println("----------------------------------------------------------------");

		        }
		        else
		        {
		        	System.out.println("Operação finalizada, muito obrigado!");
		        }
		    }
		}
}
