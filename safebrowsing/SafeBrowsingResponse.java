package com.google.android.gms.safebrowsing;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.dagr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class SafeBrowsingResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dagr();
    public final int a;
    public final int b;
    public final int[] c;

    public SafeBrowsingResponse(int i, int i2, int[] iArr) {
        this.b = i2;
        this.a = i;
        this.c = iArr;
    }

    public final String toString() {
        return "SafeBrowsingResponse{threatType=" + this.b + ", status=" + this.a + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = atzr.a(parcel);
        atzr.o(parcel, 2, i2);
        atzr.o(parcel, 3, this.b);
        atzr.p(parcel, 4, this.c, false);
        atzr.c(parcel, a);
    }
}
