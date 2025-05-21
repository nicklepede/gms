package com.google.android.gms.accountsettings.ui;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import defpackage.etic;
import defpackage.etie;
import defpackage.fecj;
import defpackage.sxm;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class ZeroPartyEntryPointChimeraActivity extends sxm {
    static final ComponentName r = new ComponentName("com.google.android.gms", "com.google.android.gms.accountsettings.ui.PrivacyHubActivityControlsActivity");
    static final ComponentName s = new ComponentName("com.google.android.gms", "com.google.android.gms.accountsettings.ui.SafetyCenterActivityControlsActivity");

    private final boolean D() {
        return Objects.equals(getIntent().getComponent(), r);
    }

    private final boolean E() {
        return Objects.equals(getIntent().getComponent(), s);
    }

    private final boolean F() {
        return Objects.equals(getIntent().getAction(), "com.android.settings.action.VIEW_ACCOUNT");
    }

    @Override // defpackage.sxm
    protected final int C() {
        return 3;
    }

    @Override // defpackage.sxm
    protected final Intent a() {
        Intent a = super.a();
        F();
        return a;
    }

    @Override // defpackage.sxm
    protected final Bundle k() {
        Bundle k = super.k();
        if (F()) {
            k.putString("extra.utmSource", "android-settings");
            k.putString("extra.utmMedium", "identity-disc");
            return k;
        }
        if (D()) {
            k.putString("extra.utmSource", "android-settings");
            k.putString("extra.utmMedium", "privacy-hub");
            return k;
        }
        if (E()) {
            k.putString("extra.utmSource", "android-settings");
            k.putString("extra.utmMedium", "safety-center");
        }
        return k;
    }

    @Override // defpackage.sxm
    public final etie l() {
        etie l = super.l();
        if (D() || E()) {
            fecj fecjVar = (fecj) l.iB(5, null);
            fecjVar.X(l);
            etic eticVar = (etic) fecjVar;
            if (!eticVar.b.L()) {
                eticVar.U();
            }
            etie etieVar = (etie) eticVar.b;
            etie etieVar2 = etie.a;
            etieVar.b |= 1;
            etieVar.c = 212;
            return (etie) eticVar.Q();
        }
        if (!Objects.equals(getIntent().getAction(), "com.google.android.gms.accountsettings.action.SAFETY_CENTER_SECURITY_CHECKUP")) {
            return l;
        }
        fecj fecjVar2 = (fecj) l.iB(5, null);
        fecjVar2.X(l);
        etic eticVar2 = (etic) fecjVar2;
        if (!eticVar2.b.L()) {
            eticVar2.U();
        }
        etie etieVar3 = (etie) eticVar2.b;
        etie etieVar4 = etie.a;
        etieVar3.b |= 1;
        etieVar3.c = 400;
        eticVar2.k("utm_source", "safety-center");
        return (etie) eticVar2.Q();
    }

    @Override // defpackage.sxm
    public final String m() {
        Intent intent = getIntent();
        return (intent == null || !intent.hasExtra("extra.callingPackageName")) ? "com.google.android.gms" : intent.getStringExtra("extra.callingPackageName");
    }

    @Override // defpackage.sxm
    protected final boolean x() {
        return true;
    }

    @Override // defpackage.sxm
    protected final boolean y() {
        return true;
    }

    @Override // defpackage.sxm
    protected final void r() {
    }
}
