import com.sun.jdi.Value;

import java.util.Scanner;

public class impostoDeRenda {
    public static void main(String[] args) {
        System.out.println(" Imposto  de renda ");
        System.out.println("");
        System.out.println("Se quiser continuar digite seu nome , para encerra digite 's' :");
        System.out.println("");
        String nome;
        Scanner digito =new Scanner(System.in);
        nome=digito.nextLine();
        while (!nome.equals("s")) {
            System .out.println("");
            System.out.println("Escreva seu salario sem adicionais (Só o  salario bruto ) :");
            String sal1;
            double salario;
            Scanner digito2 = new Scanner(System.in);
            sal1 = digito2.nextLine();
            salario = Double.parseDouble(sal1);
            if (salario <= 2500.00) {
                System.out.println(nome + " voce nao precisa declarar imposto de renda pelo seu salario bruto !");

            } else if (salario == 2500.01 || salario <= 3200.00) {
                double cal1 = salario - ((salario * 7.5) / 100);
                System.out.println(nome + " pelo seu salario voce pagara 7.5 de IR que da aproximadamente " + cal1 + " reais");

            } else if (salario == 3200.01 || salario <= 4250.00) {
                double cal2 = salario - ((salario * 15) / 100);
                System.out.println(nome + " pelo seu salario voce pagara 15% de IR que da aproximadamente " + cal2 + " reais");
            } else if (salario == 4250.01 || salario <= 5300.00) {
                double cal3 = salario - ((salario * 22.5) / 100);
                System.out.println(nome + " pelo seu salario voce pagara 22.5 de IR que da aproximadamente " + cal3 + " reais");
            }else if (salario>=5300.01){
                double cal4 = salario - ((salario * 27.5) / 100);
                System.out.println(nome + " pelo seu salario voce pagara 27.5 de IR que da aproximadamente " + cal4 +" reais");
            }
            System.out.println("");
            System.out.println("Tecle s para sair do programa ou digite novamente seu nome : ");
            nome = digito.nextLine();
        }
        System.out.println("Fim do programa , até breve !!!");


    }



    }

