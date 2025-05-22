package com.google.android.gms.accountsettings.operations;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.accountsettings.mg.poc.model.repository.RepositoryDatabase;
import defpackage.auad;
import defpackage.auqx;
import defpackage.fxwo;
import defpackage.mkv;
import defpackage.mld;
import defpackage.tmt;
import defpackage.tqh;
import defpackage.tqq;
import defpackage.usx;
import defpackage.uvs;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class AccountChangedIntentOperation extends uvs {
    static final auad a = new auad("AccountSettings", "AcctChgOp");
    public Context b;
    public RepositoryDatabase c;

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        ((usx) tmt.a(usx.class, this.d)).a(this);
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        auad auadVar = a;
        auadVar.j("Handle intent-operations: %s", intent);
        if (intent == null || !"com.google.android.gms.auth.GOOGLE_ACCOUNT_CHANGE".equals(intent.getAction())) {
            return;
        }
        auadVar.j("Remove data for obsolete accounts", new Object[0]);
        final ArrayList arrayList = new ArrayList();
        Context context = this.b;
        Iterator it = auqx.h(context, context.getPackageName()).iterator();
        while (it.hasNext()) {
            arrayList.add(((Account) it.next()).name);
        }
        RepositoryDatabase repositoryDatabase = this.c;
        tqh x = repositoryDatabase.x();
        StringBuilder sb = new StringBuilder();
        sb.append("DELETE FROM resource_info WHERE accountName NOT IN (");
        mld.a(sb, arrayList.size());
        sb.append(")");
        final String sb2 = sb.toString();
        mkv.a(((tqq) x).a, false, true, new fxwo() { // from class: tql
            @Override // defpackage.fxwo
            public final Object a(Object obj) {
                mjx a2 = ((mjo) obj).a(sb2);
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
