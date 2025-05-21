package com.google.android.gms.people.consentprimitive;

import android.accounts.Account;
import android.os.Parcelable;
import defpackage.ctsw;
import defpackage.eite;
import defpackage.eitj;
import defpackage.elkn;
import defpackage.fqzf;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public abstract class ContactsConsentPrimitiveViewModel$ConsentUiData implements Parcelable {
    public static ctsw o() {
        ctsw ctswVar = new ctsw();
        ctswVar.e(elkn.UNKNOWN_PAGE);
        ctswVar.h(0);
        ctswVar.j(false);
        ctswVar.k(false);
        ctswVar.b(0);
        ctswVar.l(0);
        ctswVar.f(0);
        ctswVar.m(0);
        ctswVar.g(elkn.CHOICES_PAGE);
        ctswVar.i(eitj.l(elkn.CUSTOM_FLOW_FINISH_PAGE));
        return ctswVar;
    }

    public static eitj p(ContactsConsentData contactsConsentData, ContactsConsentsConfig contactsConsentsConfig, Account account) {
        int i = eitj.d;
        eite eiteVar = new eite();
        if (fqzf.c()) {
            eiteVar.i(elkn.CUSTOM_FLOW_DC_PAGE);
        }
        if (fqzf.e()) {
            eiteVar.i(elkn.CUSTOM_FLOW_SHEEPDOG_PAGE);
        }
        if (fqzf.f() && contactsConsentsConfig.c && contactsConsentData.l(account)) {
            eiteVar.i(elkn.CUSTOM_FLOW_SIM_IMPORT_PAGE);
        }
        eiteVar.i(elkn.CUSTOM_FLOW_FINISH_PAGE);
        return eiteVar.g();
    }

    public abstract int a();

    public abstract int b();

    public abstract int c();

    public abstract int d();

    public abstract int e();

    public abstract Account f();

    public abstract ContactsConsentData g();

    public abstract ctsw h();

    public abstract ContactsConsentsConfig i();

    public abstract eitj j();

    public abstract elkn k();

    public abstract elkn l();

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
