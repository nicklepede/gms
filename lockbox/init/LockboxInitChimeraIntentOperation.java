package com.google.android.gms.lockbox.init;

import android.content.Intent;
import com.google.android.gms.lockbox.LockboxIntentOperation;
import defpackage.anya;
import defpackage.asng;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class LockboxInitChimeraIntentOperation extends anya {
    private static final String[] a = {"com.google.android.gms.lockbox.service.LockboxBrokerService"};

    @Override // defpackage.anya
    protected final void a(Intent intent, boolean z) {
        asng.H(this, a[0], true);
    }

    @Override // defpackage.anya
    protected final void b(Intent intent, int i) {
        if ((i & 14) != 0) {
            LockboxIntentOperation.b(this);
        }
    }
}
