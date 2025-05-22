package com.google.android.gms.auth.firstparty.dataservice;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.auth.AuthzenBeginTxData;
import com.google.android.gms.auth.ResolutionData;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.auth.firstparty.shared.CaptchaChallenge;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.aczo;
import defpackage.adau;
import defpackage.atzb;
import defpackage.atzr;
import defpackage.wkn;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class TokenResponse extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new aczo();
    AuthzenBeginTxData A;
    public boolean B;
    final int a;

    @Deprecated
    String b;
    String c;

    @Deprecated
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public CaptchaChallenge n;
    public final List o;
    public String p;
    public String q;
    public boolean r;
    public int s;
    PostSignInData t;
    public Account u;
    public String v;
    public TokenData w;
    public Bundle x;
    public String y;
    public ResolutionData z;

    public TokenResponse() {
        this.x = new Bundle();
        this.a = 9;
        this.o = new ArrayList();
    }

    public final adau a() {
        return adau.a(this.c);
    }

    public final List b() {
        return DesugarCollections.unmodifiableList(this.o);
    }

    public final void c(Account account) {
        atzb.t(account, "Account can't be null.");
        this.u = account;
        this.b = account.name;
    }

    public final void d(adau adauVar) {
        atzb.s(adauVar);
        this.c = adauVar.ak;
    }

    public final void e(TokenData tokenData) {
        if (tokenData == null) {
            tokenData = null;
            this.d = null;
        } else {
            this.d = tokenData.b;
        }
        this.w = tokenData;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, this.a);
        atzr.v(parcel, 2, this.b, false);
        atzr.v(parcel, 3, this.c, false);
        atzr.v(parcel, 4, this.d, false);
        atzr.v(parcel, 5, this.e, false);
        atzr.v(parcel, 6, this.f, false);
        atzr.v(parcel, 7, this.g, false);
        atzr.v(parcel, 8, this.h, false);
        atzr.v(parcel, 9, this.i, false);
        atzr.e(parcel, 10, this.j);
        atzr.e(parcel, 11, this.k);
        atzr.e(parcel, 12, this.l);
        atzr.e(parcel, 13, this.m);
        atzr.t(parcel, 14, this.n, i, false);
        atzr.y(parcel, 15, this.o, false);
        atzr.v(parcel, 16, this.p, false);
        atzr.v(parcel, 17, this.q, false);
        atzr.e(parcel, 19, this.r);
        atzr.o(parcel, 20, this.s);
        atzr.t(parcel, 21, this.t, i, false);
        atzr.t(parcel, 22, this.u, i, false);
        atzr.v(parcel, 26, this.v, false);
        atzr.t(parcel, 27, this.w, i, false);
        atzr.g(parcel, 28, this.x, false);
        atzr.v(parcel, 29, this.y, false);
        atzr.t(parcel, 30, this.z, i, false);
        atzr.t(parcel, 31, this.A, i, false);
        atzr.e(parcel, 32, this.B);
        atzr.c(parcel, a);
    }

    public TokenResponse(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, boolean z2, boolean z3, boolean z4, CaptchaChallenge captchaChallenge, List list, String str9, String str10, boolean z5, int i2, PostSignInData postSignInData, Account account, String str11, TokenData tokenData, Bundle bundle, String str12, ResolutionData resolutionData, AuthzenBeginTxData authzenBeginTxData, boolean z6) {
        this.x = new Bundle();
        this.a = i;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = str8;
        this.j = z;
        this.k = z2;
        this.l = z3;
        this.m = z4;
        this.n = captchaChallenge;
        this.o = list == null ? new ArrayList() : list;
        this.p = str9;
        this.q = str10;
        this.r = z5;
        this.s = i2;
        this.t = postSignInData;
        this.v = str11;
        this.x = bundle;
        this.y = str12;
        this.z = resolutionData;
        this.A = authzenBeginTxData;
        this.B = z6;
        if (account != null) {
            c(account);
        } else if (TextUtils.isEmpty(str)) {
            this.b = null;
            this.u = null;
        } else {
            c(new Account(str, "com.google"));
        }
        if (str3 != null && tokenData == null) {
            wkn wknVar = new wkn();
            wknVar.a = str3;
            e(wknVar.a());
            return;
        }
        e(tokenData);
    }
}
