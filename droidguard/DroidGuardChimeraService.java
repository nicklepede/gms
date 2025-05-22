package com.google.android.gms.droidguard;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.droidguard.DroidGuardChimeraService;
import com.google.android.gms.framework.tracing.wrapper.TracingIntentService;
import defpackage.auid;
import defpackage.aury;
import defpackage.ausn;
import defpackage.azxv;
import defpackage.azyk;
import defpackage.azze;
import defpackage.azzh;
import defpackage.azzj;
import defpackage.azzl;
import defpackage.baat;
import defpackage.bzqa;
import defpackage.bzqb;
import defpackage.ekut;
import defpackage.ekww;
import defpackage.ekxb;
import defpackage.ekxd;
import defpackage.elpp;
import defpackage.fqat;
import java.io.IOException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class DroidGuardChimeraService extends TracingIntentService {
    public ekww a;
    public ekww b;
    public baat c;
    private azyk d;
    private ekww e;

    static {
        ausn.b("DG", auid.DROID_GUARD);
    }

    public DroidGuardChimeraService() {
        super("DG");
        b();
    }

    private final void b() {
        setIntentRedelivery(true);
    }

    @Override // com.google.android.gms.framework.tracing.wrapper.TracingIntentService
    public final void a(Intent intent) {
        String stringExtra;
        String stringExtra2;
        if (intent == null) {
            return;
        }
        intent.getAction();
        intent.getStringExtra("debug");
        intent.getStringExtra("vm_url");
        intent.getExtras();
        String action = intent.getAction();
        if (action != null) {
            if (action.equals("com.google.android.gms.droidguard.service.PING")) {
                if (!fqat.c() || aury.c(this) || (stringExtra2 = intent.getStringExtra("debug")) == null || !stringExtra2.equals("dg_d")) {
                    return;
                }
                azyk azykVar = this.d;
                if (((Boolean) azykVar.j.lK()).booleanValue()) {
                    azykVar.f(14, "dg_fr_d", azxv.a(((Long) azykVar.k.lK()).longValue()), azxv.a(((Long) azykVar.l.lK()).longValue()), azxv.a(((Long) azykVar.m.lK()).longValue()));
                    return;
                } else {
                    azykVar.e(14, "dg_fr_ut");
                    return;
                }
            }
            if (action.equals("com.google.android.gms.droidguard.service.VP") && fqat.d() && (stringExtra = intent.getStringExtra("vm_url")) != null) {
                azzj azzjVar = (azzj) this.e.lK();
                if (stringExtra.startsWith("https://www.gstatic.com/droidguard/")) {
                    azze azzeVar = new azze(stringExtra.substring(35));
                    azzh azzhVar = azzjVar.a;
                    if (azzhVar.f(azzeVar)) {
                        return;
                    }
                    try {
                        byte[] a = azzjVar.a(stringExtra);
                        if (a.length != 0) {
                            azzhVar.e(azzeVar, a);
                        }
                    } catch (azzl | IOException e) {
                        azzjVar.b.d(31, e);
                    }
                }
            }
        }
    }

    @Override // com.google.android.chimera.IntentService, com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        intent.getAction();
        intent.getDataString();
        intent.getExtras();
        if ("com.google.android.gms.droidguard.service.START".equals(intent.getAction())) {
            return new bzqb(this, 25, elpp.a, 2, new bzqa() { // from class: azuz
                @Override // defpackage.bzqa
                public final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
                    String str = getServiceRequest.f;
                    DroidGuardChimeraService droidGuardChimeraService = DroidGuardChimeraService.this;
                    bzozVar.c(new azuu(droidGuardChimeraService, (azzs) droidGuardChimeraService.a.lK(), (azxu) droidGuardChimeraService.b.lK(), droidGuardChimeraService.c, str));
                }
            });
        }
        return null;
    }

    @Override // com.google.android.chimera.IntentService, com.google.android.chimera.Service
    public final void onCreate() {
        this.a = ekxd.a(new ekww() { // from class: azva
            @Override // defpackage.ekww
            public final Object lK() {
                return azzt.a(DroidGuardChimeraService.this);
            }
        });
        this.c = baat.a(this);
        this.b = new ekxb(new ekut() { // from class: azvb
            @Override // defpackage.ekut
            public final Object apply(Object obj) {
                return azxu.a(DroidGuardChimeraService.this, (azzs) obj);
            }
        }, this.a);
        this.d = azyk.a(this);
        this.e = ekxd.a(new ekww() { // from class: azvc
            @Override // defpackage.ekww
            public final Object lK() {
                return new azzj(DroidGuardChimeraService.this);
            }
        });
        super.onCreate();
    }

    private DroidGuardChimeraService(ekww ekwwVar, ekww ekwwVar2, baat baatVar, azyk azykVar, ekww ekwwVar3) {
        super("DG");
        b();
        this.a = ekwwVar;
        this.c = baatVar;
        this.b = ekwwVar2;
        this.d = azykVar;
        this.e = ekwwVar3;
    }
}
