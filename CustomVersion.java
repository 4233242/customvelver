package net.minehorizon.customversionvelocity;

import com.google.inject.Inject;
import com.velocitypowered.api.event.proxy.ProxyPingEvent;
import com.velocitypowered.api.plugin.Plugin;
import com.velocitypowered.api.proxy.ProxyServer;
import com.velocitypowered.api.proxy.server.ServerPing;
import org.slf4j.Logger;

@Plugin(id = "UltimateVersion", name = "UltimateCustomVersion", version = "1.1", description = "Excellent new versions", authors = {"Aderm"})
public class CustomVersion {

    private final ProxyServer server;
    private final Logger logger;

    @Inject
    public CustomVersion(ProxyServer server, Logger logger) {
        this.server = server;
        this.logger = logger;

        logger.info("CustomVersion loaded");
    }

    public void pingEvent(ProxyPingEvent event) {
        event.setPing(ServerPing.builder().getVersion());
    }

    public ProxyServer getServer() {
        return server;
    }

    public Logger getLogger() {
        return logger;
    }

}
