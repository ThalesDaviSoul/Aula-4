public class App {
    public static void main(String[] args) {
        //Criando o funcionário 1
        Funcionario f1 = new Funcionario("Kleber", 26, "mg 04548945", "Design", 2500.50, new Data(20, 9, 2012));
        f1.print();
        
        //Criando o funcionário 3 e 4 para comparar-los
        Funcionario f2 = new Funcionario();
        Funcionario f3 = new Funcionario();
        System.out.println(f2 == f3);
        //O resultado é falso pois a referência é diferente

        //Criando um clone para o funcionario 1
        Funcionario cloneF1 = new Funcionario("Kleber", 26, "mg 04548945", "Design", 2500.50, new Data(20, 9, 2012));
        System.out.println(f1 == cloneF1);
        //Falso, pois não é comparado os campos mas sim a referência da memória

        //Criando uma nova referência para o funcionário 1
        Funcionario clone2 = f1;
        System.out.println(clone2 == f1);
        //Agora o resultado é verdadeiro, pois ambos apontam para a mesma referência


        // Aula 6
        // 1 - Ao tentar acessar um privado, temos um erro de acesso, pois não temos acesso ao atributo diretamente pelo main. 
        Funcionario aula6 = new Funcionario();
        // aula6.name="Carlos";
        Funcionario CloneAula6 = new Funcionario("Ruan", 26, "mg 04548945", "Design", 2500.50, new Data(31, 2, 2032));
        Funcionario IdentificadorAula6 = new Funcionario("Lucas", 26, "mg 04548945", "Design", 2500.50, new Data(20, 9, 2012));
        CloneAula6.print();
        IdentificadorAula6.print();

    }
}
