package xin.cymall.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;


/**
 *
 */
public class GJc implements Serializable {
    private static final long serialVersionUID = 1L;

    /****/
    private String id;
    /**
     * 业务流水号
     **/
    private String ywlsh;
    /**
     * 汇缴的状态
     **/
    private String status;
    /**
     * 汇缴的单位账号
     **/
    private String dwzh;
    /**
     * 单位的汇缴额
     **/
    private String money;
    /**
     * 单位缴存的月份
     **/

    private String jcdate;
    /**
     * 单位缴存人数
     **/
    private String jcrs;

    /**
     * 设置：
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取：
     */
    public String getId() {
        return id;
    }

    /**
     * 设置：业务流水号
     */
    public void setYwlsh(String ywlsh) {
        this.ywlsh = ywlsh;
    }

    /**
     * 获取：业务流水号
     */
    public String getYwlsh() {
        return ywlsh;
    }

    /**
     * 设置：汇缴的状态
     */
    public void setStatus(String status) {

        this.status = status;
    }

    /**
     * 获取：汇缴的状态
     */
    public String getStatus() {

        return status;
    }

    /**
     * 设置：汇缴的单位账号
     */
    public void setDwzh(String dwzh) {
        this.dwzh = dwzh;
    }

    /**
     * 获取：汇缴的单位账号
     */
    public String getDwzh() {
        return dwzh;
    }

    /**
     * 设置：单位的汇缴额
     */
    public void setMoney(String money) {
        this.money = money;
    }

    /**
     * 获取：单位的汇缴额
     */
    public String getMoney() {
        return money;
    }

    public String getJcdate() {
        return jcdate;
    }

    public void setJcdate(String jcdate) {
        this.jcdate = jcdate;
    }

    /**
     * 设置：单位缴存人数
     */
    public void setJcrs(String jcrs) {
        this.jcrs = jcrs;
    }

    /**
     * 获取：单位缴存人数
     */
    public String getJcrs() {
        return jcrs;
    }
}
