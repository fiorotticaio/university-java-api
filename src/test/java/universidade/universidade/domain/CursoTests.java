package universidade.universidade.domain;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CursoTests {
    @Test
    public void criar() {
        Curso c = new Curso(1, "Engenharia da Computacao", 5);
         
        System.out.println(c);
    }

}
