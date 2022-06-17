package universidade.universidade.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import universidade.universidade.repository.CursoRepository;
import universidade.universidade.domain.Curso;

@RestController // dizendo que é um controller
@RequestMapping("/cursos")
public class CursoController {
    @Autowired
    private CursoRepository cursoRepository;

    @GetMapping // RequestMapping com método GET (sem url específica)
    public List<Curso> listar() {
        List<Curso> cursos = cursoRepository.findAll();
        return cursos;
    }

    @PostMapping // RequestMapping com método POST (sem url específica)
    public Curso inserir(@RequestBody Curso curso) { // @RequestBody diz que esse Curso vem do corpo da requisição
        Curso c = cursoRepository.save(curso); // método retorna o objeto salvo
        return c;
    }

    @DeleteMapping("/{id}") // RequestMapping com método DELETE
    public Optional<Curso> excluir(@PathVariable Integer id) { // @PathVariable diz que esse id é o passado na url
        // Optional faz com que possa ser nulo e não dar erro 
        Optional<Curso> c = cursoRepository.findById(id);
        cursoRepository.delete(c.get()); // .get() pega o conteúdo do Optional
        return c;
    }

    @PutMapping // RequestMapping com método PUT
    public Curso editar(@RequestBody Curso curso) {
        Curso c = cursoRepository.save(curso); // se não encontrar vai criar outro
        return c;
    }
}
