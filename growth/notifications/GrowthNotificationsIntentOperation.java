package com.google.android.gms.growth.notifications;

import android.content.Context;
import com.google.android.chimera.IntentOperation;
import defpackage.asej;
import defpackage.asot;
import defpackage.bklb;
import defpackage.bklc;
import defpackage.bklm;
import defpackage.bklq;
import defpackage.bkmh;
import defpackage.bkmi;
import defpackage.bkyb;
import defpackage.bkyk;
import defpackage.eitj;
import defpackage.ejhf;
import defpackage.ensv;
import defpackage.esex;
import defpackage.esey;
import defpackage.esng;
import defpackage.esoj;
import defpackage.feab;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.fedh;
import defpackage.fixl;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class GrowthNotificationsIntentOperation extends IntentOperation {
    public static final /* synthetic */ int e = 0;
    private static final asot f = asot.b("GrowthNotifications", asej.GROWTH);
    bklm a;
    bkyk b;
    bkmi c;
    bkyb d;

    private final boolean a(String str, esey eseyVar) {
        if ((eseyVar.b & 32) == 0) {
            return false;
        }
        try {
            bkmi bkmiVar = this.c;
            esex esexVar = eseyVar.i;
            if (esexVar == null) {
                esexVar = esex.a;
            }
            bkmh bkmhVar = (bkmh) bkmiVar.b(esexVar).get(5L, TimeUnit.SECONDS);
            if (bkmhVar.a) {
                return false;
            }
            fecj v = esng.a.v();
            if (!v.b.L()) {
                v.U();
            }
            fecp fecpVar = v.b;
            esng esngVar = (esng) fecpVar;
            esngVar.c = 2;
            esngVar.b |= 1;
            if (!fecpVar.L()) {
                v.U();
            }
            fecp fecpVar2 = v.b;
            esng esngVar2 = (esng) fecpVar2;
            esngVar2.d = 5;
            esngVar2.b |= 2;
            eitj eitjVar = bkmhVar.b;
            if (!fecpVar2.L()) {
                v.U();
            }
            esng esngVar3 = (esng) v.b;
            fedh fedhVar = esngVar3.f;
            if (!fedhVar.c()) {
                esngVar3.f = fecp.E(fedhVar);
            }
            feab.E(eitjVar, esngVar3.f);
            esoj esojVar = eseyVar.c;
            if (esojVar == null) {
                esojVar = esoj.a;
            }
            if (!v.b.L()) {
                v.U();
            }
            esng esngVar4 = (esng) v.b;
            esojVar.getClass();
            esngVar4.e = esojVar;
            esngVar4.b |= 4;
            this.a.c(str, v);
            return true;
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            ((ejhf) ((ejhf) f.i()).s(e2)).x("Failed to evaluate filtering condition");
            bklm bklmVar = this.a;
            fecj v2 = esng.a.v();
            if (!v2.b.L()) {
                v2.U();
            }
            fecp fecpVar3 = v2.b;
            esng esngVar5 = (esng) fecpVar3;
            esngVar5.c = 2;
            esngVar5.b |= 1;
            if (!fecpVar3.L()) {
                v2.U();
            }
            esng esngVar6 = (esng) v2.b;
            esngVar6.d = 1;
            esngVar6.b = 2 | esngVar6.b;
            esoj esojVar2 = eseyVar.c;
            if (esojVar2 == null) {
                esojVar2 = esoj.a;
            }
            if (!v2.b.L()) {
                v2.U();
            }
            esng esngVar7 = (esng) v2.b;
            esojVar2.getClass();
            esngVar7.e = esojVar2;
            esngVar7.b |= 4;
            bklmVar.c(str, v2);
            return true;
        }
    }

    private static final boolean b(esey eseyVar, String str) {
        esoj esojVar = eseyVar.c;
        if (esojVar == null) {
            esojVar = esoj.a;
        }
        try {
            return Pattern.compile(str, 2).matcher(esojVar.e.trim()).matches();
        } catch (PatternSyntaxException e2) {
            ((ejhf) f.j()).B("Illegal syntax for holdback campaign regex: [%s]", e2.getMessage());
            return false;
        }
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        bklq bklqVar = new bklq();
        bklqVar.b(bklb.a());
        bklc bklcVar = bklqVar.a().a;
        bklm c = bklcVar.c();
        fixl.d(c);
        this.a = c;
        bkyk f2 = bklcVar.f();
        fixl.d(f2);
        this.b = f2;
        bklb bklbVar = (bklb) bklcVar;
        Context context = (Context) bklbVar.a.a();
        fixl.d(context);
        ensv ensvVar = (ensv) bklbVar.b.a();
        fixl.d(ensvVar);
        this.c = new bkmi(context, ensvVar);
        bkyb bkybVar = (bkyb) bklbVar.o.a();
        fixl.d(bkybVar);
        this.d = bkybVar;
        bklcVar.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0199 A[LOOP:0: B:29:0x0096->B:40:0x0199, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0142 A[SYNTHETIC] */
    @Override // com.google.android.chimera.IntentOperation
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onHandleIntent(android.content.Intent r19) {
        /*
            Method dump skipped, instructions count: 1176
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.growth.notifications.GrowthNotificationsIntentOperation.onHandleIntent(android.content.Intent):void");
    }
}
