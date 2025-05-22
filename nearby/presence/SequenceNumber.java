package com.google.android.gms.nearby.presence;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzb;
import defpackage.atzr;
import defpackage.cmsy;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class SequenceNumber extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cmsy();
    public final int a;

    public SequenceNumber(int i) {
        boolean z = false;
        if (i >= 0 && i <= 15) {
            z = true;
        }
        atzb.c(z, "Sequence number should be 4 bits.");
        this.a = i;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof SequenceNumber) && this.a == ((SequenceNumber) obj).a;
    }

    public final int hashCode() {
        return Objects.hash(19, Integer.valueOf(this.a));
    }

    public final String toString() {
        return String.format(Locale.US, "DataElement<type: %s, value: %d>", "ContextSequenceNumber", Integer.valueOf(this.a));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, i2);
        atzr.c(parcel, a);
    }
}
