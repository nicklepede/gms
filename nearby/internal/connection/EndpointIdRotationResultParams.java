package com.google.android.gms.nearby.internal.connection;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.cizu;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class EndpointIdRotationResultParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cizu();
    public byte[] a;

    public EndpointIdRotationResultParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof EndpointIdRotationResultParams) {
            return Arrays.equals(this.a, ((EndpointIdRotationResultParams) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.a))});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.i(parcel, 1, this.a, false);
        arxc.c(parcel, a);
    }

    public EndpointIdRotationResultParams(byte[] bArr) {
        this.a = bArr;
    }
}
