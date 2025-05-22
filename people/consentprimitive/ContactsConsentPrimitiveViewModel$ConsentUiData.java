package com.google.android.gms.people.consentprimitive;

import android.accounts.Account;
import android.os.Parcelable;
import defpackage.cwcc;
import defpackage.elgj;
import defpackage.elgo;
import defpackage.enya;
import defpackage.ftta;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public abstract class ContactsConsentPrimitiveViewModel$ConsentUiData implements Parcelable {
    public static cwcc o() {
        cwcc cwccVar = new cwcc();
        cwccVar.e(enya.UNKNOWN_PAGE);
        cwccVar.h(0);
        cwccVar.j(false);
        cwccVar.k(false);
        cwccVar.b(0);
        cwccVar.l(0);
        cwccVar.f(0);
        cwccVar.m(0);
        cwccVar.g(enya.CHOICES_PAGE);
        cwccVar.i(elgo.l(enya.CUSTOM_FLOW_FINISH_PAGE));
        return cwccVar;
    }

    public static elgo p(ContactsConsentData contactsConsentData, ContactsConsentsConfig contactsConsentsConfig, Account account) {
        int i = elgo.d;
        elgj elgjVar = new elgj();
        if (ftta.c()) {
            elgjVar.i(enya.CUSTOM_FLOW_DC_PAGE);
        }
        if (ftta.e()) {
            elgjVar.i(enya.CUSTOM_FLOW_SHEEPDOG_PAGE);
        }
        if (ftta.f() && contactsConsentsConfig.c && contactsConsentData.l(account)) {
            elgjVar.i(enya.CUSTOM_FLOW_SIM_IMPORT_PAGE);
        }
        elgjVar.i(enya.CUSTOM_FLOW_FINISH_PAGE);
        return elgjVar.g();
    }

    public abstract int a();

    public abstract int b();

    public abstract int c();

    public abstract int d();

    public abstract int e();

    public abstract Account f();

    public abstract ContactsConsentData g();

    public abstract cwcc h();

    public abstract ContactsConsentsConfig i();

    public abstract elgo j();

    public abstract enya k();

    public abstract enya l();

    public abstract boolean m();

    public abstract boolean n();

    public final int q(int i, boolean z) {
        if (a() == 1) {
            return z ? 2 : 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        return i == 3 ? 4 : 1;
    }
}
