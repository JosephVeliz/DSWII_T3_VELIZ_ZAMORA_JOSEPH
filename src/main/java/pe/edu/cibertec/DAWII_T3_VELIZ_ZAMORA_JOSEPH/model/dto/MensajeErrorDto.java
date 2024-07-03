package pe.edu.cibertec.DAWII_T3_VELIZ_ZAMORA_JOSEPH.model.dto;
import lombok.Builder;
import lombok.Data;
import java.util.Date;

import lombok.Builder;
import lombok.Data;

import java.util.Date;



@Builder
@Data
public class MensajeErrorDto {

    private Integer codigoEstado;
    private Date fechaError;
    private String mensaje;
    private String descripcion;


}