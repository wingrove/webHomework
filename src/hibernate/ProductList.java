package hibernate;
/**
 * ProductList entity. @author MyEclipse Persistence Tools
 */
public class ProductList extends AbstractProductList implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public ProductList() {
	}

	/** minimal constructor */
	public ProductList(String productId) {
		super(productId);
	}

	/** full constructor */
	public ProductList(String productId, String businessId, String buildDate,
			String modifyDate) {
		super(productId, businessId, buildDate, modifyDate);
	}

}
