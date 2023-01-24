package com.hubbycraft.necromancy_for_dummies

import net.minecraft.block.Block
import net.minecraft.block.Material
import org.quiltmc.qsl.block.extensions.api.QuiltBlockSettings

class TestBlock : Block(QuiltBlockSettings.of(Material.METAL).strength(4.0f).requiresTool())
