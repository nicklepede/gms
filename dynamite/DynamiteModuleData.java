package com.google.android.gms.dynamite;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.aziy;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class DynamiteModuleData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aziy();
    private final long a;
    private final String b;
    private final int c;
    private final boolean d;
    private final int e;
    private final long f;
    private final RequestStats g;
    private final byte[] h;

    public DynamiteModuleData(long j, String str, int i, boolean z, int i2, long j2, RequestStats requestStats, byte[] bArr) {
        this.a = j;
        this.b = str;
        this.c = i;
        this.d = z;
        this.e = i2;
        this.f = j2;
        this.g = requestStats;
        this.h = bArr;
    }

    public int a() {
        return this.c;
    }

    public int b() {
        return this.e;
    }

    public long c() {
        return this.f;
    }

    public long d() {
        return this.a;
    }

    public RequestStats e() {
        return this.g;
    }

    public String f() {
        return this.b;
    }

    public boolean g() {
        return this.d;
    }

    public byte[] h() {
        return this.h;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.q(parcel, 1, d());
        arxc.v(parcel, 2, f(), false);
        arxc.o(parcel, 3, a());
        arxc.e(parcel, 4, g());
        arxc.o(parcel, 5, b());
        arxc.q(parcel, 6, c());
        arxc.t(parcel, 7, e(), i, false);
        arxc.i(parcel, 8, h(), false);
        arxc.c(parcel, a);
    }
}
