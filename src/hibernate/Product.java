package hibernate;
/**
 * Product entity. @author MyEclipse Persistence Tools
 */
public class Product extends AbstractProduct implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Product() {
	}

	/** minimal constructor */
	public Product(String productId) {
		super(productId);
	}

	/** full constructor */
	public Product(String productId, String productType, String productName,
			String productModel, String discription, String manufactory,
			String productionDate, String buildDate) {
		super(productId, productType, productName, productModel, discription,
				manufactory, productionDate, buildDate);
	}

}
