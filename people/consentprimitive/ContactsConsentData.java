package com.google.android.gms.people.consentprimitive;

import android.accounts.Account;
import android.os.Parcelable;
import defpackage.ctpt;
import defpackage.eitj;
import defpackage.eits;
import defpackage.eiuu;
import defpackage.ejcg;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public abstract class ContactsConsentData implements Parcelable {
    public static ctpt i() {
        ctpt ctptVar = new ctpt();
        ctptVar.c("");
        ctptVar.g(0);
        eits eitsVar = ejcg.a;
        if (ctptVar.a != null) {
            throw new IllegalStateException("Cannot set accountToImportableSimContactsCount after calling accountToImportableSimContactsCountBuilder()");
        }
        ctptVar.b = eits.k(eitsVar);
        return ctptVar;
    }

    public abstract int a();

    public abstract eitj b();

    public abstract eits c();

    public abstract eiuu d();

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
