public class Gerente extends Funcionario {

    public void setSenha(int senha) {
        this.senha = senha;
    }

    private int senha;

    public boolean autentica(int senha){
        if(this.senha == senha){
            return true;
        } else {
            return false;
        }
    }

   public double getBonificacao() {
       System.out.println("Chamando o método de bonificação do GERENTE");
       return   super.getBonificacao() + super.getSalario();
   }

 }
