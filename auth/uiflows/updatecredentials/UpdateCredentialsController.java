package com.google.android.gms.auth.uiflows.updatecredentials;

import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.R;
import com.google.android.gms.auth.uiflows.addaccount.FinishSessionChimeraActivity;
import com.google.android.gms.auth.uiflows.common.UpdateCredentialsChimeraActivity;
import com.google.android.gms.auth.uiflows.controller.Controller;
import com.google.android.gms.auth.uiflows.minutemaid.MinuteMaidChimeraActivity;
import com.google.android.gms.chimera.modules.auth.account.base.AppContextProvider;
import defpackage.aano;
import defpackage.aanp;
import defpackage.aant;
import defpackage.adjd;
import defpackage.adjh;
import defpackage.adle;
import defpackage.adli;
import defpackage.adoq;
import defpackage.adpd;
import defpackage.arke;
import defpackage.asqh;
import defpackage.bqna;
import defpackage.fkih;
import defpackage.uqw;
import defpackage.vba;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class UpdateCredentialsController implements Controller {
    private final Context b;
    private final aant c;
    private final bqna d;
    private final AccountAuthenticatorResponse e;
    private final Account f;
    private String g;
    private String h;
    private final boolean i;
    private final arke j;
    private final boolean k;
    private String l;
    private static final aano a = new aano("token_handle");
    public static final Parcelable.Creator CREATOR = new adpd();

    public UpdateCredentialsController(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, arke arkeVar, boolean z) {
        this(accountAuthenticatorResponse, account, false, arkeVar, z, null, null, null);
    }

    private final adle c(int i, String str) {
        Intent putExtra = new Intent().putExtra("errorCode", i).putExtra("errorMessage", str);
        AccountAuthenticatorResponse accountAuthenticatorResponse = this.e;
        if (accountAuthenticatorResponse != null) {
            accountAuthenticatorResponse.onError(i, str);
        }
        return new adle(0, null, 0, putExtra, -1, -1);
    }

    @Override // com.google.android.gms.auth.uiflows.controller.Controller
    public final adle a(adli adliVar) {
        if (adliVar == null) {
            if (!this.c.a()) {
                Context context = this.b;
                return new adle(1001, adjh.c.a(context, new adjd(this.i, false, 0, context.getString(R.string.common_no_network), context.getString(R.string.auth_error_no_network), this.j)), 0, null, -1, -1);
            }
            if (TextUtils.isEmpty(fkih.d() ? ((uqw) uqw.a.b()).i(this.f) : this.d.c(this.f))) {
                Context context2 = this.b;
                Account account = this.f;
                boolean z = this.i;
                arke arkeVar = this.j;
                adoq adoqVar = new adoq(context2, 3);
                adoqVar.a = account.name;
                adoqVar.b = account.type;
                adoqVar.b(arkeVar);
                return new adle(10, MinuteMaidChimeraActivity.p(context2, account, z, arkeVar, adoqVar.a()), 0, null, -1, -1);
            }
            Context context3 = this.b;
            Account account2 = this.f;
            boolean z2 = this.i;
            arke arkeVar2 = this.j;
            adoq adoqVar2 = new adoq(context3, 4);
            adoqVar2.a = account2.name;
            adoqVar2.b = account2.type;
            adoqVar2.b(arkeVar2);
            return new adle(10, MinuteMaidChimeraActivity.q(context3, account2, z2, arkeVar2, adoqVar2.a()), 0, null, -1, -1);
        }
        int i = adliVar.a;
        if (i == 10) {
            int i2 = adliVar.b;
            if (i2 == -1) {
                aanp aanpVar = new aanp(adliVar.c.getExtras());
                this.h = (String) aanpVar.a(MinuteMaidChimeraActivity.h);
                String str = (String) aanpVar.a(MinuteMaidChimeraActivity.j);
                Account account3 = this.f;
                if (account3 != null && !TextUtils.isEmpty(str) && !account3.name.equalsIgnoreCase(str)) {
                    vba.w(7);
                }
                if (!this.k || !asqh.a()) {
                    return new adle(20, UpdateCredentialsChimeraActivity.j(this.b, account3, this.h, false, this.j), 0, null, 0, 0);
                }
                this.g = (String) aanpVar.a(MinuteMaidChimeraActivity.k);
                boolean z3 = this.i;
                arke arkeVar3 = this.j;
                String str2 = this.h;
                aano aanoVar = FinishSessionChimeraActivity.i;
                Bundle bundle = new Bundle();
                bundle.putBoolean(FinishSessionChimeraActivity.k.a, z3);
                bundle.putParcelable(FinishSessionChimeraActivity.l.a, arkeVar3.a());
                bundle.putString(FinishSessionChimeraActivity.m.a, str2);
                bundle.putParcelable(FinishSessionChimeraActivity.q.a, account3);
                bundle.putString(FinishSessionChimeraActivity.i.a, "finish_update_credentials_session_type");
                Bundle bundle2 = new Bundle();
                bundle2.putBundle("accountSessionBundle", bundle);
                bundle2.putString("password", this.g);
                Intent putExtras = new Intent().putExtras(bundle2);
                AccountAuthenticatorResponse accountAuthenticatorResponse = this.e;
                if (accountAuthenticatorResponse != null) {
                    accountAuthenticatorResponse.onResult(bundle2);
                }
                return new adle(0, null, -1, putExtras, -1, -1);
            }
            if (i2 == 0) {
                return c(4, "user canceled");
            }
            if (i2 == 2) {
                return c(5, "something went wrong");
            }
        } else if (i == 20) {
            int i3 = adliVar.b;
            if (i3 == -1) {
                Intent intent = adliVar.c;
                if (intent != null) {
                    this.l = (String) new aanp(intent.getExtras()).a(a);
                }
                Bundle bundle3 = new Bundle();
                Account account4 = this.f;
                bundle3.putString("authAccount", account4.name);
                bundle3.putString("accountType", account4.type);
                String str3 = this.l;
                if (str3 != null) {
                    bundle3.putString("accountStatusToken", str3);
                }
                AccountAuthenticatorResponse accountAuthenticatorResponse2 = this.e;
                if (accountAuthenticatorResponse2 != null) {
                    accountAuthenticatorResponse2.onResult(bundle3);
                }
                return new adle(0, null, -1, new Intent().putExtras(bundle3), -1, -1);
            }
            if (i3 == 0) {
                return c(5, "something went wrong");
            }
        } else if (i == 1001) {
            return c(3, "no network");
        }
        throw new IllegalStateException(String.format("Result not handled with id %d and resultCode %d.", Integer.valueOf(i), Integer.valueOf(adliVar.b)));
    }

    @Override // com.google.android.gms.auth.uiflows.controller.Controller
    public final String b() {
        return "UpdateCredentialsController";
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.e, 0);
        parcel.writeParcelable(this.f, 0);
        parcel.writeByte(this.i ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.j.a(), 0);
        parcel.writeByte(this.k ? (byte) 1 : (byte) 0);
        parcel.writeString(this.h);
        parcel.writeString(this.g);
        parcel.writeString(this.l);
    }

    public UpdateCredentialsController(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, boolean z, arke arkeVar, boolean z2, String str, String str2, String str3) {
        aant aantVar = new aant(AppContextProvider.a());
        bqna b = bqna.b(AppContextProvider.a());
        this.b = AppContextProvider.a();
        this.c = aantVar;
        this.d = b;
        this.e = accountAuthenticatorResponse;
        this.f = account;
        this.i = z;
        this.j = arkeVar;
        this.k = z2;
        this.h = str;
        this.g = str2;
        this.l = str3;
    }
}
