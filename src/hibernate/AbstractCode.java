package hibernate;

/**
 * AbstractCode entity provides the base persistence definition of the Code
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCode implements java.io.Serializable {

	// Fields

	private String secondClass;
	private String firstClass;
	private String productName;

	// Constructors

	/** default constructor */
	public AbstractCode() {
	}

	/** minimal constructor */
	public AbstractCode(String secondClass) {
		this.secondClass = secondClass;
	}

	/** full constructor */
	public AbstractCode(String secondClass, String firstClass,
			String productName) {
		this.secondClass = secondClass;
		this.firstClass = firstClass;
		this.productName = productName;
	}

	// Property accessors

	public String getSecondClass() {
		return this.secondClass;
	}

	public void setSecondClass(String secondClass) {
		this.secondClass = secondClass;
	}

	public String getFirstClass() {
		return this.firstClass;
	}

	public void setFirstClass(String firstClass) {
		this.firstClass = firstClass;
	}

	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

}