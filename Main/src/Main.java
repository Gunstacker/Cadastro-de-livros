import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite a quantidade de livros que será salva no vetor: ");
		int qtd_livros = ler.nextInt();
		String nome;
		String desc;
		String autor;
		String data;
		
		Livro[] livro = new Livro[qtd_livros];
		
		ler.skip("\\R");
		for(int i = 0; i < livro.length; i++) {
			
			System.out.println("Digite o nome do " + (i+1) + "° livro:");
			nome = ler.nextLine();
			
			System.out.println("Digite a descrição do " + (i+1) + "° livro:");
			desc = ler.nextLine();

			
			System.out.println("Digite o nome do autor do " + (i+1) + "° livro:");
			autor = ler.nextLine();
			
			System.out.println("Digite a data de publicação do " + (i+1) + "° livro:");
			data = ler.nextLine();
			
			livro[i] = new Livro(nome, desc, autor, data);
		}
		
		for(int j = 0; j < qtd_livros; j++) {
			System.out.println( (j+1) + "° Livro");
			System.out.println("Nome do Livro: " + livro[j].getNome_livro());
			System.out.println("Nome do autor do livro: " + livro[j].getAutor());
			System.out.println("Data de publicação do livro: " + livro[j].getData());
			System.out.println("Descrição do livro: " + livro[j].getDesc());
		}
		
	}
}
