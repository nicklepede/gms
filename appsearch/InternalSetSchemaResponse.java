package com.google.android.gms.appsearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.vzm;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class InternalSetSchemaResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new vzm();
    public final boolean a;
    public final SetSchemaResponse b;
    public final String c;

    public InternalSetSchemaResponse(boolean z, SetSchemaResponse setSchemaResponse, String str) {
        Objects.requireNonNull(setSchemaResponse);
        this.a = z;
        this.b = setSchemaResponse;
        this.c = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.a;
        int a = atzr.a(parcel);
        atzr.e(parcel, 1, z);
        atzr.t(parcel, 2, this.b, i, false);
        atzr.v(parcel, 3, this.c, false);
        atzr.c(parcel, a);
    }
}
