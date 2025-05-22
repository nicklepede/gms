package com.google.android.gms.phenotype.notification;

import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteException;
import com.google.android.chimera.IntentOperation;
import defpackage.cyks;
import defpackage.cykx;
import defpackage.cyky;
import defpackage.cyll;
import defpackage.cylo;
import defpackage.cymk;
import defpackage.cyqg;
import defpackage.elqm;
import defpackage.esca;
import java.util.HashSet;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class AccountsChangedIntentOperation extends IntentOperation {
    private Context a;
    private cylo b;

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        cylo b = cyll.b(this);
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
            cykx a = this.b.a().a();
            try {
                if (a.f()) {
                    cyks i = ((cyky) a).b("  SELECT DISTINCT accounts.name\n  FROM accounts\n  INNER JOIN experiment_states\n    USING (account_id);\n").d().i();
                    try {
                        j = new HashSet();
                        while (i.b()) {
                            j.add(i.f(0));
                        }
                        i.close();
                    } finally {
                    }
                } else {
                    cyks c = ((cyky) a).b("SELECT user FROM RequestTags").d().c();
                    try {
                        j = elqm.j(c.a());
                        while (c.b()) {
                            j.add(c.f(0));
                        }
                        c.close();
                    } finally {
                    }
                }
                a.close();
                for (String str : cymk.b(this.a)) {
                    if (!j.contains(str)) {
                        cyqg.b(this, esca.NEW_USER, null);
                        return;
                    }
                }
            } finally {
            }
        } catch (SQLiteException unused) {
        }
    }
}
