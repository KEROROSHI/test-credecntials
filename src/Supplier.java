
public class Supplier {
	int supplierNumber;
	int pinNumber;
	String supplierName;
	String supplierLocation;
	
	Supplier(int suppNo, int pinNo, String suppName, String suppLocation){
		supplierNumber = suppNo;
		pinNumber = pinNo;
		supplierName = suppName;
		supplierLocation = suppLocation;
		
		System.out.println("The number of the supplier is " + suppNo);
		System.out.println("The pin number of the supplier is " + pinNo);
		System.out.println("The name of the supplier is " + suppName.toUpperCase());
		System.out.println("The location of supplier is " + suppLocation.toUpperCase());
	}
	Supplier(){
		System.out.println("The supplier details were not found in the users input");
	}
}
