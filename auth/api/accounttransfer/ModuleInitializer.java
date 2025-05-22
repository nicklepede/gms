package com.google.android.gms.auth.api.accounttransfer;

import android.content.Intent;
import defpackage.apzs;
import defpackage.aura;
import defpackage.ekva;
import defpackage.ekvd;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class ModuleInitializer extends apzs {
    protected static final String[] a = {"com.google.android.gms.auth.api.accounttransfer.PurgeAccountTransferDataService"};

    @Override // defpackage.apzs
    protected final void a(Intent intent, boolean z) {
        ekvd ekvdVar = new ekvd("; ");
        ekva ekvaVar = new ekva(ekvdVar, ekvdVar);
        String[] strArr = a;
        ekvaVar.f(strArr);
        aura.H(this, strArr[0], true);
    }
}
