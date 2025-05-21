package com.google.android.gms.auth.easyunlock.config;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import com.google.android.chimera.IntentOperation;
import defpackage.aawr;
import defpackage.aaws;
import defpackage.aawt;
import defpackage.acml;
import defpackage.aqum;
import defpackage.aqun;
import defpackage.asot;
import defpackage.dfbl;
import defpackage.dvni;
import defpackage.eijr;
import defpackage.eijy;
import defpackage.ejhf;
import defpackage.esjn;
import defpackage.fkxx;
import defpackage.fkye;
import defpackage.fldd;
import defpackage.vay;
import defpackage.vbf;
import defpackage.vbh;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class EasyUnlockSupportReporterIntentOperation extends IntentOperation {
    private static final asot a = aaws.a("EasyUnlockSupportReporterIntentOperation");

    public EasyUnlockSupportReporterIntentOperation() {
    }

    public static Intent a(Context context) {
        return IntentOperation.getStartIntent(context, EasyUnlockSupportReporterIntentOperation.class, "com.google.android.gms.auth.easyunlock.UPDATE_FEATURE_SUPPORT");
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (fkxx.a.a().d() && !fldd.h()) {
            aawt aawtVar = new aawt();
            try {
                eijr a2 = eijy.a(new vbf());
                dvni.f(this);
                Account[] a3 = vbh.a(this, new vay(this), a2);
                if (a3 == null || (a3.length) == 0) {
                    ((ejhf) a.j()).x("Invalid account list.");
                    aawtVar.a(2);
                    return;
                }
                acml acmlVar = new acml(this);
                boolean z = fkxx.d() && aawr.b(this);
                ArrayList arrayList = new ArrayList();
                for (Account account : a3) {
                    arrayList.add(acmlVar.c(esjn.EASY_UNLOCK_HOST, z, account));
                }
                try {
                    dfbl.o(dfbl.e(arrayList), fkye.a.a().a(), TimeUnit.SECONDS);
                    aawtVar.a(0);
                } catch (InterruptedException | ExecutionException | TimeoutException e) {
                    ((ejhf) ((ejhf) a.j()).s(e)).x("Failed to report feature support.");
                    aawtVar.a(3);
                }
            } catch (RemoteException | aqum | aqun e2) {
                ((ejhf) ((ejhf) a.j()).s(e2)).x("Failed to fetch account list.");
                aawtVar.a(1);
            }
        }
    }

    EasyUnlockSupportReporterIntentOperation(Context context) {
        attachBaseContext(context);
    }
}
