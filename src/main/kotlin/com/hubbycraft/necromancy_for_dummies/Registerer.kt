package com.hubbycraft.necromancy_for_dummies

import com.hubbycraft.necromancy_for_dummies.blocks.TestBlock
import com.hubbycraft.necromancy_for_dummies.testItems.DeathStaff
import com.hubbycraft.necromancy_for_dummies.testItems.DeathStaffv2
import com.hubbycraft.necromancy_for_dummies.testItems.ZombieStaff
import net.minecraft.item.BlockItem
import net.minecraft.item.Item
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.util.Identifier

object Registerer {
    private val testBlock = TestBlock()
    private val deathStaff = DeathStaff()
    private val deathStaffv2 = DeathStaffv2()
    private val zombieStaff = ZombieStaff()

    fun registerBlocks() {
        Registry.register(
            Registries.BLOCK,
            Identifier("nfd","test_block"),
            testBlock
        )
    }

    fun registerItems() {
        Registry.register(
            Registries.ITEM,
            Identifier("nfd","test_block"),
            BlockItem(testBlock, Item.Settings())
        )

        Registry.register(
            Registries.ITEM,
            Identifier("nfd", "deathstaff"),
            deathStaff
        )

        Registry.register(
            Registries.ITEM,
            Identifier("nfd", "deathstaffv2"),
            deathStaffv2
        )

        Registry.register(
            Registries.ITEM,
            Identifier("nfd", "zombiestaff"),
            zombieStaff
        )
    }

    fun registerTools() {

    }
}
