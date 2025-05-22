package com.google.android.gms.safebrowsing.settings;

import android.content.Context;
import android.util.AttributeSet;
import androidx.preference.Preference;
import com.google.android.gms.R;
import defpackage.fxxm;
import defpackage.oyy;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class SafeBrowsingGraphicPreference extends Preference implements oyy {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SafeBrowsingGraphicPreference(Context context) {
        super(context);
        fxxm.f(context, "context");
        this.B = R.layout.sb_graphic_without_illustration;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SafeBrowsingGraphicPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        fxxm.f(context, "context");
        this.B = R.layout.sb_graphic_without_illustration;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SafeBrowsingGraphicPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        fxxm.f(context, "context");
        this.B = R.layout.sb_graphic_without_illustration;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SafeBrowsingGraphicPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        fxxm.f(context, "context");
        this.B = R.layout.sb_graphic_without_illustration;
    }
}
