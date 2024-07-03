package pe.edu.cibertec.DAWII_T3_VELIZ_ZAMORA_JOSEPH.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.DAWII_T3_VELIZ_ZAMORA_JOSEPH.model.bd.Notas;
import pe.edu.cibertec.DAWII_T3_VELIZ_ZAMORA_JOSEPH.model.bd.NotasId;

@Repository
public interface NotasRepository extends JpaRepository<Notas, NotasId>{

}