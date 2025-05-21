package com.google.android.gms.search.ime;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.PIMEUpdateResponse;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.aqyf;
import defpackage.arxc;
import defpackage.cyok;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class GetIMEUpdatesCall$Response extends AbstractSafeParcelable implements aqyf {
    public static final Parcelable.Creator CREATOR = new cyok();
    public Status a;
    public PIMEUpdateResponse b;

    public GetIMEUpdatesCall$Response() {
    }

    @Override // defpackage.aqyf
    public final Status a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, this.a, i, false);
        arxc.t(parcel, 2, this.b, i, false);
        arxc.c(parcel, a);
    }

    public GetIMEUpdatesCall$Response(Status status, PIMEUpdateResponse pIMEUpdateResponse) {
        this.a = status;
        this.b = pIMEUpdateResponse;
    }
}
