
package Aula;

public class Aluno extends Pessoa{

  private String turma;
  
  public Aluno(){}
  
  public Aluno(String turma){
      
      super();
      this.turma = turma;
  }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }
    
    public String obterEtiquetaEndereco(){
        String s = "Endereço Aluno: ";
        s += super.getEndereco();
        return s;
    }
    
    public String obterTurma(){
        String t = "Turma do Aluno: ";
        t += getTurma();
        return t;
    }
    
}
