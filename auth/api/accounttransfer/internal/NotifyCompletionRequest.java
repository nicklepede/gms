package com.google.android.gms.auth.api.accounttransfer.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.vpg;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class NotifyCompletionRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new vpg();
    public final String a;
    public final int b;

    public NotifyCompletionRequest(String str, int i) {
        arwm.s(str);
        this.a = str;
        this.b = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, 1);
        arxc.v(parcel, 2, this.a, false);
        arxc.o(parcel, 3, this.b);
        arxc.c(parcel, a);
    }
}
