package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExemploCursos {

	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));

		cursos.sort(Comparator.comparing(Curso::getAlunos));
		// cursos.forEach(c -> System.out.println(c.getNome()));

		Stream<String> nomes = cursos.stream().map(Curso::getNome);

//		cursos.stream().filter(c -> c.getAlunos() > 50).forEach(c -> System.out.println(c.getNome()));

		OptionalDouble media = cursos.stream().filter(c -> c.getAlunos() >= 100).mapToInt(Curso::getAlunos).average();

		// System.out.println(sum);

//		cursos.stream().filter(c -> c.getAlunos() >= 100).findAny().ifPresent(c -> System.out.println(c.getNome()));
//
//		cursos.parallelStream()
//		.filter(c -> c.getAlunos() >= 100)
//		.collect(Collectors.toMap(c -> c.getNome(), c -> c.getAlunos()))
//		.forEach((nome, alunos) -> System.out.println(nome + " tem " + alunos + " alunos"));

		
		cursos.stream()
				.filter(c -> c.getAlunos() >= 100)
				.collect(Collectors.toMap(c -> c.getNome(), c -> c.getAlunos()))
				.forEach((nome, alunos) -> System.out.println(nome + " tem " + alunos + " alunos"));
		

	}

}
