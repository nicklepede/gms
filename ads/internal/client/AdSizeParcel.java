package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class AdSizeParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new j();
    public final String a;
    public final int b;
    public final int c;
    public final boolean d;
    public final int e;
    public final int f;
    public final AdSizeParcel[] g;
    public final boolean h;
    public final boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;

    public AdSizeParcel(String str, int i, int i2, boolean z, int i3, int i4, AdSizeParcel[] adSizeParcelArr, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = i3;
        this.f = i4;
        this.g = adSizeParcelArr;
        this.h = z2;
        this.i = z3;
        this.j = z4;
        this.k = z5;
        this.l = z6;
        this.m = z7;
        this.n = z8;
        this.o = z9;
    }

    public static int a(DisplayMetrics displayMetrics) {
        int i = (int) (displayMetrics.heightPixels / displayMetrics.density);
        if (i <= 400) {
            return 32;
        }
        return i <= 720 ? 50 : 90;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 2, str, false);
        arxc.o(parcel, 3, this.b);
        arxc.o(parcel, 4, this.c);
        arxc.e(parcel, 5, this.d);
        arxc.o(parcel, 6, this.e);
        arxc.o(parcel, 7, this.f);
        arxc.J(parcel, 8, this.g, i);
        arxc.e(parcel, 9, this.h);
        arxc.e(parcel, 10, this.i);
        arxc.e(parcel, 11, this.j);
        arxc.e(parcel, 12, this.k);
        arxc.e(parcel, 13, this.l);
        arxc.e(parcel, 14, this.m);
        arxc.e(parcel, 15, this.n);
        arxc.e(parcel, 16, this.o);
        arxc.c(parcel, a);
    }

    public AdSizeParcel() {
        this("interstitial_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AdSizeParcel(android.content.Context r13, defpackage.tcd[] r14) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.client.AdSizeParcel.<init>(android.content.Context, tcd[]):void");
    }
}
