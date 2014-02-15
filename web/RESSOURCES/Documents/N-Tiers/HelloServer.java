
import HelloApp.HelloPOA;
import HelloApp.Hello;
import HelloApp.HelloHelper; // les 3 packages sont créés par idlj.

import org.omg.CosNaming.*;
import org.omg.CosNaming.NamingContextPackage.*;
import org.omg.CORBA.*;
import org.omg.PortableServer.*;
import org.omg.PortableServer.POA; // implémentations de CORBA dans le JDK

import java.util.Properties;

class HelloImpl extends HelloPOA {

    private ORB orb; // objet Request Broken (container d'objets distants)

    public void setORB(ORB orb_val) {
        orb = orb_val;
    }

    // implement sayHello() method
    public String sayHello() {
        return "\nTHIS IS PATRICK\n";
    }

    // implement shutdown() method
    public void shutdown() {
        orb.shutdown(false);
    }
}

public class HelloServer {

    public static void main(String args[]) {
        try {
            // create and initialize the ORB
            ORB orb = ORB.init(args, null);

            // get reference to rootpoa & activate the POAManager
            POA rootpoa = POAHelper.narrow(orb.resolve_initial_references("RootPOA"));
            rootpoa.the_POAManager().activate();

            // create servant and register it with the ORB
            HelloImpl helloImpl = new HelloImpl();
            helloImpl.setORB(orb);

            // get object reference from the servant
            org.omg.CORBA.Object ref = rootpoa.servant_to_reference(helloImpl);
            Hello href = HelloHelper.narrow(ref);

			// get the root naming context
            //The string "NameService" is defined for all CORBA ORBs.
            org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");

			//objRef is a generic object reference. We must narrow it down
            // to the interface we need.
            // Use NamingContextExt which is part of the Interoperable
            // Naming Service (INS) specification.
            NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);

            // bind the Object Reference with the Naming Service.
            String name = "Hello";
            NameComponent path[] = ncRef.to_name(name);
			//pas the name to the Naming Service, binding the href to the string
            // "Hello"
            ncRef.rebind(path, href);

            System.out.println("HelloServer ready and waiting ...");

            // wait for invocations from clients
            orb.run();
        } catch (Exception e) {
            System.err.println("ERROR: " + e);
            e.printStackTrace(System.out);
        }
        System.out.println("HelloServer Exiting ...");
    }
}
