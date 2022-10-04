import java.util.Scanner;

public class MiniTeste {

	public static void main(String[] args) {

		Scanner tecladoCli = new Scanner(System.in);

		Scanner tecladoQtd = new Scanner(System.in);

		String cliente = "";
		int qtd;
		int contadorLa�o = 0;

		do {
			System.out.println("=======================================");
			System.out.println("Informe o nome do cliente( A, B ou C)");
			System.out.println("=======================================");
			cliente = tecladoCli.next().toUpperCase();

			System.out.println("=======================================");
			System.out.println("Informe a quantidade de itens comprados: ");
			System.out.println("=======================================");
			qtd = tecladoQtd.nextInt();

			if (cliente.equals("A") && qtd >= 1 && qtd < 10) {

				System.out.println("Ol� cliente A voc� recebeu 0% de desconto");

			} else if (cliente.equals("B") && qtd >= 1 && qtd < 10) {

				System.out.println("Ol� cliente B voc� recebeu 5% de desconto ");

			} else if (cliente.equals("C") && qtd >= 1 && qtd < 10) {

				System.out.println("Ol� cliente C voc� recebeu 0% de desconto");

			} else if (cliente.equals("A") && qtd >= 10 && qtd <= 99) {

				System.out.println("Ol� cliente A voc� recebeu 5% de desconto");

			} else if (cliente.equals("B") && qtd >= 10 && qtd <= 99) {

				System.out.println("Ol� cliente B voc� recebeu 15% de desconto");

			} else if (cliente.equals("C") && qtd >= 10 && qtd <= 99) {

				System.out.println("Ol� cliente C voc� recebeu 20% de desconto");

			} else if (cliente.equals("A") && qtd >= 100 && qtd <= 1000) {

				System.out.println("Ol� Cliente A recebeu 10% de desconto");

			} else if (cliente.equals("B") && qtd >= 100 && qtd <= 1000) {

				System.out.println("Ol� Cliente B recebeu 25% de desconto");

			} else if (cliente.equals("C") && qtd >= 100 && qtd <= 1000) {

				System.out.println("Ol� Cliente C recebeu 25% de desconto");

			} else {
				System.out.println("Entrada inv�lida. Nome do cliente ou quantidade de itens incorreta!");
			}

		} while (qtd > contadorLa�o);

		System.out.println("Encerrando a execu��o...");

	}

}
