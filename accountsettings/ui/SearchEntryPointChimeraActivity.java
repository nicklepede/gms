package com.google.android.gms.accountsettings.ui;

import android.net.Uri;
import android.os.Bundle;
import defpackage.etic;
import defpackage.etie;
import defpackage.fecj;
import defpackage.sxm;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class SearchEntryPointChimeraActivity extends sxm {
    @Override // defpackage.sxm
    protected final int C() {
        return 3;
    }

    @Override // defpackage.sxm
    protected final Bundle k() {
        Bundle bundle = new Bundle();
        bundle.putString("extra.utmSource", "android-settings");
        bundle.putString("extra.utmMedium", "search");
        return bundle;
    }

    @Override // defpackage.sxm
    public final etie l() {
        etie l = super.l();
        Integer num = null;
        fecj fecjVar = (fecj) l.iB(5, null);
        fecjVar.X(l);
        etic eticVar = (etic) fecjVar;
        String stringExtra = getIntent().getStringExtra(":settings:fragment_args_key");
        if (stringExtra != null) {
            try {
                num = Integer.valueOf(Integer.parseInt(Uri.parse(stringExtra).getQueryParameter("resourceId")));
            } catch (NumberFormatException unused) {
            }
        }
        if (num != null) {
            int intValue = num.intValue();
            if (!eticVar.b.L()) {
                eticVar.U();
            }
            etie etieVar = (etie) eticVar.b;
            etie etieVar2 = etie.a;
            etieVar.b |= 1;
            etieVar.c = intValue;
        }
        return (etie) eticVar.Q();
    }

    @Override // defpackage.sxm
    public final String m() {
        return "com.google.android.gms";
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
