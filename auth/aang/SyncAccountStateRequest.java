package com.google.android.gms.auth.aang;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.eiig;
import defpackage.fhly;
import defpackage.ups;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class SyncAccountStateRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ups();
    public final GoogleAccount a;
    public final fhly b;

    public SyncAccountStateRequest(GoogleAccount googleAccount, int i) {
        this.a = googleAccount;
        fhly b = fhly.b(i);
        eiig.y(b, "Invalid value for FlowName enum");
        this.b = b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        GoogleAccount googleAccount = this.a;
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, googleAccount, i, false);
        arxc.o(parcel, 2, this.b.a());
        arxc.c(parcel, a);
    }
}
