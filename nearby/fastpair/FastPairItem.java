package com.google.android.gms.nearby.fastpair;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.chza;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class FastPairItem extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new chza();
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
            if (arwb.b(this.a, fastPairItem.a) && ((bitmap = this.b) != null ? bitmap.sameAs(fastPairItem.b) : fastPairItem.b == null) && this.c == fastPairItem.c && Arrays.equals(this.d, fastPairItem.d) && this.e == fastPairItem.e) {
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
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.t(parcel, 2, this.b, i, false);
        arxc.q(parcel, 3, this.c);
        arxc.i(parcel, 4, this.d, false);
        arxc.o(parcel, 5, this.e);
        arxc.c(parcel, a);
    }
}
