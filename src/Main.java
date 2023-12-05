import br.com.dio.desafio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Formação Java");
        curso1.setDescricao("Curso completo de Java");
        curso1.setCargaHoraria(150);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Mentor para ajudar");
        mentoria1.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(mentoria1);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Santander Java Developer");
        bootcamp.setDescricao("Sua chance de garantir emprego!");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria1);

        Dev dev = new Dev();
        dev.setNome("José Antônio");
        dev.inscreverBootcamp(bootcamp);
        dev.progredir();
        System.out.println("Conteudos inscritos" + dev.getConteudoInstritos());
        System.out.println();
        System.out.println("Conteudos concluidos" + dev.getConteudosConcluidos());
        System.out.println();
        System.out.println("Exp: " + dev.calcularXp());
    }

}