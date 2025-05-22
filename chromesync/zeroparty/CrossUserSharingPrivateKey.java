package com.google.android.gms.chromesync.zeroparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import defpackage.aruq;
import defpackage.fxxm;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public final class CrossUserSharingPrivateKey implements SafeParcelable {
    public static final Parcelable.Creator CREATOR = new aruq();
    public final int a;
    public final byte[] b;

    public CrossUserSharingPrivateKey(int i, byte[] bArr) {
        fxxm.f(bArr, "x25519PrivateKey");
        this.a = i;
        this.b = bArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof CrossUserSharingPrivateKey)) {
            return false;
        }
        CrossUserSharingPrivateKey crossUserSharingPrivateKey = (CrossUserSharingPrivateKey) obj;
        return this.a == crossUserSharingPrivateKey.a && Arrays.equals(this.b, crossUserSharingPrivateKey.b);
    }

    public final int hashCode() {
        return (this.a * 31) + Arrays.hashCode(this.b);
    }

    public final String toString() {
        return "CrossUserSharingPrivateKey(version=" + this.a + ", x25519PrivateKey=" + Arrays.toString(this.b) + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        fxxm.f(parcel, "dest");
        parcel.writeInt(this.a);
        parcel.writeByteArray(this.b);
    }
}
