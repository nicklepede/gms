package com.google.android.gms.family.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class BulletedList extends LinearLayout {
    public int a;

    public BulletedList(Context context) {
        super(context);
        a();
    }

    private final void a() {
        setOrientation(1);
    }

    public BulletedList(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public BulletedList(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a();
    }
}
