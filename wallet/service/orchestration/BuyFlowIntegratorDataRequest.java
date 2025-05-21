package com.google.android.gms.wallet.service.orchestration;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.diyw;
import defpackage.diyx;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class BuyFlowIntegratorDataRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new diyx();
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

    public static diyw a() {
        return new diyw(new BuyFlowIntegratorDataRequest(new byte[0], new byte[0], new byte[0], null, Bundle.EMPTY));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.i(parcel, 2, this.a, false);
        arxc.i(parcel, 3, this.b, false);
        arxc.i(parcel, 4, this.c, false);
        arxc.v(parcel, 5, this.d, false);
        arxc.g(parcel, 6, this.e, false);
        arxc.c(parcel, a);
    }

    BuyFlowIntegratorDataRequest() {
        this(new byte[0], new byte[0], new byte[0], null, Bundle.EMPTY);
    }
}
