package com.yizuslabs.costmanagement.model.entity;


import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table (name = "tbsubunidadnegocio", schema = "costmanager",catalog = "")
public class TbSubUnidadNegocio {

    private Long codSubUnidad;
    private Long codUnidad;
    private String desSubUnidad;
    private String indSubUnidad;
    private Timestamp fecCrea;
    private String userCrea;
    private Timestamp fecModi;
    private String userModi;
    private String obsSubUnidad;

    @Id
    @Column(name = "codsubunidad")
    public Long getCodSubUnidad() {
        return codSubUnidad;
    }

    public void setCodSubUnidad(Long codSubUnidad) {
        this.codSubUnidad = codSubUnidad;
    }


    @Basic
    @Column(name = "codunidad")
    public Long getCodUnidad() {
        return codUnidad;
    }

    public void setCodUnidad(Long codUnidad) {
        this.codUnidad = codUnidad;
    }


    @Basic
    @Column(name = "dessubunidad")
    public String getDesSubUnidad() {
        return desSubUnidad;
    }

    public void setDesSubUnidad(String desSubUnidad) {
        this.desSubUnidad = desSubUnidad;
    }

    @Basic
    @Column(name = "indsubunidad")
    public String getIndSubUnidad() {
        return indSubUnidad;
    }

    public void setIndSubUnidad(String indSubUnidad) {
        this.indSubUnidad = indSubUnidad;
    }

    @Basic
    @Column(name = "feccrea")
    public Timestamp getFecCrea() {
        return fecCrea;
    }

    public void setFecCrea(Timestamp fecCrea) {
        this.fecCrea = fecCrea;
    }

    @Basic
    @Column(name = "usercrea")
    public String getUserCrea() {
        return userCrea;
    }

    public void setUserCrea(String userCrea) {
        this.userCrea = userCrea;
    }

    @Basic
    @Column(name = "fecmodi")
    public Timestamp getFecModi() {
        return fecModi;
    }

    public void setFecModi(Timestamp fecModi) {
        this.fecModi = fecModi;
    }

    @Basic
    @Column(name = "usermodi")
    public String getUserModi() {
        return userModi;
    }

    public void setUserModi(String userModi) {
        this.userModi = userModi;
    }

    @Basic
    @Column(name = "obssubunidad")
    public String getObsSubUnidad() {
        return obsSubUnidad;
    }

    public void setObsSubUnidad(String obsSubUnidad) {
        this.obsSubUnidad = obsSubUnidad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TbSubUnidadNegocio that = (TbSubUnidadNegocio) o;
        return codSubUnidad == that.codSubUnidad &&
                Objects.equals(codUnidad, that.codUnidad) &&
                Objects.equals(desSubUnidad, that.desSubUnidad) &&
                Objects.equals(indSubUnidad, that.indSubUnidad) &&
                Objects.equals(fecCrea, that.fecCrea) &&
                Objects.equals(userCrea, that.userCrea) &&
                Objects.equals(fecModi, that.fecModi) &&
                Objects.equals(userModi, that.userModi) &&
                Objects.equals(obsSubUnidad, that.obsSubUnidad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codSubUnidad,codUnidad, desSubUnidad, indSubUnidad, fecCrea, userCrea, fecModi, userModi, obsSubUnidad);
    }
}
