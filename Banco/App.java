package Banco;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Titular x = new Titular();
        Conta c1 = new Conta(1000, 1, x, 1200);
        Conta c2 = new Conta(1000, 2, x,120);
        Banco banco = new Banco();
        System.out.println(c1);
        c1.depositar(100);
        System.out.println(c1);
        c1.sacar(-10);
        System.out.println(c1);
        
        Scanner scanner = new Scanner(System.in);

        int opcao;

        public static void MenuOpcao(Banco banco){
            while (true) {
            switch (opcao) {
                case 1:
                    System.out.println(c1);
                    break;
                case 2:
                    System.out.println("Digite Valor Desejado: ");
                    double valor = scanner.nextDouble();
                    c1.depositar(valor);
                    break;
                case 3:
                    System.out.println("Digite Valor Desejado: ");
                    valor = scanner.nextDouble();
                    c1.sacar(valor);
                    break;
                case 4:
                    System.out.println("Digite Valor Desejado: ");
                    valor = scanner.nextDouble();
                    c1.transferir(valor, c2);
                    break;
                case 0:
                    System.out.println("Opção 5 Escolhida");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida"); 
                    break;
            }  
        }
            System.out.println("Menu principal:");
            System.out.println("1. Mostrar Saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Sacar");
            System.out.println("4. Transferir");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
        }
        public static void MenuTitular(Banco banco){
            MenuOpcao();
            scanner = new Scanner(System.in);
            int opcao1;
            System.out.println("Cadastro de Titular:");
            System.out.println("1. Inserir Titular");
            System.out.println("2. Alterar Titular");
            System.out.println("3. Deletar Titular");
            System.out.println("4. Listar Titulares");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            while(true){
                switch(opcao){
                    case 1:
                    break;
                    case 2:
                    break;
                    case 3:
                    break;
                    case 4:
                    break;
                    case 5:
                    break;
                    default:
                    break;

                }
            }

        }  
        
        
}
}
