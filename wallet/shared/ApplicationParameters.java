package com.google.android.gms.wallet.shared;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wallet.firstparty.WalletCustomTheme;
import defpackage.arxc;
import defpackage.djdf;
import defpackage.djdg;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class ApplicationParameters extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new djdg();
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

    public static djdf a() {
        return new djdf(new ApplicationParameters());
    }

    public static djdf b(ApplicationParameters applicationParameters) {
        djdf a = a();
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
        int a = arxc.a(parcel);
        arxc.o(parcel, 2, this.a);
        arxc.t(parcel, 3, this.b, i, false);
        arxc.g(parcel, 4, this.c, false);
        arxc.e(parcel, 5, this.d);
        arxc.o(parcel, 6, this.e);
        arxc.t(parcel, 7, this.f, i, false);
        arxc.o(parcel, 8, this.g);
        arxc.j(parcel, 9, this.h);
        arxc.j(parcel, 10, this.i);
        arxc.o(parcel, 11, this.j);
        arxc.o(parcel, 12, this.k);
        arxc.c(parcel, a);
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
