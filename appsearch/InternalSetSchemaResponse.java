package com.google.android.gms.appsearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.udn;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class InternalSetSchemaResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new udn();
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
        int a = arxc.a(parcel);
        arxc.e(parcel, 1, z);
        arxc.t(parcel, 2, this.b, i, false);
        arxc.v(parcel, 3, this.c, false);
        arxc.c(parcel, a);
    }
}
