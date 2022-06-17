package universidade.universidade.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import universidade.universidade.domain.Curso;

@SpringBootTest
public class CursoRepositoryTests {

    @Autowired // dizendo pra o spring gerenciar esse objeto
    private CursoRepository cursoRepository; // criando a interface
    
    @Test // teste o spring
    public void inserir() {

        Curso c1 = new Curso(12345, "Engenharia da Computacao", 52);

        Curso c2 = new Curso(22323, "Medicina", 10);

        cursoRepository.save(c1);
        cursoRepository.save(c2);
    }
}
