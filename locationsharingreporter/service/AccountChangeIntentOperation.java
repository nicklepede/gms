package com.google.android.gms.locationsharingreporter.service;

import android.accounts.Account;
import android.content.Intent;
import android.os.Parcelable;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.chimera.modules.locationsharingreporter.AppContextProvider;
import com.google.android.gms.locationsharingreporter.service.reporting.periodic.PersistentDispatchingIntentOperation;
import defpackage.auid;
import defpackage.ausn;
import defpackage.cdec;
import defpackage.cdfe;
import defpackage.cdft;
import defpackage.ektg;
import defpackage.ekut;
import defpackage.ekvi;
import defpackage.eluo;
import defpackage.eqgl;
import defpackage.fsqm;
import defpackage.xgt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class AccountChangeIntentOperation extends IntentOperation {
    private static final ausn a = ausn.b("LSRAccountChange", auid.LOCATION_SHARING_REPORTER);

    private final void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Account account = (Account) it.next();
            try {
                final cdfe b = cdec.b();
                final String str = account.name;
                eqgl e = b.e(this, new ekut() { // from class: cdez
                    @Override // defpackage.ekut
                    public final Object apply(Object obj) {
                        cdbx cdbxVar = (cdbx) obj;
                        ausn ausnVar = cdfe.a;
                        fgrc fgrcVar = (fgrc) cdbxVar.iQ(5, null);
                        fgrcVar.X(cdbxVar);
                        cdbw cdbwVar = (cdbw) fgrcVar;
                        String str2 = str;
                        str2.getClass();
                        if (!cdbwVar.b.L()) {
                            cdbwVar.U();
                        }
                        cdbx cdbxVar2 = (cdbx) cdbwVar.b;
                        cdbx cdbxVar3 = cdbx.a;
                        cdbxVar2.b().remove(str2);
                        return (cdbx) cdbwVar.Q();
                    }
                });
                e.hD(new Runnable() { // from class: cdfa
                    @Override // java.lang.Runnable
                    public final void run() {
                        cdfe.this.h(this, str, ektg.a);
                    }
                }, cdfe.b);
                e.get(fsqm.i(), TimeUnit.MILLISECONDS);
            } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException e2) {
                ((eluo) ((eluo) ((eluo) a.j()).s(e2)).ai((char) 5701)).x("failed to clear location reporting status map for account");
            }
        }
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        ekvi j;
        ausn ausnVar = a;
        ((eluo) ((eluo) ausnVar.h()).ai((char) 5698)).x("Received account change broadcast");
        List c = xgt.c(intent);
        if (c.isEmpty()) {
            ((eluo) ((eluo) ausnVar.h()).ai((char) 5700)).x("Dropping account change broadcast, no accounts removed.");
            return;
        }
        a(c);
        Iterator it = c.iterator();
        while (it.hasNext()) {
            cdft.a().e(this, ((Account) it.next()).name);
        }
        int i = PersistentDispatchingIntentOperation.a;
        Intent startIntent = IntentOperation.getStartIntent(AppContextProvider.a(), PersistentDispatchingIntentOperation.class, "com.google.android.gms.locationsharingreporter.service.reporting.periodic.ACTION_ACCOUNTS_REMOVED");
        if (startIntent == null) {
            j = ektg.a;
        } else {
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
            arrayList.addAll(c);
            startIntent.putParcelableArrayListExtra("com.google.android.gms.locationsharingreporter.service.reporting.periodic.EXTRA_REMOVED_ACCOUNT_LIST", arrayList);
            j = ekvi.j(startIntent);
        }
        if (j.h()) {
            AppContextProvider.a().startService((Intent) j.c());
        } else {
            ((eluo) ((eluo) ausnVar.i()).ai((char) 5699)).x("Failed to forward account change intent");
        }
    }
}
