import java.util.Scanner;

public class MiniTeste {

	public static void main(String[] args) {

		Scanner tecladoCli = new Scanner(System.in);

		Scanner tecladoQtd = new Scanner(System.in);

		//1
		String cliente = "";
		int qtd;
		int contadorLa�o = 0; 

		do { //2
		
			System.out.println("=======================================");
			System.out.println("Informe o nome do cliente( A, B ou C)");
			System.out.println("=======================================");
			cliente = tecladoCli.next().toUpperCase();

			System.out.println("=======================================");
			System.out.println("Informe a quantidade de itens comprados: ");
			System.out.println("=======================================");
			qtd = tecladoQtd.nextInt(); 

			//3

			if (cliente.equals("A") && qtd >= 1 && qtd < 10) { //4

				System.out.println("Ol� cliente A voc� recebeu 0% de desconto"); //5

			} else if (cliente.equals("B") && qtd >= 1 && qtd < 10) { //6
 
				System.out.println("Ol� cliente B voc� recebeu 5% de desconto "); //7

			} else if (cliente.equals("C") && qtd >= 1 && qtd < 10) { //8

				System.out.println("Ol� cliente C voc� recebeu 0% de desconto"); //9

			} else if (cliente.equals("A") && qtd >= 10 && qtd <= 99) { //10

				System.out.println("Ol� cliente A voc� recebeu 5% de desconto"); //1

			} else if (cliente.equals("B") && qtd >= 10 && qtd <= 99) { //12

				System.out.println("Ol� cliente B voc� recebeu 15% de desconto"); //13

			} else if (cliente.equals("C") && qtd >= 10 && qtd <= 99) { //14

				System.out.println("Ol� cliente C voc� recebeu 20% de desconto"); //15

			} else if (cliente.equals("A") && qtd >= 100 && qtd <= 1000) { //16

				System.out.println("Ol� Cliente A recebeu 10% de desconto"); //17

			} else if (cliente.equals("B") && qtd >= 100 && qtd <= 1000) { //18

				System.out.println("Ol� Cliente B recebeu 25% de desconto"); //19

			} else if (cliente.equals("C") && qtd >= 100 && qtd <= 1000) { //20

				System.out.println("Ol� Cliente C recebeu 25% de desconto"); //21

			} else {
				System.out.println("Entrada inv�lida. Nome do cliente ou quantidade de itens incorreta!"); //22
			}

		} while (qtd > contadorLa�o); //23

		System.out.println("Encerrando a execu��o..."); //24

	}

}
