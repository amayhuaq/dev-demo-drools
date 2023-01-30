package com.ejemplo.negocio;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;


public class CompraTest {

	public static void main(String[] args) {
		try {
	        KieServices ks = KieServices.Factory.get();
    	    KieContainer kContainer = ks.getKieClasspathContainer();
        	KieSession kSession = kContainer.newKieSession("CompraKS");

            Cliente cliente1 = new Cliente("Juan Perez", true);
            Cliente cliente2 = new Cliente("Maria Gomez", false);
            
            Compra compra1 = new Compra(cliente1, 2000);
            Compra compra2 = new Compra(cliente2, 2000);
            Compra compra3 = new Compra(cliente2, 500);
            
            kSession.insert(compra1);
            kSession.insert(compra2);
            kSession.insert(compra3);
            
            kSession.fireAllRules();
        } catch (Throwable t) {
            t.printStackTrace();
        }
	}
}
