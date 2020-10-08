package com.aws.codestar.projecttemplates.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "Receipt")
public class Receipt implements Serializable
{
    private int receiptNo;
    private String receiptType;
    private float previousAmt;
    private float afterAmount;
    private float amount;

    @Id
    @Column(name = "receiptNo", nullable = false)
    public int getReceiptNo() {
        return receiptNo;
    }

    public void setReceiptNo(int receiptNo) {
        this.receiptNo = receiptNo;
    }
    @Column(name = "receiptType", nullable = false)
    public String getReceiptType() {
        return receiptType;
    }

    public void setReceiptType(String receiptType) {
        this.receiptType = receiptType;
    }

    @Column(name = "previousAmt", nullable = false)
    public float getPreviousAmt() {
        return previousAmt;
    }

    public void setPreviousAmt(float previousAmt) {
        this.previousAmt = previousAmt;
    }

    @Column(name = "afterAmount", nullable = false)
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

}
