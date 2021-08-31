package model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity

public class Usuario {
    @Id
    private Long id;
    @ManytoOne
    private CategoriaUsuario categoriaUsuario;
    private String name;
    @ManytoOne
    private Empresa empresa;
    @ManytoOne
    private NilvelAcesso nilvelAcesso;
    private JornadaTrabalho jornadaTrabalho;
    private BigDecimal tolerancia;
    private LocalDateTime inicioJornada;
    private LocalDateTime finalJornada;

}
