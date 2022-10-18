public class Funcionario {
    private String name;
    private int age;
    private String rg;
    private String departament;
    private double salary;
    private Data entryDate;
    private static int totalFuncionarios;
    private int identificador;

    // Construtor
    public Funcionario(String name, int age, String rg, String departament, double salary, Data entryDate){
        this.name = name;
        this.age = age;
        this.rg = rg;
        this.departament = departament;
        this.salary = salary;
        this.entryDate = entryDate;
        Funcionario.totalFuncionarios += 1;
        this.identificador = Funcionario.totalFuncionarios;
    }

    public Funcionario(){
        Funcionario.totalFuncionarios += 1;
        this.identificador = Funcionario.totalFuncionarios;
    }

    //Getters and setters
    public String getName(){
        return this.name;
    }
    public String getRg(){
        return this.rg;
    }
    public String getDepartament(){
        return this.departament;
    }
    public double getSalary(){
        return this.salary;
    }
    public Data getEntryDate(){
        return this.entryDate;
    }
    public int getAge(){
        return this.age;
    }
    public int getIdentificador(){
        return this.identificador;
    }

    public void setDepartament(String departament){
        this.departament = departament;
    }
    public void setSalary(double salary){
        this.salary= salary;
    }
    public void setAge(int age){
        this.age = age;
    }

    // Metodo mostrar
    public void print(){
        System.out.println("["+identificador+"] - "+name+", "+age+" anos, cujo rg é "+rg+", está no departamento de "+departament+". Ele entrou na empresa em "+entryDate.dataString()+" atualmente tem um salário de "+salary+"R$");
    }


}