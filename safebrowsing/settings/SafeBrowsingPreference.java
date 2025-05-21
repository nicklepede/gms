package com.google.android.gms.safebrowsing.settings;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.preference.Preference;
import defpackage.cxxa;
import defpackage.fvbo;
import defpackage.kmp;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class SafeBrowsingPreference extends Preference {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SafeBrowsingPreference(Context context) {
        super(context);
        fvbo.f(context, "context");
    }

    @Override // androidx.preference.Preference
    public final void a(kmp kmpVar) {
        fvbo.f(kmpVar, "holder");
        super.a(kmpVar);
        View view = kmpVar.a;
        view.setPadding(view.getPaddingLeft(), cxxa.a(this, 4), view.getPaddingRight(), cxxa.a(this, 12));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SafeBrowsingPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        fvbo.f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SafeBrowsingPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        fvbo.f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SafeBrowsingPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        fvbo.f(context, "context");
    }
}
