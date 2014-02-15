package com.stub;

import java.util.*;
import javax.naming.*;

public class EntreeServer {

    public static void main(String args[]) throws Exception {

        Hashtable<String, String> env = new Hashtable<String, String>();
        env.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.cosnaming.CNCtxFactory");
        env.put(Context.PROVIDER_URL, "iiop://localhost:1049");
        Context ctx = new InitialContext(env);

        Entree c = new EntreeImpl();
        ctx.rebind("entree", c);
    }
}
