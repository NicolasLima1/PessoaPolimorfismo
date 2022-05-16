package Aula;

public class Main {
    public static void main(String[] args) {
        
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Humano");
        pessoa.setIdade(1);
        pessoa.setEndereco("rua 1, num 1");
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
        System.out.println(pessoa.obterEtiquetaEndereco());
       
        System.out.println("==================");
        
        Pessoa aluno = new Aluno();
        Aluno turma = new Aluno("Turma A");
        aluno.setNome("Nicolas");
        aluno.setIdade(18);
        aluno.setEndereco("rua 2, num 2");
        System.out.println(aluno.getNome());
        System.out.println(aluno.getIdade());
        System.out.println(aluno.obterEtiquetaEndereco());
        System.out.println(turma.obterTurma());
       
         System.out.println("==================");

        Pessoa professor = new Professor();
        Professor salario = new Professor(1000.5);
        professor.setNome("Jair");
        professor.setIdade(30);
        professor.setEndereco("rua 3, num 3");
        System.out.println(professor.getNome());
        System.out.println(professor.getIdade());
        System.out.println(professor.obterEtiquetaEndereco());
        System.out.println(salario.obterSalario());
       
    }
    
}
