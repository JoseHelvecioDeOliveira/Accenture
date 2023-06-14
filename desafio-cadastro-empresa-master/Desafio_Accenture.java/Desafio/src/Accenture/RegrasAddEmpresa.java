package Accenture;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;


public class RegrasAddEmpresa {

	private Scanner l;
	private boolean execute;
	private List<Empresa> empresa;

	public static void main(String[] args) {
		new RegrasAddEmpresa();
	}

	private RegrasAddEmpresa() {
		l = new Scanner(System.in);
		execute = true;
		empresa = new ArrayList<Empresa>();

		System.out.println("BEM VINDO AO CADASTRO DE EMPRESAS");

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
			System.out.println("Cadastro de Usuário");
			Empresa e = new Empresa(null, null, null);
			e.setNomeFantasia(textInput("Nome:"));
			e.setCEP(textInput("CEP: "));
			e.setCNPJ(textInput("CNPJ: "));

			String cadastrar = textInput("Adicionar cadastro (S/N) ?");
			if (cadastrar.equalsIgnoreCase("s")) {
				System.out.println("Cadastro adicionado !!!");
				empresa.add(e);
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
		if (empresa.size() == 0) {
			System.out.println("\nNão existem cadastros !!!\n");
		} else {
			System.out.println("\nLista de Cadastros\n");
			for (int i = 0; i < empresa.size(); i++) {
				Empresa d = empresa.get(i);
				System.out.println("Cadastro número: " + i);
				System.out.println("\tNome: " + d.getNomeFantasia());
				System.out.println("\tCEP: " + d.getCEP());
				System.out.println("\tCNPJ: " + d.getCNPJ() + "\n");
			}
			System.out.println("\nFim da lista\n");
		}
	}

	private String textInput(String label) {
		System.out.println(label);
		return l.nextLine();
	}
}