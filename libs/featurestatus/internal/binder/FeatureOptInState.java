package com.google.android.gms.libs.featurestatus.internal.binder;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.btbn;
import defpackage.fxxm;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class FeatureOptInState extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new btbn();
    public final byte[] a;

    public FeatureOptInState(byte[] bArr) {
        fxxm.f(bArr, "serializedMessage");
        this.a = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FeatureOptInState) {
            return Arrays.equals(this.a, ((FeatureOptInState) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        return "FeatureOptInState(serializedMessage=" + Arrays.toString(this.a) + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        fxxm.f(parcel, "dest");
        byte[] bArr = this.a;
        int a = atzr.a(parcel);
        atzr.i(parcel, 1, bArr, false);
        atzr.c(parcel, a);
    }
}
