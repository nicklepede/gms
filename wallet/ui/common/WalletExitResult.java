package com.google.android.gms.wallet.ui.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wallet.firstparty.ExitResult;
import defpackage.arxc;
import defpackage.diot;
import defpackage.djfd;
import defpackage.djfe;
import defpackage.emdq;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class WalletExitResult extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new djfe();
    public int a;
    public int b;
    public int c;
    final String d;
    public int e;
    public int f;

    private WalletExitResult() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = "";
        this.e = 0;
        this.f = 0;
    }

    public static djfd b() {
        return new djfd(new WalletExitResult());
    }

    public final ExitResult a() {
        diot a = ExitResult.a();
        a.b(this.f);
        ExitResult exitResult = a.a;
        exitResult.c = this.c;
        a.a(this.d);
        return exitResult;
    }

    public final int c() {
        return emdq.a(this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.a);
        arxc.o(parcel, 2, this.b);
        arxc.o(parcel, 3, this.c);
        arxc.v(parcel, 4, this.d, false);
        arxc.o(parcel, 5, this.e);
        arxc.o(parcel, 6, this.f);
        arxc.c(parcel, a);
    }

    public WalletExitResult(int i, int i2, int i3, String str, int i4, int i5) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = str;
        this.e = i4;
        this.f = i5;
    }
}
