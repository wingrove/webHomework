package hibernate;
/**
 * Evaluation entity. @author MyEclipse Persistence Tools
 */
public class Evaluation extends AbstractEvaluation implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Evaluation() {
	}

	/** minimal constructor */
	public Evaluation(String evaId) {
		super(evaId);
	}

	/** full constructor */
	public Evaluation(String evaId, String productId, String customerId,
			String evaContent, String evaDate) {
		super(evaId, productId, customerId, evaContent, evaDate);
	}

}
