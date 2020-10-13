package com.sairam.pojo;


import javax.persistence.*;
@Entity
@Table(name="account")
public class Account {

    @Id
    @Column(name="ACCNO", length=10)
    private String accNo;
    @Column(name="ACCNAME", length=10)
    private String accName;
    @Column(name="ACCTYPE", length=10)
    private String accType;

    public String getAccNo() {
        return accNo;
    }

    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }

    public String getAccName() {
        return accName;
    }

    public void setAccName(String accName) {
        this.accName = accName;
    }

    public String getAccType() {
        return accType;
    }

    public void setAccType(String accType) {
        this.accType = accType;
    }
}
