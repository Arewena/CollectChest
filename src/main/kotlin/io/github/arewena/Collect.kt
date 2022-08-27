package io.github.arewena

import org.bukkit.Location
import org.bukkit.Material
import org.bukkit.block.Block
import org.bukkit.block.BlockFace
import org.bukkit.block.Chest
import org.bukkit.entity.Player
import org.bukkit.inventory.ItemStack

fun collect(location: Location, chest: Chest, face: BlockFace) {
    if (face == BlockFace.NORTH) {
        location.z -= 1
        for (i in 1..5) {
            for (j in 1..5) {
                for (l in 1..5) {
                    location.x += 1
                    chest.blockInventory.addItem(ItemStack(location.block.type))
                    location.block.type = Material.AIR


                }
                location.x -= 5
                location.z -= 1
            }
            location.y += 1
            location.z += 5
        }
    }
    else if (face == BlockFace.SOUTH) {
        location.z += 1
        for (i in 1..5) {
            for (j in 1..5) {
                for (l in 1..5) {
                    location.x -= 1
                    chest.blockInventory.addItem(ItemStack(location.block.type))
                    location.block.type = Material.AIR


                }
                location.x += 5
                location.z += 1
            }
            location.y += 1
            location.z -= 5
        }
    }

    else if (face == BlockFace.EAST) {
        location.x += 1
        for (i in 1..5) {
            for (j in 1..5) {
                for (l in 1..5) {
                    location.z += 1
                    chest.blockInventory.addItem(ItemStack(location.block.type))
                    location.block.type = Material.AIR


                }
                location.z -= 5
                location.x += 1
            }
            location.y += 1
            location.x -= 5
        }
    }

    else if (face == BlockFace.WEST) {
        location.x -= 1
        for (i in 1..5) {
            for (j in 1..5) {
                for (l in 1..5) {
                    location.z -= 1
                    chest.blockInventory.addItem(ItemStack(location.block.type))
                    location.block.type = Material.AIR


                }
                location.z += 5
                location.x -= 1
            }
            location.y += 1
            location.x += 5
        }
    }


}