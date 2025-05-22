package com.google.android.gms.nearby.presence;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzb;
import defpackage.atzr;
import defpackage.cmrc;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class CastIdentity extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cmrc();
    public final String a;

    public CastIdentity(String str) {
        atzb.c(str.length() <= 32, "Cast id should be at most 32 characters.");
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof CastIdentity) {
            return Objects.equals(this.a, ((CastIdentity) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(17, this.a);
    }

    public final String toString() {
        return String.format(Locale.US, "DataElement<type: %s, Id: %s>", "CastId", this.a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.c(parcel, a);
    }
}
