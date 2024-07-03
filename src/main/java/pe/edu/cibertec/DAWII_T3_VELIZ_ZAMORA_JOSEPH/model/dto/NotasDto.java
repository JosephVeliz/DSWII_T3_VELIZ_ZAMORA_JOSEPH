package pe.edu.cibertec.DAWII_T3_VELIZ_ZAMORA_JOSEPH.model.dto;

import lombok.Data;

@Data
public class NotasDto implements DtoEntity  {

    private String idAlumno;
    private String idCurso;
    private Float exaParcial;
    private Float exaFinal;
    private Float promedio;


}
