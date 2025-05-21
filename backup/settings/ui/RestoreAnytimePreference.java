package com.google.android.gms.backup.settings.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.preference.Preference;
import defpackage.kmp;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class RestoreAnytimePreference extends Preference {
    public final boolean a;

    public RestoreAnytimePreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = true;
        L("restore");
    }

    private final void k(View view, boolean z, boolean z2) {
        boolean z3 = true;
        if (!z && !z2) {
            z3 = false;
        }
        view.setEnabled(z3);
        if (!(view instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                return;
            } else {
                k(viewGroup.getChildAt(childCount), z, false);
            }
        }
    }

    @Override // androidx.preference.Preference
    public final void a(kmp kmpVar) {
        super.a(kmpVar);
        boolean z = false;
        if (Z() && this.a) {
            z = true;
        }
        k(kmpVar.a, z, true);
    }
}
