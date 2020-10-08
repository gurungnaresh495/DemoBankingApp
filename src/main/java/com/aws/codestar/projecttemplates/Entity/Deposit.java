package com.aws.codestar.projecttemplates.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Deposit")
public class Deposit {

    private int depositNo;
    private float depositAmount;
    private int accountNo;

    @Id
    @Column(name = "depositNo", nullable = false)
    public int getDepositNo() {
        return depositNo;
    }

    public void setDepositNo(int depositNo) {
        this.depositNo = depositNo;
    }

    @Column(name = "depositAmount", nullable = false)
    public float getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(float depositAmount) {
        this.depositAmount = depositAmount;
    }

    @Column(name = "accountNo", nullable = false)
    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }


}
