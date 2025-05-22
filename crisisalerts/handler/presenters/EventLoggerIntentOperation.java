package com.google.android.gms.crisisalerts.handler.presenters;

import android.content.Intent;
import android.net.Uri;
import defpackage.aurp;
import defpackage.ausn;
import defpackage.auur;
import defpackage.azfl;
import defpackage.azfo;
import defpackage.azha;
import defpackage.azhg;
import defpackage.eluo;
import defpackage.fgqp;
import defpackage.fgsd;
import defpackage.fgub;
import defpackage.fguy;
import defpackage.fgvq;
import defpackage.fhoq;
import defpackage.fhoy;
import defpackage.fhpc;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class EventLoggerIntentOperation extends azfl {
    private static final ausn d = azhg.a("ELogIO");
    public azha a;
    public azfo b;
    public aurp c;

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        char c;
        if (intent == null || intent.getAction() == null) {
            return;
        }
        try {
            fhoy fhoyVar = (fhoy) fguy.c(intent, "ex_al", fhoy.a, fgqp.a());
            fhpc fhpcVar = (fhpc) fguy.c(intent, "ex_rd", fhpc.a, fgqp.a());
            String c2 = auur.c(intent.getAction());
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
                azfo azfoVar = this.b;
                fhoq fhoqVar = fhoyVar.c;
                if (fhoqVar == null) {
                    fhoqVar = fhoq.a;
                }
                azfoVar.g(fhoqVar);
                this.a.b(fhoyVar, fhpcVar, 2);
                if (auur.d(fhpcVar.d)) {
                    return;
                }
                Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(fhpcVar.d));
                intent2.setFlags(268435456);
                startActivity(intent2);
                return;
            }
            if (c != 1) {
                intent.getAction();
                return;
            }
            fgub fgubVar = fhoyVar.f;
            if (fgubVar == null) {
                fgubVar = fgub.a;
            }
            long b = fgvq.b(fgubVar);
            if (b > 0 && b <= this.c.a()) {
                z = true;
            }
            if (!z) {
                azfo azfoVar2 = this.b;
                fhoq fhoqVar2 = fhoyVar.c;
                if (fhoqVar2 == null) {
                    fhoqVar2 = fhoq.a;
                }
                azfoVar2.g(fhoqVar2);
            }
            this.a.b(fhoyVar, fhpcVar, true != z ? 3 : 4);
        } catch (fgsd e) {
            ((eluo) ((eluo) d.j()).s(e)).x("alert action");
        }
    }
}
