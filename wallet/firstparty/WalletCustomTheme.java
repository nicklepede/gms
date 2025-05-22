package com.google.android.gms.wallet.firstparty;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.dlav;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class WalletCustomTheme extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dlav();
    public int a;
    public int b;
    public int c;
    Bundle d;
    public final String e;

    public WalletCustomTheme(int i, Bundle bundle, String str, int i2, int i3) {
        this.d = bundle;
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.e = str;
    }

    public final int a() {
        return d().getInt("customThemeStyle", 0);
    }

    public final int b() {
        return d().getInt("setupWizardGlifTheme", 0);
    }

    public final int c() {
        return d().getInt("windowTransitionsStyleForEndTransition");
    }

    public final Bundle d() {
        if (this.d == null) {
            this.d = new Bundle();
        }
        return this.d;
    }

    public final void e(int i) {
        d().putInt("customThemeStyle", i);
    }

    public final void f(int i) {
        d().putInt("setupWizardGlifTheme", i);
    }

    public final void g(int i) {
        this.a = i;
        this.b = i;
        this.c = i;
    }

    public final void h(int i) {
        d().putInt("windowTransitionsStyle", i);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.o(parcel, 2, this.a);
        atzr.g(parcel, 3, this.d, false);
        atzr.v(parcel, 4, this.e, false);
        atzr.o(parcel, 5, this.b);
        atzr.o(parcel, 6, this.c);
        atzr.c(parcel, a);
    }

    public WalletCustomTheme() {
        this.b = 0;
        this.c = 0;
        this.a = 0;
        this.d = new Bundle();
        this.e = "";
    }
}
