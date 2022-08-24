package io.github.arewena

import org.bukkit.Material
import org.bukkit.block.BlockFace
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.block.BlockPlaceEvent
import org.bukkit.plugin.java.JavaPlugin


class Main : JavaPlugin(), Listener {
    override fun onEnable() { this.server.pluginManager.registerEvents(this, this) }

    @EventHandler
    fun placeChest(e: BlockPlaceEvent) {
        if (e.block.type == Material.CHEST) {
            if (e.player.facing == BlockFace.NORTH) {
                faceBlock(BlockFace.NORTH, e.block.location)
            }
            else if (e.player.facing == BlockFace.SOUTH) {
                faceBlock(BlockFace.SOUTH, e.block.location)
            }
        }

    }
}


