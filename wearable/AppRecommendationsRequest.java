package com.google.android.gms.wearable;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.djjg;
import defpackage.eijq;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class AppRecommendationsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new djjg();
    public final String a;
    public final int b;
    public final int c;

    public AppRecommendationsRequest(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final String toString() {
        return "AppRecommendationsRequest{androidId='" + this.a + "', searchFlags=" + eijq.c(Integer.toBinaryString(this.b), 8) + ", limit=" + this.c + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        arwm.t(str, "Android id is required");
        int i2 = this.b;
        arwm.v(i2 & 3, "Recommendation type is required");
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.o(parcel, 2, i2);
        arxc.o(parcel, 3, this.c);
        arxc.c(parcel, a);
    }
}
