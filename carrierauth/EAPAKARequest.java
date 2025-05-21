package com.google.android.gms.carrierauth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.alnz;
import defpackage.arwb;
import defpackage.arxc;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class EAPAKARequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new alnz();
    public final String a;
    public final Integer b;
    public final Integer c;
    public final Integer d;
    public final int e;

    public EAPAKARequest(String str, Integer num, Integer num2, Integer num3, int i) {
        this.a = str;
        this.b = num;
        this.c = num2;
        this.d = num3;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EAPAKARequest)) {
            return false;
        }
        EAPAKARequest eAPAKARequest = (EAPAKARequest) obj;
        return this.e == eAPAKARequest.e && arwb.b(this.a, eAPAKARequest.a) && arwb.b(this.b, eAPAKARequest.b) && arwb.b(this.c, eAPAKARequest.c) && arwb.b(this.d, eAPAKARequest.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, Integer.valueOf(this.e)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.F(parcel, 2, this.b);
        arxc.F(parcel, 3, this.c);
        arxc.F(parcel, 4, this.d);
        arxc.o(parcel, 5, this.e);
        arxc.c(parcel, a);
    }
}
