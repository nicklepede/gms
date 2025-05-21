package com.google.android.gms.auth.firstparty.dataservice;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.auth.firstparty.shared.CaptchaSolution;
import com.google.android.gms.auth.firstparty.shared.FACLConfig;
import com.google.android.gms.auth.firstparty.shared.PACLConfig;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.aazm;
import defpackage.aazn;
import defpackage.arwm;
import defpackage.arxc;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class TokenRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new aazn();
    public final String a;
    public final String b;
    Bundle c;
    public FACLConfig d;
    public PACLConfig e;
    boolean f;
    boolean g;
    String h;
    public AppDescription i;
    CaptchaSolution j;
    public boolean k;
    public boolean l;
    String m;
    public int n;
    public String o;
    public String p;
    public String q;
    final long r;
    boolean s;
    public String t;
    public String u;
    public int v;
    public boolean w;
    public int x;

    public TokenRequest(Account account, String str) {
        String str2 = account.name;
        String str3 = account.type;
        this.c = new Bundle();
        this.h = aazm.UNKNOWN.toString();
        this.k = false;
        this.l = true;
        this.m = "com.google";
        this.n = 0;
        this.s = false;
        this.w = true;
        this.x = 0;
        arwm.q(str2);
        this.b = str2;
        arwm.q(str3);
        this.m = str3;
        this.a = str;
        this.r = SystemClock.elapsedRealtime();
    }

    public final Account a() {
        return new Account(this.b, this.m);
    }

    public final Bundle b() {
        return new Bundle(this.c);
    }

    public final aazm c() {
        return aazm.a(this.h);
    }

    public final void d(aazm aazmVar) {
        arwm.t(aazmVar, " Consent cannot be null");
        this.h = aazmVar.toString();
    }

    @Deprecated
    public final void e(boolean z) {
        this.x = true != z ? 2 : 1;
        this.s = z;
    }

    public final void f(Bundle bundle) {
        this.c.clear();
        if (bundle != null) {
            this.c.putAll(bundle);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 2, str, false);
        arxc.v(parcel, 3, this.b, false);
        arxc.g(parcel, 4, this.c, false);
        arxc.t(parcel, 5, this.d, i, false);
        arxc.t(parcel, 6, this.e, i, false);
        arxc.e(parcel, 7, this.f);
        arxc.e(parcel, 8, this.g);
        arxc.v(parcel, 9, this.h, false);
        arxc.t(parcel, 10, this.i, i, false);
        arxc.t(parcel, 11, this.j, i, false);
        arxc.e(parcel, 13, this.k);
        arxc.e(parcel, 14, this.l);
        arxc.v(parcel, 15, this.m, false);
        arxc.o(parcel, 16, this.n);
        arxc.v(parcel, 17, this.o, false);
        arxc.v(parcel, 18, this.p, false);
        arxc.v(parcel, 19, this.q, false);
        arxc.q(parcel, 20, this.r);
        arxc.e(parcel, 21, this.s);
        arxc.v(parcel, 22, this.t, false);
        arxc.v(parcel, 23, this.u, false);
        arxc.o(parcel, 24, this.v);
        arxc.e(parcel, 25, this.w);
        arxc.o(parcel, 26, this.x);
        arxc.c(parcel, a);
    }

    public TokenRequest(String str, String str2, Bundle bundle, FACLConfig fACLConfig, PACLConfig pACLConfig, boolean z, boolean z2, String str3, AppDescription appDescription, CaptchaSolution captchaSolution, boolean z3, boolean z4, String str4, int i, String str5, String str6, String str7, long j, boolean z5, String str8, String str9, int i2, boolean z6, int i3) {
        this.c = new Bundle();
        aazm.UNKNOWN.toString();
        this.a = str;
        this.b = str2;
        this.c = bundle;
        this.d = fACLConfig;
        this.e = pACLConfig;
        this.f = z;
        this.g = z2;
        this.h = str3;
        this.i = appDescription;
        this.j = captchaSolution;
        this.k = z3;
        this.l = z4;
        this.m = str4;
        this.n = i;
        this.o = str5;
        this.p = str6;
        this.q = str7;
        this.r = j;
        this.s = z5;
        this.t = str8;
        this.u = str9;
        this.v = i2;
        this.w = z6;
        this.x = i3;
    }
}
