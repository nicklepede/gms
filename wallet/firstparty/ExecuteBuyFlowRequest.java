package com.google.android.gms.wallet.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.dios;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class ExecuteBuyFlowRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dios();
    public final byte[] a;
    public final byte[] b;
    public final WalletCustomTheme c;

    public ExecuteBuyFlowRequest(byte[] bArr, byte[] bArr2, WalletCustomTheme walletCustomTheme) {
        this.a = bArr;
        this.b = bArr2;
        this.c = walletCustomTheme;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        byte[] bArr = this.a;
        int a = arxc.a(parcel);
        arxc.i(parcel, 2, bArr, false);
        arxc.i(parcel, 3, this.b, false);
        arxc.t(parcel, 4, this.c, i, false);
        arxc.c(parcel, a);
    }
}
