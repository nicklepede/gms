package com.google.android.gms.autofill.data;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.adsh;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class AutoValue_Credential_LeakedPasswordIssue extends C$AutoValue_Credential_LeakedPasswordIssue {
    public static final Parcelable.Creator CREATOR = new adsh();

    public AutoValue_Credential_LeakedPasswordIssue(long j, boolean z) {
        super(j, z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeInt(this.b ? 1 : 0);
    }
}
