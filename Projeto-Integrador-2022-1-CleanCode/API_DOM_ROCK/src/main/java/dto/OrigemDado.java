package dto;

public class OrigemDado {
    
    private String api;
    private String sftp;
    private String upload;
    private String formato;


    public OrigemDado(String api, String sftp, String upload, String formato) {
        this.api = api;
        this.sftp = sftp;
        this.upload = upload;
        this.formato = formato;
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
}
