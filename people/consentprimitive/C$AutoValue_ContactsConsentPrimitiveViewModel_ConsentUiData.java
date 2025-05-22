package com.google.android.gms.people.consentprimitive;

import android.accounts.Account;
import defpackage.cwcc;
import defpackage.elgo;
import defpackage.elkk;
import defpackage.enya;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* renamed from: com.google.android.gms.people.consentprimitive.$AutoValue_ContactsConsentPrimitiveViewModel_ConsentUiData, reason: invalid class name */
/* loaded from: classes6.dex */
abstract class C$AutoValue_ContactsConsentPrimitiveViewModel_ConsentUiData extends ContactsConsentPrimitiveViewModel$ConsentUiData {
    public final ContactsConsentData a;
    public final ContactsConsentsConfig b;
    public final Account c;
    public final int d;
    public final int e;
    public final boolean f;
    public final boolean g;
    public final enya h;
    public final enya i;
    public final int j;
    public final int k;
    public final int l;
    public final elgo m;

    public C$AutoValue_ContactsConsentPrimitiveViewModel_ConsentUiData(ContactsConsentData contactsConsentData, ContactsConsentsConfig contactsConsentsConfig, Account account, int i, int i2, boolean z, boolean z2, enya enyaVar, enya enyaVar2, int i3, int i4, int i5, elgo elgoVar) {
        if (contactsConsentData == null) {
            throw new NullPointerException("Null consentStateData");
        }
        this.a = contactsConsentData;
        if (contactsConsentsConfig == null) {
            throw new NullPointerException("Null config");
        }
        this.b = contactsConsentsConfig;
        if (account == null) {
            throw new NullPointerException("Null selectedAccount");
        }
        this.c = account;
        this.d = i;
        this.e = i2;
        this.f = z;
        this.g = z2;
        if (enyaVar == null) {
            throw new NullPointerException("Null currentPage");
        }
        this.h = enyaVar;
        if (enyaVar2 == null) {
            throw new NullPointerException("Null learnMoreReturnPage");
        }
        this.i = enyaVar2;
        this.j = i3;
        this.k = i4;
        this.l = i5;
        if (elgoVar == null) {
            throw new NullPointerException("Null pagesInCustomizeFlow");
        }
        this.m = elgoVar;
    }

    @Override // com.google.android.gms.people.consentprimitive.ContactsConsentPrimitiveViewModel$ConsentUiData
    public final int a() {
        return this.e;
    }

    @Override // com.google.android.gms.people.consentprimitive.ContactsConsentPrimitiveViewModel$ConsentUiData
    public final int b() {
        return this.l;
    }

    @Override // com.google.android.gms.people.consentprimitive.ContactsConsentPrimitiveViewModel$ConsentUiData
    public final int c() {
        return this.d;
    }

    @Override // com.google.android.gms.people.consentprimitive.ContactsConsentPrimitiveViewModel$ConsentUiData
    public final int d() {
        return this.j;
    }

    @Override // com.google.android.gms.people.consentprimitive.ContactsConsentPrimitiveViewModel$ConsentUiData
    public final int e() {
        return this.k;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ContactsConsentPrimitiveViewModel$ConsentUiData) {
            ContactsConsentPrimitiveViewModel$ConsentUiData contactsConsentPrimitiveViewModel$ConsentUiData = (ContactsConsentPrimitiveViewModel$ConsentUiData) obj;
            if (this.a.equals(contactsConsentPrimitiveViewModel$ConsentUiData.g()) && this.b.equals(contactsConsentPrimitiveViewModel$ConsentUiData.i()) && this.c.equals(contactsConsentPrimitiveViewModel$ConsentUiData.f()) && this.d == contactsConsentPrimitiveViewModel$ConsentUiData.c() && this.e == contactsConsentPrimitiveViewModel$ConsentUiData.a() && this.f == contactsConsentPrimitiveViewModel$ConsentUiData.m() && this.g == contactsConsentPrimitiveViewModel$ConsentUiData.n() && this.h.equals(contactsConsentPrimitiveViewModel$ConsentUiData.k()) && this.i.equals(contactsConsentPrimitiveViewModel$ConsentUiData.l()) && this.j == contactsConsentPrimitiveViewModel$ConsentUiData.d() && this.k == contactsConsentPrimitiveViewModel$ConsentUiData.e() && this.l == contactsConsentPrimitiveViewModel$ConsentUiData.b() && elkk.i(this.m, contactsConsentPrimitiveViewModel$ConsentUiData.j())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.people.consentprimitive.ContactsConsentPrimitiveViewModel$ConsentUiData
    public final Account f() {
        return this.c;
    }

    @Override // com.google.android.gms.people.consentprimitive.ContactsConsentPrimitiveViewModel$ConsentUiData
    public final ContactsConsentData g() {
        return this.a;
    }

    @Override // com.google.android.gms.people.consentprimitive.ContactsConsentPrimitiveViewModel$ConsentUiData
    public final cwcc h() {
        return new cwcc(this);
    }

    public final int hashCode() {
        int hashCode = ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
        return (((((((((((((((((((hashCode * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003) ^ (true == this.g ? 1231 : 1237)) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j) * 1000003) ^ this.k) * 1000003) ^ this.l) * 1000003) ^ this.m.hashCode();
    }

    @Override // com.google.android.gms.people.consentprimitive.ContactsConsentPrimitiveViewModel$ConsentUiData
    public final ContactsConsentsConfig i() {
        return this.b;
    }

    @Override // com.google.android.gms.people.consentprimitive.ContactsConsentPrimitiveViewModel$ConsentUiData
    public final elgo j() {
        return this.m;
    }

    @Override // com.google.android.gms.people.consentprimitive.ContactsConsentPrimitiveViewModel$ConsentUiData
    public final enya k() {
        return this.h;
    }

    @Override // com.google.android.gms.people.consentprimitive.ContactsConsentPrimitiveViewModel$ConsentUiData
    public final enya l() {
        return this.i;
    }

    @Override // com.google.android.gms.people.consentprimitive.ContactsConsentPrimitiveViewModel$ConsentUiData
    public final boolean m() {
        return this.f;
    }

    @Override // com.google.android.gms.people.consentprimitive.ContactsConsentPrimitiveViewModel$ConsentUiData
    public final boolean n() {
        return this.g;
    }

    public final String toString() {
        elgo elgoVar = this.m;
        enya enyaVar = this.i;
        enya enyaVar2 = this.h;
        Account account = this.c;
        ContactsConsentsConfig contactsConsentsConfig = this.b;
        return "ConsentUiData{consentStateData=" + this.a.toString() + ", config=" + contactsConsentsConfig.toString() + ", selectedAccount=" + account.toString() + ", numImportableSimContacts=" + this.d + ", choiceSelected=" + this.e + ", recommendedPageViewed=" + this.f + ", sheepdogCustomizePageViewed=" + this.g + ", currentPage=" + enyaVar2.toString() + ", learnMoreReturnPage=" + enyaVar.toString() + ", sheepdogCustomizeSelection=" + this.j + ", simCustomizeSelection=" + this.k + ", dcCustomizeSelection=" + this.l + ", pagesInCustomizeFlow=" + elgoVar.toString() + "}";
    }
}
