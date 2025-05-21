package com.google.android.gms.trustagent.common.service;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.IBinder;
import com.google.android.chimera.Service;
import com.google.android.gms.chimera.modules.trustagent.AppContextProvider;
import defpackage.asej;
import defpackage.asot;
import defpackage.dglq;
import defpackage.dglu;
import defpackage.dglw;
import defpackage.dgnc;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class PreferenceChimeraService extends Service {
    public static final asot a = asot.b("TrustAgent", asej.TRUSTAGENT);
    public static final dglq b = new dglw();
    public SharedPreferences c;
    private final dglu d = new dglu(this);

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        return this.d;
    }

    @Override // com.google.android.chimera.Service
    public final void onCreate() {
        super.onCreate();
        this.c = dgnc.a(AppContextProvider.a());
    }
}
