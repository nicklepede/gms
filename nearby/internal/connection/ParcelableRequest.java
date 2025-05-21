package com.google.android.gms.nearby.internal.connection;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cjdb;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class ParcelableRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cjdb();
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
            if (arwb.b(Long.valueOf(this.a), Long.valueOf(parcelableRequest.a)) && arwb.b(this.b, parcelableRequest.b)) {
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
        int a = arxc.a(parcel);
        arxc.q(parcel, 1, this.a);
        arxc.t(parcel, 2, this.b, i, false);
        arxc.c(parcel, a);
    }

    public ParcelableRequest(long j, Uri uri) {
        this.a = j;
        this.b = uri;
    }
}
