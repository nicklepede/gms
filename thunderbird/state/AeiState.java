package com.google.android.gms.thunderbird.state;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.bbpr;
import defpackage.dijm;
import defpackage.fgqp;
import defpackage.fgri;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class AeiState extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dijm();
    public final byte[] a;

    public AeiState(byte[] bArr) {
        this.a = bArr;
    }

    public final bbpr a() {
        fgqp a = fgqp.a();
        bbpr bbprVar = bbpr.a;
        byte[] bArr = this.a;
        fgri y = fgri.y(bbprVar, bArr, 0, bArr.length, a);
        fgri.M(y);
        return (bbpr) y;
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
        int a = atzr.a(parcel);
        atzr.i(parcel, 1, bArr, false);
        atzr.c(parcel, a);
    }
}
