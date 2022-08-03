package com.elevenst.domain;

import java.util.List;
public class DataObjJTFSFCK1 {

    private String date_run;
    private String time_run;
    private String id_system;
    private String id_cu;
    private String ID_PTY;
    private String ID_TERM;
    private String ID_TRAN;
    private String DATA_DCS;
    private String IP;
    private String ID_VERSION;

    public void setDataObj(List<String> ListStr)
    {
        this.date_run   = ListStr.get(0);
        this.time_run   = ListStr.get(1);
        this.id_system  = ListStr.get(2);
        this.id_cu      = ListStr.get(3);
        this.ID_PTY     = ListStr.get(4);
        this.ID_TERM    = ListStr.get(5);
        this.ID_TRAN    = ListStr.get(6);
        this.DATA_DCS   = ListStr.get(7);
        this.IP         = ListStr.get(8);
        this.ID_VERSION = ListStr.get(9);
    }

    public void setDateRun(String dateRun){
        this.date_run = dateRun;
    }

    public void setTimeRun(String timeRun){
        this.time_run = timeRun;
    }

    public void setIdSystem(String idSystem){
        this.id_system = idSystem;
    }

    public void setIdCu(String idCu){
        this.id_cu = idCu;
    }

    public void setIdPty(String idPty){
        this.ID_PTY = idPty;
    }

    public void setIdTerm(String idTerm){
        this.ID_TERM = idTerm;
    }

    public void setIdTran(String idTran){
        this.ID_TRAN = idTran;
    }

    public void setDataDcs(String dataDcs) {
        this.DATA_DCS = dataDcs;
    }

    public void setIp(String ip) {
        this.IP = ip;
    }

    public void setIdVersion(String idVersion) {
        this.ID_VERSION = idVersion;
    }
}