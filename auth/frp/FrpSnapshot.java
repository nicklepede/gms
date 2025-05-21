package com.google.android.gms.auth.frp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.aboa;
import defpackage.arxc;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class FrpSnapshot extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aboa();
    final int a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    @Deprecated
    public final PersistentDeviceOwnerState e;

    @Deprecated
    public final boolean f;

    public FrpSnapshot(int i, boolean z, boolean z2, boolean z3) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = null;
        this.f = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FrpSnapshot)) {
            return false;
        }
        FrpSnapshot frpSnapshot = (FrpSnapshot) obj;
        if (this.a == frpSnapshot.a && this.b == frpSnapshot.b && this.c == frpSnapshot.c && this.d == frpSnapshot.d) {
            boolean z = frpSnapshot.f;
            PersistentDeviceOwnerState persistentDeviceOwnerState = frpSnapshot.e;
            if (Objects.equals(null, null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Boolean.valueOf(this.b), Boolean.valueOf(this.c), Boolean.valueOf(this.d), null, false);
    }

    public final String toString() {
        return String.format("FrpSnapshot[supported=%b,required=%b,ls=%b]", Boolean.valueOf(this.b), Boolean.valueOf(this.c), Boolean.valueOf(this.d));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.a);
        arxc.e(parcel, 2, this.b);
        arxc.e(parcel, 3, this.c);
        arxc.e(parcel, 4, this.d);
        arxc.t(parcel, 5, null, i, false);
        arxc.e(parcel, 6, false);
        arxc.c(parcel, a);
    }

    public FrpSnapshot(boolean z, boolean z2, boolean z3) {
        this(1, z, z2, z3);
    }
}
