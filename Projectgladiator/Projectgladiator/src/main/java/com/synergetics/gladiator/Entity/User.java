package com.synergetics.gladiator.Entity;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Table(name="User_Registration")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	@Column(unique=true)
	private long  loginId;
	
	private String bankName;
	
	@Column(nullable=false)
	private int adharNo;
	
	private String password;
	private String confPwd;
	
	@Column(unique=true)
	private String emailId;
	
	@Column(unique=true)
	private long phoneNo;
	
	private String dob;
	
	private enum userAccStatus { PENDING, ACTIVATED };
	
   @OneToOne
   @JoinColumn(name="loginId")
   @Autowired
   private Account account;
   
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getLoginId() {
		return loginId;
	}

	public void setLoginId(int loginId) {
		this.loginId = loginId;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public int getAdharNo() {
		return adharNo;
	}

	public void setAdharNo(int adharNo) {
		this.adharNo = adharNo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfPwd() {
		return confPwd;
	}

	public void setConfPwd(String confPwd) {
		this.confPwd = confPwd;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public User(int loginId, String bankName, int adharNo, String password, String confPwd, String emailId,
			long phoneNo, String dob, Account account) {
		super();
		this.loginId = loginId;
		this.bankName = bankName;
		this.adharNo = adharNo;
		this.password = password;
		this.confPwd = confPwd;
		this.emailId = emailId;
		this.phoneNo = phoneNo;
		this.dob = dob;
		this.account = account;
	}

	@Override
	public String toString() {
		return "User [loginId=" + loginId + ", bankName=" + bankName + ", adharNo=" + adharNo + ", password=" + password
				+ ", confPwd=" + confPwd + ", emailId=" + emailId + ", phoneNo=" + phoneNo + ", dob=" + dob
				+ ", account=" + account + "]";
	}
		
}
