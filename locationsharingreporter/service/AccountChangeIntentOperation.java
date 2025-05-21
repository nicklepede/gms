package com.google.android.gms.locationsharingreporter.service;

import android.accounts.Account;
import android.content.Intent;
import android.os.Parcelable;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.chimera.modules.locationsharingreporter.AppContextProvider;
import com.google.android.gms.locationsharingreporter.service.reporting.periodic.PersistentDispatchingIntentOperation;
import defpackage.asej;
import defpackage.asot;
import defpackage.cavm;
import defpackage.cawo;
import defpackage.caxd;
import defpackage.eigb;
import defpackage.eiho;
import defpackage.eiid;
import defpackage.ejhf;
import defpackage.enss;
import defpackage.fpws;
import defpackage.vks;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class AccountChangeIntentOperation extends IntentOperation {
    private static final asot a = asot.b("LSRAccountChange", asej.LOCATION_SHARING_REPORTER);

    private final void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Account account = (Account) it.next();
            try {
                final cawo b = cavm.b();
                final String str = account.name;
                enss e = b.e(this, new eiho() { // from class: cawj
                    @Override // defpackage.eiho
                    public final Object apply(Object obj) {
                        cath cathVar = (cath) obj;
                        asot asotVar = cawo.a;
                        fecj fecjVar = (fecj) cathVar.iB(5, null);
                        fecjVar.X(cathVar);
                        catg catgVar = (catg) fecjVar;
                        String str2 = str;
                        str2.getClass();
                        if (!catgVar.b.L()) {
                            catgVar.U();
                        }
                        cath cathVar2 = (cath) catgVar.b;
                        cath cathVar3 = cath.a;
                        cathVar2.b().remove(str2);
                        return (cath) catgVar.Q();
                    }
                });
                e.hn(new Runnable() { // from class: cawk
                    @Override // java.lang.Runnable
                    public final void run() {
                        cawo.this.g(this, str, eigb.a);
                    }
                }, cawo.b);
                e.get(fpws.i(), TimeUnit.MILLISECONDS);
            } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException e2) {
                ((ejhf) ((ejhf) ((ejhf) a.j()).s(e2)).ah((char) 5687)).x("failed to clear location reporting status map for account");
            }
        }
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        eiid j;
        asot asotVar = a;
        ((ejhf) ((ejhf) asotVar.h()).ah((char) 5684)).x("Received account change broadcast");
        List c = vks.c(intent);
        if (c.isEmpty()) {
            ((ejhf) ((ejhf) asotVar.h()).ah((char) 5686)).x("Dropping account change broadcast, no accounts removed.");
            return;
        }
        a(c);
        Iterator it = c.iterator();
        while (it.hasNext()) {
            caxd.a().e(this, ((Account) it.next()).name);
        }
        int i = PersistentDispatchingIntentOperation.a;
        Intent startIntent = IntentOperation.getStartIntent(AppContextProvider.a(), PersistentDispatchingIntentOperation.class, "com.google.android.gms.locationsharingreporter.service.reporting.periodic.ACTION_ACCOUNTS_REMOVED");
        if (startIntent == null) {
            j = eigb.a;
        } else {
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
            arrayList.addAll(c);
            startIntent.putParcelableArrayListExtra("com.google.android.gms.locationsharingreporter.service.reporting.periodic.EXTRA_REMOVED_ACCOUNT_LIST", arrayList);
            j = eiid.j(startIntent);
        }
        if (j.h()) {
            AppContextProvider.a().startService((Intent) j.c());
        } else {
            ((ejhf) ((ejhf) asotVar.i()).ah((char) 5685)).x("Failed to forward account change intent");
        }
    }
}
