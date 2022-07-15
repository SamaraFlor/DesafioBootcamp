package desafio.dominio;
import java.time.LocalDate;

import desafio.dominio.Curso;

public class Main {

	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Curso Bootcamp de Java");
		curso1.setCargaHoraria(80);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso SPRINGBOOT");
		curso2.setDescricao("Curso Bootcamp ultilizando o SpringBoot");
		curso2.setCargaHoraria(50);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria em Java");
		mentoria.setDescricao("mentoria sera realizada para aula de Java");
		mentoria.setData(LocalDate.now());
		
		
		
		System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria);
		
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição Bootcamp Java");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devSamara = new Dev();
		devSamara.setNome("Samara");
		devSamara.inscricaoBootcamp(bootcamp);
		System.out.println("conteudo inscritos"  + devSamara.getConteudosInscritos());
		devSamara.progredir();
		devSamara.progredir();
		devSamara.progredir();
		System.out.println("conteudo inscritos"  + devSamara.getConteudosInscritos());
		System.out.println("conteudo concluidos"  + devSamara.getConteudosConcluidos());
		System.out.println("XP" + devSamara.calcularTotalXP());
		
		
		Dev devJoao = new Dev();
		devJoao.setNome("João");
		devJoao.inscricaoBootcamp(bootcamp);
		System.out.println("conteudo  inscritos "  + devJoao.getConteudosInscritos());
		devJoao.progredir();
		System.out.println("conteudo  inscritos "  + devJoao.getConteudosInscritos());
		System.out.println("conteudo  concluidos "  + devJoao.getConteudosConcluidos());
		System.out.println("XP" + devJoao.calcularTotalXP());
	}

}
