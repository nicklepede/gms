package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.dkkt;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class LogEventRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dkkt();
    public final byte[] a;

    public LogEventRequest(byte[] bArr) {
        this.a = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        byte[] bArr = this.a;
        int a = arxc.a(parcel);
        arxc.i(parcel, 1, bArr, false);
        arxc.c(parcel, a);
    }
}
