package com.google.android.gms.nearby.presence;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.ckks;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class Salt extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ckks();
    private final byte[] a;

    public Salt(byte[] bArr) {
        arwm.c(bArr.length == 2, "the salt length is 2");
        this.a = bArr;
    }

    public final byte[] a() {
        return (byte[]) this.a.clone();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.i(parcel, 1, a(), false);
        arxc.c(parcel, a);
    }
}
