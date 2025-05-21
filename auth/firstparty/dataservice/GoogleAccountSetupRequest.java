package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.shared.AccountCredentials;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.auth.firstparty.shared.CaptchaSolution;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.aayx;
import defpackage.arxc;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class GoogleAccountSetupRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aayx();
    final int a;
    final Bundle b;
    public boolean c;
    public boolean d;
    boolean e;
    public String f;
    public String g;
    public String h;
    String i;
    boolean j;
    boolean k;
    public boolean l;
    String m;
    public AppDescription n;
    public AccountCredentials o;
    public CaptchaSolution p;
    public String q;
    public String r;

    public GoogleAccountSetupRequest(int i, Bundle bundle, boolean z, boolean z2, boolean z3, String str, String str2, String str3, String str4, boolean z4, boolean z5, boolean z6, String str5, AppDescription appDescription, AccountCredentials accountCredentials, CaptchaSolution captchaSolution, String str6, String str7) {
        this.a = i;
        this.b = bundle;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = str;
        this.g = str2;
        this.h = str3;
        this.i = str4;
        this.j = z4;
        this.k = z5;
        this.l = z6;
        this.m = str5;
        this.n = appDescription;
        this.o = accountCredentials;
        this.p = captchaSolution;
        this.q = str6;
        this.r = str7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.a);
        arxc.g(parcel, 2, this.b, false);
        arxc.e(parcel, 3, this.c);
        arxc.e(parcel, 4, this.d);
        arxc.e(parcel, 5, this.e);
        arxc.v(parcel, 6, this.f, false);
        arxc.v(parcel, 7, this.g, false);
        arxc.v(parcel, 8, this.h, false);
        arxc.v(parcel, 9, this.i, false);
        arxc.e(parcel, 10, this.j);
        arxc.e(parcel, 11, this.k);
        arxc.e(parcel, 12, this.l);
        arxc.v(parcel, 13, this.m, false);
        arxc.t(parcel, 14, this.n, i, false);
        arxc.t(parcel, 15, this.o, i, false);
        arxc.t(parcel, 16, this.p, i, false);
        arxc.v(parcel, 17, this.q, false);
        arxc.v(parcel, 18, this.r, false);
        arxc.c(parcel, a);
    }

    public GoogleAccountSetupRequest() {
        this.a = 1;
        this.b = new Bundle();
    }
}
