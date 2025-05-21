package com.google.android.gms.tapandpay.firstparty;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.deya;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class UnifiedTokenizationResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new deya();
    final int a;
    final byte[] b;
    final Integer c;
    final PendingIntent d;

    public UnifiedTokenizationResponse(int i, byte[] bArr, Integer num, PendingIntent pendingIntent) {
        this.a = i;
        this.b = bArr;
        this.c = num;
        this.d = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.a);
        arxc.i(parcel, 2, this.b, false);
        arxc.F(parcel, 3, this.c);
        arxc.t(parcel, 4, this.d, i, false);
        arxc.c(parcel, a);
    }
}
