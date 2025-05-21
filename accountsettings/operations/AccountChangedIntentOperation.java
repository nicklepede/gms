package com.google.android.gms.accountsettings.operations;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.accountsettings.mg.poc.model.repository.RepositoryDatabase;
import defpackage.arxo;
import defpackage.asnd;
import defpackage.fvaq;
import defpackage.ksa;
import defpackage.ksi;
import defpackage.rtk;
import defpackage.rwx;
import defpackage.rxg;
import defpackage.swz;
import defpackage.szu;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class AccountChangedIntentOperation extends szu {
    static final arxo a = new arxo("AccountSettings", "AcctChgOp");
    public Context b;
    public RepositoryDatabase c;

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        ((swz) rtk.a(swz.class, this.d)).a(this);
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        arxo arxoVar = a;
        arxoVar.j("Handle intent-operations: %s", intent);
        if (intent == null || !"com.google.android.gms.auth.GOOGLE_ACCOUNT_CHANGE".equals(intent.getAction())) {
            return;
        }
        arxoVar.j("Remove data for obsolete accounts", new Object[0]);
        final ArrayList arrayList = new ArrayList();
        Context context = this.b;
        Iterator it = asnd.h(context, context.getPackageName()).iterator();
        while (it.hasNext()) {
            arrayList.add(((Account) it.next()).name);
        }
        RepositoryDatabase repositoryDatabase = this.c;
        rwx x = repositoryDatabase.x();
        StringBuilder sb = new StringBuilder();
        sb.append("DELETE FROM resource_info WHERE accountName NOT IN (");
        ksi.a(sb, arrayList.size());
        sb.append(")");
        final String sb2 = sb.toString();
        ksa.a(((rxg) x).a, false, true, new fvaq() { // from class: rxb
            @Override // defpackage.fvaq
            public final Object a(Object obj) {
                kri a2 = ((kqz) obj).a(sb2);
                try {
                    int i = 1;
                    for (String str : arrayList) {
                        if (str == null) {
                            a2.g(i);
                        } else {
                            a2.h(i, str);
                        }
                        i++;
                    }
                    a2.k();
                    a2.close();
                    return null;
                } catch (Throwable th) {
                    a2.close();
                    throw th;
                }
            }
        });
        if (arrayList.isEmpty()) {
            repositoryDatabase.v().b();
        }
    }
}
