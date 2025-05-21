package com.google.android.gms.games.video;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.internal.GamesAbstractSafeParcelable;
import defpackage.arwa;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.bhsg;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class VideoCapabilities extends GamesAbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bhsg();
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
        return arwb.b(videoCapabilities.d, this.d) && arwb.b(videoCapabilities.e, this.e) && arwb.b(Boolean.valueOf(videoCapabilities.a), Boolean.valueOf(this.a)) && arwb.b(Boolean.valueOf(videoCapabilities.b), Boolean.valueOf(this.b)) && arwb.b(Boolean.valueOf(videoCapabilities.c), Boolean.valueOf(this.c));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.d, this.e, Boolean.valueOf(this.a), Boolean.valueOf(this.b), Boolean.valueOf(this.c)});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arwa.b("SupportedCaptureModes", this.d, arrayList);
        arwa.b("SupportedQualityLevels", this.e, arrayList);
        arwa.b("CameraSupported", Boolean.valueOf(this.a), arrayList);
        arwa.b("MicSupported", Boolean.valueOf(this.b), arrayList);
        arwa.b("StorageWriteSupported", Boolean.valueOf(this.c), arrayList);
        return arwa.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.a;
        int a = arxc.a(parcel);
        arxc.e(parcel, 1, z);
        arxc.e(parcel, 2, this.b);
        arxc.e(parcel, 3, this.c);
        arxc.f(parcel, 4, this.d, false);
        arxc.f(parcel, 5, this.e, false);
        arxc.c(parcel, a);
    }
}
