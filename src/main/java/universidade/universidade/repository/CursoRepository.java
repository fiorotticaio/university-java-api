package universidade.universidade.repository;

import org.springframework.data.jpa.repository.JpaRepository; // cria os métodos (http) automáticamente

import universidade.universidade.domain.Curso;

public interface CursoRepository extends JpaRepository<Curso, Integer> {

}

