package com.google.android.gms.auth.uiflows.addaccount;

import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.util.Log;
import com.google.android.gms.R;
import com.google.android.gms.auth.uiflows.controller.Controller;
import com.google.android.gms.chimera.modules.auth.account.base.AppContextProvider;
import defpackage.aano;
import defpackage.aanp;
import defpackage.aant;
import defpackage.adet;
import defpackage.adfw;
import defpackage.adik;
import defpackage.adin;
import defpackage.adjd;
import defpackage.adjh;
import defpackage.adle;
import defpackage.adli;
import defpackage.arka;
import defpackage.arke;
import defpackage.asnd;
import defpackage.fklx;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class FinishAddAccountSessionController implements Controller {
    private final Context b;
    private final aant c;
    private final AccountAuthenticatorResponse d;
    private final String e;
    private final boolean f;
    private final boolean g;
    private final arke h;
    private final String i;
    private final boolean j;
    private final String k;
    private final String l;
    private final boolean m;
    private final boolean n;
    private final String o;
    private final boolean p;
    private final boolean q;
    private final boolean r;
    private Account s;
    private String t;
    private boolean u;
    private boolean v;
    private boolean w;
    private String x;
    private final boolean y;
    private static final aano a = new aano("token_handle");
    public static final Parcelable.Creator CREATOR = new adet();

    public FinishAddAccountSessionController(AccountAuthenticatorResponse accountAuthenticatorResponse, String str, boolean z, boolean z2, arke arkeVar, String str2, String str3, String str4, boolean z3, boolean z4, String str5, boolean z5, boolean z6, boolean z7, Account account, String str6, boolean z8, boolean z9, boolean z10, String str7, boolean z11) {
        aant aantVar = new aant(AppContextProvider.a());
        boolean isOwner = Process.myUserHandle().isOwner();
        this.t = null;
        this.b = AppContextProvider.a();
        this.c = aantVar;
        this.d = accountAuthenticatorResponse;
        this.e = str;
        this.f = z;
        this.h = arkeVar;
        this.g = z2;
        this.i = str2;
        this.k = str3;
        this.l = str4;
        this.m = z3;
        this.j = isOwner;
        this.s = account;
        this.n = z4;
        this.o = str5;
        this.q = z5;
        this.p = z6;
        this.r = z7;
        this.t = str6;
        this.u = z8;
        this.v = z9;
        this.w = z10;
        this.x = str7;
        this.y = z11;
    }

    private final Intent c(String str) {
        boolean z = this.f;
        int i = true != z ? 4 : 0;
        boolean z2 = this.g;
        adjh adjhVar = adjh.c;
        Context context = this.b;
        return adjhVar.a(context, new adjd(z2, z, i, context.getString(R.string.common_login_error_title), str, this.h));
    }

    private final adle d() {
        if (!this.u) {
            Context context = this.b;
            Account account = this.s;
            boolean z = this.n;
            boolean z2 = this.f;
            boolean z3 = this.g;
            boolean z4 = this.r;
            arke arkeVar = this.h;
            Intent a2 = adfw.a(context, account, z, z2, z3, z4, arkeVar);
            if (a2 != null) {
                return new adle(30, WrapperControlledChimeraActivity.b(context, z3, arkeVar, a2), 0, null, android.R.anim.fade_in, android.R.anim.fade_out);
            }
        }
        return e();
    }

    private final adle e() {
        if (arka.f(this.t)) {
            Context context = this.b;
            Account account = this.s;
            boolean z = this.f;
            boolean z2 = this.g;
            arke arkeVar = this.h;
            boolean z3 = this.p;
            String str = this.o;
            boolean z4 = this.j;
            Intent c = arka.c(context, account, z, z2, arkeVar.a(), z3, str, z4, this.t, this.w, 0, Bundle.EMPTY, this.y);
            if (c != null) {
                return new adle(40, WrapperControlledChimeraActivity.b(context, z2, arkeVar, c), 0, null, R.anim.sud_slide_next_in, R.anim.sud_slide_next_out);
            }
        }
        return h(4);
    }

    private final adle f() {
        AccountAuthenticatorResponse accountAuthenticatorResponse = this.d;
        if (accountAuthenticatorResponse != null) {
            accountAuthenticatorResponse.onError(4, "canceled or skipped");
        }
        return new adle(0, null, 0, null, R.anim.sud_slide_back_in, R.anim.sud_slide_back_out);
    }

    private final adle g() {
        Bundle bundle = new Bundle();
        bundle.putString("authAccount", this.s.name);
        bundle.putString("accountType", this.s.type);
        bundle.putString("accountStatusToken", this.x);
        Intent putExtras = new Intent().putExtras(bundle);
        AccountAuthenticatorResponse accountAuthenticatorResponse = this.d;
        if (accountAuthenticatorResponse != null) {
            accountAuthenticatorResponse.onResult(bundle);
        }
        return new adle(0, null, -1, putExtras, R.anim.sud_slide_next_in, R.anim.sud_slide_next_out);
    }

    private final adle h(int i) {
        return this.v ? new adle(50, RemoveAccountChimeraActivity.l(this.b, this.s, i, this.g, this.h, this.w, true), 0, null, R.anim.sud_slide_next_in, R.anim.sud_slide_next_out) : g();
    }

    private static final boolean i() {
        if (Build.BRAND.toLowerCase(Locale.getDefault()).contains("google")) {
            return Build.PRODUCT.toLowerCase(Locale.getDefault()).contains("tangor") || Build.MODEL.toLowerCase(Locale.getDefault()).contains("tangor") || Build.MODEL.toLowerCase(Locale.getDefault()).contains("pixel tablet");
        }
        return false;
    }

    @Override // com.google.android.gms.auth.uiflows.controller.Controller
    public final adle a(adli adliVar) {
        if (adliVar == null) {
            if (!this.c.a()) {
                return new adle(70, c(this.b.getString(R.string.auth_error_no_network)), 0, null, -1, -1);
            }
            Log.w("Auth", String.format(Locale.US, "[AddAccount, FinishAddAccountSessionController] Triggering next action", new Object[0]));
            Context context = this.b;
            boolean z = this.g;
            arke arkeVar = this.h;
            boolean z2 = this.f;
            aano aanoVar = PreAddAccountChimeraActivity.h;
            Intent className = new Intent().setClassName(context, "com.google.android.gms.auth.uiflows.addaccount.PreAddAccountActivity");
            aanp x = PreAddAccountChimeraActivity.x(arkeVar, z);
            x.d(PreAddAccountChimeraActivity.i, Boolean.valueOf(z2));
            return new adle(10, className.putExtras(x.a), 0, null, -1, -1);
        }
        int i = adliVar.a;
        Locale locale = Locale.US;
        Integer valueOf = Integer.valueOf(i);
        int i2 = adliVar.b;
        Integer valueOf2 = Integer.valueOf(i2);
        Log.w("Auth", String.format(locale, "[AddAccount, FinishAddAccountSessionController] Result with id=%d and resultCode=%d", valueOf, valueOf2));
        Intent intent = adliVar.c;
        aanp aanpVar = new aanp(intent != null ? intent.getExtras() : new Bundle());
        if (i != 10) {
            if (i != 20) {
                if (i != 30) {
                    if (i == 40) {
                        if (i2 == -1) {
                            if (!arka.e(this.b)) {
                                return g();
                            }
                            Log.i("Auth", String.format(Locale.US, "[AddAccount, FinishAddAccountSessionController] Device was provisioned by Device Management. Finishing SUW.", new Object[0]));
                            return g();
                        }
                        if (i2 == 2) {
                            return h(1);
                        }
                        if (i2 != 3) {
                            if (i2 == 5) {
                                return new adle(42, RemoveAccountChimeraActivity.l(this.b, this.s, 5, this.g, this.h, this.w, true), 0, null, R.anim.sud_slide_next_in, R.anim.sud_slide_next_out);
                            }
                            if (i2 != 6) {
                                return i2 != 8 ? i2 != 9 ? h(3) : new adle(42, RemoveAccountChimeraActivity.l(this.b, this.s, 6, this.g, this.h, this.w, true), 0, null, R.anim.sud_slide_next_in, R.anim.sud_slide_next_out) : h(4);
                            }
                        }
                        return h(2);
                    }
                    if (i == 42) {
                        return g();
                    }
                    if (i != 50) {
                        if (i != 60) {
                            if (i == 70) {
                                return f();
                            }
                        }
                    } else {
                        if (i2 == -1) {
                            return f();
                        }
                        if (i2 == 0) {
                            AccountAuthenticatorResponse accountAuthenticatorResponse = this.d;
                            if (accountAuthenticatorResponse != null) {
                                accountAuthenticatorResponse.onError(4, "skipped or error");
                            }
                            return new adle(0, null, 0, null, R.anim.sud_slide_next_in, R.anim.sud_slide_next_out);
                        }
                    }
                    return d();
                }
                if (i2 == -1) {
                    return e();
                }
                if (i2 == 0) {
                    return new adle(60, adin.c.a(this.b, new adik(this.g, this.h)), 0, null, R.anim.sud_slide_back_in, R.anim.sud_slide_back_out);
                }
            } else {
                if (i2 == -1) {
                    this.s = (Account) aanpVar.a(AddAccountChimeraActivity.h);
                    this.x = (String) aanpVar.a(a);
                    this.t = (String) aanpVar.a(AddAccountChimeraActivity.j);
                    this.w = ((Boolean) aanpVar.a(AddAccountChimeraActivity.l)).booleanValue();
                    if (arka.f(this.t)) {
                        this.v = AddAccountController.d(this.w);
                        this.u = AddAccountController.c(this.w);
                        AddAccountController.e(this.b, this.s);
                    }
                    return d();
                }
                if (i2 == 0) {
                    return f();
                }
                if (i2 == 2) {
                    if (fklx.d() && i()) {
                        if (asnd.m(this.b, new Account(this.i, "com.google"))) {
                            Log.w("Auth", String.format(Locale.US, "[AddAccount, FinishAddAccountSessionController] Skipping error because the account is already on the device", new Object[0]));
                            return f();
                        }
                        Log.w("Auth", String.format(Locale.US, "[AddAccount, FinishAddAccountSessionController] Account not in the device", new Object[0]));
                    }
                    Log.w("Auth", String.format(Locale.US, "[AddAccount, FinishAddAccountSessionController] Failed to add account. bypassDoubleAddAccountError=%s, isTangor=%s", Boolean.valueOf(fklx.d()), Boolean.valueOf(i())));
                    return new adle(70, c(this.b.getString(R.string.auth_error_generic_server_error)), 0, null, R.anim.sud_slide_next_in, R.anim.sud_slide_next_out);
                }
                if (i2 == 3 || i2 == 4) {
                    return new adle(70, c(this.b.getString(R.string.auth_error_generic_server_error)), 0, null, R.anim.sud_slide_next_in, R.anim.sud_slide_next_out);
                }
            }
        } else {
            if (i2 == -1) {
                return new adle(20, AddAccountChimeraActivity.b(this.b, this.e, this.f, this.k, this.l, this.i, this.m, false, this.g, false, this.h, false), 0, null, android.R.anim.fade_in, android.R.anim.fade_out);
            }
            if (i2 == 0) {
                return f();
            }
            if (i2 == 2) {
                return new adle(70, c(this.b.getString(R.string.auth_error_generic_server_error)), 0, null, android.R.anim.fade_in, android.R.anim.fade_out);
            }
        }
        throw new IllegalStateException(String.format("Result not handled with id %d and resultCode %d.", valueOf, valueOf2));
    }

    @Override // com.google.android.gms.auth.uiflows.controller.Controller
    public final String b() {
        return "FinishAddAccountSessionController";
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.d, 0);
        parcel.writeString(this.e);
        parcel.writeByte(this.f ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.g ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.h.a(), 0);
        parcel.writeString(this.i);
        parcel.writeString(this.k);
        parcel.writeString(this.l);
        parcel.writeByte(this.m ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.n ? (byte) 1 : (byte) 0);
        parcel.writeString(this.o);
        parcel.writeByte(this.q ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.p ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.r ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.s, 0);
        parcel.writeString(this.t);
        parcel.writeByte(this.u ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.v ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.w ? (byte) 1 : (byte) 0);
        parcel.writeString(this.x);
        parcel.writeByte(this.y ? (byte) 1 : (byte) 0);
    }
}
