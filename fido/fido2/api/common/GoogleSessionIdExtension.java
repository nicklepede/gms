package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.bdww;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class GoogleSessionIdExtension extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bdww();
    public final long a;

    public GoogleSessionIdExtension(long j) {
        Long.valueOf(j).getClass();
        this.a = j;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GoogleSessionIdExtension) && this.a == ((GoogleSessionIdExtension) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        long j = this.a;
        int a = atzr.a(parcel);
        atzr.q(parcel, 1, j);
        atzr.c(parcel, a);
    }
}
