public class TestaEmpresa {
    public static void main(String[] args) {
        Empresa test = new Empresa("2050952514");
        test.printEmpresa();
        test.adicionarFuncionario(new Funcionario("Joao", 25, "mg-45256158", "Design", 2560.98, new Data(10, 10, 2010)));
        test.printEmpresa();
        test.adicionarFuncionario(new Funcionario("Lucas", 25, "mg-45256158", "Design", 2560.98, new Data(10, 10, 2010)));
        test.adicionarFuncionario(new Funcionario("Pedro", 25, "mg-45256158", "Design", 2560.98, new Data(10, 10, 2010)));
        test.adicionarFuncionario(new Funcionario("Fabio", 25, "mg-45256158", "Design", 2560.98, new Data(10, 10, 2010)));
        test.adicionarFuncionario(new Funcionario("Marcos", 25, "mg-45256158", "Design", 2560.98, new Data(10, 10, 2010)));
        test.printEmpresa();
    }
}
