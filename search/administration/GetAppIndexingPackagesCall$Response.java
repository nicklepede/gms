package com.google.android.gms.search.administration;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.aqyf;
import defpackage.arxc;
import defpackage.cykm;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class GetAppIndexingPackagesCall$Response extends AbstractSafeParcelable implements aqyf {
    public static final Parcelable.Creator CREATOR = new cykm();
    public final Status a;
    public final String[] b;
    public final String[] c;

    public GetAppIndexingPackagesCall$Response(Status status, String[] strArr, String[] strArr2) {
        this.a = status;
        this.b = strArr;
        this.c = strArr2;
    }

    @Override // defpackage.aqyf
    public final Status a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Status status = this.a;
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, status, i, false);
        arxc.w(parcel, 2, this.b, false);
        arxc.w(parcel, 3, this.c, false);
        arxc.c(parcel, a);
    }
}
