package orientadoObjeto.cursos;

public class CursoTeste {
	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("Otávio");
		Aluno aluno2 = new Aluno("Murilo");
		Aluno aluno3 = new Aluno("Ronaldo");
		
		Curso curso1 = new Curso("Java Completo");
		Curso curso2 = new Curso("JavaScript Completo");
		Curso curso3 = new Curso("HTML5 e CSS - Completo");
		
		curso1.addAluno(aluno1);
		curso1.addAluno(aluno2);
		
		curso2.addAluno(aluno1);
		curso2.addAluno(aluno3);
		
		aluno1.addCurso(curso3);
		aluno2.addCurso(curso3);
		aluno3.addCurso(curso3);
		
		for(Aluno aluno: curso1.alunos) {
			System.out.println("Matriculados do curso: " + curso1.nome);
			System.out.println("Aluno: " + aluno.nome);
		}
		System.out.println("\n----------");
		for(Aluno aluno: curso2.alunos) {
			System.out.println("Matriculados do curso: " + curso2.nome);
			System.out.println("Aluno: " + aluno.nome);
		}
		System.out.println("\n----------");
		for(Aluno aluno: curso3.alunos) {
			System.out.println("Matriculados do curso: " + curso3.nome);
			System.out.println("Aluno: " + aluno.nome);
		}
		
		System.out.println(aluno1.cursos.get(1).alunos.toString()); //Pegando pelo índice.
		
		//Procurar alunos pelo curso dado pelo sistema.
		Curso cursoEncontrado = aluno1.getNomePorCurso("Java COmpleto");
		if(cursoEncontrado != null) {
			System.out.println(cursoEncontrado.nome);
			System.out.println(cursoEncontrado.alunos);
		}
	}
}
