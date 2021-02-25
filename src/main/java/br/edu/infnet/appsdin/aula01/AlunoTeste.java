package br.edu.infnet.appsdin.aula01;

import java.util.ArrayList;
import java.util.List;

public class AlunoTeste {
	
	public static void main(String[] args) {
		
		String[] nomes = {"Marcio Figueiredo", "Maria", "Joao"};
		
		String[] emails = {"marcio@figueiredo.br", "maria@maria.com" , "joao@joao.com"};
		
		List<Aluno> alunos = new ArrayList<Aluno>();
			
		for(int i = 0; i < nomes.length; i++) {
			Aluno aluno = new Aluno();
			aluno.setId(i+1);
			aluno.setNome(nomes[i]);
			aluno.setEmail(emails[i]);
			alunos.add(aluno);
		}
		
		for(Aluno item : alunos) {
			System.out.println(item);
		}
		
	}

}
