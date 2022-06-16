package universidade.universidade.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/universidade")
@RestController
public class UniversidadeController {

    @RequestMapping("/ola")
    public String exibirMensagem() {
        return "Hello wolrd!";
    }
}
