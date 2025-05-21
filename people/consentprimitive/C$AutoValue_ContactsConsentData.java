package com.google.android.gms.people.consentprimitive;

import defpackage.eitj;
import defpackage.eits;
import defpackage.eiuu;
import defpackage.eixf;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* renamed from: com.google.android.gms.people.consentprimitive.$AutoValue_ContactsConsentData, reason: invalid class name */
/* loaded from: classes6.dex */
abstract class C$AutoValue_ContactsConsentData extends ContactsConsentData {
    public final eitj a;
    public final int b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final eits f;
    public final eiuu g;

    public C$AutoValue_ContactsConsentData(eitj eitjVar, int i, boolean z, boolean z2, String str, eits eitsVar, eiuu eiuuVar) {
        if (eitjVar == null) {
            throw new NullPointerException("Null googleAccounts");
        }
        this.a = eitjVar;
        this.b = i;
        this.c = z;
        this.d = z2;
        if (str == null) {
            throw new NullPointerException("Null deviceLocalContactsBackupAndSyncSuggestionId");
        }
        this.e = str;
        if (eitsVar == null) {
            throw new NullPointerException("Null accountToImportableSimContactsCount");
        }
        this.f = eitsVar;
        if (eiuuVar == null) {
            throw new NullPointerException("Null dcEligibleAndDisabledAccounts");
        }
        this.g = eiuuVar;
    }

    @Override // com.google.android.gms.people.consentprimitive.ContactsConsentData
    public final int a() {
        return this.b;
    }

    @Override // com.google.android.gms.people.consentprimitive.ContactsConsentData
    public final eitj b() {
        return this.a;
    }

    @Override // com.google.android.gms.people.consentprimitive.ContactsConsentData
    public final eits c() {
        return this.f;
    }

    @Override // com.google.android.gms.people.consentprimitive.ContactsConsentData
    public final eiuu d() {
        return this.g;
    }

    @Override // com.google.android.gms.people.consentprimitive.ContactsConsentData
    public final String e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ContactsConsentData) {
            ContactsConsentData contactsConsentData = (ContactsConsentData) obj;
            if (eixf.i(this.a, contactsConsentData.b()) && this.b == contactsConsentData.a() && this.c == contactsConsentData.f() && this.d == contactsConsentData.g() && this.e.equals(contactsConsentData.e()) && this.f.equals(contactsConsentData.c()) && this.g.equals(contactsConsentData.d())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.people.consentprimitive.ContactsConsentData
    public final boolean f() {
        return this.c;
    }

    @Override // com.google.android.gms.people.consentprimitive.ContactsConsentData
    public final boolean g() {
        return this.d;
    }

    public final int hashCode() {
        return ((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ (true == this.d ? 1231 : 1237)) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode();
    }

    public final String toString() {
        eiuu eiuuVar = this.g;
        eits eitsVar = this.f;
        return "ContactsConsentData{googleAccounts=" + this.a.toString() + ", numDeviceLocalContacts=" + this.b + ", isDeviceLocalContactsBackupAndSyncOn=" + this.c + ", isDeviceLocalContactsBackupAndSyncRecommended=" + this.d + ", deviceLocalContactsBackupAndSyncSuggestionId=" + this.e + ", accountToImportableSimContactsCount=" + eitsVar.toString() + ", dcEligibleAndDisabledAccounts=" + eiuuVar.toString() + "}";
    }
}
