package com.google.android.gms.wallet.shared;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wallet.firstparty.WalletCustomTheme;
import defpackage.atzr;
import defpackage.dloy;
import defpackage.dloz;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class ApplicationParameters extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dloz();
    public int a;
    public Account b;
    public Bundle c;
    public boolean d;
    public int e;
    public WalletCustomTheme f;
    public int g;
    public double h;
    public double i;
    public int j;
    public int k;

    public ApplicationParameters() {
        this.d = false;
        this.a = 1;
        this.e = 1;
        this.g = 0;
        this.j = 0;
        this.k = -1;
    }

    public static dloy a() {
        return new dloy(new ApplicationParameters());
    }

    public static dloy b(ApplicationParameters applicationParameters) {
        dloy a = a();
        a.f(applicationParameters.a);
        a.d(applicationParameters.b);
        a.b(applicationParameters.c);
        a.a(applicationParameters.d);
        a.i(applicationParameters.e);
        a.e(applicationParameters.f);
        a.c(applicationParameters.g);
        a.h(applicationParameters.h);
        a.g(applicationParameters.i);
        ApplicationParameters applicationParameters2 = a.a;
        applicationParameters2.j = applicationParameters.j;
        applicationParameters2.k = applicationParameters.k;
        return a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.o(parcel, 2, this.a);
        atzr.t(parcel, 3, this.b, i, false);
        atzr.g(parcel, 4, this.c, false);
        atzr.e(parcel, 5, this.d);
        atzr.o(parcel, 6, this.e);
        atzr.t(parcel, 7, this.f, i, false);
        atzr.o(parcel, 8, this.g);
        atzr.j(parcel, 9, this.h);
        atzr.j(parcel, 10, this.i);
        atzr.o(parcel, 11, this.j);
        atzr.o(parcel, 12, this.k);
        atzr.c(parcel, a);
    }

    public ApplicationParameters(int i, Account account, Bundle bundle, boolean z, int i2, WalletCustomTheme walletCustomTheme, int i3, double d, double d2, int i4, int i5) {
        this.a = i;
        this.b = account;
        this.c = bundle;
        this.d = z;
        this.e = i2;
        this.f = walletCustomTheme;
        this.g = i3;
        this.h = d;
        this.i = d2;
        this.j = i4;
        this.k = i5;
    }
}
