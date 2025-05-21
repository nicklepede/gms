package com.google.android.gms.accountsettings.widget;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.material.tabs.TabLayout;
import defpackage.ecaa;
import defpackage.taj;
import defpackage.tak;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class PagerTabLayout extends TabLayout {
    public tak a;
    public taj b;

    public PagerTabLayout(Context context) {
        super(context);
    }

    @Override // com.google.android.material.tabs.TabLayout
    public final void a(ecaa ecaaVar, int i, boolean z) {
        tak takVar = this.a;
        if (takVar != null) {
            takVar.a(ecaaVar, i);
        }
        super.a(ecaaVar, i, z);
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
