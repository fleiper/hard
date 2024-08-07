package herdeiro;

public class ObjetosPessoa {
	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa();
		Pessoa pessoa2 = new Pessoa();
		
		pessoa1.setNome("tom Cruise");
		pessoa1.setIdade(60);
		pessoa1.setEndereco("Californa");
		pessoa1.setProfissao("Ator");
		pessoa1.setRG("456-123-789-00");
		pessoa1.setCPF("78-457-258-10");
		
		pessoa2.setNome("Messi");
		pessoa2.setIdade(37);
		pessoa2.setEndereco("não localizado");
		pessoa2.setProfissao("Jogador de futebol");
		pessoa2.setRG("987.654.321.00");
		pessoa2.setCPF("12.345.678-90");
		
		System.out.println("-----OBJETO 1--------");
		System.out.println(pessoa1.getNome());
		System.out.println(pessoa1.getIdade());
		System.out.println(pessoa1.getEndereco());
		System.out.println(pessoa1.getProfissao());
		System.out.println(pessoa1.getRG());
		System.out.println(pessoa1.getCPF());
		
		
		System.out.println("-----OBJETO 2--------");
		System.out.println(pessoa2.getNome());
		System.out.println(pessoa2.getIdade());
		System.out.println(pessoa2.getEndereco());
		System.out.println(pessoa2.getProfissao());
		System.out.println(pessoa2.getRG());
		System.out.println(pessoa2.getCPF());
		

	}
	}
	


