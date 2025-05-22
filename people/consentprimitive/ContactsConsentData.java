package com.google.android.gms.people.consentprimitive;

import android.accounts.Account;
import android.os.Parcelable;
import defpackage.cvyz;
import defpackage.elgo;
import defpackage.elgx;
import defpackage.elhz;
import defpackage.elpl;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public abstract class ContactsConsentData implements Parcelable {
    public static cvyz i() {
        cvyz cvyzVar = new cvyz();
        cvyzVar.c("");
        cvyzVar.g(0);
        elgx elgxVar = elpl.a;
        if (cvyzVar.a != null) {
            throw new IllegalStateException("Cannot set accountToImportableSimContactsCount after calling accountToImportableSimContactsCountBuilder()");
        }
        cvyzVar.b = elgx.k(elgxVar);
        return cvyzVar;
    }

    public abstract int a();

    public abstract elgo b();

    public abstract elgx c();

    public abstract elhz d();

    public abstract String e();

    public abstract boolean f();

    public abstract boolean g();

    public final int h(Account account) {
        return ((Integer) c().getOrDefault(account.name, 0)).intValue();
    }

    public final boolean j(Account account) {
        return d().contains(account);
    }

    public final boolean k(Account account) {
        return !j(account);
    }

    public final boolean l(Account account) {
        return h(account) > 0;
    }
}
