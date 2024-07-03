package pe.edu.cibertec.DAWII_T3_VELIZ_ZAMORA_JOSEPH.service;

import pe.edu.cibertec.DAWII_T3_VELIZ_ZAMORA_JOSEPH.model.bd.Usuario;

public interface IUsuarioService {

    Usuario obtenerUsuarioPorNomUsuario(
            String nomusuario);
}