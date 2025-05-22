package com.google.android.gms.threadnetwork;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.dhrb;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class GetAllActiveCredentialsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dhrb();
    public final long a;
    public final Long b;
    public final ThreadNetworkClientOptions c;

    public GetAllActiveCredentialsRequest(long j, Long l, ThreadNetworkClientOptions threadNetworkClientOptions) {
        this.a = j;
        this.b = l;
        this.c = threadNetworkClientOptions;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetAllActiveCredentialsRequest)) {
            return false;
        }
        GetAllActiveCredentialsRequest getAllActiveCredentialsRequest = (GetAllActiveCredentialsRequest) obj;
        return this.a == getAllActiveCredentialsRequest.a && atyq.b(this.b, getAllActiveCredentialsRequest.b) && atyq.b(this.c, getAllActiveCredentialsRequest.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), this.b, this.c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        long j = this.a;
        int a = atzr.a(parcel);
        atzr.q(parcel, 1, j);
        atzr.I(parcel, 2, this.b);
        atzr.t(parcel, 3, this.c, i, false);
        atzr.c(parcel, a);
    }
}
