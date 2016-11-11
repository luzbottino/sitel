/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lbottino.sitel.model;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author pig
 */
@Entity
@Table(name = "ENDERECO_V2")
public class EnderecoV2 implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "COD_TIPO_REGISTRO", length = 1)
    private String codTipoRegistro;
    @Column(name = "COD_CONTROLE_GRAVACAO", length = 12)
    private String codControleGravacao;
    @Column(name = "COD_IDENT_UNICAO_RECURSO", length = 25)
    private String codIdentUnicoRecurso;
    @Column(name = "COD_DDD", length = 2)
    private String codDdd;
    @Column(name = "COD_TELEFONE", length = 10)
    private String codTelefone;
    @Column(name = "NOM_RECURSO", length = 15)
    private String nomRecurso;
    @Column(name = "COD_CNL_ENDERECO_A", length = 5)
    private String codCnlEnderecoA;
    @Column(name = "NOM_LOCALIDADE_A", length = 20)
    private String nomLocalidadeA;
    @Column(name = "DES_ENDERECO_A", length = 30)
    private String descEnderecoA;
    @Column(name = "NUM_ENDERECO_A", length = 5)
    private String numEnderecoA;
    @Column(name = "DES_COMPLEMENTO_A", length = 10)
    private String descComplementoA;
    @Column(name = "DES_BAIRRO_A", length = 20)
    private String descBairroA;
    @Column(name = "COD_CNL_ENDERECO_B", length = 5)
    private String codCnlEnderecoB;
    @Column(name = "NOM_LOCALIDADE_B", length = 20)
    private String nomLocalidadeB;
    @Column(name = "DES_ENDERECO_B", length = 30)
    private String descEnderecoB;
    @Column(name = "NUM_ENDERECO_B", length = 5)
    private String numEnderecoB;
    @Column(name = "DES_COMPLEMENTO_B", length = 10)
    private String descComplementoB;
    @Column(name = "DES_BAIRRO_B", length = 20)
    private String descBairroB;

    public EnderecoV2() {
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

    public String getCodIdentUnicoRecurso() {
        return codIdentUnicoRecurso;
    }

    public void setCodIdentUnicoRecurso(String codIdentUnicoRecurso) {
        this.codIdentUnicoRecurso = codIdentUnicoRecurso;
    }

    public String getCodDdd() {
        return codDdd;
    }

    public void setCodDdd(String codDdd) {
        this.codDdd = codDdd;
    }

    public String getCodTelefone() {
        return codTelefone;
    }

    public void setCodTelefone(String codTelefone) {
        this.codTelefone = codTelefone;
    }

    public String getNomRecurso() {
        return nomRecurso;
    }

    public void setNomRecurso(String nomRecurso) {
        this.nomRecurso = nomRecurso;
    }

    public String getCodCnlEnderecoA() {
        return codCnlEnderecoA;
    }

    public void setCodCnlEnderecoA(String codCnlEnderecoA) {
        this.codCnlEnderecoA = codCnlEnderecoA;
    }

    public String getNomLocalidadeA() {
        return nomLocalidadeA;
    }

    public void setNomLocalidadeA(String nomLocalidadeA) {
        this.nomLocalidadeA = nomLocalidadeA;
    }

    public String getDescEnderecoA() {
        return descEnderecoA;
    }

    public void setDescEnderecoA(String descEnderecoA) {
        this.descEnderecoA = descEnderecoA;
    }

    public String getNumEnderecoA() {
        return numEnderecoA;
    }

    public void setNumEnderecoA(String numEnderecoA) {
        this.numEnderecoA = numEnderecoA;
    }

    public String getDescComplementoA() {
        return descComplementoA;
    }

    public void setDescComplementoA(String descComplementoA) {
        this.descComplementoA = descComplementoA;
    }

    public String getDescBairroA() {
        return descBairroA;
    }

    public void setDescBairroA(String descBairroA) {
        this.descBairroA = descBairroA;
    }

    public String getCodCnlEnderecoB() {
        return codCnlEnderecoB;
    }

    public void setCodCnlEnderecoB(String codCnlEnderecoB) {
        this.codCnlEnderecoB = codCnlEnderecoB;
    }

    public String getNomLocalidadeB() {
        return nomLocalidadeB;
    }

    public void setNomLocalidadeB(String nomLocalidadeB) {
        this.nomLocalidadeB = nomLocalidadeB;
    }

    public String getDescEnderecoB() {
        return descEnderecoB;
    }

    public void setDescEnderecoB(String descEnderecoB) {
        this.descEnderecoB = descEnderecoB;
    }

    public String getNumEnderecoB() {
        return numEnderecoB;
    }

    public void setNumEnderecoB(String numEnderecoB) {
        this.numEnderecoB = numEnderecoB;
    }

    public String getDescComplementoB() {
        return descComplementoB;
    }

    public void setDescComplementoB(String descComplementoB) {
        this.descComplementoB = descComplementoB;
    }

    public String getDescBairroB() {
        return descBairroB;
    }

    public void setDescBairroB(String descBairroB) {
        this.descBairroB = descBairroB;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.id);
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
        final EnderecoV2 other = (EnderecoV2) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "EnderecoV2{" + "id=" + id + ", codTipoRegistro=" + codTipoRegistro + ", codControleGravacao=" + codControleGravacao + ", codIdentUnicoRecurso=" + codIdentUnicoRecurso + ", codDdd=" + codDdd + ", codTelefone=" + codTelefone + ", nomRecurso=" + nomRecurso + ", codCnlEnderecoA=" + codCnlEnderecoA + ", nomLocalidadeA=" + nomLocalidadeA + ", descEnderecoA=" + descEnderecoA + ", numEnderecoA=" + numEnderecoA + ", descComplementoA=" + descComplementoA + ", descBairroA=" + descBairroA + ", codCnlEnderecoB=" + codCnlEnderecoB + ", nomLocalidadeB=" + nomLocalidadeB + ", descEnderecoB=" + descEnderecoB + ", numEnderecoB=" + numEnderecoB + ", descComplementoB=" + descComplementoB + ", descBairroB=" + descBairroB + '}';
    }

}
