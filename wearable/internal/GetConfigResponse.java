package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wearable.ConnectionConfiguration;
import defpackage.arxc;
import defpackage.dkjm;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
@Deprecated
/* loaded from: classes7.dex */
public class GetConfigResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dkjm();
    public final int a;
    public final ConnectionConfiguration b;

    public GetConfigResponse(int i, ConnectionConfiguration connectionConfiguration) {
        this.a = i;
        this.b = connectionConfiguration;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.o(parcel, 2, this.a);
        arxc.t(parcel, 3, this.b, i, false);
        arxc.c(parcel, a);
    }
}
