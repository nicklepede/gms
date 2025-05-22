package com.google.android.gms.search.nativeapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.NativeApiInfo;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atau;
import defpackage.atzr;
import defpackage.dayr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class GetNativeApiInfoCall$Response extends AbstractSafeParcelable implements atau {
    public static final Parcelable.Creator CREATOR = new dayr();
    public Status a;
    public NativeApiInfo b;

    public GetNativeApiInfoCall$Response() {
    }

    @Override // defpackage.atau
    public final Status a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, this.a, i, false);
        atzr.t(parcel, 2, this.b, i, false);
        atzr.c(parcel, a);
    }

    public GetNativeApiInfoCall$Response(Status status, NativeApiInfo nativeApiInfo) {
        this.a = status;
        this.b = nativeApiInfo;
    }
}
