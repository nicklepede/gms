package com.google.android.gms.setupservices.item;

import android.content.Context;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
@Deprecated
/* loaded from: classes6.dex */
public class GoogleServicesExpandableSwitchItemWithBlueChip extends GoogleServicesExpandableItem {
    public GoogleServicesExpandableSwitchItemWithBlueChip(Context context, int i) {
        super(context, i, true, true, false);
    }

    @Override // com.google.android.setupdesign.items.ExpandableSwitchItem, com.google.android.setupdesign.items.SwitchItem, com.google.android.setupdesign.items.Item
    protected final int a() {
        return R.layout.sud_items_expandable_switch_with_blue_chip;
    }
}
