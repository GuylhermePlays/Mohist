/**
 * Automatically generated file, changes will be lost.
 */
package org.bukkit.craftbukkit.block.impl;

public final class CraftHopper extends org.bukkit.craftbukkit.block.data.CraftBlockData implements org.bukkit.block.data.type.Hopper, org.bukkit.block.data.Directional {

    public CraftHopper() {
        super();
    }

    public CraftHopper(net.minecraft.block.BlockState state) {
        super(state);
    }

    // org.bukkit.craftbukkit.block.data.type.CraftHopper

    private static final net.minecraft.state.PropertyBoolean ENABLED = getBoolean(net.minecraft.block.BlockHopper.class, "enabled");

    @Override
    public boolean isEnabled() {
        return get(ENABLED);
    }

    @Override
    public void setEnabled(boolean enabled) {
        set(ENABLED, enabled);
    }

    // org.bukkit.craftbukkit.block.data.CraftDirectional

    private static final net.minecraft.state.PropertyEnum<?> FACING = getEnum(net.minecraft.block.BlockHopper.class, "facing");

    @Override
    public org.bukkit.block.BlockFace getFacing() {
        return get(FACING, org.bukkit.block.BlockFace.class);
    }

    @Override
    public void setFacing(org.bukkit.block.BlockFace facing) {
        set(FACING, facing);
    }

    @Override
    public java.util.Set<org.bukkit.block.BlockFace> getFaces() {
        return getValues(FACING, org.bukkit.block.BlockFace.class);
    }
}