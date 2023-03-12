package com.synergetics.Projectgladiator.Entity;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Table(name="Benefeciary_List")
public class Benefeciary {
	
	@Id
	private long benifaccNo;
	
	@ManyToOne
	@JoinColumn(name="accNo")
	@Autowired
	private Account account;

	public long getBenifaccNo() {
		return benifaccNo;
	}

	public void setBenifaccNo(long benifaccNo) {
		this.benifaccNo = benifaccNo;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Benefeciary(long benifaccNo, Account account) {
		super();
		this.benifaccNo = benifaccNo;
		this.account = account;
	}

	@Override
	public String toString() {
		return "Benefeciary [benifaccNo=" + benifaccNo + ", account=" + account + "]";
	}

	public Benefeciary() {
		super();
		
	}
	
	
	/*@OneToOne
	@JoinColumn(name="benifaccNo")
	Transaction transaction; */
}
