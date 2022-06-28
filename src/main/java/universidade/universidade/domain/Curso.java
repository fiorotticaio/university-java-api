package universidade.universidade.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // getters e setters
@NoArgsConstructor // construtor sem nenhum argumento
@AllArgsConstructor // construtor com todos os argumentos
@Entity
public class Curso {
    @Id // auto incremento
    @GeneratedValue(strategy = GenerationType.IDENTITY) // banco gera o id automaticamente
    private Integer id = 0;

    @Column(length = 50, nullable = false, unique = true) 
    private String nome = "";
    /* 
     * length: quantidade máxima de caracteres
     * nullable: se é um campo pode ser nulo ou não (true é padrão)
     * scale: número de casas depois da vírgula
    */

    @Column(nullable = false, unique = true)
    private Integer codigo = 0;
}
