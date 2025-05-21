package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.amcl;
import defpackage.amxr;
import defpackage.arxc;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class RequestItem extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new amcl();
    public final String a;
    public final int b;
    public final int c;
    public final String d;

    public RequestItem(String str, int i, int i2, String str2) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RequestItem)) {
            return false;
        }
        RequestItem requestItem = (RequestItem) obj;
        return amxr.u(this.a, requestItem.a) && amxr.u(Integer.valueOf(this.b), Integer.valueOf(requestItem.b)) && amxr.u(Integer.valueOf(this.c), Integer.valueOf(requestItem.c)) && amxr.u(requestItem.d, this.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), Integer.valueOf(this.c), this.d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 2, str, false);
        arxc.o(parcel, 3, this.b);
        arxc.o(parcel, 4, this.c);
        arxc.v(parcel, 5, this.d, false);
        arxc.c(parcel, a);
    }
}
