package org.code.structural.proxy;

public class ProxyInternet implements Internet{
    private Internet internet = new DefaultInternet();
    private static String[] bannedSites = {"abc.com", "def.com", "ijk.com", "lnm.com"};

    @Override
    public void connectToHost(String serverHost) throws Exception {
        for (String site : bannedSites) {
            if (serverHost.contains(site)) {
                throw new Exception("Access Denied: connection to " + serverHost + " is blocked");
            }
        }
        internet.connectToHost(serverHost);
    }
}
