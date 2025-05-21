package com.google.android.gms.threadnetwork;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.dffw;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class GetAllActiveCredentialsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dffw();
    public final long a;
    public final Long b;

    public GetAllActiveCredentialsRequest(long j, Long l) {
        this.a = j;
        this.b = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetAllActiveCredentialsRequest)) {
            return false;
        }
        GetAllActiveCredentialsRequest getAllActiveCredentialsRequest = (GetAllActiveCredentialsRequest) obj;
        return this.a == getAllActiveCredentialsRequest.a && arwb.b(this.b, getAllActiveCredentialsRequest.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        long j = this.a;
        int a = arxc.a(parcel);
        arxc.q(parcel, 1, j);
        arxc.I(parcel, 2, this.b);
        arxc.c(parcel, a);
    }
}
