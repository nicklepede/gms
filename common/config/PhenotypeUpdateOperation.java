package com.google.android.gms.common.config;

import android.content.Intent;
import com.google.android.cast.JGCastService;
import com.google.android.chimera.IntentOperation;
import defpackage.aszs;
import defpackage.atps;
import defpackage.auid;
import defpackage.ausn;
import defpackage.auua;
import defpackage.bjjw;
import defpackage.bjjz;
import defpackage.bsk;
import defpackage.bsl;
import defpackage.bzkb;
import defpackage.cyjh;
import defpackage.cyki;
import defpackage.elhz;
import defpackage.eluo;
import defpackage.fpse;
import j$.util.Objects;
import java.util.Set;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class PhenotypeUpdateOperation extends IntentOperation {
    private static final ausn a = ausn.b("PhenotypeUpdateOp", auid.CORE);
    private atps b;

    private final void a(bjjz bjjzVar, Set set) {
        int a2;
        int i = bjjzVar.i;
        int a3 = bjjw.a(i);
        if (a3 == 0 || a3 == 3) {
            return;
        }
        int a4 = bjjw.a(i);
        if ((a4 == 0 || a4 != 4) && (((a2 = bjjw.a(i)) == 0 || a2 != 1) && !set.contains(bjjzVar.c))) {
            Intent intent = new Intent(auua.f(bjjzVar.c));
            intent.putExtra("com.google.android.gms.phenotype.PACKAGE_NAME", bjjzVar.c);
            IntentOperation.startIntentOperations(this, intent);
            return;
        }
        String str = bjjzVar.c;
        Intent intent2 = new Intent("com.google.android.gms.phenotype.COMMITTED");
        intent2.setPackage("com.google.android.gms");
        intent2.putExtra("com.google.android.gms.phenotype.PACKAGE_NAME", str);
        IntentOperation.startIntentOperations(this, intent2);
        intent2.addFlags(JGCastService.FLAG_PRIVATE_DISPLAY);
        sendBroadcast(intent2);
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        aszs aszsVar = cyjh.a;
        this.b = new atps(this, new cyki(this));
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (intent == null || !(Objects.equals(intent.getAction(), "com.google.android.gms.phenotype.UPDATE") || Objects.equals(intent.getAction(), "com.google.android.gms.phenotype.DAILY_CHECKIN"))) {
            ((eluo) a.i()).x("Invalid intent");
            return;
        }
        elhz G = elhz.G(fpse.a.lK().e().b);
        if (Objects.equals(intent.getAction(), "com.google.android.gms.phenotype.DAILY_CHECKIN")) {
            if (((Boolean) bzkb.b.lK()).booleanValue()) {
                bzkb.a().k(14);
            }
            bsk bskVar = new bsk((bsl) this.b.c());
            while (bskVar.hasNext()) {
                bjjz bjjzVar = (bjjz) bskVar.next();
                int a2 = bjjw.a(bjjzVar.i);
                if (a2 != 0 && a2 != 3) {
                    a(bjjzVar, G);
                }
            }
            return;
        }
        final String stringExtra = intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME");
        if (((Boolean) bzkb.b.lK()).booleanValue()) {
            final bzkb a3 = bzkb.a();
            if (stringExtra != null && a3.d.contains(stringExtra)) {
                a3.h(new Runnable() { // from class: bzjp
                    @Override // java.lang.Runnable
                    public final void run() {
                        fgrc m = bzkb.m(13);
                        if (!m.b.L()) {
                            m.U();
                        }
                        String str = stringExtra;
                        bzkb bzkbVar = bzkb.this;
                        epqm epqmVar = (epqm) m.b;
                        epqm epqmVar2 = epqm.a;
                        epqmVar.b |= 2;
                        epqmVar.d = str;
                        bzkbVar.l(m);
                    }
                });
            }
        }
        if (stringExtra == null) {
            ((eluo) a.i()).x("Invalid Intent: missing EXTRA_PACKAGE_NAME.");
            return;
        }
        atps atpsVar = this.b;
        bjjz a4 = atpsVar.a(stringExtra);
        if (a4 == null || !atpsVar.f(a4.c)) {
            return;
        }
        bjjz a5 = this.b.a(stringExtra);
        if (a5 == null) {
            ((eluo) a.i()).B("No RegistrationInfo found for package '%s'", stringExtra);
        } else {
            a(a5, G);
        }
    }
}
