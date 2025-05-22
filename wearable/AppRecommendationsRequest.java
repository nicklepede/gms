package com.google.android.gms.wearable;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzb;
import defpackage.atzr;
import defpackage.dluz;
import defpackage.ekwv;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class AppRecommendationsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dluz();
    public final String a;
    public final int b;
    public final int c;

    public AppRecommendationsRequest(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final String toString() {
        return "AppRecommendationsRequest{androidId='" + this.a + "', searchFlags=" + ekwv.c(Integer.toBinaryString(this.b), 8) + ", limit=" + this.c + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        atzb.t(str, "Android id is required");
        int i2 = this.b;
        atzb.v(i2 & 3, "Recommendation type is required");
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.o(parcel, 2, i2);
        atzr.o(parcel, 3, this.c);
        atzr.c(parcel, a);
    }
}
