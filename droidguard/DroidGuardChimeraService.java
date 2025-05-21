package com.google.android.gms.droidguard;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.droidguard.DroidGuardChimeraService;
import com.google.android.gms.framework.tracing.wrapper.TracingIntentService;
import defpackage.asej;
import defpackage.asoe;
import defpackage.asot;
import defpackage.axtv;
import defpackage.axuk;
import defpackage.axve;
import defpackage.axvh;
import defpackage.axvj;
import defpackage.axvl;
import defpackage.axwt;
import defpackage.bxhk;
import defpackage.bxhl;
import defpackage.eiho;
import defpackage.eijr;
import defpackage.eijw;
import defpackage.eijy;
import defpackage.ejck;
import defpackage.fniq;
import java.io.IOException;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class DroidGuardChimeraService extends TracingIntentService {
    public eijr a;
    public eijr b;
    public axwt c;
    private axuk d;
    private eijr e;

    static {
        asot.b("DG", asej.DROID_GUARD);
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
                if (!fniq.c() || asoe.c(this) || (stringExtra2 = intent.getStringExtra("debug")) == null || !stringExtra2.equals("dg_d")) {
                    return;
                }
                axuk axukVar = this.d;
                if (((Boolean) axukVar.j.a()).booleanValue()) {
                    axukVar.f(14, "dg_fr_d", axtv.a(((Long) axukVar.k.a()).longValue()), axtv.a(((Long) axukVar.l.a()).longValue()), axtv.a(((Long) axukVar.m.a()).longValue()));
                    return;
                } else {
                    axukVar.e(14, "dg_fr_ut");
                    return;
                }
            }
            if (action.equals("com.google.android.gms.droidguard.service.VP") && fniq.d() && (stringExtra = intent.getStringExtra("vm_url")) != null) {
                axvj axvjVar = (axvj) this.e.a();
                if (stringExtra.startsWith("https://www.gstatic.com/droidguard/")) {
                    axve axveVar = new axve(stringExtra.substring(35));
                    axvh axvhVar = axvjVar.a;
                    if (axvhVar.j(axveVar)) {
                        return;
                    }
                    try {
                        byte[] a = axvjVar.a(stringExtra);
                        if (a.length != 0) {
                            axvhVar.i(axveVar, a);
                        }
                    } catch (axvl | IOException e) {
                        axvjVar.b.d(31, e);
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
            return new bxhl(this, 25, ejck.a, 2, new bxhk() { // from class: axqz
                @Override // defpackage.bxhk
                public final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
                    String str = getServiceRequest.f;
                    DroidGuardChimeraService droidGuardChimeraService = DroidGuardChimeraService.this;
                    bxgjVar.c(new axqu(droidGuardChimeraService, (axvs) droidGuardChimeraService.a.a(), (axtu) droidGuardChimeraService.b.a(), droidGuardChimeraService.c, str));
                }
            });
        }
        return null;
    }

    @Override // com.google.android.chimera.IntentService, com.google.android.chimera.Service
    public final void onCreate() {
        this.a = eijy.a(new eijr() { // from class: axra
            @Override // defpackage.eijr
            public final Object a() {
                return axvt.a(DroidGuardChimeraService.this);
            }
        });
        this.c = axwt.a(this);
        this.b = new eijw(new eiho() { // from class: axrb
            @Override // defpackage.eiho
            public final Object apply(Object obj) {
                return axtu.a(DroidGuardChimeraService.this, (axvs) obj);
            }
        }, this.a);
        this.d = axuk.a(this);
        this.e = eijy.a(new eijr() { // from class: axrc
            @Override // defpackage.eijr
            public final Object a() {
                return new axvj(DroidGuardChimeraService.this);
            }
        });
        super.onCreate();
    }

    private DroidGuardChimeraService(eijr eijrVar, eijr eijrVar2, axwt axwtVar, axuk axukVar, eijr eijrVar3) {
        super("DG");
        b();
        this.a = eijrVar;
        this.c = axwtVar;
        this.b = eijrVar2;
        this.d = axukVar;
        this.e = eijrVar3;
    }
}
