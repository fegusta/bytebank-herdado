public class TesteFuncionario {

    public static void main(String[] args) {

        Funcionario felipe = new Funcionario();
        felipe.setNome("Felipe Nascimento");
        felipe.setCpf("388838668-35");
        felipe.setSalario(2600.00);

        System.out.println(felipe.getNome());
        System.out.println(felipe.getBonificacao());
    }

}
