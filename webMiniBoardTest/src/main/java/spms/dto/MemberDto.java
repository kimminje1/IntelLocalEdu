package spms.dto;

import java.util.Date;

public class MemberDto {
	
	private int memberNo; 
	private	String email;      
	private	String password;      
	private	String memberName;
	private	Date createDate;   
	private	Date modifiedDate;
	
	
	public MemberDto() {
		super();
	}


	public MemberDto(int memberNo, String email, String password, 
			String memberName, Date createDate,Date modifiedDate) {
		super();
		this.memberNo = memberNo;
		this.email = email;
		this.password = password;
		this.memberName = memberName;
		this.createDate = createDate;
		this.modifiedDate = modifiedDate;
	}


	public int getmemberNo() {
		return memberNo;
	}


	public void setmemberNo(int memberNo) {
		this.memberNo = memberNo;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getmemberName() {
		return memberName;
	}


	public void setmemberName(String memberName) {
		this.memberName = memberName;
	}


	public Date getCreateDate() {
		return createDate;
	}


	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}


	public Date getModifiedDate() {
		return modifiedDate;
	}


	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}


	@Override
	public String toString() {
		return "MemberDto [memberNo=" + memberNo + ", email=" + email 
				+ ", password=" + password + ", memberName="
				+ memberName + ", createDate=" + createDate + ", modifiedDate=" + modifiedDate + "]";
	}   
	
	
		
		
	
	
}
