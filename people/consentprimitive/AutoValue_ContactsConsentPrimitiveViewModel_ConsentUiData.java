package com.google.android.gms.people.consentprimitive;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.cvyy;
import defpackage.elgo;
import defpackage.enya;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class AutoValue_ContactsConsentPrimitiveViewModel_ConsentUiData extends C$AutoValue_ContactsConsentPrimitiveViewModel_ConsentUiData {
    public static final Parcelable.Creator CREATOR = new cvyy();

    public AutoValue_ContactsConsentPrimitiveViewModel_ConsentUiData(ContactsConsentData contactsConsentData, ContactsConsentsConfig contactsConsentsConfig, Account account, int i, int i2, boolean z, boolean z2, enya enyaVar, enya enyaVar2, int i3, int i4, int i5, elgo elgoVar) {
        super(contactsConsentData, contactsConsentsConfig, account, i, i2, z, z2, enyaVar, enyaVar2, i3, i4, i5, elgoVar);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
        parcel.writeParcelable(this.c, i);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeString(this.h.name());
        parcel.writeString(this.i.name());
        parcel.writeInt(this.j);
        parcel.writeInt(this.k);
        parcel.writeInt(this.l);
        parcel.writeList(this.m);
    }
}
