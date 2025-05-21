package com.google.android.gms.auth.uiflows.addaccount;

import android.accounts.AccountAuthenticatorResponse;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import com.google.android.gms.R;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.auth.firstparty.shared.SupervisedAccountOptions;
import com.google.android.gms.auth.uiflows.controller.Controller;
import com.google.android.gms.auth.uiflows.minutemaid.MinuteMaidChimeraActivity;
import com.google.android.gms.chimera.modules.auth.account.base.AppContextProvider;
import defpackage.aano;
import defpackage.aanp;
import defpackage.aant;
import defpackage.adew;
import defpackage.adfy;
import defpackage.adjb;
import defpackage.adjd;
import defpackage.adjh;
import defpackage.adle;
import defpackage.adli;
import defpackage.adoq;
import defpackage.arka;
import defpackage.arke;
import defpackage.arxd;
import defpackage.asop;
import defpackage.asqh;
import defpackage.fkgl;
import defpackage.fkka;
import defpackage.fkml;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class StartAddAccountSessionController implements Controller {
    public static final Parcelable.Creator CREATOR = new adfy();
    private final Context a;
    private final aant b;
    private final AccountAuthenticatorResponse c;
    private final String d;
    private final boolean e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final arke i;
    private final String j;
    private final String k;
    private final String[] l;
    private final String m;
    private final String n;
    private final SupervisedAccountOptions o;
    private final boolean p;
    private final AppDescription q;
    private final boolean r;
    private boolean s;
    private String t;
    private String u;
    private String v;
    private String w;
    private boolean x;

    public StartAddAccountSessionController(AccountAuthenticatorResponse accountAuthenticatorResponse, String str, boolean z, boolean z2, boolean z3, arke arkeVar, String str2, String str3, String[] strArr, String str4, SupervisedAccountOptions supervisedAccountOptions, boolean z4, AppDescription appDescription, boolean z5) {
        this(accountAuthenticatorResponse, str, z, z2, false, z3, arkeVar, str2, str3, strArr, str4, null, false, false, null, null, null, null, supervisedAccountOptions, z4, appDescription, z5);
    }

    private final Intent c(String str) {
        boolean z = this.e;
        int i = true != z ? 4 : 0;
        boolean z2 = this.h;
        adjh adjhVar = adjh.c;
        Context context = this.a;
        return adjhVar.a(context, new adjd(z2, z, i, context.getString(R.string.common_login_error_title), str, this.i));
    }

    private final adle d() {
        AccountAuthenticatorResponse accountAuthenticatorResponse = this.c;
        if (accountAuthenticatorResponse != null) {
            accountAuthenticatorResponse.onError(4, "canceled");
        }
        return new adle(0, null, 0, null, R.anim.sud_slide_back_in, R.anim.sud_slide_back_out);
    }

    private final adle e() {
        AccountAuthenticatorResponse accountAuthenticatorResponse = this.c;
        if (accountAuthenticatorResponse != null) {
            accountAuthenticatorResponse.onError(4, "skipped or error");
        }
        return new adle(0, null, 1, null, R.anim.sud_slide_next_in, R.anim.sud_slide_next_out);
    }

    private final boolean f() {
        return !this.o.a.isEmpty();
    }

    private static boolean g() {
        return fkml.d() || fkml.c();
    }

    @Override // com.google.android.gms.auth.uiflows.controller.Controller
    public final adle a(adli adliVar) {
        if (adliVar == null) {
            if (!this.b.a()) {
                return new adle(19, c(this.a.getString(R.string.auth_error_no_network)), 0, null, -1, -1);
            }
            Context context = this.a;
            boolean z = this.h;
            boolean z2 = this.e;
            arke arkeVar = this.i;
            Intent b = arka.b(context, z, z2, arkeVar.a(), Bundle.EMPTY);
            if (b != null) {
                return new adle(0, WrapperControlledChimeraActivity.b(context, z, arkeVar, b), 0, null, -1, -1);
            }
            if (asqh.c() && this.o.c == 1) {
                r3 = 5;
            } else if (asqh.c() && this.o.c == 2) {
                r3 = 6;
            } else if (!f()) {
                r3 = 1;
            }
            adoq adoqVar = new adoq(context, r3);
            adoqVar.a = this.v;
            String str = this.d;
            adoqVar.b = str;
            adoqVar.b(arkeVar);
            return new adle(10, MinuteMaidChimeraActivity.o(context, str, z2, this.f, this.g, true, z, arkeVar, this.l, g() ? this.o : null, null, this.j, this.k, this.m, this.n, true, false, false, false, null, asop.c(fkka.b()) ? adew.a(context) : null, 0, adoqVar.a()), 0, null, -1, -1);
        }
        Intent intent = adliVar.c;
        aanp aanpVar = new aanp(intent != null ? intent.getExtras() : new Bundle());
        int i = adliVar.a;
        if (i == 0) {
            int i2 = adliVar.b;
            if (i2 == -1) {
                r3 = true != f() ? 1 : 2;
                Context context2 = this.a;
                adoq adoqVar2 = new adoq(context2, r3);
                adoqVar2.a = this.v;
                String str2 = this.d;
                adoqVar2.b = str2;
                arke arkeVar2 = this.i;
                adoqVar2.b(arkeVar2);
                return new adle(10, MinuteMaidChimeraActivity.o(context2, str2, this.e, this.f, this.g, true, this.h, arkeVar2, this.l, g() ? this.o : null, null, this.j, this.k, this.m, this.n, true, false, false, false, null, asop.c(fkka.b()) ? adew.a(context2) : null, 0, adoqVar2.a()), 0, null, -1, -1);
            }
            if (i2 == 0) {
                return d();
            }
            if (i2 == 1) {
                return new adle(19, c(this.a.getString(R.string.auth_error_generic_server_error)), 0, null, R.anim.sud_slide_next_in, R.anim.sud_slide_next_out);
            }
        } else if (i == 10) {
            int i3 = adliVar.b;
            if (i3 == -1) {
                this.t = (String) aanpVar.a(MinuteMaidChimeraActivity.h);
                this.u = (String) aanpVar.a(MinuteMaidChimeraActivity.i);
                this.v = (String) aanpVar.a(MinuteMaidChimeraActivity.j);
                this.w = (String) aanpVar.a(MinuteMaidChimeraActivity.k);
                this.x = ((Boolean) aanpVar.b(MinuteMaidChimeraActivity.l, false)).booleanValue();
                this.s = ((Boolean) aanpVar.b(adjb.e, false)).booleanValue();
                boolean z3 = fkgl.c() ? this.p : this.e;
                boolean z4 = this.h;
                arke arkeVar3 = this.i;
                String str3 = this.t;
                String str4 = this.u;
                boolean z5 = this.x;
                boolean z6 = this.s;
                String str5 = this.v;
                String str6 = this.d;
                boolean z7 = this.r;
                aano aanoVar = FinishSessionChimeraActivity.i;
                Bundle bundle = new Bundle();
                bundle.putBoolean(FinishSessionChimeraActivity.j.a, z3);
                bundle.putBoolean(FinishSessionChimeraActivity.k.a, z4);
                bundle.putParcelable(FinishSessionChimeraActivity.l.a, arkeVar3.a());
                bundle.putString(FinishSessionChimeraActivity.m.a, str3);
                bundle.putString(FinishSessionChimeraActivity.n.a, str4);
                bundle.putBoolean(FinishSessionChimeraActivity.o.a, z5);
                bundle.putBoolean(FinishSessionChimeraActivity.p.a, z6);
                bundle.putString(FinishSessionChimeraActivity.r.a, str6);
                bundle.putString(FinishSessionChimeraActivity.s.a, str5);
                bundle.putString(FinishSessionChimeraActivity.i.a, "finish_add_account_session_type");
                bundle.putBoolean(arka.a.a, z7);
                Bundle bundle2 = new Bundle();
                bundle2.putBundle("accountSessionBundle", bundle);
                bundle2.putString("password", this.w);
                if (asqh.c() && this.q.b == Process.myUid()) {
                    bundle2.putString("authAccount", this.v);
                    bundle2.putString(MinuteMaidChimeraActivity.i.a, this.u);
                }
                Intent putExtras = new Intent().putExtras(bundle2);
                AccountAuthenticatorResponse accountAuthenticatorResponse = this.c;
                if (accountAuthenticatorResponse != null) {
                    accountAuthenticatorResponse.onResult(bundle2);
                }
                return new adle(0, null, -1, putExtras, R.anim.sud_slide_next_in, R.anim.sud_slide_next_out);
            }
            if (i3 == 0) {
                return d();
            }
            if (i3 == 1) {
                return e();
            }
            if (i3 == 2) {
                String str7 = (String) aanpVar.a(MinuteMaidChimeraActivity.m);
                return new adle(19, str7 != null ? c(str7) : c(this.a.getString(R.string.auth_error_generic_server_error)), 0, null, R.anim.sud_slide_next_in, R.anim.sud_slide_next_out);
            }
        } else if (i == 19) {
            int i4 = adliVar.b;
            if (i4 == -1) {
                return e();
            }
            if (i4 == 0) {
                return d();
            }
        }
        throw new IllegalStateException(String.format("Result not handled with id %d and resultCode %d.", Integer.valueOf(i), Integer.valueOf(adliVar.b)));
    }

    @Override // com.google.android.gms.auth.uiflows.controller.Controller
    public final String b() {
        return "StartAddAccountSessionController";
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.c, 0);
        parcel.writeString(this.d);
        parcel.writeByte(this.e ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.g ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.h ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.i.a(), 0);
        parcel.writeString(this.j);
        parcel.writeString(this.k);
        parcel.writeStringArray(this.l);
        parcel.writeString(this.m);
        parcel.writeString(this.n);
        parcel.writeByte(this.s ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.x ? (byte) 1 : (byte) 0);
        parcel.writeString(this.t);
        parcel.writeString(this.u);
        parcel.writeString(this.v);
        parcel.writeString(this.w);
        parcel.writeByteArray(arxd.n(this.o));
        parcel.writeByte(this.p ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.q, 0);
        parcel.writeByte(this.r ? (byte) 1 : (byte) 0);
    }

    public StartAddAccountSessionController(AccountAuthenticatorResponse accountAuthenticatorResponse, String str, boolean z, boolean z2, boolean z3, boolean z4, arke arkeVar, String str2, String str3, String[] strArr, String str4, String str5, boolean z5, boolean z6, String str6, String str7, String str8, String str9, SupervisedAccountOptions supervisedAccountOptions, boolean z7, AppDescription appDescription, boolean z8) {
        aant aantVar = new aant(AppContextProvider.a());
        this.a = AppContextProvider.a();
        this.b = aantVar;
        this.c = accountAuthenticatorResponse;
        this.d = str;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.i = arkeVar;
        this.h = z4;
        this.j = str2;
        this.k = str3;
        this.l = strArr;
        this.m = str4;
        this.n = str5;
        this.s = z5;
        this.x = z6;
        this.t = str6;
        this.u = str7;
        this.v = str8;
        this.w = str9;
        this.o = supervisedAccountOptions;
        this.p = z7;
        this.q = appDescription;
        this.r = z8;
    }
}
