package com.google.android.gms.home.matter.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzb;
import defpackage.atzr;
import defpackage.bngz;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class Discriminator extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bngz();
    public final int a;
    public final int b;

    public Discriminator(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public static Discriminator a(int i) {
        atzb.d(i >= 0 && i <= 4095, "Invalid discriminator value 0x%X (valid range 0-0xFFF)", Integer.valueOf(i));
        return new Discriminator(i & 4095, 4095);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Discriminator)) {
            return false;
        }
        Discriminator discriminator = (Discriminator) obj;
        return this.a == discriminator.a && this.b == discriminator.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b)});
    }

    public final String toString() {
        return String.format(Locale.ROOT, "%s[0x%03X]", this.b == 4095 ? "L" : "S", Integer.valueOf(this.a));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, i2);
        atzr.o(parcel, 2, this.b);
        atzr.c(parcel, a);
    }
}
