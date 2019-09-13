package com.yizuslabs.costmanagement.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "tbunidadnegocio", schema = "costmanager")
public class TbUnidadNegocio {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "codunidad", updatable = false, nullable = false)
    private Long codUnidad;
    @Basic
    @Column(name = "desunidad")
    private String desUnidad;
    @Basic
    @Column(name = "indunidad")
    private String indUnidad;
    @Basic
    @Column(name = "codtipunidad")
    private String codTipUnidad;
    @Basic
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "feccrea")
    private Date fecCrea;
    @Basic
    @Column(name = "usercrea")
    private String userCrea;
    @Basic
    @Column(name = "fecmodi")
    private Date fecModi;
    @Basic
    @Column(name = "usermodi")
    private String userModi;
    @Basic
    @Column(name = "obsunidad")
    private String obsUnidad;

   }
