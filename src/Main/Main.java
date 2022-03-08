package Main;

import java.time.LocalDate;

import br.com.dio.desafio.Bootcamp;
import br.com.dio.desafio.Curso;
import br.com.dio.desafio.Dev;
import br.com.dio.desafio.Mentoria;

public class Main {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Descrição do curso Java");
		curso1.setCargaHoraria(8);
		System.out.println(curso1);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso Js");
		curso2.setDescricao("Descrição do curso Js");
		curso2.setCargaHoraria(6);
		System.out.println(curso2);
		
		Mentoria mentoria1 = new Mentoria();
		mentoria1.setTitulo("Mentoria de Java");
		mentoria1.setDescricao("Descrição de mentoria de java");
		mentoria1.setData(LocalDate.now());
		System.out.println(mentoria1);
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria1);
		
		System.out.println("\nDev Andrey:");
		Dev devAndrey = new Dev();
		devAndrey.setNome("Andrey");
		devAndrey.inscreverBootcamp(bootcamp);
		devAndrey.progredir();
		System.out.println("Conteudos Inscritos" + devAndrey.getConteudosInscritos());
		System.out.println("Conteudos Concluidos" + devAndrey.getConteudosConcluidos());
		System.out.println("Conteudos Inscritos" + devAndrey.getConteudosInscritos());
		devAndrey.progredir();
		System.out.println("XP:" + devAndrey.calcularTotalXp());
		
		System.out.println("\nDev Paulo:");
		Dev devPaulo = new Dev();
		devPaulo.setNome("Paulo");
		devPaulo.inscreverBootcamp(bootcamp);
		devPaulo.progredir();
		System.out.println("Conteudos Inscritos" + devPaulo.getConteudosInscritos());
		System.out.println("Conteudos Concluidos" + devPaulo.getConteudosConcluidos());
		System.out.println("Conteudos Inscritos" + devAndrey.getConteudosInscritos());
		System.out.println("XP:" + devPaulo.calcularTotalXp());

		
	}
	
}

