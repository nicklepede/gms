package com.google.android.gms.people.phenotype;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.people.phenotype.CommitGmsPhenotypeOperation;
import com.google.android.gms.people.phenotype.RegisterPhenotypeOperation;
import defpackage.aqxd;
import defpackage.asqx;
import defpackage.asri;
import defpackage.ctio;
import defpackage.cuey;
import defpackage.cufq;
import defpackage.cvzk;
import defpackage.cwal;
import defpackage.dfae;
import defpackage.dfaq;
import defpackage.dfbl;
import defpackage.fecj;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class RegisterPhenotypeOperation extends IntentOperation {
    public static int a(Context context, Intent intent) {
        return (intent == null || !intent.hasExtra("first_sdk_extra")) ? cufq.a(context) : intent.getIntExtra("first_sdk_extra", -1);
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(final Intent intent) {
        byte[] r;
        final String c = intent.hasExtra("mendel_package_name") ? asqx.c(intent.getStringExtra("mendel_package_name")) : "com.google.android.gms.people";
        aqxd aqxdVar = cvzk.a;
        cwal cwalVar = new cwal(this);
        int f = asri.f();
        String[] strArr = {"GMS_CORE_PEOPLE", "CHIPS"};
        if (c.equals("com.google.android.gms.people.ui")) {
            r = null;
        } else {
            fecj v = ctio.a.v();
            int a = a(this, intent);
            if (!v.b.L()) {
                v.U();
            }
            ctio ctioVar = (ctio) v.b;
            ctioVar.b |= 1;
            ctioVar.c = a;
            r = ((ctio) v.Q()).r();
        }
        dfaq bo = cwalVar.bo(c, f, strArr, r);
        bo.q(Executors.newCachedThreadPool(), new dfae() { // from class: cufr
            @Override // defpackage.dfae
            public final void hr(dfaq dfaqVar) {
                RegisterPhenotypeOperation registerPhenotypeOperation = RegisterPhenotypeOperation.this;
                Context context = this;
                registerPhenotypeOperation.startService(IntentOperation.getStartIntent(context, CommitGmsPhenotypeOperation.class, "com.google.android.gms.phenotype.UPDATE"));
                if (dfaqVar.m() && c.equals("com.google.android.gms.people")) {
                    context.getSharedPreferences("ppl_first_sdk", 0).edit().putInt("com.google.android.gms.people.firstSdk", RegisterPhenotypeOperation.a(context, intent)).commit();
                }
            }
        });
        try {
            dfbl.o(bo, 10L, TimeUnit.SECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException unused) {
            cuey.l("PeopleGmsPhenoRgstrIntentOp", "Google Api connection failed");
        }
    }
}
