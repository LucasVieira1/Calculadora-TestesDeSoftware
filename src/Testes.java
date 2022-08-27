
public class Testes {
	public static void main(String[] args) {

		// SOMA
		Soma som = new Soma(); //instanciando a classe Soma com nome "som"
		int soma = som.somar(3, 7); //criando um atributo do tipo int, chamando o metodo somar com os valores declarados
		System.out.println(soma); //printando o atibuto "soma" no console

		soma = som.somar(3, 0); //
		System.out.println(soma);

		soma = som.somar(0, 0);
		System.out.println(soma);

		soma = som.somar(3, -1);
		System.out.println(soma);

		// SUBTRA��O
		Subtracao sub = new Subtracao(); //instanciando a classe Subtra��o com nome "sub"
		int subtracao = sub.subtrair(3, 7); //criando um atributo do tipo int, chamando o metodo subtrair com os valores declarados
		System.out.println(subtracao); //printando o atibuto "subtracao" no console

		subtracao = sub.subtrair(3, 0);
		System.out.println(subtracao);

		subtracao = sub.subtrair(0, 0);
		System.out.println(subtracao);

		subtracao = sub.subtrair(3, -1);
		System.out.println(subtracao);

		// MULTIPLICA��O
		Multiplicacao mult = new Multiplicacao(); //instanciando a classe Multiplica��o com nome "mult"
		int multiplicacao = mult.multiplicar(3, 7); //criando um atributo do tipo int, chamando o metodo multiplicar com os valores declarados
		System.out.println(multiplicacao); //printando o atibuto "multiplicacao" no console

		multiplicacao = mult.multiplicar(3, 0);
		System.out.println(multiplicacao);

		multiplicacao = mult.multiplicar(0, 0);
		System.out.println(multiplicacao);

		multiplicacao = mult.multiplicar(3, -1);
		System.out.println(multiplicacao);

		// DIVIS�O
		Divisao div = new Divisao(); //instanciando a classe Divis�o com nome "div"
		int divisao = div.dividir(3, 7); //criando um atributo do tipo int, chamando o metodo dividir com os valores declarados
		System.out.println(divisao); //printando o atibuto "Divis�o" no console, 

		divisao = div.dividir(3, 0);
		System.out.println(divisao);

		divisao = div.dividir(0, 0);
		System.out.println(divisao);

		divisao = div.dividir(3, -1);
		System.out.println(divisao);

	}
}