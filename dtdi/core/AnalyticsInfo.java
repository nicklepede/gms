package com.google.android.gms.dtdi.core;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.bagk;
import defpackage.fxxm;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class AnalyticsInfo extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new bagk();
    public final long a;
    public final byte[] b;
    public final byte[] c;
    public final boolean d;
    public final byte[] e;

    public AnalyticsInfo(long j, byte[] bArr, byte[] bArr2, boolean z, byte[] bArr3) {
        fxxm.f(bArr, "correlationId");
        fxxm.f(bArr2, "localEphemeralDeviceId");
        this.a = j;
        this.b = bArr;
        this.c = bArr2;
        this.d = z;
        this.e = bArr3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnalyticsInfo)) {
            return false;
        }
        AnalyticsInfo analyticsInfo = (AnalyticsInfo) obj;
        if (this.a != analyticsInfo.a || !Arrays.equals(this.b, analyticsInfo.b) || !Arrays.equals(this.c, analyticsInfo.c) || this.d != analyticsInfo.d) {
            return false;
        }
        byte[] bArr = this.e;
        if (bArr != null) {
            byte[] bArr2 = analyticsInfo.e;
            if (bArr2 == null || !Arrays.equals(bArr, bArr2)) {
                return false;
            }
        } else if (analyticsInfo.e != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.a;
        int hashCode = (((((int) (j ^ (j >>> 32))) * 31) + Arrays.hashCode(this.b)) * 31) + Arrays.hashCode(this.c);
        byte[] bArr = this.e;
        return (((hashCode * 31) + (true != this.d ? 1237 : 1231)) * 31) + (bArr != null ? Arrays.hashCode(bArr) : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        fxxm.f(parcel, "dest");
        long j = this.a;
        int a = atzr.a(parcel);
        atzr.q(parcel, 1, j);
        atzr.i(parcel, 2, this.b, false);
        atzr.i(parcel, 3, this.c, false);
        atzr.e(parcel, 4, this.d);
        atzr.i(parcel, 5, this.e, false);
        atzr.c(parcel, a);
    }
}
