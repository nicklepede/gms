package com.google.android.gms.icing.service;

import android.content.Intent;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import com.google.android.chimera.Service;
import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.atzb;
import defpackage.auid;
import defpackage.bnmh;
import defpackage.bnmo;
import defpackage.bntc;
import defpackage.bntk;
import defpackage.bnuy;
import defpackage.bnxz;
import defpackage.bnyx;
import defpackage.bnzw;
import defpackage.boaf;
import defpackage.bzoz;
import defpackage.bzps;
import defpackage.bzqa;
import defpackage.bzqb;
import defpackage.ekvh;
import defpackage.elhz;
import defpackage.elpp;
import defpackage.epyi;
import defpackage.frug;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class IndexChimeraService extends Service implements bzqa {
    public static final /* synthetic */ int a = 0;
    private static final elhz b = elhz.O(21, 30, 33, 32, 36, 66, 78);
    private boaf c;

    @Override // defpackage.bzqa
    public final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        if (this.c == null) {
            bnmo.a("IndexService is unavailable on this device");
            bzozVar.a(16, new Bundle());
            return;
        }
        String str = getServiceRequest.f;
        String str2 = getServiceRequest.p;
        auid auidVar = (auid) ekvh.c(auid.b(getServiceRequest.d), auid.UNKNOWN);
        int callingUid = Binder.getCallingUid();
        int i = getServiceRequest.e;
        Bundle bundle = getServiceRequest.i;
        c().h(new bnzw(this, epyi.GET_CLIENT_SERVICE_INTERFACE, str, bzozVar, str, auidVar, i, callingUid, bundle == null ? null : bundle.getString("ComponentName"), str2));
    }

    public final bnmh b() {
        atzb.s(this.c);
        return this.c.a();
    }

    public final bnyx c() {
        atzb.s(this.c);
        return this.c.c;
    }

    public final void d(bntk bntkVar, bzoz bzozVar, bzps bzpsVar) {
        boolean z;
        try {
            bntc bntcVar = b().r;
            synchronized (bntkVar.e) {
                boolean equals = bntkVar.b.equals("com.google.android.gms");
                String str = bntkVar.g;
                z = true;
                boolean z2 = equals && (str != null ? str.contains(" getStringResource threw a NPE") : false);
                String str2 = bntkVar.g;
                if (str2 == null) {
                    z = z2;
                } else if (!z2) {
                    throw new bnuy(str2);
                }
            }
            if (z && bntcVar != null) {
                bntcVar.d("b28339005");
            }
            e(bzozVar, 0, bzpsVar);
        } catch (bnuy e) {
            bnmo.i("Failed to check resources for package %s, %s", bntkVar.b, e);
            e(bzozVar, 10, bzpsVar);
        }
    }

    public final void e(bzoz bzozVar, int i, bzps bzpsVar) {
        try {
            if (i != 0) {
                bzozVar.a(i, new Bundle());
            } else {
                atzb.s(bzpsVar);
                bzozVar.c(bzpsVar);
            }
        } catch (Throwable th) {
            bnmo.j(th, "Service broker callback failed", new Object[0]);
            b().r.d("postinit_failed");
        }
    }

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        if (!"com.google.android.gms.icing.INDEX_SERVICE".equals(intent.getAction())) {
            Log.w("IndexChimeraService", "incompatible service action: ".concat(String.valueOf(intent.getAction())));
            return null;
        }
        elhz elhzVar = b;
        elpp elppVar = elpp.a;
        return new bzqb(this, elhzVar, elppVar, null, 1, elppVar, this, null, false);
    }

    @Override // com.google.android.chimera.Service
    public final void onCreate() {
        bnmo.b("%s: IndexService onCreate", "main");
        if (frug.j()) {
            this.c = boaf.c(getApplicationContext());
            b();
            bnxz.b(this);
        }
        super.onCreate();
    }

    @Override // com.google.android.chimera.Service
    public final void onDestroy() {
        bnmo.b("%s: IndexService onDestroy", "main");
        boaf boafVar = this.c;
        if (boafVar != null) {
            boafVar.b();
        }
        super.onDestroy();
    }

    @Override // com.google.android.chimera.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        bnmo.d("%s: IndexService: onStartCommand with %s", "main", intent);
        if (intent == null || !"com.google.android.gms.icing.INDEX_SERVICE".equals(intent.getAction())) {
            return 2;
        }
        intent.setClassName(this, "com.google.android.gms.icing.service.IndexWorkerService");
        startService(intent);
        return 2;
    }

    @Override // com.google.android.chimera.Service
    public final boolean onUnbind(Intent intent) {
        bnmo.b("%s: Unbind", "main");
        return false;
    }
}
