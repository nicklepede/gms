package com.google.android.gms.autofill.service;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;
import defpackage.afuy;
import defpackage.asej;
import defpackage.asot;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class AutofillImeCoreChimeraService extends Service {
    static {
        asot.b("AutofillImeCoreService", asej.AUTOFILL);
    }

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        return new afuy(this);
    }
}
