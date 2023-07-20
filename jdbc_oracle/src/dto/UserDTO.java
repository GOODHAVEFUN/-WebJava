package dto;

public class UserDTO {
//	USER1_NUMBER NUMBER,
//	USER1_ID VARCHAR(1000),
//	USER1_PASSWORD VARCHAR(1000),
//	USER1_NAME VARCHAR(1000),
//	USER1_AGE NUMBER,
//	USER1_GENDER CHAR(1) DEFAULT 'N',
//	USER1_BIRTH DATE,
//	CONSTRAINT PK_USER1 PRIMARY KEY(USER1_NUMBER)
	
	private String user1Number;
	private String user1Id;
	private String user1Password;
	private String user1Name;
	private int user1Age;
	private String user1Gender;
	private String userBirth;
	
	public UserDTO() {
		super();
	}

	public String getUser1Number() {
		return user1Number;
	}

	public void setUser1Number(String user1Number) {
		this.user1Number = user1Number;
	}

	public String getUser1Id() {
		return user1Id;
	}

	public void setUser1Id(String user1Id) {
		this.user1Id = user1Id;
	}

	public String getUser1Password() {
		return user1Password;
	}

	public void setUser1Password(String user1Password) {
		this.user1Password = user1Password;
	}

	public String getUser1Name() {
		return user1Name;
	}

	public void setUser1Name(String user1Name) {
		this.user1Name = user1Name;
	}

	public int getUser1Age() {
		return user1Age;
	}

	public void setUser1Age(int user1Age) {
		this.user1Age = user1Age;
	}

	public String getUser1Gender() {
		return user1Gender;
	}

	public void setUser1Gender(String user1Gender) {
		this.user1Gender = user1Gender;
	}

	public String getUserBirth() {
		return userBirth;
	}

	public void setUserBirth(String userBirth) {
		this.userBirth = userBirth;
	}

	@Override
	public String toString() {
		return "UserDTO [user1Number=" + user1Number + ", user1Id=" + user1Id + ", user1Password=" + user1Password
				+ ", user1Name=" + user1Name + ", user1Age=" + user1Age + ", user1Gender=" + user1Gender
				+ ", userBirth=" + userBirth + "]";
	}
	
	 
	
	
}
