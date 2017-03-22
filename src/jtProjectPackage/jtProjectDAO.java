/**
 * 
 */
package jtProjectPackage;

/**
 * @author rehnumatarannum DAO file for the Java Training Project
 *
 */
public class jtProjectDAO {
	String username, password, email, contactNo;

	/**
	 * @return the username
	 */
	String getUsername() {
		return username;
	}

	/**
	 * @param username
	 *            the username to set
	 */
	void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the email
	 */
	String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the contactNo
	 */
	String getContactNo() {
		return contactNo;
	}

	/**
	 * @param contactNo
	 *            the contactNo to set
	 */
	void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	@Override
	public String toString() {

		return "DAO [Username = " + username + ", " + "Password = " + password + ", " + "Email = " + email + ", "
				+ "ContactNo = " + contactNo + " ]";
	}

}
