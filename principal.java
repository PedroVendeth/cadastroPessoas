import java.util.Scanner;
public static void main(String[] args) {
    System.out.println("Quantos pessoas deseja cadastrar? ");
    Scanner scan = new Scanner(System.in);
    int quantidade = scan.nextInt();
    scan.nextLine(); // Consumir a nova linha pendente após o nextInt()

    cadastroPessoas[] lista = new cadastroPessoas[quantidade];
    for(int i = 0; i < quantidade; i++) {
        System.out.println("\nCadastro " + (i + 1));
        
        System.out.print("Nome: ");
        String nome = scan.nextLine();

        System.out.print("Idade: ");
        int idade = scan.nextInt();
        scan.nextLine(); // Consumir a nova linha pendente após o nextInt()

        System.out.print("Telefone: ");
        String telefone = scan.nextLine();

        lista[i] = new cadastroPessoas(nome, idade, telefone);

        System.out.println(lista[i].toString());    
        
    }

    scan.close();
    System.out.println("Cadastro finalizado.");
}