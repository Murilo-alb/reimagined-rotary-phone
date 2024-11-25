package locadora;

public class TesteVeiculo {
	public static void main(String[] args) {
		Veiculos carro1 = new Veiculos("Tracker", "Chevrolet", "AB7O15", 150.00);
		Veiculos carro2 = new Veiculos("Celta", "Chevrolet", "JK5L06", 70.00);

		carro1.alocar("Murilo", 5);
		carro2.alocar("Jose", 15);

		System.out.println(carro1.getNome());
		System.out.println(carro2.getNome());

		carro2.devolver(15);

		System.out.println(carro1.toString());
		System.out.println(carro2.toString());
	}

}
