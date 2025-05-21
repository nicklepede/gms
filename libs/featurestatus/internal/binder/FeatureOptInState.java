package com.google.android.gms.libs.featurestatus.internal.binder;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.bqtw;
import defpackage.fvbo;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class FeatureOptInState extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bqtw();
    public final byte[] a;

    public FeatureOptInState(byte[] bArr) {
        fvbo.f(bArr, "serializedMessage");
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
        fvbo.f(parcel, "dest");
        byte[] bArr = this.a;
        int a = arxc.a(parcel);
        arxc.i(parcel, 1, bArr, false);
        arxc.c(parcel, a);
    }
}
