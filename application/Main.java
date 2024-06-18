package application;

import java.time.LocalDate;

import entities.Bootcamp;
import entities.Curso;
import entities.Desenvolvedor;
import entities.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Aprendendo Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Git");
        curso2.setDescricao("Aprenda a utilizar o GIT");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Primeira mentoria");
        mentoria.setDescricao("Participe da 1ª mentoria");
        mentoria.setData(LocalDate.of(2023, 1, 9));

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Desenvolvedor dev = new Desenvolvedor();
        dev.setNome("Gabriela");
        dev.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos de " + dev.getNome() + ": " + dev.getConteudosInscritos());
        dev.progredir();
        dev.progredir();
        System.out.println("-----------");
        System.out.println("Conteúdos inscritos de " + dev.getNome() + ": " + dev.getConteudosInscritos());
        System.out.println("Conteúdos concluídos de " + dev.getNome() + ": " + dev.getConteudosConcluidos());
        System.out.println("XP: " + dev.calcularTotalXp());
        System.out.println("-----------");
    }
}