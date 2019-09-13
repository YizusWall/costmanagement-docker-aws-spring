package com.yizuslabs.costmanagement.model.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "tbtipousuario", schema = "costmanager")
public class TbTipoUsuario {
    private String codTipoUsuario;
    private String desTipoUsuario;
    private String indTipoUsuario;
    private Timestamp fecCrea;
    private String userCrea;

    @Id
    @Column(name = "codtipousuario")
    public String getCodTipoUsuario() {
        return codTipoUsuario;
    }

    public void setCodTipoUsuario(String codTipoUsuario) {
        this.codTipoUsuario = codTipoUsuario;
    }

    @Basic
    @Column(name = "destipousuario")
    public String getDesTipoUsuario() {
        return desTipoUsuario;
    }

    public void setDesTipoUsuario(String desTipoUsuario) {
        this.desTipoUsuario = desTipoUsuario;
    }

    @Basic
    @Column(name = "indtipousuario")
    public String getIndTipoUsuario() {
        return indTipoUsuario;
    }

    public void setIndTipoUsuario(String indTipoUsuario) {
        this.indTipoUsuario = indTipoUsuario;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TbTipoUsuario that = (TbTipoUsuario) o;
        return Objects.equals(codTipoUsuario, that.codTipoUsuario) &&
                Objects.equals(desTipoUsuario, that.desTipoUsuario) &&
                Objects.equals(indTipoUsuario, that.indTipoUsuario) &&
                Objects.equals(fecCrea, that.fecCrea) &&
                Objects.equals(userCrea, that.userCrea);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codTipoUsuario, desTipoUsuario, indTipoUsuario, fecCrea, userCrea);
    }
}
