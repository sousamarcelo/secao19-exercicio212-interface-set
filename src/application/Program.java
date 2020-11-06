package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import model.entitie.Aluno;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer totalCurso = 3;
		Set<Aluno> lista = new HashSet<Aluno>();
		
		Character x = 'A';
		
		for(int i = 0; i < totalCurso; i++) {			
			if (i > 0) {
				x ++;
			} 			
			System.out.print("quantos alunos no curso " + x +"?: ");
			Integer totalAlunos = sc.nextInt();
			for (int j = 1; j <= totalAlunos; j++) {
				System.out.print("Digite a matricula do " + j + "º aluno: ");
				Integer matricula = sc.nextInt();
				lista.add(new Aluno(matricula));
			}
			
		}
		
		System.out.println("Total de Alunos: " + lista.size());
		
		sc.close();
		
	}

}
