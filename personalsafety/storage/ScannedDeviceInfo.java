package com.google.android.gms.personalsafety.storage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.personalsafety.detection.FinderTagInfo;
import defpackage.arxc;
import defpackage.cvxc;
import defpackage.eihn;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class ScannedDeviceInfo extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new cvxc();
    public final long a;
    public final LatLng b;
    public final TagDeviceData c;
    public final LatLng d;
    public final List e;
    public final FinderTagInfo f;

    public ScannedDeviceInfo(long j, LatLng latLng, TagDeviceData tagDeviceData, LatLng latLng2, List list, FinderTagInfo finderTagInfo) {
        this.a = j;
        this.b = latLng;
        this.c = tagDeviceData;
        this.d = latLng2;
        this.e = list;
        this.f = finderTagInfo;
    }

    public final ScannedDeviceInfo a(FinderTagInfo finderTagInfo) {
        return new ScannedDeviceInfo(this.a, this.b, this.c, this.d, this.e, finderTagInfo);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ScannedDeviceInfo) {
            ScannedDeviceInfo scannedDeviceInfo = (ScannedDeviceInfo) obj;
            if (this.a == scannedDeviceInfo.a && eihn.a(this.b, scannedDeviceInfo.b) && this.c.equals(scannedDeviceInfo.c) && eihn.a(this.d, scannedDeviceInfo.d) && eihn.a(this.e, scannedDeviceInfo.e) && eihn.a(this.f, scannedDeviceInfo.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), this.b, this.c, this.d, this.e});
    }

    public final String toString() {
        List<LocationScan> list = this.e;
        String str = "";
        if (list != null) {
            for (LocationScan locationScan : list) {
                if (locationScan != null) {
                    str = str + " " + locationScan.toString() + ", ";
                }
            }
        }
        return String.format("Scanned Device Info:<First Seen Time: %s, First Seen Location: %s, Tag Device Detail: %s, Last Seen Location: %s, Location History: %s, Finder tag info: %s>", Long.valueOf(this.a), this.b, this.c, this.d, str, this.f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        long j = this.a;
        int a = arxc.a(parcel);
        arxc.q(parcel, 1, j);
        arxc.t(parcel, 2, this.b, i, false);
        arxc.t(parcel, 3, this.c, i, false);
        arxc.t(parcel, 4, this.d, i, false);
        arxc.y(parcel, 5, this.e, false);
        arxc.t(parcel, 6, this.f, i, false);
        arxc.c(parcel, a);
    }
}
