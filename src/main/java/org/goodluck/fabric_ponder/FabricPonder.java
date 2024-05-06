package org.goodluck.fabric_ponder;

import dev.latvian.mods.kubejs.fabric.KubeJSFabric;
import net.fabricmc.api.DedicatedServerModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FabricPonder extends KubeJSFabric implements DedicatedServerModInitializer {
    private static final Logger log = LogManager.getLogger(FabricPonder.class);

    @Override
    public void onInitializeServer() {
        log.info("hello server");
    }
}
