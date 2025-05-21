package com.google.android.gms.auth.api.accounttransfer.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.vph;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class RetrieveDataRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new vph();
    public final String a;

    public RetrieveDataRequest(String str) {
        arwm.s(str);
        this.a = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, 1);
        arxc.v(parcel, 2, this.a, false);
        arxc.c(parcel, a);
    }
}
