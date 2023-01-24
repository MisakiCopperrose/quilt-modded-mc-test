package com.hubbycraft.necromancy_for_dummies

import net.minecraft.item.BlockItem
import net.minecraft.item.Item
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.util.Identifier

object TestRegisterer {
    private val testBlock = TestBlock()
    private val testItem = TestItem()

    fun registerBlocks() {
        Registry.register(
            Registries.BLOCK,
            Identifier("test","test_block"),
            testBlock
        )
    }

    fun registerItems() {
        Registry.register(
            Registries.ITEM,
            Identifier("test","test_block"),
            BlockItem(testBlock, Item.Settings())
        )

        Registry.register(
            Registries.ITEM,
            Identifier("test", "test_tool"),
            testItem
        )
    }

    fun registerTools() {

    }
}
