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
import defpackage.aczm;
import defpackage.aczn;
import defpackage.atzb;
import defpackage.atzr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class TokenRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new aczn();
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
        this.h = aczm.UNKNOWN.toString();
        this.k = false;
        this.l = true;
        this.m = "com.google";
        this.n = 0;
        this.s = false;
        this.w = true;
        this.x = 0;
        atzb.q(str2);
        this.b = str2;
        atzb.q(str3);
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

    public final aczm c() {
        return aczm.a(this.h);
    }

    public final void d(aczm aczmVar) {
        atzb.t(aczmVar, " Consent cannot be null");
        this.h = aczmVar.toString();
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
        int a = atzr.a(parcel);
        atzr.v(parcel, 2, str, false);
        atzr.v(parcel, 3, this.b, false);
        atzr.g(parcel, 4, this.c, false);
        atzr.t(parcel, 5, this.d, i, false);
        atzr.t(parcel, 6, this.e, i, false);
        atzr.e(parcel, 7, this.f);
        atzr.e(parcel, 8, this.g);
        atzr.v(parcel, 9, this.h, false);
        atzr.t(parcel, 10, this.i, i, false);
        atzr.t(parcel, 11, this.j, i, false);
        atzr.e(parcel, 13, this.k);
        atzr.e(parcel, 14, this.l);
        atzr.v(parcel, 15, this.m, false);
        atzr.o(parcel, 16, this.n);
        atzr.v(parcel, 17, this.o, false);
        atzr.v(parcel, 18, this.p, false);
        atzr.v(parcel, 19, this.q, false);
        atzr.q(parcel, 20, this.r);
        atzr.e(parcel, 21, this.s);
        atzr.v(parcel, 22, this.t, false);
        atzr.v(parcel, 23, this.u, false);
        atzr.o(parcel, 24, this.v);
        atzr.e(parcel, 25, this.w);
        atzr.o(parcel, 26, this.x);
        atzr.c(parcel, a);
    }

    public TokenRequest(String str, String str2, Bundle bundle, FACLConfig fACLConfig, PACLConfig pACLConfig, boolean z, boolean z2, String str3, AppDescription appDescription, CaptchaSolution captchaSolution, boolean z3, boolean z4, String str4, int i, String str5, String str6, String str7, long j, boolean z5, String str8, String str9, int i2, boolean z6, int i3) {
        this.c = new Bundle();
        aczm.UNKNOWN.toString();
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
