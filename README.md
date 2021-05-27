# Trabalho-Algoritimos
import java.util.Scanner;
public class Trab{
    public static void main(String[] args){
        String nome;
        int options,num=0, estIJ, estIP, estJF, estPF, estJ, estP, transfJP, transfPJ, cont=0, i=1;                         // estoque jatiboca e estoque pontal
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Entre com o estoque inicial na empresa Jatiboca");
        estIJ=ler.nextInt();
        System.out.println("Entre com o estoque inicial na empresa Pontal");
        estIP=ler.nextInt();
        
        while (cont <=5)
        {
            System.out.println("O que deseja fazer: \n1–Entrada de Estoque \n2–Saída de Estoque \n3–Transferência de Estoque \n4–Consulta Estoque \n5–Finalizar");
            options=ler.nextInt();
            if (options == 1)
            {
                System.out.println("Qual empresa: \n1-Jatiboca \n2-Pontal");
                options=ler.nextInt();
                if (options == 1)
                {
                System.out.println("Qual a quantidade de entrada de açúcar em Jatiboca: ");
                estJ=ler.nextInt();
                estJF=estIJ+estJ;
                System.out.println("O estoque em Jatiboca agora é: " + estJF+"kg");
                }
                else
                {
                System.out.println("Qual a quantidade de entrada de açúcar em Pontal: ");
                estP=ler.nextInt();
                estPF=estIP+estP;
                System.out.println("O estoque em Pontal agora é: " + estPF+"kg");
                }
            }
            else if (options == 2)
            {
                System.out.println("Qual empresa: \n1-Jatiboca \n2-Pontal");
                options=ler.nextInt();
                if (options == 1)
                {
                System.out.println("Qual a quantidade de Saída de açúcar em Jatiboca: ");
                estJ=ler.nextInt();
                estJF=estIJ-estJ;
                System.out.println("O estoque em Jatiboca agora é: " + estJF+"kg");
                }
                else
                {
                System.out.println("Qual a quantidade de Saída de açúcar em Pontal: ");
                estP=ler.nextInt();
                estPF=estIP-estP;
                System.out.println("O estoque em Pontal agora é: " + estPF+"kg");
                }
            }
            else if(options == 3)
            {
                System.out.println("Qual empresa: \n1-Jatiboca -> Pontal \n2-Pontal -> Jatiboca");
                options=ler.nextInt();
                if (option == 1)
                {
                 System.out.println("Quantidade de transferência de açúcar de Jatiboca para Pontal: ");
                 transfJP=ler.nextInt();
                    if(transfJP > estJF)
                    {
                     System.out.println("Impossível transferir de Jatiboca para Pontal, estoque insuficiente!");
                     System.out.println("Estoque atualizado em Jatiboca: " + estJF+"kg");
                     System.out.println("Estoque atualizado em Pontal: "+ estPF+"kg");
                    }
                    else
                    {
                     System.out.println("Transferência realizada!!!");
                     System.out.println("Estoque atualizado em Jatiboca: "+ estJF-transfJP+"kg");
                     System.out.println("Estoque atualizado em Pontal: "+ estPF+transfJP+"kg");
                    }
                 
                }
            }
    }
    }   
}
