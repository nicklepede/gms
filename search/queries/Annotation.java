package com.google.android.gms.search.queries;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.dazb;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class Annotation extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dazb();
    public final int a;
    public final byte[] b;

    public Annotation(int i, byte[] bArr) {
        this.a = i;
        this.b = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, this.a);
        atzr.i(parcel, 5, this.b, false);
        atzr.c(parcel, a);
    }
}
