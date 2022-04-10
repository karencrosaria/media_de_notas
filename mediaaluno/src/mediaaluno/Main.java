package mediaaluno;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		float nota1,nota2,nota3,nota4,media;
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Qual sua primeira nota? "); 
		nota1 = scanner.nextFloat();
		System.out.println("Qual é sua segunda nota? :");
		nota2 = scanner.nextFloat();
		System.out.println("Qual sua terceira nota? "); 
		nota3 = scanner.nextFloat();
		System.out.println("Qual é sua quarta nota? :");
		nota4 = scanner.nextFloat();
		
		media = (nota1+nota2+nota3+nota4)/4;
		
		if(media >= 7) {
			System.out.println("Sua média é: " + media + "\n" +"APROVADO!!!");
			
			//ATENTE PRA O OPERADOR LOGICO se usar o || nesse caso
			//a uma das condicoes ia falhar
			
		}else if(media >=5 && media <= 6.9) {
			
			System.out.println("Sua média é: " + media + "\n" +"RECUPERACAO!");
			
		}else 
			
			System.out.println("Sua média é: " + media + "\n" + "REPROVADO!");
	}
}
		
	




