package com.google.android.gms.backup.common.util.session;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.akga;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public final class AutoValue_ParcelableSession extends C$AutoValue_ParcelableSession {
    public static final Parcelable.Creator CREATOR = new akga();

    public AutoValue_ParcelableSession(byte[] bArr) {
        super(bArr);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.a);
    }
}
