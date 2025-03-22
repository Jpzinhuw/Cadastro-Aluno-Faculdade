import java.util.List;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Aula 7");


        Materia materia1 = new Materia("PHP", 100);
        Materia materia2 = new Materia("Java", 50);

        Aluno aluno = new Aluno("João Pedro", "Mottin",
        new Endereco("Rua do ovo", "83150-666",420), materia2);

        System.out.println(aluno);
        System.out.println("\n");

        aluno.getEndereco().setRua("Rua da gema");

        System.out.println(aluno);
        System.out.println("\n");

        aluno.setRua("Rua da clara");

        System.out.println(aluno);
        System.out.println("\n");

        List<Materia> materias = new ArrayList<>();
        materias.add(materia2);
        materias.add(new Materia("C++", 25));

        materia2.setNome("JavaScript");

        System.out.println("\n"+aluno);
        System.out.println("\n"+materias);

    }
}
