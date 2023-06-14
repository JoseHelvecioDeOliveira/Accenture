package Accenture;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;


public class RegrasAddFornecedorJuridico {

	private Scanner l;
	private boolean execute;
	private List<FornecedorJuridico> fJuridico;

	public static void main(String[] args) {
		new RegrasAddFornecedorJuridico();
	}

	private RegrasAddFornecedorJuridico() {
		l = new Scanner(System.in);
		execute = true;
		fJuridico = new ArrayList<FornecedorJuridico>();

		System.out.println("BEM VINDO AO CADASTRO DE Fornecedores Pessoa Física");

		while (execute) {
			String opcao = menu();

			if (opcao.equalsIgnoreCase("n")) {
				cadastrar();
			} else if (opcao.equalsIgnoreCase("l")) {
				listarCadastros();
			} else if (opcao.equalsIgnoreCase("x")) {
				execute = false;
			} else {
				System.out.println("\nOpção Inválida! \n");
			}
		}
	}

	private String menu() {
		System.out.println("Selecione a opção:");
		System.out.println("N - Novo cadastro");
		System.out.println("L - Listar cadastros");
		System.out.println("X - Sair");
		return l.nextLine();
	}

	private void cadastrar() {
		boolean cadastrando = true;

		while (cadastrando) {
			System.out.println("Cadastro de Fornecedor Pessoa Juridica");
			FornecedorJuridico f = new FornecedorJuridico();
			f.setNome(textInput("Nome:"));
			f.setCEP(textInput("CEP: "));
			f.setCPF(textInput("CNPJ: "));
			f.setEmail(textInput("E-mail:"));	

			String cadastrar = textInput("Adicionar cadastro (S/N) ?");
			if (cadastrar.equalsIgnoreCase("s")) {
				System.out.println("Cadastro adicionado !!!");
				fJuridico.add(f);
			} else if (cadastrar.equalsIgnoreCase("n")){
				System.out.println("Cadastro ignorado !!!");
			} else {
				System.out.println("\nOpção inválida ! \n");
			}

			String continua = textInput("Continuar cadastrando (S/N) ?");
			if (continua.equalsIgnoreCase("N")) {
				cadastrando = false;
			} else if (continua.equalsIgnoreCase("s")){
				// se for s sai do if e volta para o inicio do while
			} else {
				System.out.println("\nOpção inválida! \n");
				cadastrando = false;
			}
		}
	}

	private void listarCadastros() {
		if (fJuridico.size() == 0) {
			System.out.println("\nNão existem cadastros !!!\n");
		} else {
			System.out.println("\nLista de Cadastros\n");
			for (int i = 0; i < fJuridico.size(); i++) {
				FornecedorJuridico d = fJuridico.get(i);
				System.out.println("Cadastro número: " + i);
				System.out.println("\tNome: " + d.getNome());
				System.out.println("\tCEP: " + d.getCEP());
				System.out.println("\tCNPJ: " + d.getCPF() + "\n");
				System.out.println("\tE-mail: " + d.getEmail() + "\n");
				
			}
			System.out.println("\nFim da lista\n");
		}
	}

	private String textInput(String label) {
		System.out.println(label);
		return l.nextLine();
	}
}