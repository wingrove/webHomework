package hibernate;
/**
 * Code entity. @author MyEclipse Persistence Tools
 */
public class Code extends AbstractCode implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Code() {
	}

	/** minimal constructor */
	public Code(String secondClass) {
		super(secondClass);
	}

	/** full constructor */
	public Code(String secondClass, String firstClass, String productName) {
		super(secondClass, firstClass, productName);
	}

}
