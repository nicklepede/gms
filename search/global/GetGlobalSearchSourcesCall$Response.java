package com.google.android.gms.search.global;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.aqyf;
import defpackage.arxc;
import defpackage.cynk;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class GetGlobalSearchSourcesCall$Response extends AbstractSafeParcelable implements aqyf {
    public static final Parcelable.Creator CREATOR = new cynk();
    public Status a;
    public GetGlobalSearchSourcesCall$GlobalSearchSource[] b;

    public GetGlobalSearchSourcesCall$Response() {
    }

    @Override // defpackage.aqyf
    public final Status a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, this.a, i, false);
        arxc.J(parcel, 2, this.b, i);
        arxc.c(parcel, a);
    }

    public GetGlobalSearchSourcesCall$Response(Status status, GetGlobalSearchSourcesCall$GlobalSearchSource[] getGlobalSearchSourcesCall$GlobalSearchSourceArr) {
        this.a = status;
        this.b = getGlobalSearchSourcesCall$GlobalSearchSourceArr;
    }
}
