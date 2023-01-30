package com.hubbycraft.necromancy_for_dummies.items.testItems.staffs

import net.minecraft.entity.EntityType
import net.minecraft.entity.SpawnReason
import net.minecraft.item.Item
import net.minecraft.item.ItemUsageContext
import net.minecraft.server.world.ServerWorld
import net.minecraft.util.ActionResult
import net.minecraft.util.math.Direction
import net.minecraft.world.event.GameEvent
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings

class DeathStaffV2 : Item(QuiltItemSettings()) {
    override fun useOnBlock(context: ItemUsageContext): ActionResult {
        val world = context.world

        if (world is ServerWorld) {
            var blockPos = context.blockPos

            val player = context.player
            val blockState = world.getBlockState(blockPos)

            if (!blockState.getCollisionShape(world, blockPos).isEmpty) {
                blockPos = blockPos.offset(context.side)
            }

            EntityType.SKELETON_HORSE.spawnFromItemStack(
                world,
                context.stack,
                player,
                blockPos,
                SpawnReason.MOB_SUMMONED,
                true,
                context.side == Direction.UP
            )

            world.emitGameEvent(player, GameEvent.ENTITY_PLACE, blockPos)

            return ActionResult.CONSUME
        }

        return ActionResult.SUCCESS
    }
}
