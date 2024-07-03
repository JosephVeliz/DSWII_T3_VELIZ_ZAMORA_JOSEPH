package pe.edu.cibertec.DAWII_T3_VELIZ_ZAMORA_JOSEPH.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class UsuarioSeguridadDto {
    private Integer idusuario;
    private String nomusuario;
    private String token;
}