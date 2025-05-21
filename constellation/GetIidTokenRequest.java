package com.google.android.gms.constellation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.asvs;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class GetIidTokenRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new asvs();
    public final Long a;

    public GetIidTokenRequest(Long l) {
        this.a = l;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Long l = this.a;
        int a = arxc.a(parcel);
        arxc.I(parcel, 1, l);
        arxc.c(parcel, a);
    }
}
