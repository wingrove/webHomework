package hibernate;
/**
 * Customer entity. @author MyEclipse Persistence Tools
 */
public class Customer extends AbstractCustomer implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Customer() {
	}

	/** minimal constructor */
	public Customer(String customerId) {
		super(customerId);
	}

	/** full constructor */
	public Customer(String customerId, String customerName,
			String shippingAddress, String mobile, String customerClass,
			String buildDate) {
		super(customerId, customerName, shippingAddress, mobile, customerClass,
				buildDate);
	}

}
