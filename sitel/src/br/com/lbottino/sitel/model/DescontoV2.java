/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lbottino.sitel.model;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "DESCONTO_V2")
public class DescontoV2 implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "COD_TIP_REG", length = 1)
    private String codTipoRegistro;
    @Column(name = "COD_CONTROLE_GRAVACAO", length = 12)
    private String codControleGravacao;
    @Temporal(value = TemporalType.DATE)
    @Column(name = "DTA_VENCIMENTO")
    private Date dtaVencimento;
    @Temporal(value = TemporalType.DATE)
    @Column(name = "DTA_EMISSAO")
    private Date dtaEmissao;
    @Column(name = "COD_IDENT_UNICO_RECURSO", length = 25)
    private String codIdentUnicoRecurso;
    @Column(name = "COD_IDENT_CONTA_UNICA", length = 15)
    private String codIdentContaUnica;
    @Column(name = "COD_CNL_RECURSO_REF", precision = 5)
    private Integer codCnlRecursoRef;
    @Column(name = "COD_DDD", length = 2)
    private String codDdd;
    @Column(name = "COD_TELEFONE", length = 10)
    private String codTelefone;
    @Column(name = "NOM_GRUPO_CATEGORIA", length = 3)
    private String nomGrupoCategoria;
    @Column(name = "DESC_GRUPO_CATEGORIA", length = 30)
    private String descGrupoCategoria;
    @Column(name = "COD_SINAL_VAL_LIGACAO")
    private char codSinalValLigacao;
    @Column(name = "VAL_BASE_CALC_DESCONTO", precision = 11, scale = 2)
    private BigDecimal valBaseCalcDesconto;
    @Column(name = "PCT_DESCONTO", precision = 3, scale = 2)
    private BigDecimal pctDesconto;
    @Column(name = "VAL_LIGACAO", precision = 11, scale = 2)
    private BigDecimal valLigacao;
    @Temporal(value = TemporalType.DATE)
    @Column(name = "DTA_INICIO_ACERTO")
    private Date dtaInicioAcerto;
    @Temporal(value = TemporalType.TIME)
    @Column(name = "HOR_INICIO_ACERTO")
    private Date horInicioAcerto;
    @Temporal(value = TemporalType.DATE)
    @Column(name = "DTA_FIM_ACERTO")
    private Date dtaFimAcerto;
    @Temporal(value = TemporalType.TIME)
    @Column(name = "HOR_FIM_ACERTO")
    private Date horFimAcerto;
    @Column(name = "COD_CLASSE_SERVICO")
    private Integer codClasseServico;

    public DescontoV2() {
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

    public String getCodIdentUnicoRecurso() {
        return codIdentUnicoRecurso;
    }

    public void setCodIdentUnicoRecurso(String codIdentUnicoRecurso) {
        this.codIdentUnicoRecurso = codIdentUnicoRecurso;
    }

    public String getCodIdentContaUnica() {
        return codIdentContaUnica;
    }

    public void setCodIdentContaUnica(String codIdentContaUnica) {
        this.codIdentContaUnica = codIdentContaUnica;
    }

    public Integer getCodCnlRecursoRef() {
        return codCnlRecursoRef;
    }

    public void setCodCnlRecursoRef(Integer codCnlRecursoRef) {
        this.codCnlRecursoRef = codCnlRecursoRef;
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

    public String getNomGrupoCategoria() {
        return nomGrupoCategoria;
    }

    public void setNomGrupoCategoria(String nomGrupoCategoria) {
        this.nomGrupoCategoria = nomGrupoCategoria;
    }

    public String getDescGrupoCategoria() {
        return descGrupoCategoria;
    }

    public void setDescGrupoCategoria(String descGrupoCategoria) {
        this.descGrupoCategoria = descGrupoCategoria;
    }

    public char getCodSinalValLigacao() {
        return codSinalValLigacao;
    }

    public void setCodSinalValLigacao(char codSinalValLigacao) {
        this.codSinalValLigacao = codSinalValLigacao;
    }

    public BigDecimal getValBaseCalcDesconto() {
        return valBaseCalcDesconto;
    }

    public void setValBaseCalcDesconto(BigDecimal valBaseCalcDesconto) {
        this.valBaseCalcDesconto = valBaseCalcDesconto;
    }

    public BigDecimal getPctDesconto() {
        return pctDesconto;
    }

    public void setPctDesconto(BigDecimal pctDesconto) {
        this.pctDesconto = pctDesconto;
    }

    public BigDecimal getValLigacao() {
        return valLigacao;
    }

    public void setValLigacao(BigDecimal valLigacao) {
        this.valLigacao = valLigacao;
    }

    public Date getDtaInicioAcerto() {
        return dtaInicioAcerto;
    }

    public void setDtaInicioAcerto(Date dtaInicioAcerto) {
        this.dtaInicioAcerto = dtaInicioAcerto;
    }

    public Date getHorInicioAcerto() {
        return horInicioAcerto;
    }

    public void setHorInicioAcerto(Date horInicioAcerto) {
        this.horInicioAcerto = horInicioAcerto;
    }

    public Date getDtaFimAcerto() {
        return dtaFimAcerto;
    }

    public void setDtaFimAcerto(Date dtaFimAcerto) {
        this.dtaFimAcerto = dtaFimAcerto;
    }

    public Date getHorFimAcerto() {
        return horFimAcerto;
    }

    public void setHorFimAcerto(Date horFimAcerto) {
        this.horFimAcerto = horFimAcerto;
    }

    public Integer getCodClasseServico() {
        return codClasseServico;
    }

    public void setCodClasseServico(Integer codClasseServico) {
        this.codClasseServico = codClasseServico;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.id);
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
        final DescontoV2 other = (DescontoV2) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DescontoV2{" + "codTipoRegistro=" + codTipoRegistro + ", codControleGravacao=" + codControleGravacao + ", dtaVencimento=" + dtaVencimento + ", dtaEmissao=" + dtaEmissao + ", codIdentUnicoRecurso=" + codIdentUnicoRecurso + ", codIdentContaUnica=" + codIdentContaUnica + ", codCnlRecursoRef=" + codCnlRecursoRef + ", codDdd=" + codDdd + ", codTelefone=" + codTelefone + ", nomGrupoCategoria=" + nomGrupoCategoria + ", descGrupoCategoria=" + descGrupoCategoria + ", codSinalValLigacao=" + codSinalValLigacao + ", valBaseCalcDesconto=" + valBaseCalcDesconto + ", pctDesconto=" + pctDesconto + ", valLigacao=" + valLigacao + ", dtaInicioAcerto=" + dtaInicioAcerto + ", horInicioAcerto=" + horInicioAcerto + ", dtaFimAcerto=" + dtaFimAcerto + ", horFimAcerto=" + horFimAcerto + ", codClasseServico=" + codClasseServico + '}';
    }

}
