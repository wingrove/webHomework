package hibernate;

/**
 * AbstractEvaluation entity provides the base persistence definition of the
 * Evaluation entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractEvaluation implements java.io.Serializable {

	// Fields

	private String evaId;
	private String productId;
	private String customerId;
	private String evaContent;
	private String evaDate;

	// Constructors

	/** default constructor */
	public AbstractEvaluation() {
	}

	/** minimal constructor */
	public AbstractEvaluation(String evaId) {
		this.evaId = evaId;
	}

	/** full constructor */
	public AbstractEvaluation(String evaId, String productId,
			String customerId, String evaContent, String evaDate) {
		this.evaId = evaId;
		this.productId = productId;
		this.customerId = customerId;
		this.evaContent = evaContent;
		this.evaDate = evaDate;
	}

	// Property accessors

	public String getEvaId() {
		return this.evaId;
	}

	public void setEvaId(String evaId) {
		this.evaId = evaId;
	}

	public String getProductId() {
		return this.productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getEvaContent() {
		return this.evaContent;
	}

	public void setEvaContent(String evaContent) {
		this.evaContent = evaContent;
	}

	public String getEvaDate() {
		return this.evaDate;
	}

	public void setEvaDate(String evaDate) {
		this.evaDate = evaDate;
	}

}