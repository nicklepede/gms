package com.google.android.gms.wallet.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.dipe;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class GetClientTokenRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dipe();
    public WalletCustomTheme a;
    public boolean b;
    public int c;

    public GetClientTokenRequest() {
        this.c = 1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.t(parcel, 2, this.a, i, false);
        arxc.e(parcel, 3, this.b);
        arxc.o(parcel, 4, this.c);
        arxc.c(parcel, a);
    }

    public GetClientTokenRequest(WalletCustomTheme walletCustomTheme) {
        this(walletCustomTheme, false, 1);
    }

    public GetClientTokenRequest(WalletCustomTheme walletCustomTheme, boolean z, int i) {
        this.a = walletCustomTheme;
        this.b = z;
        this.c = i;
        if (walletCustomTheme == null) {
            throw new NullPointerException("WalletCustomTheme is required");
        }
    }
}
