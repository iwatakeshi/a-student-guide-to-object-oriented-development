/* Generated by Together */
//new
package bikeshop;

public class Customer {

    private String name = null;
    private String postcode = null;
    private int telephone = 0;
	private int customerId = 0;

    private static int customerCount = 001;

    public Customer(String cName, String pcode, int tel){
		name = cName;
        postcode = pcode;
        telephone = tel;
        customerId = customerCount++;
    }
    
    public int getCustomerNumber(){
    	return customerId;
    }
	/**
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return
	 */
	public String getPostcode() {
		return postcode;
	}

}
