package com.google.android.gms.adsidentity.settings.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.preference.Preference;
import com.google.android.gms.R;
import defpackage.kmp;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class NewAdIdCustomPreference extends Preference {
    public View.OnClickListener a;

    public NewAdIdCustomPreference(Context context) {
        super(context);
    }

    @Override // androidx.preference.Preference
    public final void a(kmp kmpVar) {
        super.a(kmpVar);
        View D = kmpVar.D(R.id.informationIcon);
        if (D != null) {
            ImageView imageView = (ImageView) D;
            imageView.setEnabled(true);
            imageView.setOnClickListener(this.a);
        }
    }

    public NewAdIdCustomPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NewAdIdCustomPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public NewAdIdCustomPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
