package hibernate;
/**
 * Business entity. @author MyEclipse Persistence Tools
 */
public class Business extends AbstractBusiness implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Business() {
	}

	/** minimal constructor */
	public Business(String businessId) {
		super(businessId);
	}

	/** full constructor */
	public Business(String businessId, String businessName,
			String businessClass, String businessTel, String address,
			String buildDate) {
		super(businessId, businessName, businessClass, businessTel, address,
				buildDate);
	}

}
