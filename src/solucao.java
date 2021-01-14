import java.util.Scanner; 

public class solucao {

	public static void main(String[] args) {
//		input
		Scanner in = new Scanner(System.in);
		int ana = in.nextInt();
		int beatriz = in.nextInt();
		
//		Dado que temos 3 assentos significa que de 3 em 3 acabamos no mesmo assento, 
//		logo basta sabermos o resto do numero sorteado para sabermos o assento da pessoa	
		int assento_ana = ana % 3;
		int assento_beatriz = beatriz % 3;
		
//		Como especificado pela questão, caso o assento de beatriz e ana sejam o mesmo, beatriz passa para o proximo assento da sequencia 1,2,0
		if (assento_beatriz == assento_ana) {
			switch (assento_ana) {
			case 1:
				assento_beatriz = 2;
				break;
			case 2:
				assento_beatriz = 0;
				break;
			case 0:
				assento_beatriz = 1;
				break;
			}
		}
		
//		Aqui é feita uma soma para otimizar a verificação dos assentos ocupados já que de acordo com cada resultado da soma dos assentos disponiveis 
//		temos apenas um assento restante
		int soma_assentos = assento_ana + assento_beatriz;
		if (soma_assentos == 1) {
			System.out.printf("2");
		} else if (soma_assentos == 2 ) {
			System.out.printf("1");
		} else {
			System.out.printf("0");
		}
		
	}

}
