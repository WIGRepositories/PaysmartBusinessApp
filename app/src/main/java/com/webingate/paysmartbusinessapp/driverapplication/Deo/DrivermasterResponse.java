package com.webingate.paysmartbusinessapp.driverapplication.Deo;

import com.google.gson.annotations.SerializedName;

public class DrivermasterResponse {

	@SerializedName("Id")
	private int Id;

	@SerializedName("PPin")
	private Object pPin;

	@SerializedName("BloodGroup")
	private Object bloodGroup;

	@SerializedName("DriverCode")
	private String driverCode;

	@SerializedName("Address")
	private Object address;

	@SerializedName("CompanyId")
	private Object companyId;

	@SerializedName("PMobNo")
	private String pMobNo;

	@SerializedName("photo")
	private String photo;
	@SerializedName("UserPhoto")
	private String UserPhoto;

	@SerializedName("PAddress")
	private Object pAddress;

	@SerializedName("City")
	private Object city;

	@SerializedName("NAme")
	private String nAme;

	@SerializedName("OffMobileNo")
	private Object offMobileNo;

	@SerializedName("Pin")
	private Object pin;

	@SerializedName("Remarks")
	private Object remarks;

	@SerializedName("DOB")
	private Object dOB;

	@SerializedName("PCity")
	private Object pCity;

	@SerializedName("DId")
	private int dId;

	@SerializedName("Email")
	private String Email;

	@SerializedName("Mobilenumber")
	private String Mobilenumber;

	@SerializedName("UserAccountNo")
	private String UserAccountNo;

	@SerializedName("DOJ")
	private Object dOJ;

	public int getId(){
		return Id;
	}

	public void setPPin(Object pPin){
		this.pPin = pPin;
	}

	public Object getPPin(){
		return pPin;
	}

	public void setBloodGroup(Object bloodGroup){
		this.bloodGroup = bloodGroup;
	}

	public Object getBloodGroup(){
		return bloodGroup;
	}

	public void setDriverCode(String driverCode){
		this.driverCode = driverCode;
	}

	public String getDriverCode(){
		return driverCode;
	}

	public void setAddress(Object address){
		this.address = address;
	}

	public Object getAddress(){
		return address;
	}

	public void setCompanyId(Object companyId){
		this.companyId = companyId;
	}

	public Object getCompanyId(){
		return companyId;
	}

	public void setPMobNo(String pMobNo){
		this.pMobNo = pMobNo;
	}

	public String getPMobNo(){
		return pMobNo;
	}

	public void setPhoto(String photo){
		this.photo = photo;
	}

	public String getPhoto(){
		return photo;
	}
	public String getUserPhoto(){
		return UserPhoto;
	}
	public String getEmail(){
		return Email;
	}
	public String getUserAccountNo(){
		return UserAccountNo;
	}
	public String getMobilenumber(){
		return Mobilenumber;
	}

	public void setPAddress(Object pAddress){
		this.pAddress = pAddress;
	}

	public Object getPAddress(){
		return pAddress;
	}

	public void setCity(Object city){
		this.city = city;
	}

	public Object getCity(){
		return city;
	}

	public void setNAme(String nAme){
		this.nAme = nAme;
	}

	public String getNAme(){
		return nAme;
	}

	public void setOffMobileNo(Object offMobileNo){
		this.offMobileNo = offMobileNo;
	}

	public Object getOffMobileNo(){
		return offMobileNo;
	}

	public void setPin(Object pin){
		this.pin = pin;
	}

	public Object getPin(){
		return pin;
	}

	public void setRemarks(Object remarks){
		this.remarks = remarks;
	}

	public Object getRemarks(){
		return remarks;
	}

	public void setDOB(Object dOB){
		this.dOB = dOB;
	}

	public Object getDOB(){
		return dOB;
	}

	public void setPCity(Object pCity){
		this.pCity = pCity;
	}

	public Object getPCity(){
		return pCity;
	}

	public void setDId(int dId){
		this.dId = dId;
	}

	public int getDId(){
		return dId;
	}

	public void setDOJ(Object dOJ){
		this.dOJ = dOJ;
	}

	public Object getDOJ(){
		return dOJ;
	}

	@Override
 	public String toString(){
		return 
			"DrivermasterResponse{" +
			",UserAccountNo = '" + UserAccountNo + '\'' +
			"pPin = '" + pPin + '\'' +
			",bloodGroup = '" + bloodGroup + '\'' +
			",driverCode = '" + driverCode + '\'' + 
			",address = '" + address + '\'' + 
			",companyId = '" + companyId + '\'' + 
			",pMobNo = '" + pMobNo + '\'' + 
			",photo = '" + photo + '\'' +
			",UserPhoto = '" + UserPhoto + '\'' +
			",pAddress = '" + pAddress + '\'' +
			",city = '" + city + '\'' + 
			",nAme = '" + nAme + '\'' + 
			",offMobileNo = '" + offMobileNo + '\'' + 
			",pin = '" + pin + '\'' + 
			",remarks = '" + remarks + '\'' + 
			",dOB = '" + dOB + '\'' + 
			",pCity = '" + pCity + '\'' + 
			",dId = '" + dId + '\'' + 
			",dOJ = '" + dOJ + '\'' +
			",Email = '" + Email + '\'' +
					",Mobilenumber = '" + Mobilenumber + '\'' +

//					",Email = '" + Email + '\'' +
//					",Email = '" + Email + '\'' +
//					",Email = '" + Email + '\'' +
					"}";
		}
}
//		,[Mobilenumber]
//		,[Password]
//		,[Firstname]
//		,[lastname]
//		,[AuthTypeId]
//		,[AltPhonenumber]
//		,[Altemail]
//		,[AccountNo]
//		,[Amount]
//		,[UserPhoto]
//		,[Gender]
//		,[Emailotp]
//		,[Mobileotp]
//		,[CountryId]
//		,CurrentStateId
//		,PaymentModeId
//		,[Active]
//		,[CCode]
//		,[UserAccountNo]
//		,[usertypeid]