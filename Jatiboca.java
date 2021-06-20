import java.util.Scanner;

public class Jatiboca {

	public static void main(String[] args){

			Scanner ler = new Scanner(System.in);

			String nome;

			int options=1,num=0, estJ, estP, quantidade, transfJP, transfPJ, cont=0, i = 1;

			System.out.println("Entre com o estoque inicial de a��car na empresa Jatiboca:");
    		estJ=ler.nextInt();
   		 	System.out.println("Entre com o estoque inicial de a��car na empresa Pontal:");
    		estP=ler.nextInt();
    		System.out.print("");
		    System.out.println("----------------------------------------------------------------");

    		while (options!=5)
		    {
		        System.out.println("O que deseja fazer: \n1 � Entrada de Estoque \n2 � Sa�da de Estoque \n3 � Transfer�ncia de Estoque \n4 � Consulta Estoque \n5 � Finalizar");
		        options=ler.nextInt();
		        if (options == 1)
		        {
		            System.out.println("Qual empresa: \n1-Jatiboca \n2-Pontal");
		            options=ler.nextInt();
		            if (options == 1)
		            {
			            System.out.println("Qual a quantidade de entrada de a��car em Jatiboca: ");
			            quantidade=ler.nextInt();
			            estJ+=quantidade;
			            System.out.println("O estoque foi atualizado em Jatiboca: " + estJ+"kg");
			            System.out.print("");
			            System.out.println("----------------------------------------------------------------");
		            }
		            else
		            {
			            System.out.println("Qual a quantidade de entrada de a��car em Pontal: ");
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
		            System.out.println("Qual a quantidade de Sa�da de a��car em Jatiboca: ");
		            quantidade=ler.nextInt();
			            if(quantidade>estJ)
			            {
			            	System.out.println("Imposs�vel realizar sa�da de Jatiboca, estoque insuficiente!");
			            	System.out.print("");
		            		System.out.println("----------------------------------------------------------------");
			            }
			            else
			            {
				            estJ-=quantidade;
				            System.out.println("O estoque foi atualizado em Jatiboca, agora � -> " + estJ+"kg");
				            System.out.print("");
			            	System.out.println("----------------------------------------------------------------");
			            }
		        	}
		            else
		            {
		            System.out.println("Qual a quantidade de Sa�da de a��car em Pontal: ");
		            quantidade=ler.nextInt();
		            	if(quantidade>estP)
			            {
			            	System.out.println("Imposs�vel realizar sa�da de Pontal, estoque insuficiente!");
			            	System.out.print("");
		            		System.out.println("----------------------------------------------------------------");
			            }
			            else
			            {
				            estP-=quantidade;
				            System.out.println("O estoque foi atualizado em Pontal, agora � -> "+estP+"kg");
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
		            System.out.println("Qual a quantidade de a��car deseja tranferir de Jatiboca para Pontal? ");
		            quantidade=ler.nextInt();
		            	if(quantidade>estJ)
			            {
			            	System.out.println("Imposs�vel transferir de Jatiboca para Pontal, estoque insuficiente!");
			            	System.out.print("");
		            		System.out.println("----------------------------------------------------------------");
			            }
			            else
			            {
				            estJ-=quantidade;
				            estP+=quantidade;
				            System.out.println("Transfer�ncia realizada com sucesso!");
				            System.out.println("Estoque atualizado em Jatiboca -> " + estJ+"kg");
				            System.out.println("Estoque atualizado em Pontal -> " + estP+"kg");
				            System.out.print("");
		            		System.out.println("----------------------------------------------------------------");
			            }
		            }
		            else
		            {
		            System.out.println("Qual a quantidade de a��car deseja tranferir da Pontal para Jatiboca? ");
		            quantidade=ler.nextInt();
		            	if(quantidade>estP)
			            {
			            	System.out.println("Imposs�vel transferir de Pontal para Jatiboca, estoque insuficiente!");
			            	System.out.print("");
		            		System.out.println("----------------------------------------------------------------");
			            }
			            else
			            {
				            estP-=quantidade;
				            estJ+=quantidade;
				            System.out.println("Transfer�ncia realizada com sucesso!");
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
		        	System.out.println("Opera��o finalizada, muito obrigado!");
		        }
		    }
		}
}