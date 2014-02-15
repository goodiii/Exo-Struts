import HelloApp.Hello;
import HelloApp.HelloHelper;

import org.omg.CosNaming.*;
import org.omg.CosNaming.NamingContextPackage.*;
import org.omg.CORBA.*;

public class HelloClient {
	//Notice that this is of type Hello
	static Hello helloImpl;

	public static void main(String args[]) {
		try{
			//A client needs its own ORB to perform all
			// marshalling and IIOP work.
			// create and initialize the ORB
			ORB orb = ORB.init(args, null);

			// get the root naming context
			org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");
			// Use NamingContextExt instead of NamingContext. This is 
			// part of the Interoperable naming Service.  
			NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);

			// resolve the Object Reference in Naming
			String name = "Hello";
			//The inner call gets the reference and the outer one narrows it
			// to the proper type.
			helloImpl = HelloHelper.narrow(ncRef.resolve_str(name));

			System.out.println("Obtained a handle on server object: " + helloImpl);

			//Invobe a method on the object. magic happens.
			System.out.println(helloImpl.sayHello());
//			helloImpl.shutdown();
		} 
		catch (Exception e) {
			System.out.println("ERROR : " + e) ;
			e.printStackTrace(System.out);
		}
	}
}