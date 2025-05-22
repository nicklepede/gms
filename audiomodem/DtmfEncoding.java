package com.google.android.gms.audiomodem;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.wgs;
import defpackage.whk;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class DtmfEncoding extends AbstractSafeParcelable {
    public final int c;
    public final boolean d;
    public final float e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    private final AdsrParams j;
    private final float[] k;
    public static final float[] a = {740.0f, 830.622f, 932.342f, 1108.75f, 1244.53f, 1480.0f, 1661.24f, 1864.68f, 2217.49f, 2489.05f};
    public static final AdsrParams b = wgs.a(8, 0, 0, 40, 1.0f);
    public static final Parcelable.Creator CREATOR = new whk();

    public DtmfEncoding(int i, boolean z, float f, int i2, int i3, int i4, int i5, AdsrParams adsrParams, float[] fArr) {
        this.c = i;
        this.d = z;
        this.e = f;
        this.f = i2;
        this.g = i3;
        this.h = i4;
        this.i = i5;
        this.j = adsrParams;
        this.k = fArr;
    }

    public final AdsrParams a() {
        AdsrParams adsrParams = this.j;
        return adsrParams != null ? adsrParams : b;
    }

    public final float[] b() {
        float[] fArr = this.k;
        return fArr != null ? fArr : a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DtmfEncoding)) {
            return false;
        }
        DtmfEncoding dtmfEncoding = (DtmfEncoding) obj;
        return this.c == dtmfEncoding.c && this.d == dtmfEncoding.d && this.e == dtmfEncoding.e && this.f == dtmfEncoding.f && this.g == dtmfEncoding.g && this.h == dtmfEncoding.h && this.i == dtmfEncoding.i && atyq.b(a(), dtmfEncoding.a()) && atyq.b(b(), dtmfEncoding.b());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.c), Boolean.valueOf(this.d), Float.valueOf(this.e), Integer.valueOf(this.f), Integer.valueOf(this.g), Integer.valueOf(this.h), Integer.valueOf(this.i), this.j, this.k});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.c;
        int a2 = atzr.a(parcel);
        atzr.o(parcel, 2, i2);
        atzr.e(parcel, 3, this.d);
        atzr.l(parcel, 4, this.e);
        atzr.o(parcel, 5, this.f);
        atzr.o(parcel, 6, this.g);
        atzr.o(parcel, 7, this.h);
        atzr.o(parcel, 8, this.i);
        atzr.t(parcel, 9, a(), i, false);
        atzr.m(parcel, 10, b(), false);
        atzr.c(parcel, a2);
    }
}
