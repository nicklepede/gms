package com.google.android.gms.mobilesubscription.serviceconfig;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cese;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class GetAuthResultResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cese();
    public final String a;
    public final String b;
    public final long c;
    public final int d;
    public final long e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;

    public GetAuthResultResponse(String str, String str2, long j, int i, long j2, String str3, String str4, String str5, String str6) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = i;
        this.e = j2;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetAuthResultResponse)) {
            return false;
        }
        GetAuthResultResponse getAuthResultResponse = (GetAuthResultResponse) obj;
        return this.c == getAuthResultResponse.c && this.d == getAuthResultResponse.d && this.e == getAuthResultResponse.e && arwb.b(this.a, getAuthResultResponse.a) && arwb.b(this.b, getAuthResultResponse.b) && arwb.b(this.f, getAuthResultResponse.f) && arwb.b(this.g, getAuthResultResponse.g) && arwb.b(this.h, getAuthResultResponse.h) && arwb.b(this.i, getAuthResultResponse.i);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Long.valueOf(this.c), Integer.valueOf(this.d), Long.valueOf(this.e), this.f, this.g, this.h, this.i});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.v(parcel, 2, this.b, false);
        arxc.q(parcel, 3, this.c);
        arxc.o(parcel, 4, this.d);
        arxc.q(parcel, 5, this.e);
        arxc.v(parcel, 6, this.f, false);
        arxc.v(parcel, 7, this.g, false);
        arxc.v(parcel, 8, this.h, false);
        arxc.v(parcel, 9, this.i, false);
        arxc.c(parcel, a);
    }
}
