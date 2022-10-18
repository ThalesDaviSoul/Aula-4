public class Empresa {
    private Funcionario[] empregados;
    private String cnpj;

    public Empresa(String cnpj){
        this.empregados = new Funcionario[1];
        this.cnpj = cnpj;
    }

    public void adicionarFuncionario(Funcionario novo){
        for(int i = 0; i < empregados.length; i++){
            if(empregados[i] == null){
                empregados[i] = novo;
                break;
            }else if(i == empregados.length-1){
                Funcionario[] novo_Array = new Funcionario[empregados.length+1];
                for(int j = 0; j < empregados.length; j++){
                    novo_Array[j] = empregados[j];
                }
                novo_Array[empregados.length] = novo;
                this.empregados = novo_Array;
                break;
            }
        }
    }

    // Acidentalmente essa função já fazia a parte de imprimir o funcionário, então por isso não adicionei outra
    public void printEmpresa(){
        System.out.println("A empresa cujo cnpj é: "+cnpj+"\nTem os seguintes empregados: ");
        for(Funcionario empregado : empregados){
            if(empregado != null){
                empregado.print();
            }
        }
    }

}
