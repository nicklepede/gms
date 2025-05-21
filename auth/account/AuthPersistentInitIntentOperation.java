package com.google.android.gms.auth.account;

import android.content.Intent;
import defpackage.anya;
import defpackage.asej;
import defpackage.asot;
import defpackage.uxb;
import defpackage.uxr;
import defpackage.uyz;
import defpackage.vdw;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class AuthPersistentInitIntentOperation extends anya {
    private static final uyz[] a;

    static {
        asot.b("AuthPersistentInit", asej.AUTH_ACCOUNT_DATA);
        a = new uyz[]{vdw.a, uxr.a, uxb.a};
    }

    @Override // defpackage.anya
    protected final void b(Intent intent, int i) {
        uyz[] uyzVarArr = a;
        intent.getAction();
        int length = uyzVarArr.length;
        for (int i2 = 0; i2 < 3; i2++) {
            boolean z = (i & 2) > 0;
            uyz uyzVar = uyzVarArr[i2];
            if (z) {
                uyzVar.a(this);
            }
            boolean z2 = (i & 12) > 0;
            if (z2) {
                uyzVar.d(this);
            }
            if (z || z2) {
                uyzVar.b(this);
            }
        }
    }
}
