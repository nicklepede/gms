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
import defpackage.aazo;
import defpackage.abau;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.uoo;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class TokenResponse extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new aazo();
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

    public final abau a() {
        return abau.a(this.c);
    }

    public final List b() {
        return DesugarCollections.unmodifiableList(this.o);
    }

    public final void c(Account account) {
        arwm.t(account, "Account can't be null.");
        this.u = account;
        this.b = account.name;
    }

    public final void d(abau abauVar) {
        arwm.s(abauVar);
        this.c = abauVar.ak;
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
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.a);
        arxc.v(parcel, 2, this.b, false);
        arxc.v(parcel, 3, this.c, false);
        arxc.v(parcel, 4, this.d, false);
        arxc.v(parcel, 5, this.e, false);
        arxc.v(parcel, 6, this.f, false);
        arxc.v(parcel, 7, this.g, false);
        arxc.v(parcel, 8, this.h, false);
        arxc.v(parcel, 9, this.i, false);
        arxc.e(parcel, 10, this.j);
        arxc.e(parcel, 11, this.k);
        arxc.e(parcel, 12, this.l);
        arxc.e(parcel, 13, this.m);
        arxc.t(parcel, 14, this.n, i, false);
        arxc.y(parcel, 15, this.o, false);
        arxc.v(parcel, 16, this.p, false);
        arxc.v(parcel, 17, this.q, false);
        arxc.e(parcel, 19, this.r);
        arxc.o(parcel, 20, this.s);
        arxc.t(parcel, 21, this.t, i, false);
        arxc.t(parcel, 22, this.u, i, false);
        arxc.v(parcel, 26, this.v, false);
        arxc.t(parcel, 27, this.w, i, false);
        arxc.g(parcel, 28, this.x, false);
        arxc.v(parcel, 29, this.y, false);
        arxc.t(parcel, 30, this.z, i, false);
        arxc.t(parcel, 31, this.A, i, false);
        arxc.e(parcel, 32, this.B);
        arxc.c(parcel, a);
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
            uoo uooVar = new uoo();
            uooVar.a = str3;
            e(uooVar.a());
            return;
        }
        e(tokenData);
    }
}
