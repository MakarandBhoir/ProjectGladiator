package com.synergetics.Projectgladiator.Entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Transaction {
     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
	 private int transID;
     
     @ManyToOne
     @JoinColumn(name="accNo")
     @Autowired
     private Account account;
     
     private long amount;
     @Column(name = "transaction_date")
     @CreationTimestamp
     private Date transDate;
     public int getTransID() {
     return transID;
     }
     public void setTransID(int transID) {
     this.transID = transID;
     }
     public Account getAccount() {
     return account;
     }
     public void setAccount(Account account) {
     this.account = account;
     }
     public long getAmount() {
     return amount;
     }
     public void setAmount(long amount) {
     this.amount = amount;
     }
     public Date getTransDate() {
     return transDate;
     }
     public void setTransDate(Date transDate) {
     this.transDate = transDate;
     }
     public Transaction(int transID, Account account, long amount, Date transDate) {
     super();
     this.transID = transID;
     this.account = account;
     this.amount = amount;
     this.transDate = transDate;
     }
     @Override
     public String toString() {
     return "Transaction [transID=" + transID + ", account=" + account + ", amount=" + amount + ", transDate="
     + transDate + "]";
     }
     public Transaction() {
     super();
     // TODO Auto-generated constructor stub
     }

     
}
