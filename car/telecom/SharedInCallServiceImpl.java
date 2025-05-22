package com.google.android.gms.car.telecom;

import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.os.SystemClock;
import android.telecom.Call;
import com.google.android.chimera.Service;
import com.google.android.gms.car.telecom.SharedInCallServiceImpl;
import defpackage.amzv;
import defpackage.ancc;
import defpackage.ancu;
import defpackage.ancv;
import defpackage.ancy;
import defpackage.anki;
import defpackage.ankl;
import defpackage.anks;
import defpackage.ankt;
import defpackage.anku;
import defpackage.auub;
import defpackage.ekvi;
import defpackage.ekvl;
import defpackage.ekww;
import defpackage.ekxd;
import defpackage.eluq;
import defpackage.eokl;
import defpackage.eokr;
import defpackage.eolj;
import defpackage.eolk;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.fome;
import j$.util.Objects;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class SharedInCallServiceImpl extends Service {
    public static final eluq a = ancy.a("CAR.TEL.CALLSERVICE");
    public final anks b = new anks(this);
    private final CopyOnWriteArraySet c = new CopyOnWriteArraySet();
    private final ekww d;
    private int e;
    private int f;
    private int g;
    private int h;
    private long i;

    public SharedInCallServiceImpl() {
        Objects.requireNonNull(amzv.c);
        this.d = ekxd.a(new ekww() { // from class: ankm
            @Override // defpackage.ekww
            public final Object lK() {
                return Boolean.valueOf(fome.a.lK().c());
            }
        });
    }

    private final void d(eolj eoljVar) {
        ancu f = ancv.f(eokl.CAR_SERVICE, eolk.PHONE_CALL, eoljVar);
        if (f.h == null) {
            f.h = eokr.a.v();
        }
        fgrc fgrcVar = f.h;
        int i = this.e;
        if (!fgrcVar.b.L()) {
            fgrcVar.U();
        }
        eokr eokrVar = (eokr) fgrcVar.b;
        eokr eokrVar2 = eokr.a;
        eokrVar.b |= 4;
        eokrVar.e = i;
        int i2 = this.f;
        if (!fgrcVar.b.L()) {
            fgrcVar.U();
        }
        fgri fgriVar = fgrcVar.b;
        eokr eokrVar3 = (eokr) fgriVar;
        eokrVar3.b |= 8;
        eokrVar3.f = i2;
        int i3 = this.g;
        if (!fgriVar.L()) {
            fgrcVar.U();
        }
        fgri fgriVar2 = fgrcVar.b;
        eokr eokrVar4 = (eokr) fgriVar2;
        eokrVar4.b |= 1;
        eokrVar4.c = i3;
        int i4 = this.h;
        if (!fgriVar2.L()) {
            fgrcVar.U();
        }
        eokr eokrVar5 = (eokr) fgrcVar.b;
        eokrVar5.b |= 2;
        eokrVar5.d = i4;
        f.f = ekvi.j(Long.valueOf(SystemClock.elapsedRealtime() - this.i));
        ancc.a(this).c(f.c());
    }

    private static boolean e(Intent intent) {
        return "android.telecom.InCallService".equals(intent.getAction());
    }

    public final void a(ankt anktVar) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            anktVar.a((anki) it.next());
        }
    }

    public final void b(anki ankiVar) {
        this.c.add(ankiVar);
    }

    public final void c(anki ankiVar) {
        this.c.remove(ankiVar);
    }

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        if (e(intent)) {
            this.g++;
        } else {
            this.e++;
        }
        if (((Boolean) this.d.lK()).booleanValue()) {
            d(e(intent) ? eolj.aeT : eolj.aeR);
        }
        String action = intent.getAction();
        if (action != null && action.equals("aidl_gearhead_intent")) {
            return new anku(this);
        }
        if (action == null || !action.equals("local_gearhead_ics_intent")) {
            anks anksVar = this.b;
            anksVar.attachBaseContext(getApplication().getBaseContext());
            return anksVar.onBind(intent);
        }
        ankl anklVar = new ankl(this, this);
        if (auub.g()) {
            Iterator<Call> it = anklVar.f.getCalls().iterator();
            while (it.hasNext()) {
                it.next().registerCallback(anklVar.d);
            }
            if (!anklVar.f.getCalls().isEmpty()) {
                ancc a2 = ancc.a(anklVar.c);
                ancu f = ancv.f(eokl.CAR_SERVICE, eolk.PHONE_CALL, eolj.aQ);
                f.d(anklVar.f.getCalls().size());
                a2.c(f.c());
            }
        }
        return anklVar;
    }

    @Override // com.google.android.chimera.Service
    public final void onCreate() {
        super.onCreate();
        this.i = SystemClock.elapsedRealtime();
        ekvl.r(Build.VERSION.SDK_INT < 30, "GmsCore InCallService is used in R+ or Gearhead");
    }

    @Override // com.google.android.chimera.Service
    public final void onDestroy() {
        super.onDestroy();
        if (((Boolean) this.d.lK()).booleanValue()) {
            d(eolj.aeQ);
        }
    }

    @Override // com.google.android.chimera.Service
    public final void onRebind(Intent intent) {
        if (e(intent)) {
            this.g++;
        } else {
            this.e++;
        }
        if (((Boolean) this.d.lK()).booleanValue()) {
            d(e(intent) ? eolj.aeT : eolj.aeR);
        }
    }

    @Override // com.google.android.chimera.Service
    public final boolean onUnbind(Intent intent) {
        String action;
        eluq eluqVar = a;
        eluqVar.h().ai(2463).x("onUnbind");
        if (e(intent)) {
            this.h++;
        } else {
            this.f++;
        }
        if (((Boolean) this.d.lK()).booleanValue()) {
            d(e(intent) ? eolj.aeU : eolj.aeS);
        }
        fome fomeVar = fome.a;
        if (fomeVar.lK().f() && (action = intent.getAction()) != null && action.equals("android.telecom.InCallService")) {
            eluqVar.h().ai(2464).x("Triggering unbind on InCallService instance");
            this.b.onUnbind(intent);
        }
        if (fomeVar.lK().a()) {
            a(new ankt() { // from class: ankn
                @Override // defpackage.ankt
                public final void a(anki ankiVar) {
                    eluq eluqVar2 = SharedInCallServiceImpl.a;
                    ankiVar.a();
                }
            });
            return true;
        }
        a(new ankt() { // from class: anko
            @Override // defpackage.ankt
            public final void a(anki ankiVar) {
                eluq eluqVar2 = SharedInCallServiceImpl.a;
                ankiVar.a();
            }
        });
        return false;
    }
}
