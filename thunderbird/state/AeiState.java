package com.google.android.gms.thunderbird.state;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.azlv;
import defpackage.dfyh;
import defpackage.febw;
import defpackage.fecp;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class AeiState extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dfyh();
    public final byte[] a;

    public AeiState(byte[] bArr) {
        this.a = bArr;
    }

    public final azlv a() {
        febw a = febw.a();
        azlv azlvVar = azlv.a;
        byte[] bArr = this.a;
        fecp y = fecp.y(azlvVar, bArr, 0, bArr.length, a);
        fecp.M(y);
        return (azlv) y;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AeiState) {
            return Arrays.equals(this.a, ((AeiState) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        byte[] bArr = this.a;
        int a = arxc.a(parcel);
        arxc.i(parcel, 1, bArr, false);
        arxc.c(parcel, a);
    }
}
