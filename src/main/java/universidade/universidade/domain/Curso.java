package universidade.universidade.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // banco gera o id automaticamente
    private int id;

    @Column(length = 50, nullable = false, unique = true) 
    private String nome;
    /* 
     * length: quantidade máxima de caracteres
     * nullable: se é um campo pode ser nulo ou não (true é padrão)
     * scale: número de casas depois da vírgula
    */

    @Column(nullable = false, unique = true)
    private int codigo;
}
