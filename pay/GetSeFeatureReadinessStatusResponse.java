package com.google.android.gms.pay;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cvlq;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class GetSeFeatureReadinessStatusResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cvlq();
    public int a;
    public PendingIntent b;
    public byte[][] c;

    private GetSeFeatureReadinessStatusResponse() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetSeFeatureReadinessStatusResponse) {
            GetSeFeatureReadinessStatusResponse getSeFeatureReadinessStatusResponse = (GetSeFeatureReadinessStatusResponse) obj;
            if (atyq.b(Integer.valueOf(this.a), Integer.valueOf(getSeFeatureReadinessStatusResponse.a)) && atyq.b(this.b, getSeFeatureReadinessStatusResponse.b) && Arrays.equals(this.c, getSeFeatureReadinessStatusResponse.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b, Integer.valueOf(Arrays.hashCode(this.c))});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, this.a);
        atzr.t(parcel, 2, this.b, i, false);
        atzr.A(parcel, 4, this.c);
        atzr.c(parcel, a);
    }

    public GetSeFeatureReadinessStatusResponse(int i, PendingIntent pendingIntent, byte[][] bArr) {
        this.a = i;
        this.b = pendingIntent;
        this.c = bArr;
    }
}
