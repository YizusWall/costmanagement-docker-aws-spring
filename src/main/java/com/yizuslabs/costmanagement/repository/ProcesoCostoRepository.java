package com.yizuslabs.costmanagement.repository;

import com.yizuslabs.costmanagement.model.entity.TbProcesoCosto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProcesoCostoRepository extends JpaRepository<TbProcesoCosto, Long> {
}
