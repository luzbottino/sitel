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
@Table(name = "BILHETE_V2")
public class BilheteV2 implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "COD_TIPO_REGISTRO", length = 1)
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
    @Column(name = "COD_CNL_RECURSO_REF", precision = 5)
    private Integer codCnlRecursoRef;
    @Column(name = "COD_DDD", length = 2)
    private String codDdd;
    @Column(name = "COD_TELEFONE", length = 10)
    private String codTelefone;
    @Column(name = "NOM_RECURSO", length = 15)
    private String nomRecurso;
    @Column(name = "COD_DEGRAU", length = 2)
    private String codDegrau;
    @Temporal(value = TemporalType.DATE)
    @Column(name = "DTA_LIGACAO")
    private Date dtaLigacao;
    @Column(name = "COD_CNL_DESTINO")
    private Integer codCnlDestino;
    @Column(name = "NOM_LOCALIDADE_DESTINO", length = 25)
    private String nomLocalidadeDestino;
    @Column(name = "COD_UF_DESTINO", length = 2)
    private String codUfDestino;
    @Column(name = "COD_INTERNACIONAL_NACIONAL", length = 2)
    private String codInternacionalNacional;
    @Column(name = "COD_OPERADORA", length = 2)
    private String codOperadora;
    @Column(name = "DES_OPERADORA", length = 20)
    private String descOperadora;
    @Column(name = "COD_PAIS_DESTINO", length = 3)
    private String codPaisDestino;
    @Column(name = "COD_AREA_DDD", length = 4)
    private String codAreaDdd;
    @Column(name = "COD_TELEFONE_DESTINO", length = 10)
    private String codTelefoneDestino;
    @Column(name = "COD_CONJUGADOR_NUM_ORIGEM", length = 2)
    private String codConjugadoNumOrigem;
    @Column(name = "NUM_DURACAO_LIGACAO", precision = 5, scale = 1)
    private BigDecimal numDuracaoLigacao;
    @Column(name = "NOM_CATEGORIA", length = 3)
    private String nomCategoria;
    @Column(name = "DES_CATEGORIA", length = 50)
    private String descCategoria;
    @Temporal(value = TemporalType.TIME)
    @Column(name = "HOR_LIGACAO")
    private Date horLigacao;
    @Column(name = "COD_TIPO_CHAMADA", length = 1)
    private String codTipoChamada;
    @Column(name = "COD_GRUPO_HORARIO_TARIFARIO", length = 1)
    private String codGrupoHorarioTarifario;
    @Column(name = "DES_GRUPO_HORARIO_TARIFARIO", length = 25)
    private String descGrupoHorarioTarifario;
    @Column(name = "COD_DEGRAU_LIGACAO")
    private Integer codDegrauLigacao;
    @Column(name = "COD_SINAL_VAL_LIGACAO")
    private char codSinalValLigacao;
    @Column(name = "VAL_ALIQUOTA_ICMS", precision = 5, scale = 2)
    private BigDecimal valAliquotaIcms;
    @Column(name = "VAL_LIGACAO_COM_IMPOSTO", precision = 11, scale = 2)
    private BigDecimal valLigacaoComImposto;
    @Column(name = "COD_CLASSE_SERVICO")
    private Integer codClasseServico;

    public BilheteV2() {
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

    public String getNomRecurso() {
        return nomRecurso;
    }

    public void setNomRecurso(String nomRecurso) {
        this.nomRecurso = nomRecurso;
    }

    public String getCodDegrau() {
        return codDegrau;
    }

    public void setCodDegrau(String codDegrau) {
        this.codDegrau = codDegrau;
    }

    public Date getDtaLigacao() {
        return dtaLigacao;
    }

    public void setDtaLigacao(Date dtaLigacao) {
        this.dtaLigacao = dtaLigacao;
    }

    public Integer getCodCnlDestino() {
        return codCnlDestino;
    }

    public void setCodCnlDestino(Integer codCnlDestino) {
        this.codCnlDestino = codCnlDestino;
    }

    public String getNomLocalidadeDestino() {
        return nomLocalidadeDestino;
    }

    public void setNomLocalidadeDestino(String nomLocalidadeDestino) {
        this.nomLocalidadeDestino = nomLocalidadeDestino;
    }

    public String getCodUfDestino() {
        return codUfDestino;
    }

    public void setCodUfDestino(String codUfDestino) {
        this.codUfDestino = codUfDestino;
    }

    public String getCodInternacionalNacional() {
        return codInternacionalNacional;
    }

    public void setCodInternacionalNacional(String codInternacionalNacional) {
        this.codInternacionalNacional = codInternacionalNacional;
    }

    public String getCodOperadora() {
        return codOperadora;
    }

    public void setCodOperadora(String codOperadora) {
        this.codOperadora = codOperadora;
    }

    public String getDescOperadora() {
        return descOperadora;
    }

    public void setDescOperadora(String descOperadora) {
        this.descOperadora = descOperadora;
    }

    public String getCodPaisDestino() {
        return codPaisDestino;
    }

    public void setCodPaisDestino(String codPaisDestino) {
        this.codPaisDestino = codPaisDestino;
    }

    public String getCodAreaDdd() {
        return codAreaDdd;
    }

    public void setCodAreaDdd(String codAreaDdd) {
        this.codAreaDdd = codAreaDdd;
    }

    public String getCodTelefoneDestino() {
        return codTelefoneDestino;
    }

    public void setCodTelefoneDestino(String codTelefoneDestino) {
        this.codTelefoneDestino = codTelefoneDestino;
    }

    public String getCodConjugadoNumOrigem() {
        return codConjugadoNumOrigem;
    }

    public void setCodConjugadoNumOrigem(String codConjugadoNumOrigem) {
        this.codConjugadoNumOrigem = codConjugadoNumOrigem;
    }

    public BigDecimal getNumDuracaoLigacao() {
        return numDuracaoLigacao;
    }

    public void setNumDuracaoLigacao(BigDecimal numDuracaoLigacao) {
        this.numDuracaoLigacao = numDuracaoLigacao;
    }

    public String getNomCategoria() {
        return nomCategoria;
    }

    public void setNomCategoria(String nomCategoria) {
        this.nomCategoria = nomCategoria;
    }

    public String getDescCategoria() {
        return descCategoria;
    }

    public void setDescCategoria(String descCategoria) {
        this.descCategoria = descCategoria;
    }

    public Date getHorLigacao() {
        return horLigacao;
    }

    public void setHorLigacao(Date horLigacao) {
        this.horLigacao = horLigacao;
    }

    public String getCodTipoChamada() {
        return codTipoChamada;
    }

    public void setCodTipoChamada(String codTipoChamada) {
        this.codTipoChamada = codTipoChamada;
    }

    public String getCodGrupoHorarioTarifario() {
        return codGrupoHorarioTarifario;
    }

    public void setCodGrupoHorarioTarifario(String codGrupoHorarioTarifario) {
        this.codGrupoHorarioTarifario = codGrupoHorarioTarifario;
    }

    public String getDescGrupoHorarioTarifario() {
        return descGrupoHorarioTarifario;
    }

    public void setDescGrupoHorarioTarifario(String descGrupoHorarioTarifario) {
        this.descGrupoHorarioTarifario = descGrupoHorarioTarifario;
    }

    public Integer getCodDegrauLigacao() {
        return codDegrauLigacao;
    }

    public void setCodDegrauLigacao(Integer codDegrauLigacao) {
        this.codDegrauLigacao = codDegrauLigacao;
    }

    public char getCodSinalValLigacao() {
        return codSinalValLigacao;
    }

    public void setCodSinalValLigacao(char codSinalValLigacao) {
        this.codSinalValLigacao = codSinalValLigacao;
    }

    public BigDecimal getValAliquotaIcms() {
        return valAliquotaIcms;
    }

    public void setValAliquotaIcms(BigDecimal valAliquotaIcms) {
        this.valAliquotaIcms = valAliquotaIcms;
    }

    public BigDecimal getValLigacaoComImposto() {
        return valLigacaoComImposto;
    }

    public void setValLigacaoComImposto(BigDecimal valLigacaoComImposto) {
        this.valLigacaoComImposto = valLigacaoComImposto;
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
        hash = 53 * hash + Objects.hashCode(this.id);
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
        final BilheteV2 other = (BilheteV2) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BilheteV2{" + "codTipoRegistro=" + codTipoRegistro + ", codControleGravacao=" + codControleGravacao + ", dtaVencimento=" + dtaVencimento + ", dtaEmissao=" + dtaEmissao + ", codIdentUnicoRecurso=" + codIdentUnicoRecurso + ", codCnlRecursoRef=" + codCnlRecursoRef + ", codDdd=" + codDdd + ", codTelefone=" + codTelefone + ", nomRecurso=" + nomRecurso + ", codDegrau=" + codDegrau + ", dtaLigacao=" + dtaLigacao + ", codCnlDestino=" + codCnlDestino + ", nomLocalidadeDestino=" + nomLocalidadeDestino + ", codUfDestino=" + codUfDestino + ", codInternacionalNacional=" + codInternacionalNacional + ", codOperadora=" + codOperadora + ", descOperadora=" + descOperadora + ", codPaisDestino=" + codPaisDestino + ", codAreaDdd=" + codAreaDdd + ", codTelefoneDestino=" + codTelefoneDestino + ", codConjugadoNumOrigem=" + codConjugadoNumOrigem + ", numDuracaoLigacao=" + numDuracaoLigacao + ", nomCategoria=" + nomCategoria + ", descCategoria=" + descCategoria + ", horLigacao=" + horLigacao + ", codTipoChamada=" + codTipoChamada + ", codGrupoHorarioTarifario=" + codGrupoHorarioTarifario + ", descGrupoHorarioTarifario=" + descGrupoHorarioTarifario + ", codDegrauLigacao=" + codDegrauLigacao + ", codSinalValLigacao=" + codSinalValLigacao + ", valAliquotaIcms=" + valAliquotaIcms + ", valLigacaoComImposto=" + valLigacaoComImposto + ", codClasseServico=" + codClasseServico + '}';
    }

}
