package hibernate;

/**
 * AbstractBusiness entity provides the base persistence definition of the
 * Business entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractBusiness implements java.io.Serializable {

	// Fields

	private String businessId;
	private String businessName;
	private String businessClass;
	private String businessTel;
	private String address;
	private String buildDate;

	// Constructors

	/** default constructor */
	public AbstractBusiness() {
	}

	/** minimal constructor */
	public AbstractBusiness(String businessId) {
		this.businessId = businessId;
	}

	/** full constructor */
	public AbstractBusiness(String businessId, String businessName,
			String businessClass, String businessTel, String address,
			String buildDate) {
		this.businessId = businessId;
		this.businessName = businessName;
		this.businessClass = businessClass;
		this.businessTel = businessTel;
		this.address = address;
		this.buildDate = buildDate;
	}

	// Property accessors

	public String getBusinessId() {
		return this.businessId;
	}

	public void setBusinessId(String businessId) {
		this.businessId = businessId;
	}

	public String getBusinessName() {
		return this.businessName;
	}

	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}

	public String getBusinessClass() {
		return this.businessClass;
	}

	public void setBusinessClass(String businessClass) {
		this.businessClass = businessClass;
	}

	public String getBusinessTel() {
		return this.businessTel;
	}

	public void setBusinessTel(String businessTel) {
		this.businessTel = businessTel;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBuildDate() {
		return this.buildDate;
	}

	public void setBuildDate(String buildDate) {
		this.buildDate = buildDate;
	}

}