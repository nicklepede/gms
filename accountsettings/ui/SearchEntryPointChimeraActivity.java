package com.google.android.gms.accountsettings.ui;

import android.net.Uri;
import android.os.Bundle;
import defpackage.evxu;
import defpackage.evxw;
import defpackage.fgrc;
import defpackage.utk;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class SearchEntryPointChimeraActivity extends utk {
    @Override // defpackage.utk
    protected final int C() {
        return 3;
    }

    @Override // defpackage.utk
    protected final Bundle k() {
        Bundle bundle = new Bundle();
        bundle.putString("extra.utmSource", "android-settings");
        bundle.putString("extra.utmMedium", "search");
        return bundle;
    }

    @Override // defpackage.utk
    public final evxw l() {
        evxw l = super.l();
        Integer num = null;
        fgrc fgrcVar = (fgrc) l.iQ(5, null);
        fgrcVar.X(l);
        evxu evxuVar = (evxu) fgrcVar;
        String stringExtra = getIntent().getStringExtra(":settings:fragment_args_key");
        if (stringExtra != null) {
            try {
                num = Integer.valueOf(Integer.parseInt(Uri.parse(stringExtra).getQueryParameter("resourceId")));
            } catch (NumberFormatException unused) {
            }
        }
        if (num != null) {
            int intValue = num.intValue();
            if (!evxuVar.b.L()) {
                evxuVar.U();
            }
            evxw evxwVar = (evxw) evxuVar.b;
            evxw evxwVar2 = evxw.a;
            evxwVar.b |= 1;
            evxwVar.c = intValue;
        }
        return (evxw) evxuVar.Q();
    }

    @Override // defpackage.utk
    public final String m() {
        return "com.google.android.gms";
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
