package com.google.android.gms.auth.firstparty.delegate;

import android.accounts.AccountAuthenticatorResponse;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abab;
import defpackage.arwm;
import defpackage.arxc;
import j$.util.DesugarCollections;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class StartAddAccountSessionWorkflowRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new abab();
    public final int a;
    public List b;
    public final Bundle c;
    public final AppDescription d;
    public final String e;
    public AccountAuthenticatorResponse f;
    public boolean g;
    public boolean h;
    public String i;
    public String j;
    public boolean k;
    public boolean l;

    public StartAddAccountSessionWorkflowRequest(int i, List list, Bundle bundle, AppDescription appDescription, String str, AccountAuthenticatorResponse accountAuthenticatorResponse, boolean z, boolean z2, String str2, String str3, boolean z3, boolean z4) {
        this.a = i;
        this.b = list;
        this.c = bundle;
        arwm.s(appDescription);
        this.d = appDescription;
        this.e = str;
        this.f = accountAuthenticatorResponse;
        this.g = z;
        this.h = z2;
        this.i = str2;
        this.j = str3;
        this.k = z3;
        this.l = z4;
    }

    public final Bundle a() {
        return new Bundle(this.c);
    }

    public final List b() {
        List list = this.b;
        if (list == null) {
            return null;
        }
        return DesugarCollections.unmodifiableList(list);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.a);
        arxc.x(parcel, 2, b(), false);
        arxc.g(parcel, 3, a(), false);
        arxc.t(parcel, 4, this.d, i, false);
        arxc.v(parcel, 5, this.e, false);
        arxc.t(parcel, 6, this.f, i, false);
        arxc.e(parcel, 7, this.g);
        arxc.e(parcel, 8, this.h);
        arxc.v(parcel, 9, this.i, false);
        arxc.v(parcel, 10, this.j, false);
        arxc.e(parcel, 11, this.k);
        arxc.e(parcel, 12, this.l);
        arxc.c(parcel, a);
    }
}
