package com.google.android.gms.car.telecom;

import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.os.SystemClock;
import android.telecom.Call;
import com.google.android.chimera.Service;
import com.google.android.gms.car.telecom.SharedInCallServiceImpl;
import defpackage.akyk;
import defpackage.alar;
import defpackage.albj;
import defpackage.albk;
import defpackage.albn;
import defpackage.alix;
import defpackage.alja;
import defpackage.aljh;
import defpackage.alji;
import defpackage.aljj;
import defpackage.asqh;
import defpackage.eiid;
import defpackage.eiig;
import defpackage.eijr;
import defpackage.eijy;
import defpackage.ejhh;
import defpackage.elwx;
import defpackage.elxd;
import defpackage.elxv;
import defpackage.elxw;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.fluv;
import j$.util.Objects;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class SharedInCallServiceImpl extends Service {
    public static final ejhh a = albn.a("CAR.TEL.CALLSERVICE");
    public final aljh b = new aljh(this);
    private final CopyOnWriteArraySet c = new CopyOnWriteArraySet();
    private final eijr d;
    private int e;
    private int f;
    private int g;
    private int h;
    private long i;

    public SharedInCallServiceImpl() {
        Objects.requireNonNull(akyk.c);
        this.d = eijy.a(new eijr() { // from class: aljb
            @Override // defpackage.eijr
            public final Object a() {
                return Boolean.valueOf(fluv.a.a().c());
            }
        });
    }

    private final void d(elxv elxvVar) {
        albj f = albk.f(elwx.CAR_SERVICE, elxw.PHONE_CALL, elxvVar);
        if (f.h == null) {
            f.h = elxd.a.v();
        }
        fecj fecjVar = f.h;
        int i = this.e;
        if (!fecjVar.b.L()) {
            fecjVar.U();
        }
        elxd elxdVar = (elxd) fecjVar.b;
        elxd elxdVar2 = elxd.a;
        elxdVar.b |= 4;
        elxdVar.e = i;
        int i2 = this.f;
        if (!fecjVar.b.L()) {
            fecjVar.U();
        }
        fecp fecpVar = fecjVar.b;
        elxd elxdVar3 = (elxd) fecpVar;
        elxdVar3.b |= 8;
        elxdVar3.f = i2;
        int i3 = this.g;
        if (!fecpVar.L()) {
            fecjVar.U();
        }
        fecp fecpVar2 = fecjVar.b;
        elxd elxdVar4 = (elxd) fecpVar2;
        elxdVar4.b |= 1;
        elxdVar4.c = i3;
        int i4 = this.h;
        if (!fecpVar2.L()) {
            fecjVar.U();
        }
        elxd elxdVar5 = (elxd) fecjVar.b;
        elxdVar5.b |= 2;
        elxdVar5.d = i4;
        f.f = eiid.j(Long.valueOf(SystemClock.elapsedRealtime() - this.i));
        alar.a(this).c(f.c());
    }

    private static boolean e(Intent intent) {
        return "android.telecom.InCallService".equals(intent.getAction());
    }

    public final void a(alji aljiVar) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            aljiVar.a((alix) it.next());
        }
    }

    public final void b(alix alixVar) {
        this.c.add(alixVar);
    }

    public final void c(alix alixVar) {
        this.c.remove(alixVar);
    }

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        if (e(intent)) {
            this.g++;
        } else {
            this.e++;
        }
        if (((Boolean) this.d.a()).booleanValue()) {
            d(e(intent) ? elxv.aeO : elxv.aeM);
        }
        String action = intent.getAction();
        if (action != null && action.equals("aidl_gearhead_intent")) {
            return new aljj(this);
        }
        if (action == null || !action.equals("local_gearhead_ics_intent")) {
            aljh aljhVar = this.b;
            aljhVar.attachBaseContext(getApplication().getBaseContext());
            return aljhVar.onBind(intent);
        }
        alja aljaVar = new alja(this, this);
        if (asqh.g()) {
            Iterator<Call> it = aljaVar.f.getCalls().iterator();
            while (it.hasNext()) {
                it.next().registerCallback(aljaVar.d);
            }
            if (!aljaVar.f.getCalls().isEmpty()) {
                alar a2 = alar.a(aljaVar.c);
                albj f = albk.f(elwx.CAR_SERVICE, elxw.PHONE_CALL, elxv.aQ);
                f.d(aljaVar.f.getCalls().size());
                a2.c(f.c());
            }
        }
        return aljaVar;
    }

    @Override // com.google.android.chimera.Service
    public final void onCreate() {
        super.onCreate();
        this.i = SystemClock.elapsedRealtime();
        eiig.q(Build.VERSION.SDK_INT < 30, "GmsCore InCallService is used in R+ or Gearhead");
    }

    @Override // com.google.android.chimera.Service
    public final void onDestroy() {
        super.onDestroy();
        if (((Boolean) this.d.a()).booleanValue()) {
            d(elxv.aeL);
        }
    }

    @Override // com.google.android.chimera.Service
    public final void onRebind(Intent intent) {
        if (e(intent)) {
            this.g++;
        } else {
            this.e++;
        }
        if (((Boolean) this.d.a()).booleanValue()) {
            d(e(intent) ? elxv.aeO : elxv.aeM);
        }
    }

    @Override // com.google.android.chimera.Service
    public final boolean onUnbind(Intent intent) {
        String action;
        ejhh ejhhVar = a;
        ejhhVar.h().ah(2459).x("onUnbind");
        if (e(intent)) {
            this.h++;
        } else {
            this.f++;
        }
        if (((Boolean) this.d.a()).booleanValue()) {
            d(e(intent) ? elxv.aeP : elxv.aeN);
        }
        fluv fluvVar = fluv.a;
        if (fluvVar.a().f() && (action = intent.getAction()) != null && action.equals("android.telecom.InCallService")) {
            ejhhVar.h().ah(2460).x("Triggering unbind on InCallService instance");
            this.b.onUnbind(intent);
        }
        if (fluvVar.a().a()) {
            a(new alji() { // from class: aljc
                @Override // defpackage.alji
                public final void a(alix alixVar) {
                    ejhh ejhhVar2 = SharedInCallServiceImpl.a;
                    alixVar.a();
                }
            });
            return true;
        }
        a(new alji() { // from class: aljd
            @Override // defpackage.alji
            public final void a(alix alixVar) {
                ejhh ejhhVar2 = SharedInCallServiceImpl.a;
                alixVar.a();
            }
        });
        return false;
    }
}
