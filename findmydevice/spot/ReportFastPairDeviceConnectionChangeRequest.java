package com.google.android.gms.findmydevice.spot;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.bcwi;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class ReportFastPairDeviceConnectionChangeRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bcwi();
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
            if (Arrays.equals(this.a, reportFastPairDeviceConnectionChangeRequest.a) && arwb.b(this.b, reportFastPairDeviceConnectionChangeRequest.b) && Arrays.equals(this.c, reportFastPairDeviceConnectionChangeRequest.c) && arwb.b(this.d, reportFastPairDeviceConnectionChangeRequest.d) && arwb.b(this.e, reportFastPairDeviceConnectionChangeRequest.e) && arwb.b(Boolean.valueOf(this.f), Boolean.valueOf(reportFastPairDeviceConnectionChangeRequest.f))) {
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
        int a = arxc.a(parcel);
        arxc.i(parcel, 2, this.c, false);
        arxc.i(parcel, 3, this.a, false);
        arxc.v(parcel, 4, this.d, false);
        arxc.t(parcel, 5, this.e, i, false);
        arxc.t(parcel, 6, this.b, i, false);
        arxc.e(parcel, 7, this.f);
        arxc.c(parcel, a);
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
