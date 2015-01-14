package hibernate;

/**
 * AbstractProduct entity provides the base persistence definition of the
 * Product entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractProduct implements java.io.Serializable {

	// Fields

	private String productId;
	private String productType;
	private String productName;
	private String productModel;
	private String discription;
	private String manufactory;
	private String productionDate;
	private String buildDate;

	// Constructors

	/** default constructor */
	public AbstractProduct() {
	}

	/** minimal constructor */
	public AbstractProduct(String productId) {
		this.productId = productId;
	}

	/** full constructor */
	public AbstractProduct(String productId, String productType,
			String productName, String productModel, String discription,
			String manufactory, String productionDate, String buildDate) {
		this.productId = productId;
		this.productType = productType;
		this.productName = productName;
		this.productModel = productModel;
		this.discription = discription;
		this.manufactory = manufactory;
		this.productionDate = productionDate;
		this.buildDate = buildDate;
	}

	// Property accessors

	public String getProductId() {
		return this.productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductType() {
		return this.productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductModel() {
		return this.productModel;
	}

	public void setProductModel(String productModel) {
		this.productModel = productModel;
	}

	public String getDiscription() {
		return this.discription;
	}

	public void setDiscription(String discription) {
		this.discription = discription;
	}

	public String getManufactory() {
		return this.manufactory;
	}

	public void setManufactory(String manufactory) {
		this.manufactory = manufactory;
	}

	public String getProductionDate() {
		return this.productionDate;
	}

	public void setProductionDate(String productionDate) {
		this.productionDate = productionDate;
	}

	public String getBuildDate() {
		return this.buildDate;
	}

	public void setBuildDate(String buildDate) {
		this.buildDate = buildDate;
	}

}