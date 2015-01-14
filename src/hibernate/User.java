package hibernate;
/**
 * User entity. @author MyEclipse Persistence Tools
 */
public class User extends AbstractUser implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public User() {
	}

	/** minimal constructor */
	public User(String userId) {
		super(userId);
	}

	/** full constructor */
	public User(String userId, String userName, String password, String userType) {
		super(userId, userName, password, userType);
	}

}
