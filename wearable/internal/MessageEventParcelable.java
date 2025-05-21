package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.dklm;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class MessageEventParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dklm();
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
        int a = arxc.a(parcel);
        arxc.o(parcel, 2, i2);
        arxc.v(parcel, 3, this.b, false);
        arxc.i(parcel, 4, this.c, false);
        arxc.v(parcel, 5, this.d, false);
        arxc.c(parcel, a);
    }
}
