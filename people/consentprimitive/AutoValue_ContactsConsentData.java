package com.google.android.gms.people.consentprimitive;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.ctpr;
import defpackage.eitj;
import defpackage.eits;
import defpackage.eiuu;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class AutoValue_ContactsConsentData extends C$AutoValue_ContactsConsentData {
    public static final Parcelable.Creator CREATOR = new ctpr();

    public AutoValue_ContactsConsentData(eitj eitjVar, int i, boolean z, boolean z2, String str, eits eitsVar, eiuu eiuuVar) {
        super(eitjVar, i, z, z2, str, eitsVar, eiuuVar);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeString(this.e);
        parcel.writeMap(this.f);
        parcel.writeList(this.g.v());
    }
}
