package pe.edu.cibertec.DAWII_T3_VELIZ_ZAMORA_JOSEPH.model.bd;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "rol")
public class Rol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idrol;
    @Column(name = "nomrol")
    private String nomrol;
}