package net.rodsduarte.mythrilore.item.client;

import net.rodsduarte.mythrilore.MythrilOreMod;
import net.rodsduarte.mythrilore.item.custom.MythrilArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class MythrilArmorModel extends GeoModel<MythrilArmorItem> {

	@Override
	public ResourceLocation getModelResource(MythrilArmorItem animatable) {
        return new ResourceLocation(MythrilOreMod.MOD_ID, "geo/mythril_armor.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MythrilArmorItem animatable) {
        return new ResourceLocation(MythrilOreMod.MOD_ID, "textures/armor/mythril_armor.png");
	}

	@Override
	public ResourceLocation getAnimationResource(MythrilArmorItem animatable) {
        return new ResourceLocation(MythrilOreMod.MOD_ID, "animations/mythril_armor.animation.json");
	}
    
}
