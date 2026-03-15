import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
      static void main (String [] args){

        Curso curso1 = new Curso();
        curso1.setTitulo("curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);


         Curso curso2 = new Curso();
         curso2.setTitulo("curso JS");
         curso2.setDescricao("Descrição curso JS");
         curso2.setCargaHoraria(4);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("descrição mentoria Java");
        mentoria.setData(LocalDate.now());

          Bootcamp bootcamp = new Bootcamp();
          bootcamp.setNome("Bootcamp Java Developer");
          bootcamp.setDescricao("Descrição Bootcamp Java");
          bootcamp.getConteudos().add(curso1);
          bootcamp.getConteudos().add(curso2);
          bootcamp.getConteudos().add(mentoria);

          Dev devCamila = new Dev ();
          devCamila.setNome("Camila");
          devCamila.inscreverBootcamp(bootcamp);
          System.out.println("Conteudos Inscritos Camila:" + devCamila.getConteudosInscritos());

          devCamila.progredir();
          devCamila.progredir();
          System.out.println("-----");
          System.out.println("Conteudos Inscritos Camila:" + devCamila.getConteudosInscritos());
          System.out.println("Conteudos Concluidos Camila:" + devCamila.getConteudosConcluidos());
          System.out.println("XP:" + devCamila.calcularTotalXp());


          System.out.println("--------------------------------------");



          Dev devJoao = new Dev();
          devJoao.setNome("Joao");
          devJoao.inscreverBootcamp(bootcamp);
          System.out.println("Conteudos Inscritos João:" + devJoao.getConteudosInscritos());
          devJoao.progredir();
          devJoao.progredir();
          devJoao.progredir();
          System.out.println("-----");
          System.out.println("Conteudos Inscritos João: " + devJoao.getConteudosInscritos());
          System.out.println("Conteudos Concluidos João: " + devJoao.getConteudosConcluidos());
          System.out.println("XP:" + devJoao.calcularTotalXp());
          System.out.println("----------------------------------------");



    }
}
