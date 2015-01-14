package hibernate;

/**
 * AbstractProductList entity provides the base persistence definition of the
 * ProductList entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractProductList implements java.io.Serializable {

	// Fields

	private String productId;
	private String businessId;
	private String buildDate;
	private String modifyDate;

	// Constructors

	/** default constructor */
	public AbstractProductList() {
	}

	/** minimal constructor */
	public AbstractProductList(String productId) {
		this.productId = productId;
	}

	/** full constructor */
	public AbstractProductList(String productId, String businessId,
			String buildDate, String modifyDate) {
		this.productId = productId;
		this.businessId = businessId;
		this.buildDate = buildDate;
		this.modifyDate = modifyDate;
	}

	// Property accessors

	public String getProductId() {
		return this.productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getBusinessId() {
		return this.businessId;
	}

	public void setBusinessId(String businessId) {
		this.businessId = businessId;
	}

	public String getBuildDate() {
		return this.buildDate;
	}

	public void setBuildDate(String buildDate) {
		this.buildDate = buildDate;
	}

	public String getModifyDate() {
		return this.modifyDate;
	}

	public void setModifyDate(String modifyDate) {
		this.modifyDate = modifyDate;
	}

}