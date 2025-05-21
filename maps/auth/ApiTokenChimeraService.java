package com.google.android.gms.maps.auth;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import com.google.android.chimera.Service;
import com.google.autofill.detection.ml.AndroidInputTypeSignal;
import defpackage.aqto;
import defpackage.aquo;
import defpackage.asoe;
import defpackage.asot;
import defpackage.brby;
import defpackage.buzh;
import defpackage.ccad;
import defpackage.ccae;
import defpackage.ccaf;
import defpackage.ccdq;
import defpackage.elhu;
import defpackage.enop;
import defpackage.enoq;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.fqad;
import j$.time.Duration;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class ApiTokenChimeraService extends Service {
    public static final Duration a = Duration.ofDays(5);
    public buzh b;
    public ccaf c;
    public enoq d;
    public final ccad e;
    private final ccae f;

    static {
        TimeUnit.SECONDS.toMillis(30L);
    }

    public ApiTokenChimeraService() {
        this(ccad.a, null, enop.a);
    }

    public static Bundle a(short s) {
        Bundle bundle = new Bundle(1);
        bundle.putShort("ERROR_CODE", s);
        return bundle;
    }

    public final void b(int i) {
        elhu elhuVar;
        if (fqad.e()) {
            Context applicationContext = getApplicationContext();
            fecj v = elhu.a.v();
            if (!v.b.L()) {
                v.U();
            }
            fecp fecpVar = v.b;
            elhu elhuVar2 = (elhu) fecpVar;
            elhuVar2.f = 4001;
            elhuVar2.b |= 8192;
            int i2 = i - 1;
            if (!fecpVar.L()) {
                v.U();
            }
            fecp fecpVar2 = v.b;
            elhu elhuVar3 = (elhu) fecpVar2;
            elhuVar3.b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
            elhuVar3.g = i2;
            if (!fecpVar2.L()) {
                v.U();
            }
            elhu.b((elhu) v.b);
            aqto aqtoVar = aqto.a;
            int a2 = aquo.a(applicationContext);
            if (!v.b.L()) {
                v.U();
            }
            elhu elhuVar4 = (elhu) v.b;
            elhuVar4.b |= 64;
            elhuVar4.d = a2;
            if (asoe.k(applicationContext)) {
                if (!v.b.L()) {
                    v.U();
                }
                elhu elhuVar5 = (elhu) v.b;
                elhuVar5.e = 8;
                elhuVar5.b |= 512;
            } else if (asoe.j(applicationContext)) {
                if (!v.b.L()) {
                    v.U();
                }
                elhu elhuVar6 = (elhu) v.b;
                elhuVar6.e = 1;
                elhuVar6.b |= 512;
            } else if (asoe.m(applicationContext)) {
                if (!v.b.L()) {
                    v.U();
                }
                elhu elhuVar7 = (elhu) v.b;
                elhuVar7.e = 2;
                elhuVar7.b |= 512;
            } else {
                if (!v.b.L()) {
                    v.U();
                }
                elhu elhuVar8 = (elhu) v.b;
                elhuVar8.e = 0;
                elhuVar8.b |= 512;
            }
            elhuVar = (elhu) v.Q();
        } else {
            elhuVar = null;
        }
        if (!brby.b(this.b) || elhuVar == null) {
            return;
        }
        this.b.f(elhuVar);
        asot asotVar = ccdq.a;
    }

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        return this.f;
    }

    @Override // com.google.android.chimera.Service
    public final boolean onUnbind(Intent intent) {
        return false;
    }

    public ApiTokenChimeraService(ccad ccadVar, ccaf ccafVar, enoq enoqVar) {
        this.d = enop.a;
        this.f = new ccae(this);
        this.e = ccadVar;
        this.c = ccafVar;
        this.d = enoqVar;
    }
}
