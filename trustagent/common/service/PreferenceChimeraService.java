package com.google.android.gms.trustagent.common.service;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.IBinder;
import com.google.android.chimera.Service;
import com.google.android.gms.chimera.modules.trustagent.AppContextProvider;
import defpackage.auid;
import defpackage.ausn;
import defpackage.diwv;
import defpackage.diwz;
import defpackage.dixb;
import defpackage.diyh;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class PreferenceChimeraService extends Service {
    public static final ausn a = ausn.b("TrustAgent", auid.TRUSTAGENT);
    public static final diwv b = new dixb();
    public SharedPreferences c;
    private final diwz d = new diwz(this);

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        return this.d;
    }

    @Override // com.google.android.chimera.Service
    public final void onCreate() {
        super.onCreate();
        this.c = diyh.a(AppContextProvider.a());
    }
}
