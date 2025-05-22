package com.google.android.gms.personalsafety.service;

import android.content.Intent;
import android.os.IBinder;
import android.os.Looper;
import com.google.android.chimera.Service;
import defpackage.auun;
import defpackage.auuo;
import defpackage.caqj;
import defpackage.cxze;
import defpackage.ekvk;
import defpackage.eluo;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class ElderlyCareChimeraService extends Service implements auun {
    private auuo a;

    @Override // defpackage.auun
    public final void a() {
        ((eluo) ((eluo) cxze.a.h()).ai((char) 8638)).x("Screen off detected");
    }

    @Override // defpackage.auun
    public final void b() {
        ((eluo) ((eluo) cxze.a.h()).ai((char) 8639)).x("Screen on detected");
    }

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // com.google.android.chimera.Service
    public final void onCreate() {
        super.onCreate();
        auuo auuoVar = new auuo(this, new caqj(Looper.getMainLooper()));
        this.a = auuoVar;
        auuoVar.b(this);
    }

    @Override // com.google.android.chimera.Service
    public final void onDestroy() {
        super.onDestroy();
        this.a.c();
    }

    @Override // com.google.android.chimera.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        if (intent != null && !ekvk.c(intent.getAction())) {
            return 1;
        }
        ((eluo) ((eluo) cxze.a.j()).ai((char) 8637)).x("Module received null intent");
        return 1;
    }
}
