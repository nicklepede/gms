package com.google.android.gms.wallet.service.orchestration;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.diyy;
import defpackage.diyz;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class BuyFlowIntegratorDataResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new diyz();
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

    public static diyy a() {
        return new diyy(new BuyFlowIntegratorDataResponse(new byte[0], new byte[0], new byte[0], null, 1));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.i(parcel, 2, this.b, false);
        arxc.i(parcel, 3, this.c, false);
        arxc.t(parcel, 4, this.d, i, false);
        arxc.o(parcel, 5, this.e);
        arxc.i(parcel, 6, this.a, false);
        arxc.c(parcel, a);
    }

    BuyFlowIntegratorDataResponse() {
        this(new byte[0], new byte[0], new byte[0], null, 1);
    }
}
