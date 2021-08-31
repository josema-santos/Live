package model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity

public class Localidade {
    @Id
    private long id;
    @ManytoOne
    private NilvelAcesso nilvelAcesso;
    private String descricao;

}
