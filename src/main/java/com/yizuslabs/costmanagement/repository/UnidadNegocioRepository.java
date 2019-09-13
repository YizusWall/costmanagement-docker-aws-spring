package com.yizuslabs.costmanagement.repository;

import com.yizuslabs.costmanagement.model.entity.TbUnidadNegocio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UnidadNegocioRepository extends JpaRepository<TbUnidadNegocio, Long> {
}
