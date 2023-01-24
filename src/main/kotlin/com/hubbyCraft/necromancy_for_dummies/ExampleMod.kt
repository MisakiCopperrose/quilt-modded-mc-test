package com.hubbyCraft.necromancy_for_dummies

import org.quiltmc.loader.api.ModContainer
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer
import org.slf4j.Logger
import org.slf4j.LoggerFactory

object NecromancyForDummies : ModInitializer {
    val LOGGER: Logger = LoggerFactory.getLogger("Necromancy For Dummies")
    val MOD_ID: String = "necromancy_for_dummies";

    override fun onInitialize(mod: ModContainer) {
        LOGGER.info("Hello Quilt world from {}!", mod.metadata()?.name())
    }
}
