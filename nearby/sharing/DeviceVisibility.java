package com.google.android.gms.nearby.sharing;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.clof;
import defpackage.clog;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class DeviceVisibility extends AbstractSafeParcelable implements Cloneable {
    public static final Parcelable.Creator CREATOR;
    public static final DeviceVisibility a;
    public static final DeviceVisibility b;
    public static final DeviceVisibility c;
    public static final DeviceVisibility d;
    public static final DeviceVisibility e;
    public final int f;
    public final int g;
    public final int h;
    public final long i;
    public final boolean j;
    public final String k;

    static {
        clof clofVar = new clof();
        clofVar.a = 3;
        a = clofVar.a();
        clof clofVar2 = new clof();
        clofVar2.a = 1;
        b = clofVar2.a();
        clof clofVar3 = new clof();
        clofVar3.a = 2;
        c = clofVar3.a();
        clof clofVar4 = new clof();
        clofVar4.a = 4;
        d = clofVar4.a();
        clof clofVar5 = new clof();
        clofVar5.a = 0;
        e = clofVar5.a();
        CREATOR = new clog();
    }

    public DeviceVisibility(int i, int i2, int i3, long j, boolean z, String str) {
        this.f = i;
        this.g = i2;
        this.h = i3;
        this.i = j;
        this.j = z;
        this.k = str;
    }

    public final clof a() {
        clof clofVar = new clof();
        clofVar.a = this.f;
        clofVar.b = this.g;
        clofVar.c = this.h;
        clofVar.d = this.i;
        clofVar.e = this.j;
        clofVar.f = this.k;
        return clofVar;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final DeviceVisibility clone() {
        try {
            return (DeviceVisibility) super.clone();
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof DeviceVisibility) {
            DeviceVisibility deviceVisibility = (DeviceVisibility) obj;
            if (arwb.b(Integer.valueOf(this.f), Integer.valueOf(deviceVisibility.f))) {
                if (arwb.b(Integer.valueOf(this.g), Integer.valueOf(deviceVisibility.g))) {
                    if (arwb.b(Integer.valueOf(this.h), Integer.valueOf(deviceVisibility.h))) {
                        if (arwb.b(Long.valueOf(this.i), Long.valueOf(deviceVisibility.i))) {
                            if (arwb.b(Boolean.valueOf(this.j), Boolean.valueOf(deviceVisibility.j)) && arwb.b(this.k, deviceVisibility.k)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f), Integer.valueOf(this.g), Integer.valueOf(this.h), Long.valueOf(this.i), Boolean.valueOf(this.j), this.k});
    }

    public final String toString() {
        return String.format(Locale.US, "DeviceVisibility<visibility: %s, previous_visibility: %s, contact_visibility_preference: %s, prefer_persistent_everyone: %s, duration_millis: %s, triggered by: %s>", Integer.valueOf(this.f), Integer.valueOf(this.g), Integer.valueOf(this.h), Boolean.valueOf(this.j), Long.valueOf(this.i), this.k);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.f;
        int a2 = arxc.a(parcel);
        arxc.o(parcel, 1, i2);
        arxc.o(parcel, 2, this.g);
        arxc.o(parcel, 3, this.h);
        arxc.q(parcel, 4, this.i);
        arxc.e(parcel, 5, this.j);
        arxc.v(parcel, 6, this.k, false);
        arxc.c(parcel, a2);
    }
}
