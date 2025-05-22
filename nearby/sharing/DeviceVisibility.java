package com.google.android.gms.nearby.sharing;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cnwn;
import defpackage.cnwo;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
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
        cnwn cnwnVar = new cnwn();
        cnwnVar.a = 3;
        a = cnwnVar.a();
        cnwn cnwnVar2 = new cnwn();
        cnwnVar2.a = 1;
        b = cnwnVar2.a();
        cnwn cnwnVar3 = new cnwn();
        cnwnVar3.a = 2;
        c = cnwnVar3.a();
        cnwn cnwnVar4 = new cnwn();
        cnwnVar4.a = 4;
        d = cnwnVar4.a();
        cnwn cnwnVar5 = new cnwn();
        cnwnVar5.a = 0;
        e = cnwnVar5.a();
        CREATOR = new cnwo();
    }

    public DeviceVisibility(int i, int i2, int i3, long j, boolean z, String str) {
        this.f = i;
        this.g = i2;
        this.h = i3;
        this.i = j;
        this.j = z;
        this.k = str;
    }

    public final cnwn a() {
        cnwn cnwnVar = new cnwn();
        cnwnVar.a = this.f;
        cnwnVar.b = this.g;
        cnwnVar.c = this.h;
        cnwnVar.d = this.i;
        cnwnVar.e = this.j;
        cnwnVar.f = this.k;
        return cnwnVar;
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
            if (atyq.b(Integer.valueOf(this.f), Integer.valueOf(deviceVisibility.f))) {
                if (atyq.b(Integer.valueOf(this.g), Integer.valueOf(deviceVisibility.g))) {
                    if (atyq.b(Integer.valueOf(this.h), Integer.valueOf(deviceVisibility.h))) {
                        if (atyq.b(Long.valueOf(this.i), Long.valueOf(deviceVisibility.i))) {
                            if (atyq.b(Boolean.valueOf(this.j), Boolean.valueOf(deviceVisibility.j)) && atyq.b(this.k, deviceVisibility.k)) {
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
        int a2 = atzr.a(parcel);
        atzr.o(parcel, 1, i2);
        atzr.o(parcel, 2, this.g);
        atzr.o(parcel, 3, this.h);
        atzr.q(parcel, 4, this.i);
        atzr.e(parcel, 5, this.j);
        atzr.v(parcel, 6, this.k, false);
        atzr.c(parcel, a2);
    }
}
