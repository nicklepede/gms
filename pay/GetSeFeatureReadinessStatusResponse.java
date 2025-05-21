package com.google.android.gms.pay;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.ctcl;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class GetSeFeatureReadinessStatusResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ctcl();
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
            if (arwb.b(Integer.valueOf(this.a), Integer.valueOf(getSeFeatureReadinessStatusResponse.a)) && arwb.b(this.b, getSeFeatureReadinessStatusResponse.b) && Arrays.equals(this.c, getSeFeatureReadinessStatusResponse.c)) {
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
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.a);
        arxc.t(parcel, 2, this.b, i, false);
        arxc.A(parcel, 4, this.c);
        arxc.c(parcel, a);
    }

    public GetSeFeatureReadinessStatusResponse(int i, PendingIntent pendingIntent, byte[][] bArr) {
        this.a = i;
        this.b = pendingIntent;
        this.c = bArr;
    }
}
