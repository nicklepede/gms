package com.google.android.gms.droidguard;

import android.content.Intent;
import com.google.android.gms.chimera.modules.droidguard.AppContextProvider;
import defpackage.apzs;
import defpackage.auid;
import defpackage.ausn;
import defpackage.azyk;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class DroidGuardModuleInitIntentOperation extends apzs {
    private azyk a;

    static {
        ausn.b("DGMI", auid.DROID_GUARD);
    }

    public DroidGuardModuleInitIntentOperation() {
        this.a = null;
    }

    @Override // defpackage.apzs
    protected final void b(Intent intent, int i) {
        if (this.a == null) {
            this.a = azyk.a(AppContextProvider.a());
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

    DroidGuardModuleInitIntentOperation(azyk azykVar) {
        this.a = azykVar;
    }
}
