/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lbottino.sitel.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author pig
 */
@Entity
@Table(name = "HEADER_V2")
public class HeaderV2 implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "COD_TIP_REG", length = 1)
    private String codTipoRegistro;
    @Column(name = "COD_CONTROLE_GRAVACAO", length = 12)
    private String codControleGravacao;
    @Temporal(value = TemporalType.DATE)
    @Column(name = "DTA_GERACAO_ARQ")
    private Date dtaGeracaoArq;
    @Column(name = "NOM_OPERADORA", length = 15)
    private String nomOperadora;
    @Column(name = "NOM_UF", length = 2)
    private String nomUf;
    @Column(name = "COD_CLIENTE", length = 15)
    private String codCliente;
    @Column(name = "NOM_CLIENTE", length = 40)
    private String nomCliente;
    @Column(name = "COD_CGC_CLIENTE", length = 15)
    private String codCgcCliente;
    @Column(name = "COD_IDENT_CONTA_UNICA", length = 15)
    private String codIdentContaUnica;
    @Temporal(value = TemporalType.DATE)
    @Column(name = "MES_ANO_REF")
    private Date mesAnoRef;
    @Temporal(value = TemporalType.DATE)
    @Column(name = "DTA_VENCIMENTO")
    private Date dtaVencimento;
    @Temporal(value = TemporalType.DATE)
    @Column(name = "DTA_EMISSAO")
    private Date dtaEmissao;

    public HeaderV2() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodTipoRegistro() {
        return codTipoRegistro;
    }

    public void setCodTipoRegistro(String codTipoRegistro) {
        this.codTipoRegistro = codTipoRegistro;
    }

    public String getCodControleGravacao() {
        return codControleGravacao;
    }

    public void setCodControleGravacao(String codControleGravacao) {
        this.codControleGravacao = codControleGravacao;
    }

    public Date getDtaGeracaoArq() {
        return dtaGeracaoArq;
    }

    public void setDtaGeracaoArq(Date dtaGeracaoArq) {
        this.dtaGeracaoArq = dtaGeracaoArq;
    }

    public String getNomOperadora() {
        return nomOperadora;
    }

    public void setNomOperadora(String nomOperadora) {
        this.nomOperadora = nomOperadora;
    }

    public String getNomUf() {
        return nomUf;
    }

    public void setNomUf(String nomUf) {
        this.nomUf = nomUf;
    }

    public String getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(String codCliente) {
        this.codCliente = codCliente;
    }

    public String getNomCliente() {
        return nomCliente;
    }

    public void setNomCliente(String nomCliente) {
        this.nomCliente = nomCliente;
    }

    public String getCodCgcCliente() {
        return codCgcCliente;
    }

    public void setCodCgcCliente(String codCgcCliente) {
        this.codCgcCliente = codCgcCliente;
    }

    public String getCodIdentContaUnica() {
        return codIdentContaUnica;
    }

    public void setCodIdentContaUnica(String codIdentContaUnica) {
        this.codIdentContaUnica = codIdentContaUnica;
    }

    public Date getMesAnoRef() {
        return mesAnoRef;
    }

    public void setMesAnoRef(Date mesAnoRef) {
        this.mesAnoRef = mesAnoRef;
    }

    public Date getDtaVencimento() {
        return dtaVencimento;
    }

    public void setDtaVencimento(Date dtaVencimento) {
        this.dtaVencimento = dtaVencimento;
    }

    public Date getDtaEmissao() {
        return dtaEmissao;
    }

    public void setDtaEmissao(Date dtaEmissao) {
        this.dtaEmissao = dtaEmissao;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final HeaderV2 other = (HeaderV2) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "HeaderV2{" + "codTipoRegistro=" + codTipoRegistro + ", codControleGravacao=" + codControleGravacao + ", dtaGeracaoArq=" + dtaGeracaoArq + ", nomOperadora=" + nomOperadora + ", nomUf=" + nomUf + ", codCliente=" + codCliente + ", nomCliente=" + nomCliente + ", codCgcCliente=" + codCgcCliente + ", codIdentContaUnica=" + codIdentContaUnica + ", mesAnoRef=" + mesAnoRef + ", dtaVencimento=" + dtaVencimento + ", dtaEmissao=" + dtaEmissao + '}';
    }

    
}
