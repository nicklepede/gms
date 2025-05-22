package com.google.android.gms.people.consentprimitive;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.cvyx;
import defpackage.elgo;
import defpackage.elgx;
import defpackage.elhz;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class AutoValue_ContactsConsentData extends C$AutoValue_ContactsConsentData {
    public static final Parcelable.Creator CREATOR = new cvyx();

    public AutoValue_ContactsConsentData(elgo elgoVar, int i, boolean z, boolean z2, String str, elgx elgxVar, elhz elhzVar) {
        super(elgoVar, i, z, z2, str, elgxVar, elhzVar);
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
