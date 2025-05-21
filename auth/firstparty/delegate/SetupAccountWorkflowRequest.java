package com.google.android.gms.auth.firstparty.delegate;

import android.accounts.AccountAuthenticatorResponse;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.auth.firstparty.shared.ManagedAuthOptions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abaa;
import defpackage.arwm;
import defpackage.arxc;
import j$.util.DesugarCollections;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class SetupAccountWorkflowRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new abaa();
    public final int a;
    public boolean b;
    public boolean c;
    public List d;
    public final Bundle e;
    public final AppDescription f;
    public boolean g;
    public final String h;
    public AccountAuthenticatorResponse i;
    public boolean j;
    public boolean k;
    public String l;
    public String m;
    public String n;
    public String o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public ManagedAuthOptions t;
    public String u;

    @Deprecated
    public boolean v;
    public int w;
    public boolean x;

    public SetupAccountWorkflowRequest(int i, boolean z, boolean z2, List list, Bundle bundle, AppDescription appDescription, boolean z3, String str, AccountAuthenticatorResponse accountAuthenticatorResponse, boolean z4, boolean z5, String str2, String str3, String str4, String str5, boolean z6, boolean z7, boolean z8, boolean z9, ManagedAuthOptions managedAuthOptions, String str6, boolean z10, int i2, boolean z11) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = list;
        this.e = bundle;
        arwm.s(appDescription);
        this.f = appDescription;
        this.g = z3;
        this.h = str;
        this.i = accountAuthenticatorResponse;
        this.j = z4;
        this.k = z5;
        this.l = str2;
        this.m = str3;
        this.n = str4;
        this.o = str5;
        this.p = z6;
        this.q = z7;
        this.r = z8;
        this.s = z9;
        this.t = managedAuthOptions;
        this.u = str6;
        this.v = z10;
        this.w = i2;
        this.x = z11;
    }

    public final Bundle a() {
        return new Bundle(this.e);
    }

    public final List b() {
        List list = this.d;
        if (list == null) {
            return null;
        }
        return DesugarCollections.unmodifiableList(list);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.a);
        arxc.e(parcel, 2, this.b);
        arxc.e(parcel, 3, this.c);
        arxc.x(parcel, 4, this.d, false);
        arxc.g(parcel, 5, this.e, false);
        arxc.t(parcel, 6, this.f, i, false);
        arxc.e(parcel, 7, this.g);
        arxc.v(parcel, 8, this.h, false);
        arxc.t(parcel, 9, this.i, i, false);
        arxc.e(parcel, 10, this.j);
        arxc.e(parcel, 11, this.k);
        arxc.v(parcel, 12, this.l, false);
        arxc.v(parcel, 13, this.m, false);
        arxc.v(parcel, 14, this.n, false);
        arxc.v(parcel, 15, this.o, false);
        arxc.e(parcel, 16, this.p);
        arxc.e(parcel, 17, this.q);
        arxc.e(parcel, 18, this.r);
        arxc.e(parcel, 19, this.s);
        arxc.t(parcel, 20, this.t, i, false);
        arxc.v(parcel, 21, this.u, false);
        arxc.e(parcel, 22, this.v);
        arxc.o(parcel, 23, this.w);
        arxc.e(parcel, 24, this.x);
        arxc.c(parcel, a);
    }

    public SetupAccountWorkflowRequest(AppDescription appDescription, String str) {
        this.a = 14;
        this.e = new Bundle();
        this.t = new ManagedAuthOptions();
        this.f = appDescription;
        this.h = str;
    }
}
