package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.aodw;
import defpackage.aozc;
import defpackage.atzr;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class RequestItem extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aodw();
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
        return aozc.u(this.a, requestItem.a) && aozc.u(Integer.valueOf(this.b), Integer.valueOf(requestItem.b)) && aozc.u(Integer.valueOf(this.c), Integer.valueOf(requestItem.c)) && aozc.u(requestItem.d, this.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), Integer.valueOf(this.c), this.d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 2, str, false);
        atzr.o(parcel, 3, this.b);
        atzr.o(parcel, 4, this.c);
        atzr.v(parcel, 5, this.d, false);
        atzr.c(parcel, a);
    }
}
