package com.google.android.gms.dynamite;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.bbmu;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class DynamiteModuleData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bbmu();
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
        int a = atzr.a(parcel);
        atzr.q(parcel, 1, d());
        atzr.v(parcel, 2, f(), false);
        atzr.o(parcel, 3, a());
        atzr.e(parcel, 4, g());
        atzr.o(parcel, 5, b());
        atzr.q(parcel, 6, c());
        atzr.t(parcel, 7, e(), i, false);
        atzr.i(parcel, 8, h(), false);
        atzr.c(parcel, a);
    }
}
