package com.google.android.gms.constellation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.auzo;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class GetIidTokenRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new auzo();
    public final Long a;

    public GetIidTokenRequest(Long l) {
        this.a = l;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Long l = this.a;
        int a = atzr.a(parcel);
        atzr.I(parcel, 1, l);
        atzr.c(parcel, a);
    }
}
