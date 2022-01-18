package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Descrição curso java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso1.setTitulo("Curso JS");
		curso1.setDescricao("Descrição curso JS");
		curso1.setCargaHoraria(4);
		
		
		
		Mentoria mentoria  = new Mentoria();
		mentoria.setTitulo("mentoria java");
		mentoria.setDescricao("descrição mentoria java");
		mentoria.setData(LocalDate.now());
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java ");
		bootcamp.setDescricao("Descricao bootcamp java developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devBruno = new Dev();
		devBruno.setNome("Bruno");
		System.out.println("Conteudos inscritos: " + devBruno.getConteudosInscritos());
		devBruno.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos inscritos: " + devBruno.getConteudosInscritos());
		System.out.println("Conteudos concluidos: " + devBruno.getConteudosConcluidos());
		devBruno.progredir();
		System.out.println("Conteudos concluidos: " + devBruno.getConteudosConcluidos());
		System.out.println(devBruno.calcularTotalXp());
		devBruno.progredir();
		devBruno.progredir();
		System.out.println(devBruno.calcularTotalXp());
		System.out.println("Conteudos concluidos: " + devBruno.getConteudosConcluidos());
		System.out.println("Conteudos inscritos: " + devBruno.getConteudosInscritos());
		
		
	}
}
