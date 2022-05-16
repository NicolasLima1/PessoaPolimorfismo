
package Aula;

public class Professor extends Pessoa {

    private double salario;
    
    
    public Professor(){}
    
   public Professor(double salario){
      
     super();
      this.salario = salario;
  }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public String obterEtiquetaEndereco(){
        String s = "Endereço Professor: ";
        s += super.getEndereco();
        return s;
    }
    
    public String obterSalario(){
        String sa = "Salário do Professor: ";
        sa += getSalario();
        return sa;
    }
    
   
}
