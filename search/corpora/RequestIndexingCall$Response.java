package com.google.android.gms.search.corpora;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.aqyf;
import defpackage.arxc;
import defpackage.cymj;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class RequestIndexingCall$Response extends AbstractSafeParcelable implements aqyf {
    public static final Parcelable.Creator CREATOR = new cymj();
    public Status a;
    public boolean b;

    public RequestIndexingCall$Response() {
    }

    @Override // defpackage.aqyf
    public final Status a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, this.a, i, false);
        arxc.e(parcel, 2, this.b);
        arxc.c(parcel, a);
    }

    public RequestIndexingCall$Response(Status status, boolean z) {
        this.a = status;
        this.b = z;
    }
}
