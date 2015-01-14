package hibernate;

/**
 * AbstractCustomer entity provides the base persistence definition of the
 * Customer entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCustomer implements java.io.Serializable {

	// Fields

	private String customerId;
	private String customerName;
	private String shippingAddress;
	private String mobile;
	private String customerClass;
	private String buildDate;

	// Constructors

	/** default constructor */
	public AbstractCustomer() {
	}

	/** minimal constructor */
	public AbstractCustomer(String customerId) {
		this.customerId = customerId;
	}

	/** full constructor */
	public AbstractCustomer(String customerId, String customerName,
			String shippingAddress, String mobile, String customerClass,
			String buildDate) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.shippingAddress = shippingAddress;
		this.mobile = mobile;
		this.customerClass = customerClass;
		this.buildDate = buildDate;
	}

	// Property accessors

	public String getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return this.customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getShippingAddress() {
		return this.shippingAddress;
	}

	public void setShippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getCustomerClass() {
		return this.customerClass;
	}

	public void setCustomerClass(String customerClass) {
		this.customerClass = customerClass;
	}

	public String getBuildDate() {
		return this.buildDate;
	}

	public void setBuildDate(String buildDate) {
		this.buildDate = buildDate;
	}

}