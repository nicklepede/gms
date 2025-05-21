package com.google.android.gms.droidguard;

import android.content.Intent;
import com.google.android.gms.chimera.modules.droidguard.AppContextProvider;
import defpackage.anya;
import defpackage.asej;
import defpackage.asot;
import defpackage.axuk;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class DroidGuardModuleInitIntentOperation extends anya {
    private axuk a;

    static {
        asot.b("DGMI", asej.DROID_GUARD);
    }

    public DroidGuardModuleInitIntentOperation() {
        this.a = null;
    }

    @Override // defpackage.anya
    protected final void b(Intent intent, int i) {
        if (this.a == null) {
            this.a = axuk.a(AppContextProvider.a());
        }
        int i2 = i & 2;
        int i3 = i & 8;
        int i4 = i & 4;
        if (i2 > 0) {
            this.a.d(2);
            return;
        }
        if (i3 > 0) {
            this.a.d(4);
        } else if (i4 > 0) {
            this.a.d(3);
        } else {
            this.a.d(1);
        }
    }

    DroidGuardModuleInitIntentOperation(axuk axukVar) {
        this.a = axukVar;
    }
}
