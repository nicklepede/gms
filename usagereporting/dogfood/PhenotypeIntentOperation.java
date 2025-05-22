package com.google.android.gms.usagereporting.dogfood;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.chimera.modules.usagereporting.AppContextProvider;
import defpackage.atad;
import defpackage.atat;
import defpackage.auid;
import defpackage.ausn;
import defpackage.auua;
import defpackage.dhlw;
import defpackage.dhmr;
import defpackage.dkbl;
import defpackage.dkbp;
import defpackage.dkbr;
import defpackage.ekvl;
import defpackage.fvnf;
import defpackage.fvnv;
import j$.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class PhenotypeIntentOperation extends IntentOperation {
    static final String a;
    private final Context b = AppContextProvider.a();
    private dkbp c;
    private atad d;

    static {
        ausn.b("PhenotypeIntentOperation", auid.USAGE_REPORTING);
        a = auua.f("com.google.android.gms.usagereporting");
    }

    private final boolean a(Context context) {
        if (this.d == null) {
            this.d = dkbl.a(context);
        }
        dhlw aK = this.d.aK();
        try {
            dhmr.o(aK, fvnf.b(), TimeUnit.SECONDS);
            return aK.m() && aK.i() != null && ((atat) aK.i()).q();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return false;
        } catch (ExecutionException | TimeoutException unused2) {
            return false;
        }
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (Objects.equals(intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"), "com.google.android.gms.usagereporting") && Objects.equals(intent.getAction(), a) && fvnv.i()) {
            if (this.c == null) {
                Context context = this.b;
                this.c = new dkbp(context, new dkbr(context));
            }
            if (!fvnv.h()) {
                dkbp dkbpVar = this.c;
                ekvl.y(dkbpVar);
                dkbpVar.a();
            } else {
                if (a(this.b)) {
                    return;
                }
                dkbp dkbpVar2 = this.c;
                ekvl.y(dkbpVar2);
                dkbpVar2.b();
            }
        }
    }
}
