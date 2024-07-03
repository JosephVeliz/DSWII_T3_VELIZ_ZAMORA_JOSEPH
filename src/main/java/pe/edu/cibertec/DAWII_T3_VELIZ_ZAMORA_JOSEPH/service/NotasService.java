package pe.edu.cibertec.DAWII_T3_VELIZ_ZAMORA_JOSEPH.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.DAWII_T3_VELIZ_ZAMORA_JOSEPH.model.bd.Notas;
import pe.edu.cibertec.DAWII_T3_VELIZ_ZAMORA_JOSEPH.repository.NotasRepository;

import java.util.List;

@AllArgsConstructor
@Service
public class NotasService implements INotasService {

    private NotasRepository notasRepository;

    @Override
    public List<Notas> listarNotasConDetalles() {
        return notasRepository.findAll();
    }
}