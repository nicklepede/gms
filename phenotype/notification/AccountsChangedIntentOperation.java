package com.google.android.gms.phenotype.notification;

import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteException;
import com.google.android.chimera.IntentOperation;
import defpackage.cwav;
import defpackage.cwba;
import defpackage.cwbb;
import defpackage.cwbo;
import defpackage.cwbr;
import defpackage.cwcn;
import defpackage.cwgj;
import defpackage.ejdf;
import defpackage.epob;
import java.util.HashSet;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class AccountsChangedIntentOperation extends IntentOperation {
    private Context a;
    private cwbr b;

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        cwbr b = cwbo.b(this);
        this.a = this;
        this.b = b;
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onDestroy() {
        this.b.close();
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        HashSet j;
        try {
            cwba a = this.b.a().a();
            try {
                if (a.f()) {
                    cwav i = ((cwbb) a).b("  SELECT DISTINCT accounts.name\n  FROM accounts\n  INNER JOIN experiment_states\n    USING (account_id);\n").d().i();
                    try {
                        j = new HashSet();
                        while (i.b()) {
                            j.add(i.f(0));
                        }
                        i.close();
                    } finally {
                    }
                } else {
                    cwav c = ((cwbb) a).b("SELECT user FROM RequestTags").d().c();
                    try {
                        j = ejdf.j(c.a());
                        while (c.b()) {
                            j.add(c.f(0));
                        }
                        c.close();
                    } finally {
                    }
                }
                a.close();
                for (String str : cwcn.b(this.a)) {
                    if (!j.contains(str)) {
                        cwgj.b(this, epob.NEW_USER, null);
                        return;
                    }
                }
            } finally {
            }
        } catch (SQLiteException unused) {
        }
    }
}
