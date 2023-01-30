package com.hubbycraft.necromancy_for_dummies.items.testItems.staffs

import net.minecraft.entity.EntityType
import net.minecraft.entity.SpawnReason
import net.minecraft.item.Item
import net.minecraft.item.ItemUsageContext
import net.minecraft.item.Items
import net.minecraft.server.world.ServerWorld
import net.minecraft.util.ActionResult
import net.minecraft.util.math.Direction
import net.minecraft.world.event.GameEvent
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings

class DeathStaff : Item(QuiltItemSettings()) {
    override fun useOnBlock(context: ItemUsageContext): ActionResult {
        val world = context.world

        if (world is ServerWorld) {
            var blockPos = context.blockPos

            val player = context.player
            val blockState = world.getBlockState(blockPos)

            if (!blockState.getCollisionShape(world, blockPos).isEmpty) {
                blockPos = blockPos.offset(context.side)
            }

            // grab and save reference
            val skeletonEntity = EntityType.SKELETON.spawnFromItemStack(
                world,
                context.stack,
                player,
                blockPos,
                SpawnReason.MOB_SUMMONED,
                true,
                context.side == Direction.UP
            )
            // use reference to equip armor
            skeletonEntity?.tryEquip(Items.DIAMOND_HELMET.defaultStack)

            world.emitGameEvent(player, GameEvent.ENTITY_PLACE, blockPos)

            return ActionResult.CONSUME
        }

        return ActionResult.SUCCESS
    }
}
