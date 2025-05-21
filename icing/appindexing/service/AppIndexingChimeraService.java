package com.google.android.gms.icing.appindexing.service;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;
import defpackage.blfw;
import defpackage.blke;
import defpackage.bltn;
import defpackage.bxhl;
import defpackage.ejck;
import defpackage.fpaz;
import defpackage.fpbg;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class AppIndexingChimeraService extends Service {
    private bltn a;
    private boolean b;
    private String c;

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        if (!"com.google.android.gms.icing.APP_INDEXING_SERVICE".equals(intent.getAction())) {
            blfw.b("Incompatible action: %s", intent.getAction());
            return null;
        }
        return new bxhl(this, 113, ejck.a, 3, new blke(this.a, this.b, this.c));
    }

    @Override // com.google.android.chimera.Service
    public final void onCreate() {
        if (fpaz.j()) {
            this.a = bltn.c(getApplicationContext());
            this.b = fpbg.a.a().G();
            this.c = fpbg.a.a().a();
        }
        super.onCreate();
    }

    @Override // com.google.android.chimera.Service
    public final void onDestroy() {
        bltn bltnVar = this.a;
        if (bltnVar != null) {
            bltnVar.b();
        }
        super.onDestroy();
    }

    @Override // com.google.android.chimera.Service
    public final boolean onUnbind(Intent intent) {
        return false;
    }
}
