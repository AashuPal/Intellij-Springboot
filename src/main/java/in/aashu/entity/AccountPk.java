package in.aashu.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import java.io.Serializable;

@Embeddable
public class AccountPk implements Serializable {

    @Column(name="Account_Id")
    private Integer accId;
    @Column(name="Account_Type")
    private String accType;

    @Column(name="Account_Number")
    private Long accNum;

    @Override
    public String toString() {
        return "AccountPk{" +
                "accId=" + accId +
                ", accType='" + accType + '\'' +
                ", accNum=" + accNum +
                '}';
    }
    public AccountPk() {
    }

    public AccountPk(Integer accId, String accType, Long accNum) {
        this.accId = accId;
        this.accType = accType;
        this.accNum = accNum;
    }

    public Integer getAccId() {
        return accId;
    }

    public void setAccId(Integer accId) {
        this.accId = accId;
    }

    public String getAccType() {
        return accType;
    }

    public void setAccType(String accType) {
        this.accType = accType;
    }

    public Long getAccNum() {
        return accNum;
    }

    public void setAccNum(Long accNum) {
        this.accNum = accNum;
    }
}
