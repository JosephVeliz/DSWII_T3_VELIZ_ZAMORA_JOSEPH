package pe.edu.cibertec.DAWII_T3_VELIZ_ZAMORA_JOSEPH.util;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import pe.edu.cibertec.DAWII_T3_VELIZ_ZAMORA_JOSEPH.model.dto.DtoEntity;

@Component
public class DtoUtil {
    public DtoEntity convertirADto(Object obj, DtoEntity mapper) {
        return new ModelMapper().map(obj, mapper.getClass());
    }

    public Object convertirDtoAEntity(Object obj, DtoEntity mapper) {
        return new ModelMapper().map(mapper, obj.getClass());
    }
}