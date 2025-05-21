package com.google.android.gms.findmydevice.spot;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.bcwa;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class LocationReportRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bcwa();
    public ScanResult[] a;
    public int b;

    public LocationReportRequest() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocationReportRequest) {
            LocationReportRequest locationReportRequest = (LocationReportRequest) obj;
            if (Arrays.equals(this.a, locationReportRequest.a) && arwb.b(Integer.valueOf(this.b), Integer.valueOf(locationReportRequest.b))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.a)), Integer.valueOf(this.b)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.J(parcel, 1, this.a, i);
        arxc.o(parcel, 2, this.b);
        arxc.c(parcel, a);
    }

    public LocationReportRequest(ScanResult[] scanResultArr, int i) {
        this.a = scanResultArr;
        this.b = i;
    }
}
