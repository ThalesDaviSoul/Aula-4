public class Funcionario {
    private String name;
    private int age;
    private String rg;
    private String departament;
    private double salary;
    private Data entryDate;

    // Construtor
    public Funcionario(String name, int age, String rg, String departament, double salary, Data entryDate){
        this.name = name;
        this.age = age;
        this.rg = rg;
        this.departament = departament;
        this.salary = salary;
        this.entryDate = entryDate;
    }

    public Funcionario(){}


    // Metodo mostrar
    public void print(){
        System.out.println(name+", "+age+" anos, cujo rg é "+rg+", está no departamento de "+departament+". Ele entrou na empresa em "+entryDate.dataString()+" atualmente tem um salário de "+salary+"R$");
    }


}