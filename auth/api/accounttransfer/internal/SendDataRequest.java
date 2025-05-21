package com.google.android.gms.auth.api.accounttransfer.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.vpi;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class SendDataRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new vpi();
    public final String a;
    public final byte[] b;

    public SendDataRequest(String str, byte[] bArr) {
        arwm.s(str);
        this.a = str;
        arwm.s(bArr);
        this.b = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, 1);
        arxc.v(parcel, 2, this.a, false);
        arxc.i(parcel, 3, this.b, false);
        arxc.c(parcel, a);
    }
}
