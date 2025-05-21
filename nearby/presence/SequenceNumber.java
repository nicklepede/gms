package com.google.android.gms.nearby.presence;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.ckkt;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class SequenceNumber extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ckkt();
    public final int a;

    public SequenceNumber(int i) {
        boolean z = false;
        if (i >= 0 && i <= 15) {
            z = true;
        }
        arwm.c(z, "Sequence number should be 4 bits.");
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
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, i2);
        arxc.c(parcel, a);
    }
}
