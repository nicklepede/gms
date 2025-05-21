package com.google.android.gms.backup.extension.backup;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.aixb;
import defpackage.arxc;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class ClientInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aixb();
    public final int a;

    public ClientInfo(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof ClientInfo) && this.a == ((ClientInfo) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "ClientInfo{supportedApiVersionNumber=" + this.a + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, i2);
        arxc.c(parcel, a);
    }
}
