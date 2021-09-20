package Exercicio09;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Exercicio09 {

	public static void main(String[] args) {

		BigDecimal zero = BigDecimal.ZERO;
		BigDecimal um = BigDecimal.ONE;
		BigDecimal outro = null;

		System.out.println(soma(zero, zero));
		System.out.println(soma(um, um));
		System.out.println(soma(outro, um));
		System.out.println(soma(um, outro));

		apresentarNaTela("Primeiro");
		apresentarNaTela("Segundo");
		apresentarNaTela(null);

		System.out.println(somaInteger(2, 1).intValue());
		System.out.println(somaInteger(null, 1).intValue());
		System.out.println(somaInteger(2, null).intValue());

		Integer[] lista = { 1, 2, 3, 4, 5 };
		apresentarElementos(lista);
	}

	public static BigDecimal soma(BigDecimal valor1, BigDecimal valor2) {
		try {
			return valor1.add(valor2);
		} catch (NullPointerException e) {
			if (valor1 == null) {
				valor1 = BigDecimal.ZERO;
				return valor1.add(valor2);
			}
			valor2 = BigDecimal.ZERO;
			return valor1.add(valor2);
		}

	}

	public static void apresentarNaTela(String valor) {
		try {
			System.out.println(valor.toString());

		} catch (NullPointerException e) {
			System.out.println("Validar Eu / apagar depois");
		}

	}

	public static Integer somaInteger(Integer valor1, Integer valor2) {
		try {
			if (valor1 == null || valor2 == null) {
			}
			return valor1 + valor2;
		} catch (NullPointerException e) {
			if (valor1 == null) {
				valor1 = 0;
				return valor1 + valor2;
			}
			valor2 = 0;
			return valor1 + valor2;
		}

	}

	public static void apresentarElementos(Integer[] lista) {
		try {
			for (int i = 0; i <= lista.length; i++) {
				System.out.println(lista[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {

		}

		{

		}
	}

}