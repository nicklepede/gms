package com.google.android.gms.icing.service;

import android.content.Intent;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import com.google.android.chimera.Service;
import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.arwm;
import defpackage.asej;
import defpackage.blfp;
import defpackage.blfw;
import defpackage.blmk;
import defpackage.blms;
import defpackage.blog;
import defpackage.blrh;
import defpackage.blsf;
import defpackage.blte;
import defpackage.bltn;
import defpackage.bxgj;
import defpackage.bxhc;
import defpackage.bxhk;
import defpackage.bxhl;
import defpackage.eiic;
import defpackage.eiuu;
import defpackage.ejck;
import defpackage.enkr;
import defpackage.fpaz;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class IndexChimeraService extends Service implements bxhk {
    public static final /* synthetic */ int a = 0;
    private static final eiuu b = eiuu.O(21, 30, 33, 32, 36, 66, 78);
    private bltn c;

    @Override // defpackage.bxhk
    public final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        if (this.c == null) {
            blfw.a("IndexService is unavailable on this device");
            bxgjVar.a(16, new Bundle());
            return;
        }
        String str = getServiceRequest.f;
        String str2 = getServiceRequest.p;
        asej asejVar = (asej) eiic.c(asej.b(getServiceRequest.d), asej.UNKNOWN);
        int callingUid = Binder.getCallingUid();
        int i = getServiceRequest.e;
        Bundle bundle = getServiceRequest.i;
        c().h(new blte(this, enkr.GET_CLIENT_SERVICE_INTERFACE, str, bxgjVar, str, asejVar, i, callingUid, bundle == null ? null : bundle.getString("ComponentName"), str2));
    }

    public final blfp b() {
        arwm.s(this.c);
        return this.c.a();
    }

    public final blsf c() {
        arwm.s(this.c);
        return this.c.c;
    }

    public final void d(blms blmsVar, bxgj bxgjVar, bxhc bxhcVar) {
        boolean z;
        try {
            blmk blmkVar = b().r;
            synchronized (blmsVar.e) {
                boolean equals = blmsVar.b.equals("com.google.android.gms");
                String str = blmsVar.g;
                z = true;
                boolean z2 = equals && (str != null ? str.contains(" getStringResource threw a NPE") : false);
                String str2 = blmsVar.g;
                if (str2 == null) {
                    z = z2;
                } else if (!z2) {
                    throw new blog(str2);
                }
            }
            if (z && blmkVar != null) {
                blmkVar.d("b28339005");
            }
            e(bxgjVar, 0, bxhcVar);
        } catch (blog e) {
            blfw.i("Failed to check resources for package %s, %s", blmsVar.b, e);
            e(bxgjVar, 10, bxhcVar);
        }
    }

    public final void e(bxgj bxgjVar, int i, bxhc bxhcVar) {
        try {
            if (i != 0) {
                bxgjVar.a(i, new Bundle());
            } else {
                arwm.s(bxhcVar);
                bxgjVar.c(bxhcVar);
            }
        } catch (Throwable th) {
            blfw.j(th, "Service broker callback failed", new Object[0]);
            b().r.d("postinit_failed");
        }
    }

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        if (!"com.google.android.gms.icing.INDEX_SERVICE".equals(intent.getAction())) {
            Log.w("IndexChimeraService", "incompatible service action: ".concat(String.valueOf(intent.getAction())));
            return null;
        }
        eiuu eiuuVar = b;
        ejck ejckVar = ejck.a;
        return new bxhl(this, eiuuVar, ejckVar, null, 1, ejckVar, this, null, false);
    }

    @Override // com.google.android.chimera.Service
    public final void onCreate() {
        blfw.b("%s: IndexService onCreate", "main");
        if (fpaz.j()) {
            this.c = bltn.c(getApplicationContext());
            b();
            blrh.b(this);
        }
        super.onCreate();
    }

    @Override // com.google.android.chimera.Service
    public final void onDestroy() {
        blfw.b("%s: IndexService onDestroy", "main");
        bltn bltnVar = this.c;
        if (bltnVar != null) {
            bltnVar.b();
        }
        super.onDestroy();
    }

    @Override // com.google.android.chimera.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        blfw.d("%s: IndexService: onStartCommand with %s", "main", intent);
        if (intent == null || !"com.google.android.gms.icing.INDEX_SERVICE".equals(intent.getAction())) {
            return 2;
        }
        intent.setClassName(this, "com.google.android.gms.icing.service.IndexWorkerService");
        startService(intent);
        return 2;
    }

    @Override // com.google.android.chimera.Service
    public final boolean onUnbind(Intent intent) {
        blfw.b("%s: Unbind", "main");
        return false;
    }
}
