package com.google.android.gms.mobiledataplan.esim;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;
import defpackage.an;
import defpackage.asej;
import defpackage.asot;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class CarrierEuiccProvisioningChimeraService extends Service {
    public static final asot a = asot.b("MobileDataPlan", asej.MOBILE_DATA_PLAN);
    public String b = "";
    private final an c = new an(this);

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        return this.c;
    }
}
