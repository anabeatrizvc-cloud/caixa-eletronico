import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {


        Conta conta = new Conta(

                "1234",
                "223344",
                0.0,
                "Ana Beatriz",
                "1234567890"
        );

        int operacaoSelecionada = 0;
        Scanner leitorDoTeclado = new Scanner(System.in);

        while (operacaoSelecionada != 4) {
            System.out.println("###############################################################");
            String tema = "Bem vindo ao Caixa Eletronico";
            System.out.println(tema);

            System.out.println("Qual operação você deseja?");
            System.out.println("Para sacar, digite 1");
            System.out.println("Para depositar, digite 2");
            System.out.println("Para consultar saldo, digite 3");
            System.out.println("Para sair, digite 4");
            System.out.println("###############################################################");

            operacaoSelecionada = leitorDoTeclado.nextInt();

            if (operacaoSelecionada == 1) {
                System.out.println("###############################################################");

                System.out.println("Digite o valor que você deseja sacar: ");

                Double valorSaque = leitorDoTeclado.nextDouble();
                conta.sacar(valorSaque);

                System.out.println("Saque de: " + valorSaque + " efetuado com sucesso! ");

                System.out.println("Para sair, digite 4");
                System.out.println("Para voltar ao menu, digite qualquer outro dígito");

                operacaoSelecionada = leitorDoTeclado.nextInt();
                System.out.println("###############################################################");
            }

            if (operacaoSelecionada == 2) {
                System.out.println("###############################################################");

                System.out.println("Digite o valor que você deseja depositar: ");

                Double valorDeposito = leitorDoTeclado.nextDouble();
                conta.depositar(valorDeposito);

                System.out.println("Depósito de: " + valorDeposito + " efetuado com sucesso! ");

                System.out.println("Para sair, digite 4");
                System.out.println("Para voltar ao menu, digite qualquer outro dígito");

                operacaoSelecionada = leitorDoTeclado.nextInt();
                System.out.println("###############################################################");
            }

            if (operacaoSelecionada == 3) {
                System.out.println("###############################################################");

                System.out.println("Seu saldo atual é: " + conta.consultar());

                System.out.println("Para sair, digite 4");
                System.out.println("Para voltar ao menu, digite qualquer outro dígito");

                operacaoSelecionada = leitorDoTeclado.nextInt();
                System.out.println("###############################################################");
            }
        }

    }
}
