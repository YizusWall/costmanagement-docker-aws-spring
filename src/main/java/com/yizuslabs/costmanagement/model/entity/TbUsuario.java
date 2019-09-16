package com.yizuslabs.costmanagement.model.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "tbusuario", schema = "costmanager")
public class TbUsuario {
    private String codUsuario;
    private String nomUsuario;
    private String indUsuario;
    private String codEmpleado;
    private String pwdUsuario;
    private Timestamp fecCrea;
    private String userCrea;


    @Id
    @Column(name = "codusuario")
    public String getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(String codUsuario) {
        this.codUsuario = codUsuario;
    }

    @Basic
    @Column(name = "nomusuario")
    public String getNomUsuario() {
        return nomUsuario;
    }

    public void setNomUsuario(String nomUsuario) {
        this.nomUsuario = nomUsuario;
    }

    @Basic
    @Column(name = "indUsuario")
    public String getIndUsuario() {
        return indUsuario;
    }

    public void setIndUsuario(String indUsuario) {
        this.indUsuario = indUsuario;
    }

    @Basic
    @Column(name = "codempleado")
    public String getCodEmpleado() {
        return codEmpleado;
    }

    public void setCodEmpleado(String codEmpleado) {
        this.codEmpleado = codEmpleado;
    }

    @Basic
    @Column(name = "pwdusuario")
    public String getPwdUsuario() {
        return pwdUsuario;
    }

    public void setPwdUsuario(String pwdUsuario) {
        this.pwdUsuario = pwdUsuario;
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
        TbUsuario that = (TbUsuario) o;
        return Objects.equals(codUsuario, that.codUsuario) &&
                Objects.equals(nomUsuario, that.nomUsuario) &&
                Objects.equals(indUsuario, that.indUsuario) &&
                Objects.equals(codEmpleado, that.codEmpleado) &&
                Objects.equals(pwdUsuario, that.pwdUsuario) &&
                Objects.equals(fecCrea, that.fecCrea) &&
                Objects.equals(userCrea, that.userCrea);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codUsuario, nomUsuario, indUsuario, codEmpleado, pwdUsuario, fecCrea, userCrea);
    }
}
