package com.google.android.gms.personalsafety.service;

import android.content.Intent;
import android.os.IBinder;
import android.os.Looper;
import com.google.android.chimera.Service;
import defpackage.asqt;
import defpackage.asqu;
import defpackage.byhr;
import defpackage.cvpo;
import defpackage.eiif;
import defpackage.ejhf;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class ElderlyCareChimeraService extends Service implements asqt {
    private asqu a;

    @Override // defpackage.asqt
    public final void a() {
        ((ejhf) ((ejhf) cvpo.a.h()).ah((char) 8640)).x("Screen off detected");
    }

    @Override // defpackage.asqt
    public final void b() {
        ((ejhf) ((ejhf) cvpo.a.h()).ah((char) 8641)).x("Screen on detected");
    }

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // com.google.android.chimera.Service
    public final void onCreate() {
        super.onCreate();
        asqu asquVar = new asqu(this, new byhr(Looper.getMainLooper()));
        this.a = asquVar;
        asquVar.b(this);
    }

    @Override // com.google.android.chimera.Service
    public final void onDestroy() {
        super.onDestroy();
        this.a.c();
    }

    @Override // com.google.android.chimera.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        if (intent != null && !eiif.c(intent.getAction())) {
            return 1;
        }
        ((ejhf) ((ejhf) cvpo.a.j()).ah((char) 8639)).x("Module received null intent");
        return 1;
    }
}
