package com.google.android.gms.gass.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.ads.afma.proto2api.b;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.bhtt;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class GassResponseParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bhtt();
    public final int a;
    private final b b;
    private final byte[] c;

    public GassResponseParcel(int i, byte[] bArr) {
        this.a = i;
        this.b = null;
        this.c = bArr;
        a();
    }

    private final void a() {
        b bVar = this.b;
        if (bVar != null || this.c == null) {
            if (bVar == null || this.c != null) {
                if (bVar != null && this.c != null) {
                    throw new IllegalStateException("Invalid internal representation - full");
                }
                if (bVar != null || this.c != null) {
                    throw new IllegalStateException("Impossible");
                }
                throw new IllegalStateException("Invalid internal representation - empty");
            }
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.a);
        byte[] bArr = this.c;
        if (bArr == null) {
            bArr = this.b.r();
        }
        arxc.i(parcel, 2, bArr, false);
        arxc.c(parcel, a);
    }

    public GassResponseParcel(b bVar) {
        this.a = 1;
        arwm.s(bVar);
        this.b = bVar;
        this.c = null;
        a();
    }
}
