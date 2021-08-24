package digital.innovation.one.util;

import digital.innovation.one.util.Calculadora;

import java.util.Scanner;

public class Looping {
    public static void menu() {
        //menu
        Scanner scan = new Scanner(System.in); //instancia classe Scanner

        System.out.println("======================================================================");
        System.out.println("================Bem Vindo a calculadora modular Java==================");
        System.out.println("===========Essa calculadora foi desenvolvida em modulos===============");
        System.out.println("======================================================================");
        System.out.println("==================Pressione 'Enter' para iniciar======================");
        System.out.println("======================================================================");
        scan.nextLine();

        menuOp();
    }

    public static void menuOp() {
        Calculadora calculadora = new Calculadora(); //instancia classe calculadora
        Scanner scan = new Scanner(System.in); //instancia classe Scanner

        var opSubtracao = 2;              //variaveis para verificacao
        var opMultiplicacao = 3;          //de escolha de operacao o menu
        var opDivisao = 4;

        System.out.println("======================================================================");
        System.out.println("=======================Escolha a operacao:============================");
        System.out.println("=======================1 - Soma=======================================");
        System.out.println("=======================2 - Subtracao==================================");
        System.out.println("=======================3 - Multiplicacao==============================");
        System.out.println("=======================4 - Divisao====================================");
        System.out.println("======================================================================");
        var opEscolha = scan.nextInt();

        //verificacoes da opcao escolhida
        if (opEscolha == opDivisao) {

            var a = termos("primeiro");
            var b = termos("segundo");

            System.out.println(calculadora.div(a, b));

            exit();
        }
        else if (opEscolha == opMultiplicacao) {

            var a = termos("primeiro");
            var b = termos("segundo");

            System.out.println(calculadora.multi(a, b));

            exit();
        }
        else if (opEscolha == opSubtracao) {

            var a = termos("primeiro");
            var b = termos("segundo");

            System.out.println(calculadora.sub(a, b));

            exit();
        }
        else {

            var a = termos("primeiro");
            var b = termos("segundo");

            System.out.println(calculadora.sum(a, b));

            exit();
        }
    }


    public static Integer termos(String ordinal) {
        Scanner scan = new Scanner(System.in); //instancia classe Scanner

        System.out.printf("Digite o " + ordinal + " valor: ");

        return scan.nextInt();
    }

    public static void exit() {
        Scanner scan = new Scanner(System.in); //instancia classe Scanner
        System.out.printf("Deseja realizar nova operacao? s = Sim / n = Nao: ");
        var yesNo = scan.nextLine();

        if (yesNo.intern() == "s") {
            menuOp();
        }
        else if (yesNo.intern() == "n") {
            System.exit(0);
        }
        else {
            exit();
        }
    }
}
