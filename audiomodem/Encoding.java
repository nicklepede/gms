package com.google.android.gms.audiomodem;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.uln;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class Encoding extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new uln();
    public final int a;
    public final DsssEncoding b;
    public final DtmfEncoding c;

    public Encoding(int i, DsssEncoding dsssEncoding, DtmfEncoding dtmfEncoding) {
        this.a = i;
        this.b = dsssEncoding;
        this.c = dtmfEncoding;
    }

    public static int a(int i) {
        return (i == 2 || i == 3) ? 2 : 0;
    }

    public static boolean b(int i) {
        return i == 1 || i == 3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Encoding)) {
            return false;
        }
        Encoding encoding = (Encoding) obj;
        int i = this.a;
        if (i == encoding.a) {
            return i == 0 ? arwb.b(this.b, encoding.b) : i != 1 || arwb.b(this.c, encoding.c);
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3 = this.a;
        int hashCode = Arrays.hashCode(new Object[]{Integer.valueOf(i3)});
        if (i3 == 0) {
            i2 = this.b.hashCode();
            i = 0;
        } else {
            i = i3;
            i2 = 0;
        }
        return hashCode + i2 + (i == 1 ? this.c.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = arxc.a(parcel);
        arxc.o(parcel, 2, i2);
        arxc.t(parcel, 3, this.b, i, false);
        arxc.t(parcel, 4, this.c, i, false);
        arxc.c(parcel, a);
    }
}
