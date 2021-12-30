import com.github.antonioticelso.dominio.Bootcamp;
import com.github.antonioticelso.dominio.Curso;
import com.github.antonioticelso.dominio.Dev;
import com.github.antonioticelso.dominio.Mentoria;

import java.time.LocalDate;

public class Application {

    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("curso de Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("curso de JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("mentoria da linguagem Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Bootcamp de Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devTonhao = new Dev();
        devTonhao.setNome("Tonhao");
        devTonhao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Tonhao: " + devTonhao.getConteudosInscritos());
        devTonhao.progredir();
        devTonhao.progredir();
        System.out.println("Conteudos Inscritos Tonhao: " + devTonhao.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Tonhao: " + devTonhao.getConteudosConcluidos());
        System.out.println("XP Tonhao: " + devTonhao.calcularTotalXp());

        System.out.println("-------");

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Camila: " + devCamila.getConteudosInscritos());
        devCamila.progredir();
        System.out.println("Conteudos Inscritos Camila: " + devCamila.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Camila: " + devCamila.getConteudosConcluidos());
        System.out.println("XP Camila: " + devCamila.calcularTotalXp());

    }

}
