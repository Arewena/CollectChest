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
            faceBlock(e.player.facing, e.block.location)

        }

    }
}


