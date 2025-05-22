package com.google.android.gms.autofill.service;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;
import defpackage.ahvk;
import defpackage.auid;
import defpackage.ausn;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public final class AutofillImeCoreChimeraService extends Service {
    static {
        ausn.b("AutofillImeCoreService", auid.AUTOFILL);
    }

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        return new ahvk(this);
    }
}
