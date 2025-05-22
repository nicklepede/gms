package com.google.android.gms.mobiledataplan.esim;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;
import defpackage.an;
import defpackage.auid;
import defpackage.ausn;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class CarrierEuiccProvisioningChimeraService extends Service {
    public static final ausn a = ausn.b("MobileDataPlan", auid.MOBILE_DATA_PLAN);
    public String b = "";
    private final an c = new an(this);

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        return this.c;
    }
}
