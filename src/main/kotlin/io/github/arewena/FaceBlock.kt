package io.github.arewena


import org.bukkit.Location
import org.bukkit.Material
import org.bukkit.block.Block
import org.bukkit.block.BlockFace
import org.bukkit.block.Chest



fun faceBlock(blockFace: BlockFace, location: Location) {
    fun woolFun(face: Int, location: Location, location2: Location, loop : Int) {
        if (face == 1) {
            for (i in 1..loop) {
            location.block.type = Material.RED_WOOL
            location.add(location2)
            }
        }
    }

    if (blockFace == BlockFace.NORTH) {
        val forCollect = Location(location.world, location.x, location.y, location.z)
        forCollect.z -= 2


        location.z -= 1
        location.y -= 1

        woolFun(1, location, Location(location.world, 0.0, 1.0, 0.0), 6)
        location.y -= 6

        woolFun(1, location, Location(location.world, 1.0, 0.0, 0.0), 7)
        location.x -= 1

        woolFun(1, location, Location(location.world, 0.0, 1.0, 0.0), 6)
        location.y -= 6

        woolFun(1, location, Location(location.world, 0.0, 0.0, -1.0), 6)
        woolFun(1, location, Location(location.world, 0.0, 1.0, 0.0), 6)
        location.y -= 6

        woolFun(1, location, Location(location.world, -1.0, 0.0, 0.0), 6)
        woolFun(1, location, Location(location.world, 0.0, 1.0, 0.0), 6)
        location.y -= 6

        woolFun(1, location, Location(location.world, 0.0, 0.0, 1.0), 6)
        location.y += 6

        woolFun(1, location, Location(location.world, 1.0, 0.0, 0.0), 6)
        woolFun(1, location, Location(location.world, 0.0, 0.0, -1.0), 6)
        woolFun(1, location, Location(location.world, -1.0, 0.0, 0.0), 6)
        woolFun(1, location, Location(location.world, 0.0, 0.0, 1.0), 6)

    }

    if (blockFace == BlockFace.SOUTH) {
        location.z += 1
        location.y -= 1

        woolFun(1, location, Location(location.world, 0.0, 1.0, 0.0), 6)
        location.y -= 6

        woolFun(1, location, Location(location.world, -1.0, 0.0, 0.0), 7)
        location.x += 1

        woolFun(1, location, Location(location.world, 0.0, 1.0, 0.0), 6)
        location.y -= 6

        woolFun(1, location, Location(location.world, 0.0, 0.0, 1.0), 6)
        woolFun(1, location, Location(location.world, 0.0, 1.0, 0.0), 6)
        location.y -= 6

        woolFun(1, location, Location(location.world, 1.0, 0.0, 0.0), 6)
        woolFun(1, location, Location(location.world, 0.0, 1.0, 0.0), 6)
        location.y -= 6

        woolFun(1, location, Location(location.world, 0.0, 0.0, -1.0), 6)
        location.y += 6

        woolFun(1, location, Location(location.world, -1.0, 0.0, 0.0), 6)
        woolFun(1, location, Location(location.world, 0.0, 0.0, 1.0), 6)
        woolFun(1, location, Location(location.world, 1.0, 0.0, 0.0), 6)
        woolFun(1, location, Location(location.world, 0.0, 0.0, -1.0), 6)
    }

    if (blockFace == BlockFace.WEST) {
        location.x -= 1
        location.y -= 1

        woolFun(1, location, Location(location.world, 0.0, 1.0, 0.0), 6)
        location.y -= 6

        woolFun(1, location, Location(location.world, 0.0, 0.0, -1.0), 7)
        location.z += 1

        woolFun(1, location, Location(location.world, 0.0, 1.0, 0.0), 6)
        location.y -= 6

        woolFun(1, location, Location(location.world, -1.0, 0.0, 0.0), 6)
        woolFun(1, location, Location(location.world, 0.0, 1.0, 0.0), 6)
        location.y -= 6

        woolFun(1, location, Location(location.world, 0.0, 0.0, 1.0), 6)
        woolFun(1, location, Location(location.world, 0.0, 1.0, 0.0), 6)
        location.y -= 6

        woolFun(1, location, Location(location.world, 1.0, 0.0, 0.0), 6)
        location.y += 6

        woolFun(1, location, Location(location.world, 0.0, 0.0, -1.0), 6)
        woolFun(1, location, Location(location.world, -1.0, 0.0, 0.0), 6)
        woolFun(1, location, Location(location.world, 0.0, 0.0, 1.0), 6)
        woolFun(1, location, Location(location.world, 1.0, 0.0, 0.0), 6)
    }

    if (blockFace == BlockFace.EAST) {
        location.x += 1
        location.y -= 1

        woolFun(1, location, Location(location.world, 0.0, 1.0, 0.0), 6)
        location.y -= 6

        woolFun(1, location, Location(location.world, 0.0, 0.0, 1.0), 7)
        location.z -= 1

        woolFun(1, location, Location(location.world, 0.0, 1.0, 0.0), 6)
        location.y -= 6

        woolFun(1, location, Location(location.world, 1.0, 0.0, 0.0), 6)
        woolFun(1, location, Location(location.world, 0.0, 1.0, 0.0), 6)
        location.y -= 6

        woolFun(1, location, Location(location.world, 0.0, 0.0, -1.0), 6)
        woolFun(1, location, Location(location.world, 0.0, 1.0, 0.0), 6)
        location.y -= 6

        woolFun(1, location, Location(location.world, -1.0, 0.0, 0.0), 6)
        location.y += 6

        woolFun(1, location, Location(location.world, 0.0, 0.0, 1.0), 6)
        woolFun(1, location, Location(location.world, 1.0, 0.0, 0.0), 6)
        woolFun(1, location, Location(location.world, 0.0, 0.0, -1.0), 6)
        woolFun(1, location, Location(location.world, -1.0, 0.0, 0.0), 6)
    }
}
