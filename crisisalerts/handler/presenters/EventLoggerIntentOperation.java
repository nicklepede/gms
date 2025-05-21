package com.google.android.gms.crisisalerts.handler.presenters;

import android.content.Intent;
import android.net.Uri;
import defpackage.asnv;
import defpackage.asot;
import defpackage.asqx;
import defpackage.axbl;
import defpackage.axbo;
import defpackage.axda;
import defpackage.axdg;
import defpackage.ejhf;
import defpackage.febw;
import defpackage.fedk;
import defpackage.fefi;
import defpackage.fegf;
import defpackage.fegx;
import defpackage.fezs;
import defpackage.ffaa;
import defpackage.ffae;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class EventLoggerIntentOperation extends axbl {
    private static final asot d = axdg.a("ELogIO");
    public axda a;
    public axbo b;
    public asnv c;

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        char c;
        if (intent == null || intent.getAction() == null) {
            return;
        }
        try {
            ffaa ffaaVar = (ffaa) fegf.c(intent, "ex_al", ffaa.a, febw.a());
            ffae ffaeVar = (ffae) fegf.c(intent, "ex_rd", ffae.a, febw.a());
            String c2 = asqx.c(intent.getAction());
            int hashCode = c2.hashCode();
            boolean z = false;
            if (hashCode != -224443664) {
                if (hashCode == -130846222 && c2.equals("com.google.android.gms.crisisalerts.handler.presenters.EVENT_DISMISS")) {
                    c = 1;
                }
                c = 65535;
            } else {
                if (c2.equals("com.google.android.gms.crisisalerts.handler.presenters.EVENT_CLICK")) {
                    c = 0;
                }
                c = 65535;
            }
            if (c == 0) {
                axbo axboVar = this.b;
                fezs fezsVar = ffaaVar.c;
                if (fezsVar == null) {
                    fezsVar = fezs.a;
                }
                axboVar.g(fezsVar);
                this.a.b(ffaaVar, ffaeVar, 2);
                if (asqx.d(ffaeVar.d)) {
                    return;
                }
                Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(ffaeVar.d));
                intent2.setFlags(268435456);
                startActivity(intent2);
                return;
            }
            if (c != 1) {
                intent.getAction();
                return;
            }
            fefi fefiVar = ffaaVar.f;
            if (fefiVar == null) {
                fefiVar = fefi.a;
            }
            long b = fegx.b(fefiVar);
            if (b > 0 && b <= this.c.a()) {
                z = true;
            }
            if (!z) {
                axbo axboVar2 = this.b;
                fezs fezsVar2 = ffaaVar.c;
                if (fezsVar2 == null) {
                    fezsVar2 = fezs.a;
                }
                axboVar2.g(fezsVar2);
            }
            this.a.b(ffaaVar, ffaeVar, true != z ? 3 : 4);
        } catch (fedk e) {
            ((ejhf) ((ejhf) d.j()).s(e)).x("alert action");
        }
    }
}
