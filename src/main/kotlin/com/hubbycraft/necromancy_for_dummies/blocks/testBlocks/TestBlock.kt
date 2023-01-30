package com.hubbycraft.necromancy_for_dummies.blocks

import net.minecraft.block.Block
import net.minecraft.block.BlockState
import net.minecraft.block.Material
import net.minecraft.entity.player.PlayerEntity
import net.minecraft.sound.SoundCategory
import net.minecraft.sound.SoundEvents
import net.minecraft.util.ActionResult
import net.minecraft.util.Hand
import net.minecraft.util.hit.BlockHitResult
import net.minecraft.util.math.BlockPos
import net.minecraft.world.World
import org.quiltmc.qsl.block.extensions.api.QuiltBlockSettings

class TestBlock : Block(QuiltBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()) {

    @Deprecated("", ReplaceWith("ActionResult.SUCCESS", "net.minecraft.util.ActionResult"))
    override fun onUse(
        state: BlockState,
        world: World,
        pos: BlockPos,
        player: PlayerEntity,
        hand: Hand,
        hit: BlockHitResult
    ): ActionResult {
        if (!world.isClient) {
            world.playSound(
                null,
                pos,
                SoundEvents.BLOCK_ANVIL_LAND,
                SoundCategory.BLOCKS,
                1f,
                1f
            )
        }

        return ActionResult.SUCCESS
    }
}
