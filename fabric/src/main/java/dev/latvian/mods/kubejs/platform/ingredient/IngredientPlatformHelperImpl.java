package dev.latvian.mods.kubejs.platform.ingredient;

import dev.latvian.mods.kubejs.item.ingredient.IngredientPlatformHelper;
import dev.latvian.mods.kubejs.item.ingredient.IngredientStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import org.jetbrains.annotations.Nullable;

import java.util.UUID;
import java.util.function.Predicate;
import java.util.regex.Pattern;

public class IngredientPlatformHelperImpl implements IngredientPlatformHelper {
	public static void register() {
	}

	@Override
	public IngredientStack stack(Ingredient ingredient, int count) {
		return null;
	}

	@Override
	public Ingredient wildcard() {
		return null;
	}

	@Override
	public Ingredient custom(Ingredient parent, Predicate<ItemStack> predicate) {
		return null;
	}

	@Override
	public Ingredient custom(Ingredient parent, @Nullable UUID uuid) {
		return null;
	}

	@Override
	public Ingredient tag(String tag) {
		return null;
	}

	@Override
	public Ingredient mod(String mod) {
		return null;
	}

	@Override
	public Ingredient regex(Pattern pattern) {
		return null;
	}

	@Override
	public Ingredient creativeTab(CreativeModeTab tab) {
		return null;
	}

	@Override
	public Ingredient not(Ingredient ingredient) {
		return null;
	}

	@Override
	public Ingredient or(Ingredient[] ingredients) {
		return null;
	}

	@Override
	public Ingredient and(Ingredient[] ingredients) {
		return null;
	}

	@Override
	public Ingredient ignoreNBT(Item item) {
		return null;
	}

	@Override
	public Ingredient strongNBT(ItemStack item) {
		return null;
	}

	@Override
	public Ingredient weakNBT(ItemStack item) {
		return null;
	}
}
