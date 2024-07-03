package pe.edu.cibertec.DAWII_T3_VELIZ_ZAMORA_JOSEPH.model.bd;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PagosId implements java.io.Serializable {
    private String idAlumno;
    private String ciclo;
    private Integer ncuota;
}
