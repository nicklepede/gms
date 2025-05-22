package com.google.android.gms.games.video;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.internal.GamesAbstractSafeParcelable;
import defpackage.atyp;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.bjwv;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class VideoCapabilities extends GamesAbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bjwv();
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean[] d;
    public final boolean[] e;

    public VideoCapabilities(boolean z, boolean z2, boolean z3, boolean[] zArr, boolean[] zArr2) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = zArr;
        this.e = zArr2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof VideoCapabilities)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        VideoCapabilities videoCapabilities = (VideoCapabilities) obj;
        return atyq.b(videoCapabilities.d, this.d) && atyq.b(videoCapabilities.e, this.e) && atyq.b(Boolean.valueOf(videoCapabilities.a), Boolean.valueOf(this.a)) && atyq.b(Boolean.valueOf(videoCapabilities.b), Boolean.valueOf(this.b)) && atyq.b(Boolean.valueOf(videoCapabilities.c), Boolean.valueOf(this.c));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.d, this.e, Boolean.valueOf(this.a), Boolean.valueOf(this.b), Boolean.valueOf(this.c)});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        atyp.b("SupportedCaptureModes", this.d, arrayList);
        atyp.b("SupportedQualityLevels", this.e, arrayList);
        atyp.b("CameraSupported", Boolean.valueOf(this.a), arrayList);
        atyp.b("MicSupported", Boolean.valueOf(this.b), arrayList);
        atyp.b("StorageWriteSupported", Boolean.valueOf(this.c), arrayList);
        return atyp.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.a;
        int a = atzr.a(parcel);
        atzr.e(parcel, 1, z);
        atzr.e(parcel, 2, this.b);
        atzr.e(parcel, 3, this.c);
        atzr.f(parcel, 4, this.d, false);
        atzr.f(parcel, 5, this.e, false);
        atzr.c(parcel, a);
    }
}
