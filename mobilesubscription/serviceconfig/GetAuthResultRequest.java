package com.google.android.gms.mobilesubscription.serviceconfig;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.chbl;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class GetAuthResultRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new chbl();
    public final int a;
    public final int b;
    public final String c;
    public final String d;
    public final int e;
    public final long f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;

    public GetAuthResultRequest(int i, int i2, String str, String str2, int i3, long j, String str3, String str4, String str5, String str6) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = str2;
        this.e = i3;
        this.f = j;
        this.g = str3;
        this.h = str4;
        this.i = str5;
        this.j = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetAuthResultRequest)) {
            return false;
        }
        GetAuthResultRequest getAuthResultRequest = (GetAuthResultRequest) obj;
        return this.a == getAuthResultRequest.a && this.b == getAuthResultRequest.b && this.e == getAuthResultRequest.e && this.f == getAuthResultRequest.f && atyq.b(this.c, getAuthResultRequest.c) && atyq.b(this.d, getAuthResultRequest.d) && atyq.b(this.g, getAuthResultRequest.g) && atyq.b(this.h, getAuthResultRequest.h) && atyq.b(this.i, getAuthResultRequest.i) && atyq.b(this.j, getAuthResultRequest.j);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b), this.c, this.d, Integer.valueOf(this.e), Long.valueOf(this.f), this.g, this.h, this.i, this.j});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, i2);
        atzr.o(parcel, 2, this.b);
        atzr.v(parcel, 3, this.c, false);
        atzr.v(parcel, 4, this.d, false);
        atzr.o(parcel, 5, this.e);
        atzr.q(parcel, 6, this.f);
        atzr.v(parcel, 7, this.g, false);
        atzr.v(parcel, 8, this.h, false);
        atzr.v(parcel, 9, this.i, false);
        atzr.v(parcel, 10, this.j, false);
        atzr.c(parcel, a);
    }
}
