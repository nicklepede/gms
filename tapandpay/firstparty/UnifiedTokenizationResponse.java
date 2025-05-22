package com.google.android.gms.tapandpay.firstparty;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.dhje;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class UnifiedTokenizationResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dhje();
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
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, this.a);
        atzr.i(parcel, 2, this.b, false);
        atzr.F(parcel, 3, this.c);
        atzr.t(parcel, 4, this.d, i, false);
        atzr.c(parcel, a);
    }
}
