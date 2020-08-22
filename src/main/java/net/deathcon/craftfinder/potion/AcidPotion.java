
package net.deathcon.craftfinder.potion;

@CraftfinderModElements.ModElement.Tag
public class AcidPotion extends CraftfinderModElements.ModElement {

	@ObjectHolder("craftfinder:acid")
	public static final Effect potion = null;

	@ObjectHolder("craftfinder:acid")
	public static final Potion potionType = null;

	public AcidPotion(CraftfinderModElements instance) {
		super(instance, 15);

		FMLJavaModLoadingContext.get().getModEventBus().register(this);
	}

	@SubscribeEvent
	public void registerEffect(RegistryEvent.Register<Effect> event) {
		event.getRegistry().register(new EffectCustom());
	}

	@SubscribeEvent
	public void registerPotion(RegistryEvent.Register<Potion> event) {
		event.getRegistry().register(new PotionCustom());
	}

	public static class PotionCustom extends Potion {

		public PotionCustom() {
			super(new EffectInstance(potion, 3600));
			setRegistryName("acid");
		}

	}

	public static class EffectCustom extends Effect {

		private final ResourceLocation potionIcon;

		public EffectCustom() {
			super(EffectType.HARMFUL, -16751053);
			setRegistryName("acid");
			potionIcon = new ResourceLocation("craftfinder:textures/wip.png");
		}

		@Override
		public String getName() {
			return "effect.acid";
		}

		@Override
		public boolean isBeneficial() {
			return false;
		}

		@Override
		public boolean isInstant() {
			return false;
		}

		@Override
		public boolean shouldRenderInvText(EffectInstance effect) {
			return true;
		}

		@Override
		public boolean shouldRender(EffectInstance effect) {
			return true;
		}

		@Override
		public boolean shouldRenderHUD(EffectInstance effect) {
			return true;
		}

		@Override
		public boolean isReady(int duration, int amplifier) {
			return true;
		}

	}

}
