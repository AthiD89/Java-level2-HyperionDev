
/**
 *
 * The class contains the attributes for a person involved
 * with a project such as the Architect, contractor or
 * customer.
 *
 */
public class Person {
	
	//Attributes
	/**
	 * String value for jobType of Person
	 */
	private String jobType;

	/**
	 * String value for name of Person
	 */
	private String name;

	/**
	 * String value for telNumber of Person
	 */
	private String telNumber;

	/**
	 * String value for email address of Person
	 */
	private String emailAddress;

	/**
	 * String value for physical address of Person
	 */
	private String physicalAddress;

	// Constructor
	/**
	 *
	 * Constructor
	 *
	 * @param jobType Job type of person
	 * @param name Name of person
	 * @param telNumber Tel number person
	 * @param emailAddress Email address of person
	 * @param physicalAddress Physical address of person */
	public Person(String jobType, String name, String telNumber, String emailAddress,
				  String physicalAddress) {
		this.jobType = jobType;
		this.name = name;
		this.telNumber = telNumber;
		this.emailAddress = emailAddress;
		this.physicalAddress = physicalAddress;
	}
	/**
	 *
	 * The method returns the name of the Person object.
	 *
	 * @return name
	 */
	public String getName() {
		return name;
	}
	/**
	 *
	 * The method returns the job type of the Person object.
	 *
	 * @return jobType
	 */
	public String getJobType() {
		return jobType;
	}
	/**
	 *
	 * The method returns the tel number of the Person object.
	 *
	 * @return telNumber
	 */
	public String getTelNumber() {
		return telNumber;
	}
	/**
	 *
	 * The method returns the email address of the Person object.
	 *
	 * @return emailAddress
	 */
	public String getEmailAddress() {
		return emailAddress;
	}
	/**
	 *
	 * The method returns the physical of the Person object.
	 *
	 * @return physicalAddress	 
	 */
	public String getPhysicalAddress() {
		return physicalAddress;
	}
	/**
	 *
	 * The method sets the tel number of the Person object to
	 * a new given value.
	 *
	 * @param newTelNumber new value to set telNUmber to.
	 * */
	public void setTelNumber(String newTelNumber) {
		this.telNumber = newTelNumber;
	}
	/**
	 *
	 * The method sets the email address of the Person object to
	 * a new given value.
	 *
	 * @param newEmailAddress new value to set emailAddress to.
	 * */
	public void setEmailAddress(String newEmailAddress) {
		this.emailAddress = newEmailAddress;
	}
	
}