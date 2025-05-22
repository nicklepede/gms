package com.google.android.gms.nearby.internal.connection;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cllg;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class ParcelableRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cllg();
    public long a;
    public Uri b;

    public ParcelableRequest() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ParcelableRequest) {
            ParcelableRequest parcelableRequest = (ParcelableRequest) obj;
            if (atyq.b(Long.valueOf(this.a), Long.valueOf(parcelableRequest.a)) && atyq.b(this.b, parcelableRequest.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.q(parcel, 1, this.a);
        atzr.t(parcel, 2, this.b, i, false);
        atzr.c(parcel, a);
    }

    public ParcelableRequest(long j, Uri uri) {
        this.a = j;
        this.b = uri;
    }
}
