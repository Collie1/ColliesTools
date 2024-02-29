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

    public static ItemGroup colliesToolsGroup = FabricItemGroup.builder()
            .icon(() -> new ItemStack(elementalSword))
            .displayName(Text.translatable("itemGroup.collies_tools"))
            .entries((displayContext, entries) -> {
                entries.add(elementalSword);
                entries.add(elementalAxe);
            })
            .build();

    public static void Init() {
        Registry.register(Registries.ITEM, new Identifier(ColliesTools.mod_id, "elemental_sword"), elementalSword);
        Registry.register(Registries.ITEM, new Identifier(ColliesTools.mod_id, "elemental_axe"), elementalAxe);
        Registry.register(Registries.ITEM_GROUP, new Identifier(ColliesTools.mod_id, "collies_tools"), colliesToolsGroup);

    }

}
