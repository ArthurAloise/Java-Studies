package orientadoObjeto.cursos;

import java.util.ArrayList;

public class Curso {
	
	final String nome;
	final ArrayList<Aluno> alunos = new ArrayList<>(); //Lista constante, que foi armazenada na memória.
	
	Curso(String nome){
		this.nome = nome;
	}
	
	void addAluno(Aluno aluno) { //Relação Bidirecional.
		this.alunos.add(aluno);
		aluno.cursos.add(this);
	}

}
