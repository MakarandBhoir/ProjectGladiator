package com.synergetics.Projectgladiator.Entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Table(name="Accounts")
public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long accNo;
	
	
	private long balance;
	
	@OneToOne
	@Autowired
	private User user;
	
	@OneToMany
	@Autowired
	private List<Benefeciary> beneficiary;
	
	@OneToMany
	@Autowired
	private List<Transaction> transactions;
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getAccNo() {
		return accNo;
	}

	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Benefeciary> getBeneficiary() {
		return beneficiary;
	}

	public void setBeneficiary(List<Benefeciary> beneficiary) {
		this.beneficiary = beneficiary;
	}

	public List<Transaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}

	public Account(long accNo, long balance, User user, List<Benefeciary> beneficiary, List<Transaction> transactions) {
		super();
		this.accNo = accNo;
		this.balance = balance;
		this.user = user;
		this.beneficiary = beneficiary;
		this.transactions = transactions;
	}

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", balance=" + balance + ", user=" + user + ", beneficiary=" + beneficiary
				+ ", transactions=" + transactions + "]";
	}


	

}
