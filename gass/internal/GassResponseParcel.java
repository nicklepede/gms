package com.google.android.gms.gass.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.ads.afma.proto2api.b;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzb;
import defpackage.atzr;
import defpackage.bjyi;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class GassResponseParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bjyi();
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
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, this.a);
        byte[] bArr = this.c;
        if (bArr == null) {
            bArr = this.b.r();
        }
        atzr.i(parcel, 2, bArr, false);
        atzr.c(parcel, a);
    }

    public GassResponseParcel(b bVar) {
        this.a = 1;
        atzb.s(bVar);
        this.b = bVar;
        this.c = null;
        a();
    }
}
