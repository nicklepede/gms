package com.google.android.gms.common.config;

import android.content.Intent;
import com.google.android.cast.JGCastService;
import com.google.android.chimera.IntentOperation;
import defpackage.aqxd;
import defpackage.arnd;
import defpackage.asej;
import defpackage.asot;
import defpackage.asqg;
import defpackage.bhfg;
import defpackage.bhfj;
import defpackage.brz;
import defpackage.bsa;
import defpackage.bxbl;
import defpackage.cvzk;
import defpackage.cwal;
import defpackage.eiuu;
import defpackage.ejhf;
import defpackage.fnaf;
import j$.util.Objects;
import java.util.Set;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class PhenotypeUpdateOperation extends IntentOperation {
    private static final asot a = asot.b("PhenotypeUpdateOp", asej.CORE);
    private arnd b;

    private final void a(bhfj bhfjVar, Set set) {
        int a2;
        int i = bhfjVar.i;
        int a3 = bhfg.a(i);
        if (a3 == 0 || a3 == 3) {
            return;
        }
        int a4 = bhfg.a(i);
        if ((a4 == 0 || a4 != 4) && (((a2 = bhfg.a(i)) == 0 || a2 != 1) && !set.contains(bhfjVar.c))) {
            Intent intent = new Intent(asqg.f(bhfjVar.c));
            intent.putExtra("com.google.android.gms.phenotype.PACKAGE_NAME", bhfjVar.c);
            IntentOperation.startIntentOperations(this, intent);
            return;
        }
        String str = bhfjVar.c;
        Intent intent2 = new Intent("com.google.android.gms.phenotype.COMMITTED");
        intent2.setPackage("com.google.android.gms");
        intent2.putExtra("com.google.android.gms.phenotype.PACKAGE_NAME", str);
        IntentOperation.startIntentOperations(this, intent2);
        intent2.addFlags(JGCastService.FLAG_PRIVATE_DISPLAY);
        sendBroadcast(intent2);
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        aqxd aqxdVar = cvzk.a;
        this.b = new arnd(this, new cwal(this));
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (intent == null || !(Objects.equals(intent.getAction(), "com.google.android.gms.phenotype.UPDATE") || Objects.equals(intent.getAction(), "com.google.android.gms.phenotype.DAILY_CHECKIN"))) {
            ((ejhf) a.i()).x("Invalid intent");
            return;
        }
        eiuu G = eiuu.G(fnaf.a.a().e().b);
        if (Objects.equals(intent.getAction(), "com.google.android.gms.phenotype.DAILY_CHECKIN")) {
            if (((Boolean) bxbl.b.a()).booleanValue()) {
                bxbl.a().k(14);
            }
            brz brzVar = new brz((bsa) this.b.c());
            while (brzVar.hasNext()) {
                bhfj bhfjVar = (bhfj) brzVar.next();
                int a2 = bhfg.a(bhfjVar.i);
                if (a2 != 0 && a2 != 3) {
                    a(bhfjVar, G);
                }
            }
            return;
        }
        final String stringExtra = intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME");
        if (((Boolean) bxbl.b.a()).booleanValue()) {
            final bxbl a3 = bxbl.a();
            if (stringExtra != null && a3.d.contains(stringExtra)) {
                a3.h(new Runnable() { // from class: bxaz
                    @Override // java.lang.Runnable
                    public final void run() {
                        fecj m = bxbl.m(13);
                        if (!m.b.L()) {
                            m.U();
                        }
                        String str = stringExtra;
                        bxbl bxblVar = bxbl.this;
                        encv encvVar = (encv) m.b;
                        encv encvVar2 = encv.a;
                        encvVar.b |= 2;
                        encvVar.d = str;
                        bxblVar.l(m);
                    }
                });
            }
        }
        if (stringExtra == null) {
            ((ejhf) a.i()).x("Invalid Intent: missing EXTRA_PACKAGE_NAME.");
            return;
        }
        arnd arndVar = this.b;
        bhfj a4 = arndVar.a(stringExtra);
        if (a4 == null || !arndVar.f(a4.c)) {
            return;
        }
        bhfj a5 = this.b.a(stringExtra);
        if (a5 == null) {
            ((ejhf) a.i()).B("No RegistrationInfo found for package '%s'", stringExtra);
        } else {
            a(a5, G);
        }
    }
}
