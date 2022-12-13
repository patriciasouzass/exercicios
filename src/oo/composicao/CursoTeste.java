package oo.composicao;

public class CursoTeste {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Joao");
        Aluno aluno2 = new Aluno("Sandra");
        Aluno aluno3 = new Aluno("Paola");

        Curso curso1 = new Curso("Java Completo");
        Curso curso2 = new Curso("Javascript");
        Curso curso3 = new Curso("Banco de Dados");

        curso1.adicionarAluno(aluno1);
        curso1.adicionarAluno(aluno2);

        curso2.adicionarAluno(aluno1);
        curso2.adicionarAluno(aluno3);

        aluno1.adicionarCurso(curso3);
        aluno2.adicionarCurso(curso3);
        aluno3.adicionarCurso(curso3);

        for (Aluno aluno : curso1.alunos) {
            System.out.printf("Estou matriculado no curso %s e meu nome é %s\n", curso1.nome, aluno.nome);
        }

        //System.out.println(aluno1.cursos.get(0).alunos);

        Curso cursoEncontrado = aluno1.obterCursoPorNome("Java Completo");
        if (cursoEncontrado != null){
            System.out.println(cursoEncontrado.nome);
            System.out.println(cursoEncontrado.alunos);
        }
    }
}
