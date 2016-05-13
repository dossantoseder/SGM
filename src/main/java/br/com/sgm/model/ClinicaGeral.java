
package br.com.sgm.model;

import java.util.ArrayList;


public class ClinicaGeral extends Especialidade {
    private String descricaoSintomas;
    private ExameFisico exameFisico;
    private ArrayList listaProcedimentos = new ArrayList<Procedimento>();

    public String getDescricaoSintomas() {
        return descricaoSintomas;
    }

    public void setDescricaoSintomas(String descricaoSintomas) {
        this.descricaoSintomas = descricaoSintomas;
    }

    public ExameFisico getExameFisico() {
        return exameFisico;
    }

    public void setExameFisico(ExameFisico exameFisico) {
        this.exameFisico = exameFisico;
    }

    public ArrayList getListaProcedimentos() {
        return listaProcedimentos;
    }

    public void setListaProcedimentos(ArrayList listaProcedimentos) {
        this.listaProcedimentos = listaProcedimentos;
    }
    
    public int coletarQueixasPaciente() throws Exception {

        return 1;
    }
    
    
}
