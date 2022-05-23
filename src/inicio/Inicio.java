package inicio;

import codigo.*;

public class Inicio {
    public static void main(String[] args) {
        /// <-------------------------------------------- Ejercicio 1 ----------------------------------------------------------> ///
        /// 1.A y 1.B
        Rectangulo ac = new Rectangulo(25,35);
        System.out.println(ac.toString());
        /// 1.A y 1.B

        /// 1.C
        System.out.println("El area del rectangulo es : " + ac.areaRectangulo() + " y el perimetro es : " + ac.perimetroRectangulo() );
        /// 1.C

        /// 1.D y 1.E
        ac.setAncho(150);
        ac.setLargo(1050);
        System.out.println("El area del rectangulo es : " + ac.areaRectangulo() + " y el perimetro es : " + ac.perimetroRectangulo() );
        /// 1.D y 1.E

        //1.F
        Rectangulo rc = new Rectangulo(); /// Inicializar un objeto con valores default
        System.out.println(rc.toString()); /// Mostrar el objeto con valores default
        //1.F
        /// <-------------------------------------------- Ejercicio 1 ----------------------------------------------------------> ///


        /// <-------------------------------------------- Ejercicio 2 ----------------------------------------------------------> ///
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
        Empleado juan = new Empleado("Carlos","Gutiérrez,","23456345",25000);
        Empleado Ana = new Empleado("Ana","Sánchez","34234123",27500);
        System.out.println("El salario de " + juan.getNombre() + " es de : " + juan.getSalario());
        System.out.println(juan.toString());
        System.out.println(Ana.toString());
        //System.out.println(Ana.toString());
        System.out.println("El salario anual de Juan es : " + "\n" + juan.salarioAnual());
        System.out.println("El salario anual de Ana es : " + "\n" + Ana.salarioAnual());
        juan.aumentoSalarial(100.0D);
        System.out.println("El aumento salarial de " + juan.getNombre() + " es de : " + juan.salarioAnual());


        /// <-------------------------------------------- Ejercicio 2 ----------------------------------------------------------> ///
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");

        /// <-------------------------------------------- Ejercicio 3 ----------------------------------------------------------> ///
        System.out.println("Ejercicio 3");
        InventarioItems invent = new InventarioItems(1,"Una descripción salvaje",25,250);
        System.out.println(invent.toString());
        /// <-------------------------------------------- Ejercicio 3 ----------------------------------------------------------> ///


        /// <-------------------------------------------- Ejercicio 4 ----------------------------------------------------------> ///
        Banco JoseCarlos = new Banco(0,"Jose Carlos",15000);
        JoseCarlos.credito(2500);
        JoseCarlos.debito(1500);
        JoseCarlos.debito(30000);
        System.out.println(JoseCarlos.toString());

        /// <-------------------------------------------- Ejercicio 4 ----------------------------------------------------------> ///



        /// <-------------------------------------------- Ejercicio 5 ----------------------------------------------------------> ///

        Hora hora = new Hora(13,59,22);
        System.out.println(hora.toString());
        hora.sumarMin();
        hora.sumarMin();
        System.out.println(hora.toString());
        hora.restarSeg();
        System.out.println(hora.toString());
        /// <-------------------------------------------- Ejercicio 5 ----------------------------------------------------------> ///

    }
}
