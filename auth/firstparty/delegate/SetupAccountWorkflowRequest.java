package com.google.android.gms.auth.firstparty.delegate;

import android.accounts.AccountAuthenticatorResponse;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.auth.firstparty.shared.ManagedAuthOptions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.adaa;
import defpackage.atzb;
import defpackage.atzr;
import j$.util.DesugarCollections;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class SetupAccountWorkflowRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new adaa();
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
        atzb.s(appDescription);
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
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, this.a);
        atzr.e(parcel, 2, this.b);
        atzr.e(parcel, 3, this.c);
        atzr.x(parcel, 4, this.d, false);
        atzr.g(parcel, 5, this.e, false);
        atzr.t(parcel, 6, this.f, i, false);
        atzr.e(parcel, 7, this.g);
        atzr.v(parcel, 8, this.h, false);
        atzr.t(parcel, 9, this.i, i, false);
        atzr.e(parcel, 10, this.j);
        atzr.e(parcel, 11, this.k);
        atzr.v(parcel, 12, this.l, false);
        atzr.v(parcel, 13, this.m, false);
        atzr.v(parcel, 14, this.n, false);
        atzr.v(parcel, 15, this.o, false);
        atzr.e(parcel, 16, this.p);
        atzr.e(parcel, 17, this.q);
        atzr.e(parcel, 18, this.r);
        atzr.e(parcel, 19, this.s);
        atzr.t(parcel, 20, this.t, i, false);
        atzr.v(parcel, 21, this.u, false);
        atzr.e(parcel, 22, this.v);
        atzr.o(parcel, 23, this.w);
        atzr.e(parcel, 24, this.x);
        atzr.c(parcel, a);
    }

    public SetupAccountWorkflowRequest(AppDescription appDescription, String str) {
        this.a = 14;
        this.e = new Bundle();
        this.t = new ManagedAuthOptions();
        this.f = appDescription;
        this.h = str;
    }
}
