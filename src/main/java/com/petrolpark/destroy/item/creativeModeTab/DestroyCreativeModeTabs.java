package com.petrolpark.destroy.item.creativeModeTab;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

import com.petrolpark.destroy.Destroy;
import com.petrolpark.destroy.block.DestroyBlocks;
import com.petrolpark.destroy.config.DestroySubstancesConfigs;
import com.petrolpark.destroy.fluid.DestroyFluids;
import com.petrolpark.destroy.item.BadgeItem;
import com.petrolpark.destroy.item.DestroyItems;
import com.petrolpark.destroy.item.creativeModeTab.CustomTab.ITabEntry;
import com.simibubi.create.AllBlocks;
import com.simibubi.create.AllCreativeModeTabs;
import com.simibubi.create.AllItems;
import com.simibubi.create.foundation.utility.Pair;
import com.tterrag.registrate.util.entry.ItemProviderEntry;
import com.tterrag.registrate.util.entry.RegistryEntry;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.CreativeModeTab.DisplayItemsGenerator;
import net.minecraft.world.item.CreativeModeTab.ItemDisplayParameters;
import net.minecraft.world.item.CreativeModeTab.Output;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class DestroyCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Destroy.MOD_ID);

    // public static final RegistryObject<CreativeModeTab> MAIN_TAB = TABS.register("base",
	// 	() -> CreativeModeTab.builder()
	// 		.title(Component.translatable("itemGroup.destroy.base"))
	// 		.withTabsBefore(CreativeModeTabs.SPAWN_EGGS)
	// 		.icon(() -> DestroyItems.LOGO.asStack())
	// 		.displayItems(new DestroyDisplayItemsGenerator())
	// 		.build()
    // );

	public static final RegistryObject<CreativeModeTab> MAIN_TAB = TABS.register(
		"base",
		() -> new CustomTab.Builder(CreativeModeTab.Row.TOP, 0)
			.add(

				s("chemistry_equipment"),
				i(DestroyBlocks.VAT_CONTROLLER), i(DestroyBlocks.STAINLESS_STEEL_BLOCK), i(DestroyBlocks.BOROSILICATE_GLASS), d(AllBlocks.FLUID_PIPE), d(AllBlocks.MECHANICAL_PUMP), i(DestroyItems.TEST_TUBE), d(AllBlocks.CREATIVE_FLUID_TANK), d(AllBlocks.BLAZE_BURNER), i(DestroyBlocks.COOLER), i(DestroyBlocks.BUBBLE_CAP), i(DestroyBlocks.CENTRIFUGE), i(DestroyBlocks.DYNAMO), i(DestroyBlocks.BLACKLIGHT), i(DestroyBlocks.COLORIMETER), i(DestroyBlocks.TEST_TUBE_RACK), i(DestroyBlocks.MEASURING_CYLINDER), i(DestroyItems.GAS_MASK), i(DestroyItems.HAZMAT_SUIT), i(DestroyItems.HAZMAT_LEGGINGS), i(DestroyItems.WELLINGTON_BOOTS),

				s("common_chemicals"),

				s("processing"),
				i(DestroyBlocks.AGING_BARREL), i(DestroyBlocks.EXTRUSION_DIE), i(DestroyBlocks.KEYPUNCH), i(DestroyBlocks.PUMPJACK), i(DestroyBlocks.TREE_TAP), i(DestroyItems.SEISMOMETER), i(DestroyBlocks.REDSTONE_PROGRAMMER), i(DestroyBlocks.POLLUTOMETER),

				s("kinetics"),
				i(DestroyBlocks.COAXIAL_GEAR), i(DestroyBlocks.COLOSSAL_COGWHEEL), i(DestroyBlocks.DIFFERENTIAL), i(DestroyBlocks.DOUBLE_CARDAN_SHAFT), i(DestroyBlocks.COLOSSAL_COGWHEEL),

				s("metals"),
				n(), i(DestroyItems.CHROMIUM_INGOT), i(DestroyBlocks.CHROMIUM_BLOCK), i(DestroyItems.CHROMIUM_POWDER), i(DestroyItems.CRUSHED_RAW_CHROMIUM), d(DestroyItems.CHROMIUM_NUGGET), 
				n(), d(Items.COPPER_INGOT), d(Blocks.COPPER_BLOCK), i(DestroyItems.COPPER_POWDER), d(AllItems.COPPER_SHEET), d(AllItems.CRUSHED_COPPER),
				n(), i(DestroyItems.STAINLESS_STEEL_INGOT), r(DestroyBlocks.STAINLESS_STEEL_BLOCK), e(), i(DestroyItems.STAINLESS_STEEL_SHEET), i(DestroyItems.STAINLESS_STEEL_ROD), i(DestroyBlocks.STAINLESS_STEEL_RODS), i(DestroyItems.MOLTEN_STAINLESS_STEEL_BUCKET),
				n(), d(Items.IRON_INGOT), d(Blocks.IRON_BLOCK), i(DestroyItems.IRON_POWDER), d(AllItems.CRUSHED_IRON), d(AllItems.IRON_SHEET),d(Items.RAW_IRON), d(Blocks.RAW_IRON_BLOCK), d(Blocks.IRON_ORE), d(Blocks.DEEPSLATE_IRON_ORE),
				n(), i(DestroyItems.LEAD_INGOT), i(DestroyBlocks.LEAD_BLOCK), i(DestroyItems.LEAD_POWDER), d(AllItems.CRUSHED_LEAD), e(), e(), i(DestroyItems.NETHER_CROCOITE), i(DestroyBlocks.NETHER_CROCOITE_BLOCK),
				n(), i(DestroyItems.NICKEL_INGOT), i(DestroyBlocks.NICKEL_BLOCK), i(DestroyItems.NICKEL_POWDER), d(AllItems.CRUSHED_NICKEL), e(), i(DestroyItems.RAW_NICKEL), d(DestroyBlocks.RAW_NICKEL_BLOCK), d(DestroyBlocks.NICKEL_ORE), d(DestroyBlocks.DEEPSLATE_NICKEL_ORE),
				n(), i(DestroyItems.PALLADIUM_INGOT), i(DestroyBlocks.PALLADIUM_BLOCK), i(DestroyItems.PALLADIUM_POWDER), i(DestroyItems.CRUSHED_RAW_PALLADIUM),
				n(), i(DestroyItems.PLATINUM_INGOT), i(DestroyBlocks.PLATINUM_BLOCK), i(DestroyItems.PLATINUM_POWDER), d(AllItems.CRUSHED_PLATINUM),
				n(), i(DestroyItems.RHODIUM_INGOT), i(DestroyBlocks.RHODIUM_BLOCK), i(DestroyItems.RHODIUM_POWDER), i(DestroyItems.CRUSHED_RAW_RHODIUM), 
				n(), d(AllItems.ZINC_INGOT), d(AllBlocks.ZINC_BLOCK), i(DestroyItems.ZINC_POWDER), i(DestroyItems.ZINC_SHEET), d(AllItems.CRUSHED_ZINC), d(AllItems.RAW_ZINC), d(AllBlocks.RAW_ZINC_BLOCK), d(AllBlocks.ZINC_ORE), d(AllBlocks.DEEPSLATE_ZINC_ORE),
				//TODO pure gold

				s("plastics"),
				i(DestroyItems.POLYETHENE_TEREPHTHALATE), i(DestroyItems.POLYVINYL_CHLORIDE), i(DestroyItems.POLYETHENE), i(DestroyItems.POLYPROPENE), i(DestroyItems.POLYSTYRENE), i(DestroyItems.ABS), i(DestroyItems.POLYTETRAFLUOROETHENE), i(DestroyItems.NYLON), i(DestroyItems.POLYSTYRENE_BUTADIENE), i(DestroyItems.POLYACRYLONITRILE), i(DestroyItems.POLYISOPRENE), i(DestroyItems.POLYURETHANE), i(DestroyItems.POLYMETHYL_METHACRYLATE), i(DestroyItems.CARD_STOCK),

				s("resources"),
				i(DestroyItems.FLUORITE), i(DestroyBlocks.FLUORITE_BLOCK), i(DestroyBlocks.FLUORITE_ORE), i(DestroyBlocks.DEEPSLATE_FLUORITE_ORE), i(DestroyBlocks.END_FLUORITE_ORE), i(() -> new ItemStack(DestroyFluids.CRUDE_OIL.getBucket().get())), i(DestroyItems.BORAX), i(DestroyItems.SILICA), i(DestroyItems.MOLTEN_BOROSILICATE_GLASS_BUCKET), i(DestroyBlocks.BOROSILICATE_GLASS_FIBER), r(DestroyBlocks.BOROSILICATE_GLASS), i(DestroyItems.IODINE), i(DestroyBlocks.IODINE_BLOCK), i(DestroyItems.CARBON_FIBER), i(DestroyBlocks.CARBON_FIBER_BLOCK), i(DestroyBlocks.UNVARNISHED_PLYWOOD), i(DestroyBlocks.PLYWOOD), i(DestroyItems.CHALK_DUST), i(DestroyItems.ZEOLITE), i(DestroyItems.NANODIAMONDS),

				s("explosives"),
				n(), i(DestroyItems.ACETONE_PEROXIDE), i(DestroyItems.FULMINATED_MERCURY), i(DestroyItems.NICKEL_HYDRAZINE_NITRATE), i(DestroyItems.TOUCH_POWDER),
				n(), i(DestroyItems.ANFO), i(DestroyItems.CORDITE), i(DestroyItems.DYNAMITE), i(DestroyItems.NITROCELLULOSE), i(DestroyItems.PICRIC_ACID_TABLET), i(DestroyItems.TNT_TABLET), 
				n(), i(DestroyBlocks.DYNAMITE_BLOCK), i(DestroyBlocks.CUSTOM_MIX_EXPLOSIVE), i(DestroyBlocks.CORDITE_BLOCK), i(DestroyBlocks.EXTRUDED_CORDITE_BLOCK),
				
				s("pharmaceuticals"),
				i(DestroyItems.SYRINGE), i(DestroyItems.ASPIRIN_SYRINGE), i(DestroyItems.CISPLATIN_SYRINGE), c(DestroyItems.BABY_BLUE_SYRINGE, DestroySubstancesConfigs::babyBlueEnabled), c(DestroyItems.BABY_BLUE_CRYSTAL, DestroySubstancesConfigs::babyBlueEnabled), c(DestroyItems.BABY_BLUE_POWDER, DestroySubstancesConfigs::babyBlueEnabled), i(DestroyItems.SPRAY_BOTTLE), i(DestroyItems.PERFUME_BOTTLE), i(DestroyItems.SUNSCREEN_BOTTLE),
				
				s("food"),
				i(DestroyItems.NAPALM_SUNDAE), i(DestroyItems.THERMITE_BROWNIE), i(DestroyItems.BOMB_BON), i(DestroyItems.EMPTY_BOMB_BON),
				i(DestroyItems.BUTTER), i(DestroyItems.MASHED_POTATO), i(DestroyBlocks.MASHED_POTATO_BLOCK), i(DestroyItems.RAW_FRIES), i(DestroyBlocks.RAW_FRIES_BLOCK), i(DestroyItems.FRIES), i(DestroyItems.BANGERS_AND_MASH), i(DestroyItems.CHEWING_GUM), i(DestroyItems.EMPTY_CARTON), i(DestroyItems.APPLE_JUICE_CARTON), i(DestroyItems.MILK_CARTON),
				c(DestroyItems.MOONSHINE_BOTTLE, DestroySubstancesConfigs::alcoholEnabled), c(DestroyItems.MOONSHINE_BOTTLE, DestroySubstancesConfigs::alcoholEnabled), i(DestroyItems.CHORUS_WINE_BOTTLE),
				
				s("beetroots"),
				n(), i(DestroyItems.HEFTY_BEETROOT), i(DestroyItems.COAL_INFUSED_BEETROOT), i(DestroyItems.COPPER_INFUSED_BEETROOT), i(DestroyItems.DIAMOND_INFUSED_BEETROOT), i(DestroyItems.EMERALD_INFUSED_BEETROOT), i(DestroyItems.FLUORITE_INFUSED_BEETROOT), i(DestroyItems.GOLD_INFUSED_BEETROOT), i(DestroyItems.IRON_INFUSED_BEETROOT), i(DestroyItems.LAPIS_INFUSED_BEETROOT),
				n(), i(DestroyItems.BEETROOT_ASHES), i(DestroyItems.COAL_INFUSED_BEETROOT_ASHES), i(DestroyItems.COPPER_INFUSED_BEETROOT_ASHES), i(DestroyItems.DIAMOND_INFUSED_BEETROOT_ASHES), i(DestroyItems.EMERALD_INFUSED_BEETROOT_ASHES), i(DestroyItems.FLUORITE_INFUSED_BEETROOT_ASHES), i(DestroyItems.GOLD_INFUSED_BEETROOT_ASHES), i(DestroyItems.IRON_INFUSED_BEETROOT_ASHES), i(DestroyItems.LAPIS_INFUSED_BEETROOT_ASHES),
				n(), i(DestroyItems.NICKEL_INFUSED_BEETROOT), i(DestroyItems.REDSTONE_INFUSED_BEETROOT), i(DestroyItems.ZINC_INFUSED_BEETROOT), i(DestroyItems.HYPERACCUMULATING_FERTILIZER), i(DestroyItems.MAGIC_BEETROOT_SEEDS),
				n(), i(DestroyItems.NICKEL_INFUSED_BEETROOT_ASHES), i(DestroyItems.REDSTONE_INFUSED_BEETROOT_ASHES), i(DestroyItems.ZINC_INFUSED_BEETROOT_ASHES),

				s("periodic_table"),
				i(DestroyBlocks.HYDROGEN_PERIODIC_TABLE_BLOCK), i(DestroyBlocks.CARBON_PERIODIC_TABLE_BLOCK), i(DestroyBlocks.NITROGEN_PERIODIC_TABLE_BLOCK), i(DestroyBlocks.OXYGEN_PERIODIC_TABLE_BLOCK), i(DestroyBlocks.FLUORINE_PERIODIC_TABLE_BLOCK), i(DestroyBlocks.CHLORINE_PERIODIC_TABLE_BLOCK), i(DestroyBlocks.CHROMIUM_PERIODIC_TABLE_BLOCK), i(DestroyBlocks.IRON_PERIODIC_TABLE_BLOCK), i(DestroyBlocks.NICKEL_PERIODIC_TABLE_BLOCK), i(DestroyBlocks.COPPER_PERIODIC_TABLE_BLOCK), i(DestroyBlocks.ZINC_PERIODIC_TABLE_BLOCK), i(DestroyBlocks.RHODIUM_PERIODIC_TABLE_BLOCK), i(DestroyBlocks.PALLADIUM_PERIODIC_TABLE_BLOCK), i(DestroyBlocks.IODINE_PERIODIC_TABLE_BLOCK), i(DestroyBlocks.PLATINUM_PERIODIC_TABLE_BLOCK), i(DestroyBlocks.GOLD_PERIODIC_TABLE_BLOCK), i(DestroyBlocks.MERCURY_PERIODIC_TABLE_BLOCK), i(DestroyBlocks.LEAD_PERIODIC_TABLE_BLOCK),
				
				s("misc"),
				i(DestroyItems.BLANK_MUSIC_DISC), i(DestroyItems.MUSIC_DISC_SPECTRUM), i(DestroyItems.CIRCUIT_MASK), i(DestroyItems.RUINED_CIRCUIT_MASK), i(DestroyItems.CIRCUIT_BOARD), i(DestroyItems.RUINED_CIRCUIT_BOARD), i(DestroyItems.GAS_FILTER), i(DestroyItems.SWISS_ARMY_KNIFE), i(DestroyItems.BUCKET_AND_SPADE), i(DestroyItems.VOLTAIC_PILE), i(DestroyItems.DISCHARGED_VOLTAIC_PILE), i(DestroyItems.PAPER_PULP), i(DestroyItems.TEAR_BOTTLE), i(DestroyItems.URINE_BOTTLE), i(DestroyItems.YEAST)
			
			).title(Component.translatable("itemGroup.destroy.base"))
			.withTabsBefore(AllCreativeModeTabs.PALETTES_CREATIVE_TAB.getId())
			.icon(DestroyItems.LOGO::asStack)
			.build()
	);

	public static final ITabEntry e() {
		return ITabEntry.EMPTY;
	};

	public static final ITabEntry n() {
		return ITabEntry.LINE_BREAK;
	};

	private static final ITabEntry.Item i(ItemProviderEntry<?> item) {
		return new ITabEntry.Item(item::asStack);
	};

	public static final ITabEntry.Item i(Supplier<ItemStack> item) {
		return new ITabEntry.Item(item);
	};

	public static final ITabEntry.ConditionalItem c(ItemProviderEntry<?> item, Supplier<Boolean> condition) {
		return new ITabEntry.ConditionalItem(item::asStack, condition);
	};

	private static final ITabEntry.DuplicateItem r(ItemProviderEntry<?> item) {
		return new ITabEntry.DuplicateItem(item::asStack);
	};

	private static final ITabEntry.DuplicateItem d(ItemProviderEntry<?> item) {
		return new ITabEntry.DuplicateItem(item::asStack);
	};

	private static final ITabEntry.DuplicateItem d(ItemLike item) {
		return new ITabEntry.DuplicateItem(() -> new ItemStack(item));
	};

	private static final ITabEntry.Subheading s(String translationKey) {
		return new ITabEntry.Subheading(Component.translatable("itemGroup.destroy.base."+translationKey));
	};

    public static void register(IEventBus modEventBus) {
		TABS.register(modEventBus);
	};

	public static class DestroyDisplayItemsGenerator implements DisplayItemsGenerator {

		public static List<ItemProviderEntry<?>> excludedItems = new ArrayList<>();
		public static List<Pair<ItemProviderEntry<?>, Supplier<Boolean>>> conditionallyExcludedItems = new ArrayList<>();

		static {
			excludedItems.addAll(List.of(
				// Meta
				DestroyItems.LOGO,
				DestroyItems.POLLUTION_SYMBOL,
				DestroyItems.MOLECULE_DISPLAY,

				// Temporary items
				DestroyItems.UNFINISHED_BLACKLIGHT,
				DestroyItems.UNFINISHED_CIRCUIT_BOARD,
				DestroyItems.UNFINISHED_VOLTAIC_PILE,
				DestroyItems.UNFINISHED_UNVARNISHED_PLYWOOD,
				DestroyItems.UNPROCESSED_MASHED_POTATO,
				DestroyItems.UNPROCESSED_NAPALM_SUNDAE,
				DestroyItems.UNFINISHED_CARD_STOCK
			));
		};

		static {
			conditionallyExcludedItems.addAll(List.of(
				// Baby Blue-related Items
				Pair.of(DestroyItems.BABY_BLUE_CRYSTAL, DestroySubstancesConfigs::babyBlueEnabled),
				Pair.of(DestroyItems.BABY_BLUE_POWDER, DestroySubstancesConfigs::babyBlueEnabled),
				Pair.of(DestroyItems.BABY_BLUE_SYRINGE, DestroySubstancesConfigs::babyBlueEnabled),
				// Alcoholic Items
				Pair.of(DestroyItems.UNDISTILLED_MOONSHINE_BOTTLE, DestroySubstancesConfigs::alcoholEnabled),
				Pair.of(DestroyItems.MOONSHINE_BOTTLE, DestroySubstancesConfigs::alcoholEnabled)
			));
		};

		
		@Override
		public void accept(ItemDisplayParameters parameters, Output output) {
			for (RegistryEntry<Item> entry : Destroy.REGISTRATE.getAll(Registries.ITEM)) {
				if (conditionallyExcludedItems.stream().filter(p -> p.getFirst().equals(entry)).map(pair -> pair.getSecond().get()).findFirst().orElse(false)) continue;
				if (!excludedItems.contains(entry) && !(entry.get() instanceof BadgeItem)) {
					output.accept(new ItemStack(entry.get().asItem()));
				};
			};
		};
		
	};
};
