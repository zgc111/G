package xin.cymall.entity;

import java.util.Date;

public class DwUser {

    private Long id;
    private String userLx;
    private Long dbPointCode;
    private String dwzh;
    private String dwmc;
    private String TYXYDM;
    private String userName;
    private String password;
    private Long userRole;
    private String dwjbr;
    private String dwJbrsj;
    private Short isno;
    private String salt;
    private Date qyrq;
    private String ywwd;

    public String getDwJbrsj() {
        return dwJbrsj;
    }

    public void setDwJbrsj(String dwJbrsj) {
        this.dwJbrsj = dwJbrsj;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserLx() {
        return userLx;
    }

    public void setUserLx(String userLx) {
        this.userLx = userLx;
    }

    public Long getDbPointCode() {
        return dbPointCode;
    }

    public void setDbPointCode(Long dbPointCode) {
        this.dbPointCode = dbPointCode;
    }

    public String getDwzh() {
        return dwzh;
    }

    public void setDwzh(String dwzh) {
        this.dwzh = dwzh;
    }

    public String getDwmc() {
        return dwmc;
    }

    public void setDwmc(String dwmc) {
        this.dwmc = dwmc;
    }

    public String getTYXYDM() {
        return TYXYDM;
    }

    public void setTYXYDM(String TYXYDM) {
        this.TYXYDM = TYXYDM;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getUserRole() {
        return userRole;
    }

    public void setUserRole(Long userRole) {
        this.userRole = userRole;
    }

    public String getDwjbr() {
        return dwjbr;
    }

    public void setDwjbr(String dwjbr) {
        this.dwjbr = dwjbr;
    }

    public Short getIsno() {
        return isno;
    }

    public void setIsno(Short isno) {
        this.isno = isno;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public Date getQyrq() {
        return qyrq;
    }

    public void setQyrq(Date qyrq) {
        this.qyrq = qyrq;
    }

    public String getYwwd() {
        return ywwd;
    }

    public void setYwwd(String ywwd) {
        this.ywwd = ywwd;
    }

    @Override
    public String toString() {
        return "DwUser{" +
                "id=" + id +
                ", userLx='" + userLx + '\'' +
                ", dbPointCode=" + dbPointCode +
                ", dwzh='" + dwzh + '\'' +
                ", dwmc='" + dwmc + '\'' +
                ", TYXYDM='" + TYXYDM + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", userRole=" + userRole +
                ", dwjbr='" + dwjbr + '\'' +
                ", dwJbrsj='" + dwJbrsj + '\'' +
                ", isno=" + isno +
                ", salt='" + salt + '\'' +
                ", qyrq=" + qyrq +
                ", ywwd='" + ywwd + '\'' +
                '}';
    }
}
