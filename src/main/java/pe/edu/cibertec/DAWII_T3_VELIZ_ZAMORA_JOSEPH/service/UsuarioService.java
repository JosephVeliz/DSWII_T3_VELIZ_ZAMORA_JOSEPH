package pe.edu.cibertec.DAWII_T3_VELIZ_ZAMORA_JOSEPH.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.DAWII_T3_VELIZ_ZAMORA_JOSEPH.model.bd.Usuario;
import pe.edu.cibertec.DAWII_T3_VELIZ_ZAMORA_JOSEPH.repository.UsuarioRepository;

@AllArgsConstructor
@Service
public class UsuarioService implements IUsuarioService {

    private UsuarioRepository usuarioRepository;

    @Override
    public Usuario obtenerUsuarioPorNomUsuario(
            String nomusuario) {
        return usuarioRepository.findByNomusuario(nomusuario);
    }
}