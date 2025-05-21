package com.google.android.gms.auth.firstparty.shared;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abaq;
import defpackage.arxc;
import defpackage.arxd;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class ManagedAuthOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new abaq();
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
        return (bArr == null || bArr.length == 0) ? new ManagedAuthOptions() : (ManagedAuthOptions) arxd.a(bArr, CREATOR);
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
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.a);
        arxc.o(parcel, 2, this.b);
        arxc.o(parcel, 3, this.c);
        arxc.q(parcel, 4, this.d);
        arxc.c(parcel, a);
    }

    public ManagedAuthOptions() {
        this(1, 0, 0, -1L);
    }

    public ManagedAuthOptions(int i, int i2) {
        this(1, i, i2, -1L);
    }
}
