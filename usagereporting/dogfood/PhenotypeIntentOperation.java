package com.google.android.gms.usagereporting.dogfood;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.chimera.modules.usagereporting.AppContextProvider;
import defpackage.aqxo;
import defpackage.aqye;
import defpackage.asej;
import defpackage.asot;
import defpackage.asqg;
import defpackage.dfaq;
import defpackage.dfbl;
import defpackage.dhqf;
import defpackage.dhqj;
import defpackage.dhql;
import defpackage.eiig;
import defpackage.fsrp;
import defpackage.fssf;
import j$.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class PhenotypeIntentOperation extends IntentOperation {
    static final String a;
    private final Context b = AppContextProvider.a();
    private dhqj c;
    private aqxo d;

    static {
        asot.b("PhenotypeIntentOperation", asej.USAGE_REPORTING);
        a = asqg.f("com.google.android.gms.usagereporting");
    }

    private final boolean a(Context context) {
        if (this.d == null) {
            this.d = dhqf.a(context);
        }
        dfaq aL = this.d.aL();
        try {
            dfbl.o(aL, fsrp.b(), TimeUnit.SECONDS);
            return aL.m() && aL.i() != null && ((aqye) aL.i()).r();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return false;
        } catch (ExecutionException | TimeoutException unused2) {
            return false;
        }
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (Objects.equals(intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"), "com.google.android.gms.usagereporting") && Objects.equals(intent.getAction(), a) && fssf.i()) {
            if (this.c == null) {
                Context context = this.b;
                this.c = new dhqj(context, new dhql(context));
            }
            if (!fssf.h()) {
                dhqj dhqjVar = this.c;
                eiig.x(dhqjVar);
                dhqjVar.a();
            } else {
                if (a(this.b)) {
                    return;
                }
                dhqj dhqjVar2 = this.c;
                eiig.x(dhqjVar2);
                dhqjVar2.b();
            }
        }
    }
}
