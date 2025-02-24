package pe.edu.cibertec.DAWII_T3_VELIZ_ZAMORA_JOSEPH.model.bd;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "curso")
public class Curso {
    @Id
    @Column(name = "idcurso")
    private String idCurso;

    @Column(name = "nomcurso")
    private String nomCurso;

    @Column(name = "credito")
    private Integer credito;
}