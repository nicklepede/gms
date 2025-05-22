package com.google.android.gms.search.ime;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.dayh;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class GetIMEUpdatesCall$Request extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dayh();
    public int a;
    public byte[] b;

    public GetIMEUpdatesCall$Request() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, this.a);
        atzr.i(parcel, 2, this.b, false);
        atzr.c(parcel, a);
    }

    public GetIMEUpdatesCall$Request(int i, byte[] bArr) {
        this.a = i;
        this.b = bArr;
    }
}
