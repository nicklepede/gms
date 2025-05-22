package com.google.android.gms.auth.managed.deviceposture;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.adrs;
import defpackage.atzr;
import defpackage.fxxm;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class PrepareEnvironmentResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new adrs();
    public final int a;

    public PrepareEnvironmentResponse(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PrepareEnvironmentResponse) && this.a == ((PrepareEnvironmentResponse) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "PrepareEnvironmentResponse(statusCode=" + this.a + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        fxxm.f(parcel, "dest");
        int i2 = this.a;
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, i2);
        atzr.c(parcel, a);
    }
}
