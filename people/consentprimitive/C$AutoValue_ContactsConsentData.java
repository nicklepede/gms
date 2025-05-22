package com.google.android.gms.people.consentprimitive;

import defpackage.elgo;
import defpackage.elgx;
import defpackage.elhz;
import defpackage.elkk;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* renamed from: com.google.android.gms.people.consentprimitive.$AutoValue_ContactsConsentData, reason: invalid class name */
/* loaded from: classes6.dex */
abstract class C$AutoValue_ContactsConsentData extends ContactsConsentData {
    public final elgo a;
    public final int b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final elgx f;
    public final elhz g;

    public C$AutoValue_ContactsConsentData(elgo elgoVar, int i, boolean z, boolean z2, String str, elgx elgxVar, elhz elhzVar) {
        if (elgoVar == null) {
            throw new NullPointerException("Null googleAccounts");
        }
        this.a = elgoVar;
        this.b = i;
        this.c = z;
        this.d = z2;
        if (str == null) {
            throw new NullPointerException("Null deviceLocalContactsBackupAndSyncSuggestionId");
        }
        this.e = str;
        if (elgxVar == null) {
            throw new NullPointerException("Null accountToImportableSimContactsCount");
        }
        this.f = elgxVar;
        if (elhzVar == null) {
            throw new NullPointerException("Null dcEligibleAndDisabledAccounts");
        }
        this.g = elhzVar;
    }

    @Override // com.google.android.gms.people.consentprimitive.ContactsConsentData
    public final int a() {
        return this.b;
    }

    @Override // com.google.android.gms.people.consentprimitive.ContactsConsentData
    public final elgo b() {
        return this.a;
    }

    @Override // com.google.android.gms.people.consentprimitive.ContactsConsentData
    public final elgx c() {
        return this.f;
    }

    @Override // com.google.android.gms.people.consentprimitive.ContactsConsentData
    public final elhz d() {
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
            if (elkk.i(this.a, contactsConsentData.b()) && this.b == contactsConsentData.a() && this.c == contactsConsentData.f() && this.d == contactsConsentData.g() && this.e.equals(contactsConsentData.e()) && this.f.equals(contactsConsentData.c()) && this.g.equals(contactsConsentData.d())) {
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
        elhz elhzVar = this.g;
        elgx elgxVar = this.f;
        return "ContactsConsentData{googleAccounts=" + this.a.toString() + ", numDeviceLocalContacts=" + this.b + ", isDeviceLocalContactsBackupAndSyncOn=" + this.c + ", isDeviceLocalContactsBackupAndSyncRecommended=" + this.d + ", deviceLocalContactsBackupAndSyncSuggestionId=" + this.e + ", accountToImportableSimContactsCount=" + elgxVar.toString() + ", dcEligibleAndDisabledAccounts=" + elhzVar.toString() + "}";
    }
}
