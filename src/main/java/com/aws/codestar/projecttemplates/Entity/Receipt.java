package com.aws.codestar.projecttemplates.Entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Receipt")
public class Receipt implements Serializable
{
    private int receiptNo;

    public Receipt ()
    {

    }
    public Receipt( String receiptType, float previousAmt, float afterAmount, float amount, int accountNo) {
        this.receiptType = receiptType;
        this.previousAmt = previousAmt;
        this.afterAmount = afterAmount;
        this.amount = amount;
        this.accountNo =accountNo;
    }

    private String receiptType;
    private float previousAmt;
    private float afterAmount;
    private float amount;
    private int accountNo;
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "receiptno", nullable = false)
    public int getReceiptNo() {
        return receiptNo;
    }

    public void setReceiptNo(int receiptNo) {
        this.receiptNo = receiptNo;
    }
    @Column(name = "receipttype", nullable = false)
    public String getReceiptType() {
        return receiptType;
    }

    public void setReceiptType(String receiptType) {
        this.receiptType = receiptType;
    }

    @Column(name = "previousamount", nullable = false)
    public float getPreviousAmt() {
        return previousAmt;
    }

    public void setPreviousAmt(float previousAmt) {
        this.previousAmt = previousAmt;
    }

    @Column(name = "afteramount", nullable = false)
    public float getAfterAmount() {
        return afterAmount;
    }

    public void setAfterAmount(float afterAmount) {
        this.afterAmount = afterAmount;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    @Column(name = "accountno", nullable = false)
    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }
}
