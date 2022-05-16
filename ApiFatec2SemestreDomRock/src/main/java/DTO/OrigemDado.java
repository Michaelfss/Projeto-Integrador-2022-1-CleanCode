package DTO;

public class OrigemDado {
    
    private String api;
    private String sftp;
    private String upload;
    private String formato;
    private String volumeDados;
    private String frequenciaDados;
    private String sistemas;


    public OrigemDado(String api, String sftp, String upload, String formato, String volumeDados,
            String frequenciaDados, String sistemas) {
        this.api = api;
        this.sftp = sftp;
        this.upload = upload;
        this.formato = formato;
        this.volumeDados = volumeDados;
        this.frequenciaDados = frequenciaDados;
        this.sistemas = sistemas;
    }


    public String getApi() {
        return api;
    }
    public void setApi(String api) {
        this.api = api;
    }

    public String getSftp() {
        return sftp;
    }
    public void setSftp(String sftp) {
        this.sftp = sftp;
    }

    public String getUpload() {
        return upload;
    }
    public void setUpload(String upload) {
        this.upload = upload;
    }

    public String getFormato() {
        return formato;
    }
    public void setFormato(String formato) {
        this.formato = formato;
    }

    public String getVolumeDados() {
        return volumeDados;
    }
    public void setVolumeDados(String volumeDados) {
        this.volumeDados = volumeDados;
    }

    public String getFrequenciaDados() {
        return frequenciaDados;
    }
    public void setFrequenciaDados(String frequenciaDados) {
        this.frequenciaDados = frequenciaDados;
    }

    public String getSistemas() {
        return sistemas;
    }
    public void setSistemas(String sistemas) {
        this.sistemas = sistemas;
    }
}