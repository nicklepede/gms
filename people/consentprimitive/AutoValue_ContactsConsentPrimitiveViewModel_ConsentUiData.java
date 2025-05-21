package com.google.android.gms.people.consentprimitive;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.ctps;
import defpackage.eitj;
import defpackage.elkn;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class AutoValue_ContactsConsentPrimitiveViewModel_ConsentUiData extends C$AutoValue_ContactsConsentPrimitiveViewModel_ConsentUiData {
    public static final Parcelable.Creator CREATOR = new ctps();

    public AutoValue_ContactsConsentPrimitiveViewModel_ConsentUiData(ContactsConsentData contactsConsentData, ContactsConsentsConfig contactsConsentsConfig, Account account, int i, int i2, boolean z, boolean z2, elkn elknVar, elkn elknVar2, int i3, int i4, int i5, eitj eitjVar) {
        super(contactsConsentData, contactsConsentsConfig, account, i, i2, z, z2, elknVar, elknVar2, i3, i4, i5, eitjVar);
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
