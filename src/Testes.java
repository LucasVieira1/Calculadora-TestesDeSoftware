
public class Testes {
	public static void main(String[] args) {

		// SOMA
		Soma som = new Soma();
		int soma = som.somar(3, 7);
		System.out.println(soma);

		soma = som.somar(3, 0);
		System.out.println(soma);

		soma = som.somar(0, 0);
		System.out.println(soma);

		soma = som.somar(3, -1);
		System.out.println(soma);

		// SUBTRAÇÃO
		Subtracao sub = new Subtracao();
		int subtracao = sub.subtrair(3, 7);
		System.out.println(subtracao);

		subtracao = sub.subtrair(3, 0);
		System.out.println(subtracao);

		subtracao = sub.subtrair(0, 0);
		System.out.println(subtracao);

		subtracao = sub.subtrair(3, -1);
		System.out.println(subtracao);

		// MULTIPLICAÇÃO
		Multiplicacao mult = new Multiplicacao();
		int multiplicacao = mult.multiplicar(3, 7);
		System.out.println(multiplicacao);

		multiplicacao = mult.multiplicar(3, 0);
		System.out.println(multiplicacao);

		multiplicacao = mult.multiplicar(0, 0);
		System.out.println(multiplicacao);

		multiplicacao = mult.multiplicar(3, -1);
		System.out.println(multiplicacao);

		Divisao div = new Divisao();
		int divisao = div.dividir(3, 7);
		System.out.println(divisao);

		// DIVISÃO
		divisao = div.dividir(3, 0);
		System.out.println(divisao);

		divisao = div.dividir(0, 0);
		System.out.println(divisao);

		divisao = div.dividir(3, -1);
		System.out.println(divisao);

	}
}