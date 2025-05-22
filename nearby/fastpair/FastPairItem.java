package com.google.android.gms.nearby.fastpair;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.ckhf;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class FastPairItem extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ckhf();
    public final String a;
    public final Bitmap b;
    public final long c;
    public final byte[] d;
    public final int e;

    public FastPairItem(String str, Bitmap bitmap, long j, byte[] bArr, int i) {
        this.a = str;
        this.b = bitmap;
        this.c = j;
        this.d = bArr;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        Bitmap bitmap;
        if (obj instanceof FastPairItem) {
            FastPairItem fastPairItem = (FastPairItem) obj;
            if (atyq.b(this.a, fastPairItem.a) && ((bitmap = this.b) != null ? bitmap.sameAs(fastPairItem.b) : fastPairItem.b == null) && this.c == fastPairItem.c && Arrays.equals(this.d, fastPairItem.d) && this.e == fastPairItem.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Long.valueOf(this.c), this.d, Integer.valueOf(this.e)});
    }

    public final String toString() {
        return "item:  \ntitle= " + this.a + " \nlastObservationTimestampMillis= " + this.c + " \ndeviceType= " + this.e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.t(parcel, 2, this.b, i, false);
        atzr.q(parcel, 3, this.c);
        atzr.i(parcel, 4, this.d, false);
        atzr.o(parcel, 5, this.e);
        atzr.c(parcel, a);
    }
}
