package com.google.android.gms.backup.settings.ui.optin;

import android.content.Context;
import com.google.android.gms.R;
import com.google.android.setupdesign.items.Item;
import defpackage.efrl;
import defpackage.efwn;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class OptInItem extends Item {
    public OptInItem(Context context, int i, int i2, int i3) {
        D(R.layout.sud_items_default);
        e(false);
        this.e = i;
        int i4 = efwn.a;
        if (efrl.w(context)) {
            C(context.getDrawable(i2));
        } else {
            C(context.getDrawable(i3));
            this.m = context.getColor(R.color.settings_preference_icon_color);
        }
    }

    public OptInItem(Context context, int i, int i2, int i3, int i4, int i5) {
        this(context, i, i2, i3);
        F(context.getString(i4));
        E(context.getString(i5));
    }
}
