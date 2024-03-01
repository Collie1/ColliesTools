package io.github.collie1.colliestools.item;

import io.github.collie1.colliestools.ColliesTools;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final SwordItem elementalSword = new SwordItem(ToolMaterials.DIAMOND, 7, -2.0f, new FabricItemSettings()
            .fireproof());

    public static final AxeItem elementalAxe = new AxeItem(ToolMaterials.DIAMOND, 11, -3.0f, new FabricItemSettings()
            .fireproof());

    public static final PickaxeItem elementalPick = new PickaxeItem(ToolMaterials.DIAMOND, 8, -3.0f, new FabricItemSettings()
            .fireproof());

    public static final ShovelItem elementalShovel = new ShovelItem(ToolMaterials.DIAMOND, 3, -3.0f, new FabricItemSettings()
            .fireproof());

    public static final HoeItem elementalHoe = new HoeItem(ToolMaterials.DIAMOND, 2, -3.0f, new FabricItemSettings()
            .fireproof());

    public static final Item elementalIngot = new Item(new FabricItemSettings()
            .fireproof());
    public static ItemGroup colliesToolsGroup = FabricItemGroup.builder()
            .icon(() -> new ItemStack(elementalIngot))
            .displayName(Text.translatable("itemGroup.collies_tools"))
            .entries((displayContext, entries) -> {
                entries.add(elementalSword);
                entries.add(elementalAxe);
                entries.add(elementalPick);
                entries.add(elementalShovel);
                entries.add(elementalHoe);
                entries.add(elementalIngot);
            })
            .build();

    public static void Init() {
        Registry.register(Registries.ITEM, new Identifier(ColliesTools.mod_id, "elemental_sword"), elementalSword);
        Registry.register(Registries.ITEM, new Identifier(ColliesTools.mod_id, "elemental_axe"), elementalAxe);
        Registry.register(Registries.ITEM, new Identifier(ColliesTools.mod_id, "elemental_pickaxe"), elementalPick);
        Registry.register(Registries.ITEM, new Identifier(ColliesTools.mod_id, "elemental_shovel"), elementalShovel);
        Registry.register(Registries.ITEM, new Identifier(ColliesTools.mod_id, "elemental_hoe"), elementalHoe);
        Registry.register(Registries.ITEM, new Identifier(ColliesTools.mod_id, "elemental_ingot"), elementalIngot);
        Registry.register(Registries.ITEM_GROUP, new Identifier(ColliesTools.mod_id, "collies_tools"), colliesToolsGroup);

    }

}
