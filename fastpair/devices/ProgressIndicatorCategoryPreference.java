package com.google.android.gms.fastpair.devices;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.preference.PreferenceCategory;
import com.google.android.gms.R;
import defpackage.eike;
import defpackage.kmm;
import defpackage.kmp;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class ProgressIndicatorCategoryPreference extends PreferenceCategory {
    private View d;

    public ProgressIndicatorCategoryPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.preference.Preference
    public final void C(kmm kmmVar) {
        super.C(kmmVar);
        this.B = R.layout.progress_indicator_category_preference;
    }

    @Override // androidx.preference.PreferenceCategory, androidx.preference.Preference
    public final void a(kmp kmpVar) {
        super.a(kmpVar);
        View D = kmpVar.D(R.id.progress_indicator);
        eike.e(D);
        this.d = D;
        if (D != null) {
            D.setVisibility(8);
        }
    }
}
