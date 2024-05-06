import java.util.Scanner;

public class ContaTerminal {
    /**
     * @param args
     * @version 0.1
     * @since Eduardo Pires (Dev-Duardo[GitHub])
     */ 
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Olá, Bem vindo ao banco Santander! \nEssa é a central de criação de contas! \nQual é o seu nome?");
        
        System.out.println("Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scanner.next();

        // Loop para garantir que o formato da agência esteja correto
        String agencia;
        while (true) {
            System.out.println("Digite sua agência com 4 dígitos (formato: XXX-X): ");
            agencia = scanner.next();
            if (agencia.matches("\\d{3}-\\d")) {
                break; // Sai do loop se a agência estiver no formato correto
            } else {
                System.out.println("Formato de agência inválido. Por favor, digite no formato XXX-X.");
            }
        }

        // Loop para garantir que o formato da conta esteja correto
        int conta;
        while (true) {
            System.out.println("Digite sua conta com 4 dígitos:");
            String inputConta = scanner.next();
            if (inputConta.matches("\\d{4}")) {
                conta = Integer.parseInt(inputConta);
                break; // Sai do loop se a conta estiver no formato correto
            } else {
                System.out.println("Formato de conta inválido. Por favor, digite uma conta com 4 dígitos numéricos.");
            }
        }

        System.out.println("Digite o valor do seu depósito: R$ ");
        Double deposito = scanner.nextDouble();


        System.out.println("Olá " + nome + " " + sobrenome+ ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo referente ao seu depósito de R$ " + deposito + " já está disponível para saque");

        scanner.close();
    }

}

