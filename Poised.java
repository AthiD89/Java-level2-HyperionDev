// import packages
import java.io.PrintStream;
import java.util.Scanner;

// defining main class
public class Poised {

	private static final PrintStream OUT = System.out;
	private static int option;
	// defining main method
	public static void main(String[] args) throws Exception {

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
				// menu options for the user to select from
				OUT.println("\t---------------------------------------------");
				OUT.println("\t|\t\tMENU\t\t\t    |");
				OUT.println("\t---------------------------------------------");
				OUT.println("\t1. Add NEW PROJECT");
				OUT.println("\t2. Add ARCHITECT");
				OUT.println("\t3. Add CONTRACTOR");
				OUT.println("\t4. FINALISE PROJECT ");
				OUT.println("\t5. EDIT");
				OUT.println("\t0. EXIT");
				OUT.println("\tEnter choice between(0 - 5):");
				option = input.nextInt();
				OUT.println("\t---------------------------------------------");
			
					// if user selects 1 they will have to fill in New project details
					if (option == 1){
						OUT.println("NEW PROJECT FORM ");
						OUT.println("------------------------------------------------------");
						
						//New Project details
						// data types and all the attributes
						OUT.println("Enter Project ID: ");
						input.nextInt();
						 
					    System.out.println("Enter Project Name: ");
						input.next();
			
						OUT.println("Enter Building Type: ");
						input.next();
			
						OUT.println("Enter Project Address: ");
						input.next();
			
						OUT.println("Enter ERF Number: ");
						input.nextInt();
				
						OUT.println("Enter Fee Charged: ");
						input.nextDouble();
				
						OUT.println("Enter Amount Paid: ");
						input.nextDouble();
					
						OUT.println("Enter DeadLine Date: ");
						input.next();
						
						//Architect details
						OUT.println("Enter Architect Name: ");
						String ArchitectName = input.next();
						
						OUT.println("Enter Architect Cell Number: ");
						int ArchitectNumber = input.nextInt();
					
						OUT.println("Enter Architect Email Address: ");
						String ArchitectEmail = input.next();
					
						OUT.println("Enter Architect Physical Address: ");
						String ArchitectAddress = input.next();
				
						//Contractor details
						OUT.println("Enter Contractor ID: ");
						int ContractorID = input.nextInt();
						
						OUT.println("Enter Contractor Name: ");
						String ContractorName = input.next();
			
						OUT.println("Enter Contractor Cell Number: ");
						int ContractorNumber = input.nextInt();
					
						OUT.println("Enter Contractor Email: ");
						String ContractorEmail1 = input.next();
					
						OUT.println("Enter Contractor Physical Address: ");
						String ContractorAddress = input.next();
				
						//Customer Details
						OUT.println("Enter Customer ID: ");
						int CustomerID = input.nextInt();
						
						OUT.println("Enter Customer Name: ");
						String CustomerName = input.next();
						
						OUT.println("Enter Customer Cell Number: ");
						int CustomerNumber = input.nextInt();
						
						OUT.println("Enter Customer Email: ");
						String CustomerEmail = input.next();
					
						
						OUT.println("Enter Customer Physical Address: ");
						String CustomerAddress = input.next();
						OUT.println("Success");
					
						
						// Architect method to get architect details
						new Architect(ArchitectName, ArchitectNumber, ArchitectEmail, ArchitectAddress);
						// Contractor method to get contract details
						new Contractor(ContractorID, ContractorName, ContractorNumber, ContractorEmail1, ContractorAddress);
						// Customer method to get customer details
						new Customer(CustomerID,CustomerName, CustomerNumber, CustomerEmail, CustomerAddress);
								
					}
					// if user selects option 2 they will have to enter architect details
					else if(option == 2) {
						//Architect details
						OUT.println("\tARCHITECT DETAILS ");
						OUT.println("------------------------------------------------------");
						OUT.println("Enter Architect Name: ");
						String ArchitectName = input.next();
						
						OUT.println("Enter Architect Cell Number: ");
						int ArchitectNumber = input.nextInt();
				
						OUT.println("Enter Architect Email Address: ");
						String ArchitectEmail = input.next();
						
						OUT.println("Enter Architect Physical Address: ");
						String ArchitectAddress = input.next();
				
						OUT.println("Success");
						
						new Architect(ArchitectName, ArchitectNumber, ArchitectEmail, ArchitectAddress);
					}
					// if user selects option 3 they will be required to enter contractore details
					else if(option == 3) {
						
						OUT.println("\tCONTRACTOR DETAILS ");
						OUT.println("------------------------------------------------------");
						//Contractor details
						OUT.println("Enter Contractor ID: ");
						int ContractorID = input.nextInt();
	
						OUT.println("Enter Contractor Name: ");
						String ContractorName = input.next();
						
						OUT.println("Enter Contractor Email: ");
						String ContractorEmail = input.next();
						
						OUT.println("Enter Contractor Cell Number: ");
						int ContractorNumber = input.nextInt();
						
						OUT.println("Enter Contractor Physical Address: ");
						String ContractorAddress = input.next();
						
						new Contractor(ContractorID, ContractorName, ContractorNumber, ContractorEmail, ContractorAddress);
						OUT.println("Successfull Saved");
					}
					// Finalising project
					else if(option == 4) {
						OUT.println("Enter a Project Number to Finalise: ");
						input.nextInt();
						OUT.println("Successfully Saved");
						return;
						}

					else if (option == 5) {
						
						// Editing Menu
						OUT.println("\t|\tEDITING OPTIONS                      |");
						OUT.println("\t---------------------------------------------");
						OUT.println("\t1. CHANGE AMOUNT OF FEE PAID");
						OUT.println("\t2. CHANGE CONTRACTOR CONTACTS");
						OUT.println("\t3. CHANGE DUE DATE OF PROJECT");
						OUT.println("\t0. BACK");
						OUT.println("\tEnter Options between(0 - 3):");
						int options = input.nextInt();
						
							if (options == 1) {
								
								OUT.println("Please enter the new amout: ");
								input.nextDouble();
								OUT.println("SAVED");
									
							}
							else if(options == 2) {
								
								OUT.println("Please enter new contractors contacts");
								input.nextInt();
								OUT.println("Saved");
							}
							else if (options == 3) {
								OUT.println("Enter DeadLine Date: ");
								input.next();
							}
							else if (options == 0) {
								System.exit(options);
								
							}
					}
					
					else if (option == 0) {
						System.out.println("\tGood Bye!!");
					}
				}
				
	}

