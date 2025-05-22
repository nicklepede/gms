package com.google.android.gms.wallet.service.orchestration;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.dlkp;
import defpackage.dlkq;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class BuyFlowIntegratorDataRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dlkq();
    public byte[] a;
    public byte[] b;
    public byte[] c;
    public String d;
    public Bundle e;

    public BuyFlowIntegratorDataRequest(byte[] bArr, byte[] bArr2, byte[] bArr3, String str, Bundle bundle) {
        this.a = bArr;
        this.b = bArr2;
        this.c = bArr3;
        this.d = str;
        this.e = bundle;
    }

    public static dlkp a() {
        return new dlkp(new BuyFlowIntegratorDataRequest(new byte[0], new byte[0], new byte[0], null, Bundle.EMPTY));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.i(parcel, 2, this.a, false);
        atzr.i(parcel, 3, this.b, false);
        atzr.i(parcel, 4, this.c, false);
        atzr.v(parcel, 5, this.d, false);
        atzr.g(parcel, 6, this.e, false);
        atzr.c(parcel, a);
    }

    BuyFlowIntegratorDataRequest() {
        this(new byte[0], new byte[0], new byte[0], null, Bundle.EMPTY);
    }
}
