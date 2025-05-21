package com.google.android.gms.search.ime;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.cyoj;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class GetIMEUpdatesCall$Request extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cyoj();
    public int a;
    public byte[] b;

    public GetIMEUpdatesCall$Request() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.a);
        arxc.i(parcel, 2, this.b, false);
        arxc.c(parcel, a);
    }

    public GetIMEUpdatesCall$Request(int i, byte[] bArr) {
        this.a = i;
        this.b = bArr;
    }
}
