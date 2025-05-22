package com.google.android.gms.people.phenotype;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.people.phenotype.CommitGmsPhenotypeOperation;
import com.google.android.gms.people.phenotype.RegisterPhenotypeOperation;
import defpackage.aszs;
import defpackage.auur;
import defpackage.auvc;
import defpackage.cvru;
import defpackage.cwof;
import defpackage.cwox;
import defpackage.cyjh;
import defpackage.cyki;
import defpackage.dhlk;
import defpackage.dhlw;
import defpackage.dhmr;
import defpackage.fgrc;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class RegisterPhenotypeOperation extends IntentOperation {
    public static int a(Context context, Intent intent) {
        return (intent == null || !intent.hasExtra("first_sdk_extra")) ? cwox.a(context) : intent.getIntExtra("first_sdk_extra", -1);
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(final Intent intent) {
        byte[] r;
        final String c = intent.hasExtra("mendel_package_name") ? auur.c(intent.getStringExtra("mendel_package_name")) : "com.google.android.gms.people";
        aszs aszsVar = cyjh.a;
        cyki cykiVar = new cyki(this);
        int f = auvc.f();
        String[] strArr = {"GMS_CORE_PEOPLE", "CHIPS"};
        if (c.equals("com.google.android.gms.people.ui")) {
            r = null;
        } else {
            fgrc v = cvru.a.v();
            int a = a(this, intent);
            if (!v.b.L()) {
                v.U();
            }
            cvru cvruVar = (cvru) v.b;
            cvruVar.b |= 1;
            cvruVar.c = a;
            r = ((cvru) v.Q()).r();
        }
        dhlw n = cykiVar.n(c, f, strArr, r);
        n.q(Executors.newCachedThreadPool(), new dhlk() { // from class: cwoy
            @Override // defpackage.dhlk
            public final void hH(dhlw dhlwVar) {
                RegisterPhenotypeOperation registerPhenotypeOperation = RegisterPhenotypeOperation.this;
                Context context = this;
                registerPhenotypeOperation.startService(IntentOperation.getStartIntent(context, CommitGmsPhenotypeOperation.class, "com.google.android.gms.phenotype.UPDATE"));
                if (dhlwVar.m() && c.equals("com.google.android.gms.people")) {
                    context.getSharedPreferences("ppl_first_sdk", 0).edit().putInt("com.google.android.gms.people.firstSdk", RegisterPhenotypeOperation.a(context, intent)).commit();
                }
            }
        });
        try {
            dhmr.o(n, 10L, TimeUnit.SECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException unused) {
            cwof.l("PeopleGmsPhenoRgstrIntentOp", "Google Api connection failed");
        }
    }
}
