package com.google.android.gms.accountsettings.ui;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import defpackage.evxu;
import defpackage.evxw;
import defpackage.fgrc;
import defpackage.utk;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class ZeroPartyEntryPointChimeraActivity extends utk {
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

    @Override // defpackage.utk
    protected final int C() {
        return 3;
    }

    @Override // defpackage.utk
    protected final Intent a() {
        Intent a = super.a();
        F();
        return a;
    }

    @Override // defpackage.utk
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

    @Override // defpackage.utk
    public final evxw l() {
        evxw l = super.l();
        if (D() || E()) {
            fgrc fgrcVar = (fgrc) l.iQ(5, null);
            fgrcVar.X(l);
            evxu evxuVar = (evxu) fgrcVar;
            if (!evxuVar.b.L()) {
                evxuVar.U();
            }
            evxw evxwVar = (evxw) evxuVar.b;
            evxw evxwVar2 = evxw.a;
            evxwVar.b |= 1;
            evxwVar.c = 212;
            return (evxw) evxuVar.Q();
        }
        if (!Objects.equals(getIntent().getAction(), "com.google.android.gms.accountsettings.action.SAFETY_CENTER_SECURITY_CHECKUP")) {
            return l;
        }
        fgrc fgrcVar2 = (fgrc) l.iQ(5, null);
        fgrcVar2.X(l);
        evxu evxuVar2 = (evxu) fgrcVar2;
        if (!evxuVar2.b.L()) {
            evxuVar2.U();
        }
        evxw evxwVar3 = (evxw) evxuVar2.b;
        evxw evxwVar4 = evxw.a;
        evxwVar3.b |= 1;
        evxwVar3.c = 400;
        evxuVar2.k("utm_source", "safety-center");
        return (evxw) evxuVar2.Q();
    }

    @Override // defpackage.utk
    public final String m() {
        Intent intent = getIntent();
        return (intent == null || !intent.hasExtra("extra.callingPackageName")) ? "com.google.android.gms" : intent.getStringExtra("extra.callingPackageName");
    }

    @Override // defpackage.utk
    protected final boolean x() {
        return true;
    }

    @Override // defpackage.utk
    protected final boolean y() {
        return true;
    }

    @Override // defpackage.utk
    protected final void r() {
    }
}
