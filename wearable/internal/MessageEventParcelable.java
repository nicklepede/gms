package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.dmxf;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class MessageEventParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dmxf();
    public final int a;
    public final String b;
    public final byte[] c;
    public final String d;

    public MessageEventParcelable(int i, String str, byte[] bArr, String str2) {
        this.a = i;
        this.b = str;
        this.c = bArr;
        this.d = str2;
    }

    public final String toString() {
        byte[] bArr = this.c;
        Object valueOf = bArr == null ? "null" : Integer.valueOf(bArr.length);
        String str = this.b;
        return "MessageEventParcelable[" + this.a + "," + str + ", size=" + valueOf.toString() + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = atzr.a(parcel);
        atzr.o(parcel, 2, i2);
        atzr.v(parcel, 3, this.b, false);
        atzr.i(parcel, 4, this.c, false);
        atzr.v(parcel, 5, this.d, false);
        atzr.c(parcel, a);
    }
}
