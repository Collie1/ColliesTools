package io.github.collie1.colliestools.datagen;

import io.github.collie1.colliestools.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

public class RecipeGenerator extends FabricRecipeProvider {

    public RecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.elementalSword, 1)
                .pattern(" I ")
                .pattern(" I ")
                .pattern(" s ")
                .input('I', ModItems.elementalIngot)
                .input('s', Items.STICK)

                .criterion(hasItem(ModItems.elementalIngot), conditionsFromItem(ModItems.elementalIngot))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))

                .offerTo(exporter, new Identifier(getRecipeName(ModItems.elementalSword)));


        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.elementalPick, 1)
                .pattern("III")
                .pattern(" s ")
                .pattern(" s ")
                .input('I', ModItems.elementalIngot)
                .input('s', Items.STICK)

                .criterion(hasItem(ModItems.elementalIngot), conditionsFromItem(ModItems.elementalIngot))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))

                .offerTo(exporter, new Identifier(getRecipeName(ModItems.elementalPick)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.elementalHoe, 1)
                .pattern("II ")
                .pattern(" s ")
                .pattern(" s ")
                .input('I', ModItems.elementalIngot)
                .input('s', Items.STICK)

                .criterion(hasItem(ModItems.elementalIngot), conditionsFromItem(ModItems.elementalIngot))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))

                .offerTo(exporter, new Identifier(getRecipeName(ModItems.elementalHoe)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.elementalShovel, 1)
                .pattern(" I ")
                .pattern(" s ")
                .pattern(" s ")
                .input('I', ModItems.elementalIngot)
                .input('s', Items.STICK)

                .criterion(hasItem(ModItems.elementalIngot), conditionsFromItem(ModItems.elementalIngot))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))

                .offerTo(exporter, new Identifier(getRecipeName(ModItems.elementalShovel)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.elementalAxe, 1)
                .pattern("II ")
                .pattern("Is ")
                .pattern(" s ")
                .input('I', ModItems.elementalIngot)
                .input('s', Items.STICK)

                .criterion(hasItem(ModItems.elementalIngot), conditionsFromItem(ModItems.elementalIngot))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))

                .offerTo(exporter, new Identifier(getRecipeName(ModItems.elementalAxe)));


        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.elementalIngot, 1)
                .pattern(" I ")
                .pattern("IGI")
                .pattern(" I ")
                .input('I', Items.IRON_INGOT)
                .input('G', Items.GOLD_INGOT)

                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .criterion(hasItem(Items.GOLD_INGOT), conditionsFromItem(Items.GOLD_INGOT))

                .offerTo(exporter, new Identifier(getRecipeName(ModItems.elementalIngot)));
    }
}
