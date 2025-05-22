package com.google.android.gms.auth.firstparty.shared;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.adaq;
import defpackage.atzr;
import defpackage.atzs;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class ManagedAuthOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new adaq();
    final int a;
    public int b;
    int c;

    @Deprecated
    long d;

    public ManagedAuthOptions(int i, int i2, int i3, long j) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = j;
    }

    public static ManagedAuthOptions b(byte[] bArr) {
        return (bArr == null || bArr.length == 0) ? new ManagedAuthOptions() : (ManagedAuthOptions) atzs.a(bArr, CREATOR);
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt("enforced_management_mode", this.b);
        bundle.putInt("restore_mode", this.c);
        long j = this.d;
        if (j != -1) {
            bundle.putString("source_device_id", String.valueOf(j));
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ManagedAuthOptions)) {
            return false;
        }
        ManagedAuthOptions managedAuthOptions = (ManagedAuthOptions) obj;
        return this.b == managedAuthOptions.b && this.c == managedAuthOptions.c && this.d == managedAuthOptions.d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.c), Long.valueOf(this.d)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, this.a);
        atzr.o(parcel, 2, this.b);
        atzr.o(parcel, 3, this.c);
        atzr.q(parcel, 4, this.d);
        atzr.c(parcel, a);
    }

    public ManagedAuthOptions() {
        this(1, 0, 0, -1L);
    }

    public ManagedAuthOptions(int i, int i2) {
        this(1, i, i2, -1L);
    }
}
