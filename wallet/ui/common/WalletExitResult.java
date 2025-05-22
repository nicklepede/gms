package com.google.android.gms.wallet.ui.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wallet.firstparty.ExitResult;
import defpackage.atzr;
import defpackage.dlae;
import defpackage.dlqw;
import defpackage.dlqx;
import defpackage.eore;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class WalletExitResult extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new dlqx();
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

    public static dlqw b() {
        return new dlqw(new WalletExitResult());
    }

    public final ExitResult a() {
        dlae a = ExitResult.a();
        a.b(this.f);
        ExitResult exitResult = a.a;
        exitResult.c = this.c;
        a.a(this.d);
        return exitResult;
    }

    public final int c() {
        return eore.a(this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, this.a);
        atzr.o(parcel, 2, this.b);
        atzr.o(parcel, 3, this.c);
        atzr.v(parcel, 4, this.d, false);
        atzr.o(parcel, 5, this.e);
        atzr.o(parcel, 6, this.f);
        atzr.c(parcel, a);
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
