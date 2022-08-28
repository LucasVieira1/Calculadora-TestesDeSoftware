
import org.junit.jupiter.api.Test; // importando a biblioteca JUnit para execução de testes

import junit.framework.Assert; //importando a biblioteca Assert

public class CalculadoraJUnitTest {

	Soma som = new Soma(); // instanciando a classe Subtração com nome "som"
	Subtracao sub = new Subtracao(); // instanciando a classe Subtração com nome "sub"
	Multiplicacao mult = new Multiplicacao(); // instanciando a classe Multiplicação com nome "mult"
	Divisao div = new Divisao(); // instanciando a classe Divisão com nome "div"
	int soma, subtracao, divisao, multiplicacao; // criando variaveis do tipo "int"

	// SOMA

	@SuppressWarnings("deprecation") // anotação para fazer o compilador não emitir warning, "deprecation"
										// sobreescreve um método deprecated
	@Test // anotação para declarar a classe como teste, fazer parte dos testes com JUnit
	public void SomarDoisNumerosPositivos() { // sucesso, resultado = "10"
		soma = som.somar(3, 7);
		Assert.assertEquals(10, soma); // os 2 resultados tem que serem iguais, se não forem o teste falha
	}

	@SuppressWarnings("deprecation")
	@Test
	public void SomarUmNumeroPositivoZero() { // sucesso, resultado = "3"
		soma = som.somar(3, 0);
		Assert.assertEquals(3, soma); // os 2 resultados tem que serem iguais, se não forem o teste falha
	}

	@SuppressWarnings("deprecation")
	@Test
	public void SomarDoisNumerosZeros() { // sucesso, resultado = "0"
		soma = som.somar(0, 0);
		Assert.assertEquals(0, soma); // os 2 resultados tem que serem iguais, se não forem o teste falha
	}

	@SuppressWarnings("deprecation")
	@Test
	public void SomarUmNumeroPositivoNegativo() { // sucesso, resultado = "2"
		soma = som.somar(3, -1);
		Assert.assertEquals(2, soma); // os 2 resultados tem que serem iguais, se não forem o teste falha
	}

	// SUBTRAÇÃO

	@SuppressWarnings("deprecation")
	@Test
	public void SubtrairDoisNumerosPositivos() { // sucesso, resultado = "-4"
		subtracao = sub.subtrair(3, 7);
		Assert.assertEquals(-4, subtracao); // os 2 resultados tem que serem iguais, se não forem o teste falha
	}

	@SuppressWarnings("deprecation")
	@Test
	public void SubtrairUmNumeroPositivoZero() { // sucesso, resultado = "3"
		subtracao = sub.subtrair(3, 0);
		Assert.assertEquals(3, subtracao); // os 2 resultados tem que serem iguais, se não forem o teste falha
	}

	@SuppressWarnings("deprecation")
	@Test
	public void SubtrairDoisNumerosZeros() { // sucesso, resultado = "0"
		subtracao = sub.subtrair(0, 0);
		Assert.assertEquals(0, subtracao); // os 2 resultados tem que serem iguais, se não forem o teste falha
	}

	@SuppressWarnings("deprecation")
	@Test
	public void SubtrairUmNumeroPositivoNegativo() { // sucesso, resultado = "4"
		subtracao = sub.subtrair(3, -1);
		Assert.assertEquals(4, subtracao); // os 2 resultados tem que serem iguais, se não forem o teste falha

	}

	// MULTIPLICAÇÃO

	@SuppressWarnings("deprecation")
	@Test
	public void MultiplicarDoisNumerosPositivos() { // sucesso, resultado = "21"
		multiplicacao = mult.multiplicar(3, 7);
		Assert.assertEquals(21, multiplicacao); // os 2 resultados tem que serem iguais, se não forem o teste falha

	}

	@SuppressWarnings("deprecation")
	@Test
	public void MultiplicarUmNumeroPositivoZero() { // sucesso, resultado = "0"
		multiplicacao = mult.multiplicar(3, 0);
		Assert.assertEquals(0, multiplicacao); // os 2 resultados tem que serem iguais, se não forem o teste falha

	}

	@SuppressWarnings("deprecation")
	@Test
	public void MultiplicarDoisNumerosZeros() { // sucesso, resultado = "0"
		multiplicacao = mult.multiplicar(0, 0);
		Assert.assertEquals(0, multiplicacao); // os 2 resultados tem que serem iguais, se não forem o teste falha

	}

	@SuppressWarnings("deprecation")
	@Test
	public void MultiplicarUmNumeroPositivoNegativo() { // sucesso, resultado = "-3"
		multiplicacao = mult.multiplicar(3, -1);
		Assert.assertEquals(-3, multiplicacao); // os 2 resultados tem que serem iguais, se não forem o teste falha

	}

	// DIVISÃO

	@Test
	public void DividirDoisNumerosPositivos() { // erro, teste não vai passar pois as variaveis são do tipo "int", o
												// resultado retornaria um número com casas decimais, "float", a solução
												// seria trocar os atributos do metodo "dividir" e do atributo "divisão"
												// para float, o tipo "int" não é recomendado para esse tipo de cálculo.
		divisao = div.dividir(3, 7);

	}

	@Test
	public void DividiUmNumeroPositivoZero() { // erro, teste não vai passar pois não é possivel dividir um número por
												// "0", solução seria trocar o divisor para um número diferente de "0"

		divisao = div.dividir(3, 0);

	}

	@Test
	public void DividiDoisNumerosZeros() { // erro, teste não vai passar pois "0" dividido pra "0" é igual a um
											// resultado indefinido
		divisao = div.dividir(0, 0);

	}

	@SuppressWarnings("deprecation")
	@Test
	public void DividiUmNumeroPositivoNegativo() { // sucesso, resultado = "-3"
		divisao = div.dividir(3, -1);
		Assert.assertEquals(-3, divisao); // os 2 resultados tem que serem iguais, se não forem o teste falha

	}

}
