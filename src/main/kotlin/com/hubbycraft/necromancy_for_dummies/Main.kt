package com.hubbycraft.necromancy_for_dummies

import org.quiltmc.loader.api.ModContainer
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer
import org.slf4j.Logger
import org.slf4j.LoggerFactory

object Main : ModInitializer {
    val LOGGER: Logger = LoggerFactory.getLogger("Example Mod")

    override fun onInitialize(mod: ModContainer) {
        LOGGER.info("Hello Quilt world from {}!", mod.metadata()?.name())

        Registerer.registerBlocks()
        Registerer.registerItems()
        Registerer.registerTools()
    }
}
