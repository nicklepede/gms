package com.google.android.gms.auth.firstparty.delegate;

import android.accounts.AccountAuthenticatorResponse;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.adab;
import defpackage.atzb;
import defpackage.atzr;
import j$.util.DesugarCollections;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class StartAddAccountSessionWorkflowRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new adab();
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
        atzb.s(appDescription);
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
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, this.a);
        atzr.x(parcel, 2, b(), false);
        atzr.g(parcel, 3, a(), false);
        atzr.t(parcel, 4, this.d, i, false);
        atzr.v(parcel, 5, this.e, false);
        atzr.t(parcel, 6, this.f, i, false);
        atzr.e(parcel, 7, this.g);
        atzr.e(parcel, 8, this.h);
        atzr.v(parcel, 9, this.i, false);
        atzr.v(parcel, 10, this.j, false);
        atzr.e(parcel, 11, this.k);
        atzr.e(parcel, 12, this.l);
        atzr.c(parcel, a);
    }
}
