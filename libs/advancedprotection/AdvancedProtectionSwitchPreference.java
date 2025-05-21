package com.google.android.gms.libs.advancedprotection;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.View;
import androidx.preference.SwitchPreferenceCompat;
import com.google.android.gms.R;
import defpackage.asej;
import defpackage.asot;
import defpackage.bqnt;
import defpackage.bqnu;
import defpackage.bqnv;
import defpackage.bqnw;
import defpackage.ejhf;
import defpackage.fvbo;
import defpackage.iln;
import defpackage.kmp;
import defpackage.tjd;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class AdvancedProtectionSwitchPreference extends SwitchPreferenceCompat {
    private static final asot e = asot.b("AdvancedProtectionPref", asej.ADVANCED_PROTECTION);
    public boolean c;
    public boolean d;
    private final bqnu f;
    private final bqnw g;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AdvancedProtectionSwitchPreference(Context context) {
        this(context, null, 0, 0, 14, null);
        fvbo.f(context, "context");
    }

    @Override // androidx.preference.Preference
    public final void B() {
        super.G();
        Executor g = iln.g(this.j);
        fvbo.e(g, "getMainExecutor(...)");
        fvbo.f(g, "executor");
        fvbo.f(this.g, "callbackCompat");
        this.f.b();
    }

    @Override // androidx.preference.Preference
    public final void D() {
        super.V();
        fvbo.f(this.g, "callbackCompat");
        this.f.b();
    }

    @Override // androidx.preference.Preference
    public final void F() {
        if (!ah()) {
            super.F();
            return;
        }
        Context context = this.j;
        fvbo.e(context, "getContext(...)");
        Intent a = tjd.a(context);
        if (a == null) {
            ((ejhf) e.i()).x("AdvancedProtectionActivities.getDialogActivityIntent returned null?!");
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
    public final void a(kmp kmpVar) {
        fvbo.f(kmpVar, "holder");
        super.a(kmpVar);
        if (ah()) {
            View view = kmpVar.a;
            view.setClickable(true);
            view.setEnabled(true);
        }
    }

    public final boolean ah() {
        Context context = this.j;
        fvbo.e(context, "getContext(...)");
        return bqnv.a(context) && this.f.a();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AdvancedProtectionSwitchPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        fvbo.f(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AdvancedProtectionSwitchPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        fvbo.f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvancedProtectionSwitchPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        fvbo.f(context, "context");
        bqnu bqnuVar = bqnu.a;
        this.f = bqnt.a(context);
        this.g = new bqnw(this);
        this.c = attributeSet != null ? attributeSet.getAttributeBooleanValue(R.attr.enabled, true) : true;
        this.d = attributeSet != null ? attributeSet.getAttributeBooleanValue(R.attr.selectable, true) : true;
    }

    public /* synthetic */ AdvancedProtectionSwitchPreference(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? R.attr.switchPreferenceCompatStyle : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
