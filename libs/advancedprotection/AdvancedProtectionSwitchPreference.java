package com.google.android.gms.libs.advancedprotection;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.View;
import androidx.preference.SwitchPreferenceCompat;
import com.google.android.gms.R;
import defpackage.auid;
import defpackage.ausn;
import defpackage.bsvj;
import defpackage.bsvk;
import defpackage.bsvl;
import defpackage.bsvm;
import defpackage.eluo;
import defpackage.fxxm;
import defpackage.ind;
import defpackage.mfa;
import defpackage.vfd;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class AdvancedProtectionSwitchPreference extends SwitchPreferenceCompat {
    private static final ausn e = ausn.b("AdvancedProtectionPref", auid.ADVANCED_PROTECTION);
    public boolean c;
    public boolean d;
    private final bsvk f;
    private final bsvm g;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AdvancedProtectionSwitchPreference(Context context) {
        this(context, null, 0, 0, 14, null);
        fxxm.f(context, "context");
    }

    @Override // androidx.preference.Preference
    public final void B() {
        super.G();
        Executor g = ind.g(this.j);
        fxxm.e(g, "getMainExecutor(...)");
        fxxm.f(g, "executor");
        fxxm.f(this.g, "callbackCompat");
        this.f.b();
    }

    @Override // androidx.preference.Preference
    public final void D() {
        super.V();
        fxxm.f(this.g, "callbackCompat");
        this.f.b();
    }

    @Override // androidx.preference.Preference
    public final void F() {
        if (!ah()) {
            super.F();
            return;
        }
        Context context = this.j;
        fxxm.e(context, "getContext(...)");
        Intent a = vfd.a(context);
        if (a == null) {
            ((eluo) e.i()).x("AdvancedProtectionActivities.getDialogActivityIntent returned null?!");
        } else {
            context.startActivity(a);
        }
    }

    @Override // androidx.preference.Preference
    public final void H(boolean z) {
        ah();
        this.c = z;
        if (ah()) {
            return;
        }
        super.H(z);
    }

    @Override // androidx.preference.SwitchPreferenceCompat, androidx.preference.Preference
    public final void a(mfa mfaVar) {
        fxxm.f(mfaVar, "holder");
        super.a(mfaVar);
        if (ah()) {
            View view = mfaVar.a;
            view.setClickable(true);
            view.setEnabled(true);
        }
    }

    public final boolean ah() {
        Context context = this.j;
        fxxm.e(context, "getContext(...)");
        return bsvl.a(context) && this.f.a();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AdvancedProtectionSwitchPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        fxxm.f(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AdvancedProtectionSwitchPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        fxxm.f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvancedProtectionSwitchPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        fxxm.f(context, "context");
        bsvk bsvkVar = bsvk.a;
        this.f = bsvj.a(context);
        this.g = new bsvm(this);
        this.c = attributeSet != null ? attributeSet.getAttributeBooleanValue(R.attr.enabled, true) : true;
        this.d = attributeSet != null ? attributeSet.getAttributeBooleanValue(R.attr.selectable, true) : true;
    }

    public /* synthetic */ AdvancedProtectionSwitchPreference(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? R.attr.switchPreferenceCompatStyle : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
