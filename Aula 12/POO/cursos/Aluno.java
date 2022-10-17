package orientadoObjeto.cursos;

import java.util.ArrayList;

public class Aluno {
	
	final String nome;
	final ArrayList<Curso> cursos = new ArrayList<>();
	
	Aluno(String nome){
		this.nome = nome;
	}
		
	void addCurso(Curso curso) { //Relação Bidirecional.
		this.cursos.add(curso);
		curso.alunos.add(this);
	}
	
	//Procurar alunos pelo curso dado pelo sistema.
	Curso getNomePorCurso(String nome) {
		for(Curso curso: this.cursos) {
			if(curso.nome.equalsIgnoreCase(nome)) {
				return curso;
			}
		}
		return null;
	}
	
	public String toString(){
		return nome;
	}
}
	
	

