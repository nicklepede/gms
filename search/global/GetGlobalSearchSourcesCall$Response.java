package com.google.android.gms.search.global;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atau;
import defpackage.atzr;
import defpackage.daxi;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class GetGlobalSearchSourcesCall$Response extends AbstractSafeParcelable implements atau {
    public static final Parcelable.Creator CREATOR = new daxi();
    public Status a;
    public GetGlobalSearchSourcesCall$GlobalSearchSource[] b;

    public GetGlobalSearchSourcesCall$Response() {
    }

    @Override // defpackage.atau
    public final Status a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, this.a, i, false);
        atzr.J(parcel, 2, this.b, i);
        atzr.c(parcel, a);
    }

    public GetGlobalSearchSourcesCall$Response(Status status, GetGlobalSearchSourcesCall$GlobalSearchSource[] getGlobalSearchSourcesCall$GlobalSearchSourceArr) {
        this.a = status;
        this.b = getGlobalSearchSourcesCall$GlobalSearchSourceArr;
    }
}
