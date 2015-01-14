package hibernate;
/**
 * Order entity. @author MyEclipse Persistence Tools
 */
public class Order extends AbstractOrder implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Order() {
	}

	/** minimal constructor */
	public Order(String orderId) {
		super(orderId);
	}

	/** full constructor */
	public Order(String orderId, String customerId, String productId,
			String businessId, String purchaseDate, String status,
			String receiveDate) {
		super(orderId, customerId, productId, businessId, purchaseDate, status,
				receiveDate);
	}

}
