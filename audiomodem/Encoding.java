package com.google.android.gms.audiomodem;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.whm;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class Encoding extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new whm();
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
            return i == 0 ? atyq.b(this.b, encoding.b) : i != 1 || atyq.b(this.c, encoding.c);
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
        int a = atzr.a(parcel);
        atzr.o(parcel, 2, i2);
        atzr.t(parcel, 3, this.b, i, false);
        atzr.t(parcel, 4, this.c, i, false);
        atzr.c(parcel, a);
    }
}
