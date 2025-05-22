package com.google.android.gms.auth.account;

import android.content.Intent;
import defpackage.apzs;
import defpackage.auid;
import defpackage.ausn;
import defpackage.wta;
import defpackage.wtr;
import defpackage.wuz;
import defpackage.wzx;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class AuthPersistentInitIntentOperation extends apzs {
    private static final wuz[] a;

    static {
        ausn.b("AuthPersistentInit", auid.AUTH_ACCOUNT_DATA);
        a = new wuz[]{wzx.a, wtr.a, wta.a};
    }

    @Override // defpackage.apzs
    protected final void b(Intent intent, int i) {
        wuz[] wuzVarArr = a;
        intent.getAction();
        int length = wuzVarArr.length;
        for (int i2 = 0; i2 < 3; i2++) {
            boolean z = (i & 2) > 0;
            wuz wuzVar = wuzVarArr[i2];
            if (z) {
                wuzVar.a(this);
            }
            boolean z2 = (i & 12) > 0;
            if (z2) {
                wuzVar.d(this);
            }
            if (z || z2) {
                wuzVar.b(this);
            }
        }
    }
}
