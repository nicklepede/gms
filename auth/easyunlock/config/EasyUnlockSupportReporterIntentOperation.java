package com.google.android.gms.auth.easyunlock.config;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import com.google.android.chimera.IntentOperation;
import defpackage.acwr;
import defpackage.acws;
import defpackage.acwt;
import defpackage.aeml;
import defpackage.asxb;
import defpackage.asxc;
import defpackage.ausn;
import defpackage.dhmr;
import defpackage.dxyi;
import defpackage.ekww;
import defpackage.ekxd;
import defpackage.eluo;
import defpackage.euzc;
import defpackage.fnpd;
import defpackage.fnpk;
import defpackage.fnum;
import defpackage.wwy;
import defpackage.wxf;
import defpackage.wxh;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class EasyUnlockSupportReporterIntentOperation extends IntentOperation {
    private static final ausn a = acws.a("EasyUnlockSupportReporterIntentOperation");

    public EasyUnlockSupportReporterIntentOperation() {
    }

    public static Intent a(Context context) {
        return IntentOperation.getStartIntent(context, EasyUnlockSupportReporterIntentOperation.class, "com.google.android.gms.auth.easyunlock.UPDATE_FEATURE_SUPPORT");
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (fnpd.a.lK().d() && !fnum.h()) {
            acwt acwtVar = new acwt();
            try {
                ekww a2 = ekxd.a(new wxf());
                dxyi.f(this);
                Account[] a3 = wxh.a(this, new wwy(this), a2);
                if (a3 == null || (a3.length) == 0) {
                    ((eluo) a.j()).x("Invalid account list.");
                    acwtVar.a(2);
                    return;
                }
                aeml aemlVar = new aeml(this);
                boolean z = fnpd.d() && acwr.b(this);
                ArrayList arrayList = new ArrayList();
                for (Account account : a3) {
                    arrayList.add(aemlVar.c(euzc.EASY_UNLOCK_HOST, z, account));
                }
                try {
                    dhmr.o(dhmr.e(arrayList), fnpk.a.lK().a(), TimeUnit.SECONDS);
                    acwtVar.a(0);
                } catch (InterruptedException | ExecutionException | TimeoutException e) {
                    ((eluo) ((eluo) a.j()).s(e)).x("Failed to report feature support.");
                    acwtVar.a(3);
                }
            } catch (RemoteException | asxb | asxc e2) {
                ((eluo) ((eluo) a.j()).s(e2)).x("Failed to fetch account list.");
                acwtVar.a(1);
            }
        }
    }

    EasyUnlockSupportReporterIntentOperation(Context context) {
        attachBaseContext(context);
    }
}
