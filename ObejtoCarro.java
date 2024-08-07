package herdeiro;
public class ObejtoCarro {
	public static void main(String[] args) {
	carro carro1 = new carro();
	carro carro2 = new carro();
	
	System.out.println("-----OBJETO 1--------");
	carro1.setModelo("fusca");
	carro1.setPlaca("placa-fal");
	carro1.setCor("azul");
	carro1.setValor("0,99");
	
	
	System.out.println("-----OBJETO 2--------");
	carro2.setModelo("venha conferir");
	carro2.setPlaca("indecifravel");
	carro2.setCor("inedita");
	carro2.setValor("2.000.000.000");
	
	System.out.println(carro1.getModelo());
	System.out.println(carro1.getPlaca());
	System.out.println(carro1.getCor());
	System.out.println(carro1.getValor());
	
	System.out.println(carro2.getModelo());
	System.out.println(carro2.getPlaca());
	System.out.println(carro2.getCor());
	System.out.println(carro2.getValor());
}
}