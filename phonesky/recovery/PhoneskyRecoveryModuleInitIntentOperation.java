package com.google.android.gms.phonesky.recovery;

import android.content.Intent;
import defpackage.apzs;
import defpackage.cyrg;
import defpackage.cyrj;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class PhoneskyRecoveryModuleInitIntentOperation extends apzs {
    @Override // defpackage.apzs
    public final void b(Intent intent, int i) {
        if ((i & 2) == 0 && (i & 4) == 0 && (i & 8) == 0) {
            cyrg.b("Module triggered without updates or boot complete", new Object[0]);
        } else {
            new cyrj(this).a();
        }
    }
}
