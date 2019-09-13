package com.yizuslabs.costmanagement.repository;

import com.yizuslabs.costmanagement.model.entity.TbSubUnidadNegocio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubUnidadNegocioRepository extends JpaRepository<TbSubUnidadNegocio, Long> {
}
