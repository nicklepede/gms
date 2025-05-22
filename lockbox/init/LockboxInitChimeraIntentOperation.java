package com.google.android.gms.lockbox.init;

import android.content.Intent;
import com.google.android.gms.lockbox.LockboxIntentOperation;
import defpackage.apzs;
import defpackage.aura;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class LockboxInitChimeraIntentOperation extends apzs {
    private static final String[] a = {"com.google.android.gms.lockbox.service.LockboxBrokerService"};

    @Override // defpackage.apzs
    protected final void a(Intent intent, boolean z) {
        aura.H(this, a[0], true);
    }

    @Override // defpackage.apzs
    protected final void b(Intent intent, int i) {
        if ((i & 14) != 0) {
            LockboxIntentOperation.b(this);
        }
    }
}
