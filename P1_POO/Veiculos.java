package locadora;

public class Veiculos {

	private String modelo;
	private String marca;
	private String placa;
	private double diaria;

	private boolean disponivel = true;
	private String nome;
	private int dia;
	private int contador;
	private double valor;

	public Veiculos(String modelo, String marca, String placa, double diaria) {

		this.modelo = modelo;
		this.marca = marca;
		this.placa = placa;
		this.diaria = diaria;
	}

	public void alocar(String nome, int dia) {

		if (disponivel) {
			// Nao permitindo alugar dia 31;
			if (dia > 0 && dia <= 30) {
				if (!nome.equals("")) {
					this.dia = dia;
					this.nome = nome;

					disponivel = false;
					System.out.println("Carro: " + modelo + " alocado por: " + nome + " dia: " + dia + "\n");
				}
			} else {
				System.out.println("Informação errada!");
			}
		} else
			System.out.println("Veiculo indisponivel!");
	}

	public void devolver(int dia) {
		if (!disponivel) {
			if (dia > 0 && dia <= 31) {

				if (dia > this.dia) {

					this.dia -= dia;

					if (this.dia < 0)
						this.dia *= (-1);

					valor = this.dia * this.diaria;
					System.out.println(valor);
					disponivel = true;

				} else if (this.dia > dia) {

					for (contador = 0; this.dia <= 31; this.dia++) {
						System.out.println(contador);
						contador++;
					}

					valor = contador + dia;
					valor *= diaria;

					System.out.println(valor);
					disponivel = true;
				}else if(dia == this.dia) {
						valor = diaria;
					System.out.println(valor);
					
					disponivel = true;
				}
			}
		}
	}

	public String getNome() {
		return nome;
	}

	public String toString() {
		if (disponivel) {
			return "Veiculos ( Modelo: " + modelo + ", Marca: " + marca + ", Placa:" + placa + ", Diaria: " + diaria
					+ ", Disponivel: " + disponivel + ")\n";
		} else
			return "Veiculos ( Modelo: " + modelo + ", Marca: " + marca + ", Placa:" + placa + ", Diaria: " + diaria
					+ ", Disponivel: " + disponivel + ", Nome:  " + nome + ")\n";
	}
}
