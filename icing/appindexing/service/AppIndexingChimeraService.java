package com.google.android.gms.icing.appindexing.service;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;
import defpackage.bnmo;
import defpackage.bnqw;
import defpackage.boaf;
import defpackage.bzqb;
import defpackage.elpp;
import defpackage.frug;
import defpackage.frun;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class AppIndexingChimeraService extends Service {
    private boaf a;
    private boolean b;
    private String c;

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        if (!"com.google.android.gms.icing.APP_INDEXING_SERVICE".equals(intent.getAction())) {
            bnmo.b("Incompatible action: %s", intent.getAction());
            return null;
        }
        return new bzqb(this, 113, elpp.a, 3, new bnqw(this.a, this.b, this.c));
    }

    @Override // com.google.android.chimera.Service
    public final void onCreate() {
        if (frug.j()) {
            this.a = boaf.c(getApplicationContext());
            frun frunVar = frun.a;
            this.b = frunVar.lK().G();
            this.c = frunVar.lK().a();
        }
        super.onCreate();
    }

    @Override // com.google.android.chimera.Service
    public final void onDestroy() {
        boaf boafVar = this.a;
        if (boafVar != null) {
            boafVar.b();
        }
        super.onDestroy();
    }

    @Override // com.google.android.chimera.Service
    public final boolean onUnbind(Intent intent) {
        return false;
    }
}
