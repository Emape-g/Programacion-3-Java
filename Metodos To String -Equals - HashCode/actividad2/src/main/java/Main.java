import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    List<Estudiante> estudiantes = new ArrayList<>();

    Estudiante e1 = new Estudiante("Phoebe",30,"Masajista");
    Estudiante e2 = new Estudiante("Rachel",29,"Estilista");
    Estudiante e3 = new Estudiante("Ross",32,"Paleontologo");
    Estudiante e4 = new Estudiante("Monica",30,"Chef");
    Estudiante e5 = new Estudiante("Joey",33,"Actor");
    Estudiante e6 = new Estudiante("Chandler",30,"Contador?");

    estudiantes.add(e1);
    estudiantes.add(e2);
    estudiantes.add(e3);
    estudiantes.add(e4);
    estudiantes.add(e5);
    estudiantes.add(e6);

    for(Estudiante e: estudiantes){
        System.out.println(e);
    }

    }
}