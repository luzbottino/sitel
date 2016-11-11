/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lbottino.sitel.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;

/**
 *
 * @author pig
 */
public class BilheteV2 {

    @Column(name = "DTA_LIGACAO")
    private Date dtaLigacao;

    @Column(name = "COD_CNL_DESTINO")
    private Integer codCnlDestino;

    @Column(name = "NOM_LOCALIDADE_DESTINO")
    private String nomLocalidadeDestino;

    @Column(name = "COD_UF_DESTINO")
    private String codUfDestino;

    @Column(name = "COD_INTERNACIONAL_NACIONAL")
    private String codInternacionalNacional;

    @Column(name = "COD_OPERADORA")
    private String codOperadora;

    @Column(name = "DES_OPERADORA")
    private String descOperadora;

    @Column(name = "COD_PAIS_DESTINO")
    private String codPaisDestino;

    @Column(name = "COD_AREA_DDD")
    private String codAreaDdd;

    @Column(name = "COD_CONJUGADOR_NUM_ORIGEM")
    private String codConjugadoNumOrigem;

    @Column(name = "NUM_DURACAO_LIGACAO")
    private Date numDuracaoLigacao;

    @Column(name = "NOM_CATEGORIA")
    private String nomCategoria;

    @Column(name = "DES_CATEGORIA")
    private String descCategoria;

    @Column(name = "HOR_LIGACAO")
    private String horLigacao;

    @Column(name = "COD_TIPO_CHAMADA")
    private String codTipoChamada;

    @Column(name = "COD_GRUPO_HORARIO_TARIFARIO")
    private String codGrupoHorarioTarifario;

    @Column(name = "DES_GRUPO_HORARIO_TARIFARIO")
    private String descGrupoHorarioTarifario;

    @Column(name = "COD_DEGRAU_LIGACAO")
    private Integer codDegrauLigacao;

    @Column(name = "COD_SINAL_VAL_LIGACAO")
    private char codSinalValLigacao;

    @Column(name = "VAL_ALIQUOTA_ICMS")
    private BigDecimal valAliquotaIcms;

    @Column(name = "VAL_LIGACAO_COM_IMPOSTO")
    private BigDecimal valLigacaoComImposto;

    @Column(name = "COD_CLASSE_SERVICO")
    private Integer codClasseServico;
}
