package com.google.android.gms.wallet.service.orchestration;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.dlkr;
import defpackage.dlks;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class BuyFlowIntegratorDataResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dlks();
    public byte[] a;
    public byte[] b;
    public byte[] c;
    public PendingIntent d;
    public int e;

    public BuyFlowIntegratorDataResponse(byte[] bArr, byte[] bArr2, byte[] bArr3, PendingIntent pendingIntent, int i) {
        this.a = bArr;
        this.b = bArr2;
        this.c = bArr3;
        this.d = pendingIntent;
        this.e = i;
    }

    public static dlkr a() {
        return new dlkr(new BuyFlowIntegratorDataResponse(new byte[0], new byte[0], new byte[0], null, 1));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.i(parcel, 2, this.b, false);
        atzr.i(parcel, 3, this.c, false);
        atzr.t(parcel, 4, this.d, i, false);
        atzr.o(parcel, 5, this.e);
        atzr.i(parcel, 6, this.a, false);
        atzr.c(parcel, a);
    }

    BuyFlowIntegratorDataResponse() {
        this(new byte[0], new byte[0], new byte[0], null, 1);
    }
}
