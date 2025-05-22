package com.google.android.gms.findmydevice.spot;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.bexu;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class ReportFastPairDeviceConnectionChangeRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bexu();
    public byte[] a;
    public BloomFilterData b;
    public byte[] c;
    public String d;
    public ClockSyncMessageStreamData e;
    public boolean f;

    public ReportFastPairDeviceConnectionChangeRequest() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ReportFastPairDeviceConnectionChangeRequest) {
            ReportFastPairDeviceConnectionChangeRequest reportFastPairDeviceConnectionChangeRequest = (ReportFastPairDeviceConnectionChangeRequest) obj;
            if (Arrays.equals(this.a, reportFastPairDeviceConnectionChangeRequest.a) && atyq.b(this.b, reportFastPairDeviceConnectionChangeRequest.b) && Arrays.equals(this.c, reportFastPairDeviceConnectionChangeRequest.c) && atyq.b(this.d, reportFastPairDeviceConnectionChangeRequest.d) && atyq.b(this.e, reportFastPairDeviceConnectionChangeRequest.e) && atyq.b(Boolean.valueOf(this.f), Boolean.valueOf(reportFastPairDeviceConnectionChangeRequest.f))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.a)), this.b, Integer.valueOf(Arrays.hashCode(this.c)), this.d, this.e, Boolean.valueOf(this.f)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.i(parcel, 2, this.c, false);
        atzr.i(parcel, 3, this.a, false);
        atzr.v(parcel, 4, this.d, false);
        atzr.t(parcel, 5, this.e, i, false);
        atzr.t(parcel, 6, this.b, i, false);
        atzr.e(parcel, 7, this.f);
        atzr.c(parcel, a);
    }

    public ReportFastPairDeviceConnectionChangeRequest(byte[] bArr, BloomFilterData bloomFilterData, byte[] bArr2, String str, ClockSyncMessageStreamData clockSyncMessageStreamData, boolean z) {
        this.a = bArr;
        this.b = bloomFilterData;
        this.c = bArr2;
        this.d = str;
        this.e = clockSyncMessageStreamData;
        this.f = z;
    }
}
