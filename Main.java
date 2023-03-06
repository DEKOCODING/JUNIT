public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
    public static float calculaSalarioBruto(TipoEmpleado tipus, float ventasMes, float horasExtra){float salario = 0;
        if (tipus == null || ventasMes < 0 || horasExtra < 0){ return -1; }
        if (tipus == TipoEmpleado.venedor){salario += 1000;} else {salario += 1500;}
        if (ventasMes >= 1000  && ventasMes < 1500) {salario += 100;} else if (ventasMes >= 1500) {salario += 200;}
        salario += 20 * horasExtra;
        return salario;
    }
    public static float calculaSalarioNeto(float salarioBruto){ float salarioNeto = salarioBruto;
        if (salarioBruto < 0) {return -1;}
        else if (salarioBruto >= 1000 && salarioBruto < 1500) {salarioNeto = (float) (salarioBruto * (1.0 - (16.0/100.0)));return salarioNeto;}
        else if (salarioBruto >= 1500) {salarioNeto = (float) (salarioBruto * (1.0 - (18.0/100.0)));return salarioNeto;} else {return salarioNeto;}
    }
}