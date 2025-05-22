package com.google.android.gms.accountsettings.widget;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.material.tabs.TabLayout;
import defpackage.eemp;
import defpackage.uwi;
import defpackage.uwj;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class PagerTabLayout extends TabLayout {
    public uwj a;
    public uwi b;

    public PagerTabLayout(Context context) {
        super(context);
    }

    @Override // com.google.android.material.tabs.TabLayout
    public final void a(eemp eempVar, int i, boolean z) {
        uwj uwjVar = this.a;
        if (uwjVar != null) {
            uwjVar.a(eempVar, i);
        }
        super.a(eempVar, i, z);
    }

    @Override // android.view.View
    protected final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        this.b.a.a(i);
    }

    public PagerTabLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PagerTabLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
