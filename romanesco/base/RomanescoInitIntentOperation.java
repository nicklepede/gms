package com.google.android.gms.romanesco.base;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import defpackage.anya;
import defpackage.asej;
import defpackage.asng;
import defpackage.asot;
import defpackage.cxis;
import defpackage.cxln;
import defpackage.cxot;
import defpackage.cxov;
import defpackage.ejhf;
import defpackage.frrr;
import defpackage.frsd;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class RomanescoInitIntentOperation extends anya {
    private static final asot b = asot.b("ROM_RomanescoInit", asej.ROMANESCO);
    static final String[] a = {"com.google.android.gms.romanesco.settings.ContactsRestoreSettingsActivity", "com.google.android.gms.romanesco.settings.ContactsRestoreDialogActivity", "com.google.android.gms.romanesco.settings.ContactsRestoreContactsActivity"};

    @Override // defpackage.anya
    protected final void a(Intent intent, boolean z) {
        String[] strArr = a;
        int length = strArr.length;
        for (int i = 0; i < 3; i++) {
            try {
                asng.H(this, strArr[i], true);
            } catch (IllegalArgumentException e) {
                ((ejhf) ((ejhf) b.i()).ah((char) 9127)).B("Component invalid: %s", e.getMessage());
            }
        }
    }

    @Override // defpackage.anya
    protected final void b(Intent intent, int i) {
        cxln.b(this).a.j();
        if (frrr.d()) {
            cxov.b(getApplicationContext());
        }
        if (frsd.c()) {
            cxis a2 = cxis.a(getApplicationContext());
            try {
                List a3 = a2.c.a();
                HashSet hashSet = new HashSet();
                Iterator it = a3.iterator();
                while (it.hasNext()) {
                    hashSet.add(((Account) it.next()).name);
                }
                Context context = a2.b;
                HashSet hashSet2 = new HashSet(cxot.a(context));
                hashSet2.removeAll(hashSet);
                Iterator it2 = hashSet2.iterator();
                while (it2.hasNext()) {
                    cxot.b((String) it2.next(), context);
                }
            } catch (InterruptedException | ExecutionException e) {
                ((ejhf) ((ejhf) ((ejhf) cxis.a.j()).s(e)).ah((char) 9125)).x("Failed to clear data store for opted In accounts.");
            }
        }
    }
}
