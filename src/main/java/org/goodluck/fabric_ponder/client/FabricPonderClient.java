package org.goodluck.fabric_ponder.client;

import dev.latvian.mods.kubejs.fabric.KubeJSFabricClient;
import net.fabricmc.api.ClientModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FabricPonderClient extends KubeJSFabricClient implements ClientModInitializer {
    private static final Logger log = LogManager.getLogger(FabricPonderClient.class);

    @Override
    public void onInitializeClient() {
        log.info("hello client");
    }
}
