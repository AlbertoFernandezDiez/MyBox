package com.alberto.fernandez.mybox.intefaces;

import com.alberto.fernandez.mybox.pojo.User;

/**
 * This interfaces sets the functionality a UserDao implementation must have.
 * 
 * @author Alberto
 *
 */
public interface UserDaoInterface {

	/**
	 * This method check if the given name is in use
	 * 
	 * @param username
	 *            {@code String} The username of the user
	 * @return <code>Boolean</code>
	 *         <ul>
	 *         <li><strong>true</strong> the entered data exists in the data
	 *         base</li>
	 *         <li><strong>false</strong> the entered data does not exists</li>
	 *         </ul>
	 */
	public boolean checkUserName(String username);

	
	/**
	 * This method check if the given email is in use
	 * 
	 * @param username
	 *            {@code String} The email of the user
	 * @return <code>Boolean</code>
	 *         <ul>
	 *         <li><strong>true</strong> the entered data exists in the data
	 *         base</li>
	 *         <li><strong>false</strong> the entered data does not exists</li>
	 *         </ul>
	 */
	public boolean checkEmail(String username);
	/**
	 * This method creates a new user
	 * 
	 * @param username
	 *            {@code String} The username of the user
	 * @param password
	 *            {@code String} The hashed password of the user, the hash must
	 *            be <strong>SHA-512</strong>
	 * @param email
	 *            {@code String} The email of the user, it must be unique
	 * @return <code>Boolean</code>
	 *         <ul>
	 *         <li><strong>true</strong> the new user is created</li>
	 *         <li><strong>false</strong> the user is not created</li>
	 *         </ul>
	 */
	public boolean singInUser(String username, String password, String email);

	
	/**
	 * This method check if the given access data is correct
	 * 
	 * @param username
	 *            {@code String} The username of the user
	 * @param password
	 *            {@code String} The hashed password of the user, the hash must
	 *            be <strong>SHA-512</strong>
	 * @return <code>User</code> If the access data is correct the <code>User</code> is returned, else <code>null</code>
	 *			
	 */
	public User logInUser(String username,String password);
	/**
	 * This method changes the users password for a new one
	 * 
	 * @param username
	 *            {@code String} The username of the user
	 * @param password
	 *            {@code String} The hashed password of the user, the hash must
	 *            be <strong>SHA-512</strong>
	 * @param newPassword
	 *            {@code String} The new password of the user
	 * @return <code>Boolean</code>
	 *         <ul>
	 *         <li><strong>true</strong> the password is changed</li>
	 *         <li><strong>false</strong> the password is not changed</li>
	 *         </ul>
	 * */
	public boolean changeUserPassword(String username, String password,
			String newPassword);

	/**
	 * This method return a User by his/her <code>id</code>
	 * @param id <code>int</code> the id of a user in the database
	 * @return <code>User</code> If the id exists the <code>User</code> is returned, else <code>null</code>
	 */
	public User getById(int id);
}
