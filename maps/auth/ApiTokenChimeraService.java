package com.google.android.gms.maps.auth;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import com.google.android.chimera.Service;
import com.google.autofill.detection.ml.AndroidInputTypeSignal;
import defpackage.aswd;
import defpackage.asxd;
import defpackage.aury;
import defpackage.ausn;
import defpackage.btjp;
import defpackage.bxhj;
import defpackage.ceix;
import defpackage.ceiy;
import defpackage.ceiz;
import defpackage.cemk;
import defpackage.envh;
import defpackage.eqci;
import defpackage.eqcj;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.fsub;
import j$.time.Duration;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class ApiTokenChimeraService extends Service {
    public static final Duration a = Duration.ofDays(5);
    public bxhj b;
    public ceiz c;
    public eqcj d;
    public final ceix e;
    private final ceiy f;

    static {
        TimeUnit.SECONDS.toMillis(30L);
    }

    public ApiTokenChimeraService() {
        this(ceix.a, null, eqci.a);
    }

    public static Bundle a(short s) {
        Bundle bundle = new Bundle(1);
        bundle.putShort("ERROR_CODE", s);
        return bundle;
    }

    public final void b(int i) {
        envh envhVar;
        if (fsub.e()) {
            Context applicationContext = getApplicationContext();
            fgrc v = envh.a.v();
            if (!v.b.L()) {
                v.U();
            }
            fgri fgriVar = v.b;
            envh envhVar2 = (envh) fgriVar;
            envhVar2.f = 4001;
            envhVar2.b |= 8192;
            int i2 = i - 1;
            if (!fgriVar.L()) {
                v.U();
            }
            fgri fgriVar2 = v.b;
            envh envhVar3 = (envh) fgriVar2;
            envhVar3.b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
            envhVar3.g = i2;
            if (!fgriVar2.L()) {
                v.U();
            }
            envh.b((envh) v.b);
            aswd aswdVar = aswd.a;
            int a2 = asxd.a(applicationContext);
            if (!v.b.L()) {
                v.U();
            }
            envh envhVar4 = (envh) v.b;
            envhVar4.b |= 64;
            envhVar4.d = a2;
            if (aury.k(applicationContext)) {
                if (!v.b.L()) {
                    v.U();
                }
                envh envhVar5 = (envh) v.b;
                envhVar5.e = 8;
                envhVar5.b |= 512;
            } else if (aury.j(applicationContext)) {
                if (!v.b.L()) {
                    v.U();
                }
                envh envhVar6 = (envh) v.b;
                envhVar6.e = 1;
                envhVar6.b |= 512;
            } else if (aury.m(applicationContext)) {
                if (!v.b.L()) {
                    v.U();
                }
                envh envhVar7 = (envh) v.b;
                envhVar7.e = 2;
                envhVar7.b |= 512;
            } else {
                if (!v.b.L()) {
                    v.U();
                }
                envh envhVar8 = (envh) v.b;
                envhVar8.e = 0;
                envhVar8.b |= 512;
            }
            envhVar = (envh) v.Q();
        } else {
            envhVar = null;
        }
        if (!btjp.b(this.b) || envhVar == null) {
            return;
        }
        this.b.f(envhVar);
        ausn ausnVar = cemk.a;
    }

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        return this.f;
    }

    @Override // com.google.android.chimera.Service
    public final boolean onUnbind(Intent intent) {
        return false;
    }

    public ApiTokenChimeraService(ceix ceixVar, ceiz ceizVar, eqcj eqcjVar) {
        this.d = eqci.a;
        this.f = new ceiy(this);
        this.e = ceixVar;
        this.c = ceizVar;
        this.d = eqcjVar;
    }
}
