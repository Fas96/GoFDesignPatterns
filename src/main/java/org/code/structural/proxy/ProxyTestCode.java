package org.code.structural.proxy;

public class ProxyTestCode {
    public static void main(String[] args) {
        Internet internet = new ProxyInternet();
        System.out.println("==========ProxyInternet==========");

        for (String site : new String[]{"abc.com", "def.com", "ijk.com", "lnm.com", "google.com"}) {
            try {
                internet.connectToHost(site);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("ProxyInternet is a proxy of DefaultInternet: " + (internet instanceof DefaultInternet));
    }
}
