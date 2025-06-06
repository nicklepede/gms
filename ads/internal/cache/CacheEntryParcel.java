package com.google.android.gms.ads.internal.cache;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import java.io.InputStream;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class CacheEntryParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new b();
    private ParcelFileDescriptor a;
    private final boolean b;
    private final boolean c;
    private final long d;
    private final boolean e;

    public CacheEntryParcel(ParcelFileDescriptor parcelFileDescriptor, boolean z, boolean z2, long j, boolean z3) {
        this.a = parcelFileDescriptor;
        this.b = z;
        this.c = z2;
        this.d = j;
        this.e = z3;
    }

    public final synchronized long a() {
        return this.d;
    }

    final synchronized ParcelFileDescriptor b() {
        return this.a;
    }

    public final synchronized InputStream c() {
        if (this.a == null) {
            return null;
        }
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(this.a);
        this.a = null;
        return autoCloseInputStream;
    }

    public final synchronized boolean d() {
        return this.b;
    }

    public final synchronized boolean e() {
        return this.a != null;
    }

    public final synchronized boolean f() {
        return this.c;
    }

    public final synchronized boolean g() {
        return this.e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.t(parcel, 2, b(), i, false);
        atzr.e(parcel, 3, d());
        atzr.e(parcel, 4, f());
        atzr.q(parcel, 5, a());
        atzr.e(parcel, 6, g());
        atzr.c(parcel, a);
    }

    public CacheEntryParcel() {
        this(null, false, false, 0L, false);
    }
}
