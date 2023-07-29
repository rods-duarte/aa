package net.rodsduarte.mythrilore.item.client;

import net.rodsduarte.mythrilore.item.custom.MythrilArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class MythrilArmorRenderer extends GeoArmorRenderer<MythrilArmorItem> {
    public MythrilArmorRenderer() {
        super(new MythrilArmorModel());
    }
}
