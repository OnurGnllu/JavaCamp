package homework4;

public class Gamer implements EntityBase {

	private String firstName;
	private String lastName;
	private String yearOfBirth;
	private String nationalityId;
	private String userName;
	private String cardNo;
	private String password;
	private String discountCode;
	
	
	
	
	public Gamer( String firstName, String lastName ,  String natinalityId , String discountCode) {
        
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalityId = natinalityId;
		
	}
	
	
	public Gamer () {
		

	}
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getYearOfBirth() {
		return yearOfBirth;
	}
	public void setYearOfBirth(String yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}
	public String getNationalityId() {
		return nationalityId;
	}
	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getCardNo() {
		return cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}


	public String getDiscountCode() {
		return discountCode;
	}


	public void setDiscountCode(String discountCode) {
		this.discountCode = discountCode;
	}
	
	
	
	
	
	



















}
