package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição Curso JS");
        curso2.setCargaHoraria(4);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição Mentoria Java");
        mentoria.setDataInicio(LocalDate.now());


        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();

        bootcamp.setNome("Bootcamp Java Development");
        bootcamp.setDescricao("Descrição Bootcamp Java Development");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devAlan = new Dev();
        devAlan.setNome("Alan");
        devAlan.inscreverBootcamp(bootcamp);
        devAlan.progredir();
        devAlan.progredir();
        devAlan.progredir();
        System.out.println("Conteúdos Inscritos Alan: " + devAlan.getConteudosInscritos());
        System.out.println("Conteúdos Pendentes Alan: " + devAlan.getConteudosPendentes());
        System.out.println("Conteúdos Concluídos Alan: " + devAlan.getConteudosConcluidos());
    }
}
