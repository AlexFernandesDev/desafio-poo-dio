import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("Os alunos aprenderão os conceitos de programação Java, " +
                "desenvolverão aplicativos orientados a objetos com Java e criarão programas " +
                "Java por meio de atividades práticas interessantes. ");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("Saiba muito além de frameworks, aprenda e domine a base! " +
                "Diversos projetos práticos para você ficar fera nessa linguagem." +
                "Além disso diversos bônus inclusos, como: Node, React, FireBase.");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

       /* System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devAlex = new Dev();
        devAlex.setNome("Alex");
        devAlex.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Alex: " + devAlex.getConteudosIncritos());

        devAlex.progredir();
        devAlex.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos Alex: " + devAlex.getConteudosIncritos());
        System.out.println("Conteúdos concluídos Alex: " + devAlex.getConteudosConcluidos());
        System.out.println("XP: " + devAlex.calcularTotalXP());


        System.out.println("--------------------------------");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos João: " + devJoao.getConteudosIncritos());

        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos João: " + devJoao.getConteudosIncritos());
        System.out.println("Conteúdos concluídos João: " + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXP());



    }
}