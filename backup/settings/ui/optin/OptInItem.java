package com.google.android.gms.backup.settings.ui.optin;

import android.content.Context;
import com.google.android.gms.R;
import com.google.android.setupdesign.items.Item;
import defpackage.edeq;
import defpackage.edjs;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class OptInItem extends Item {
    public OptInItem(Context context, int i, int i2, int i3) {
        D(R.layout.sud_items_default);
        e(false);
        this.e = i;
        int i4 = edjs.a;
        if (edeq.w(context)) {
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
