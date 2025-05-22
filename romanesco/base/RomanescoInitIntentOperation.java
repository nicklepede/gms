package com.google.android.gms.romanesco.base;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import defpackage.apzs;
import defpackage.auid;
import defpackage.aura;
import defpackage.ausn;
import defpackage.czso;
import defpackage.czvj;
import defpackage.czyq;
import defpackage.czys;
import defpackage.eluo;
import defpackage.fume;
import defpackage.fumq;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class RomanescoInitIntentOperation extends apzs {
    private static final ausn b = ausn.b("ROM_RomanescoInit", auid.ROMANESCO);
    static final String[] a = {"com.google.android.gms.romanesco.settings.ContactsRestoreSettingsActivity", "com.google.android.gms.romanesco.settings.ContactsRestoreDialogActivity", "com.google.android.gms.romanesco.settings.ContactsRestoreContactsActivity"};

    @Override // defpackage.apzs
    protected final void a(Intent intent, boolean z) {
        String[] strArr = a;
        int length = strArr.length;
        for (int i = 0; i < 3; i++) {
            try {
                aura.H(this, strArr[i], true);
            } catch (IllegalArgumentException e) {
                ((eluo) ((eluo) b.i()).ai((char) 9125)).B("Component invalid: %s", e.getMessage());
            }
        }
    }

    @Override // defpackage.apzs
    protected final void b(Intent intent, int i) {
        czvj.b(this).a.j();
        if (fume.d()) {
            czys.b(getApplicationContext());
        }
        if (fumq.d()) {
            czso a2 = czso.a(getApplicationContext());
            try {
                List a3 = a2.c.a();
                HashSet hashSet = new HashSet();
                Iterator it = a3.iterator();
                while (it.hasNext()) {
                    hashSet.add(((Account) it.next()).name);
                }
                Context context = a2.b;
                HashSet hashSet2 = new HashSet(czyq.a(context));
                hashSet2.removeAll(hashSet);
                Iterator it2 = hashSet2.iterator();
                while (it2.hasNext()) {
                    czyq.b((String) it2.next(), context);
                }
            } catch (InterruptedException | ExecutionException e) {
                ((eluo) ((eluo) ((eluo) czso.a.j()).s(e)).ai((char) 9123)).x("Failed to clear data store for opted In accounts.");
            }
        }
    }
}
