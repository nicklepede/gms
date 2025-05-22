package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzb;
import defpackage.atzr;
import defpackage.bdwl;
import defpackage.fgpr;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class CableAuthenticationData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bdwl();
    public final long a;
    private final fgpr b;
    private final fgpr c;
    private final fgpr d;

    public CableAuthenticationData(long j, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        atzb.s(bArr);
        fgpr w = fgpr.w(bArr);
        atzb.s(bArr2);
        fgpr w2 = fgpr.w(bArr2);
        atzb.s(bArr3);
        fgpr w3 = fgpr.w(bArr3);
        this.a = j;
        this.b = w;
        this.c = w2;
        this.d = w3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof CableAuthenticationData)) {
            return false;
        }
        CableAuthenticationData cableAuthenticationData = (CableAuthenticationData) obj;
        return this.a == cableAuthenticationData.a && atyq.b(this.b, cableAuthenticationData.b) && atyq.b(this.c, cableAuthenticationData.c) && atyq.b(this.d, cableAuthenticationData.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), this.b, this.c, this.d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        long j = this.a;
        int a = atzr.a(parcel);
        atzr.q(parcel, 1, j);
        atzr.i(parcel, 2, this.b.M(), false);
        atzr.i(parcel, 3, this.c.M(), false);
        atzr.i(parcel, 4, this.d.M(), false);
        atzr.c(parcel, a);
    }
}
