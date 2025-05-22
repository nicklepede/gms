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
import defpackage.acno;
import defpackage.acnp;
import defpackage.acnt;
import defpackage.afjk;
import defpackage.afjo;
import defpackage.afll;
import defpackage.aflp;
import defpackage.afox;
import defpackage.afpk;
import defpackage.atmt;
import defpackage.auub;
import defpackage.bsup;
import defpackage.fmyw;
import defpackage.wmv;
import defpackage.wxa;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class UpdateCredentialsController implements Controller {
    private final Context b;
    private final acnt c;
    private final bsup d;
    private final AccountAuthenticatorResponse e;
    private final Account f;
    private String g;
    private String h;
    private final boolean i;
    private final atmt j;
    private final boolean k;
    private String l;
    private static final acno a = new acno("token_handle");
    public static final Parcelable.Creator CREATOR = new afpk();

    public UpdateCredentialsController(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, atmt atmtVar, boolean z) {
        this(accountAuthenticatorResponse, account, false, atmtVar, z, null, null, null);
    }

    private final afll c(int i, String str) {
        Intent putExtra = new Intent().putExtra("errorCode", i).putExtra("errorMessage", str);
        AccountAuthenticatorResponse accountAuthenticatorResponse = this.e;
        if (accountAuthenticatorResponse != null) {
            accountAuthenticatorResponse.onError(i, str);
        }
        return new afll(0, null, 0, putExtra, -1, -1);
    }

    @Override // com.google.android.gms.auth.uiflows.controller.Controller
    public final afll a(aflp aflpVar) {
        if (aflpVar == null) {
            if (!this.c.a()) {
                Context context = this.b;
                return new afll(1001, afjo.c.a(context, new afjk(this.i, false, 0, context.getString(R.string.common_no_network), context.getString(R.string.auth_error_no_network), this.j)), 0, null, -1, -1);
            }
            if (TextUtils.isEmpty(fmyw.d() ? ((wmv) wmv.a.b()).i(this.f) : this.d.c(this.f))) {
                Context context2 = this.b;
                Account account = this.f;
                boolean z = this.i;
                atmt atmtVar = this.j;
                afox afoxVar = new afox(context2, 3);
                afoxVar.a = account.name;
                afoxVar.b = account.type;
                afoxVar.b(atmtVar);
                return new afll(10, MinuteMaidChimeraActivity.p(context2, account, z, atmtVar, afoxVar.a()), 0, null, -1, -1);
            }
            Context context3 = this.b;
            Account account2 = this.f;
            boolean z2 = this.i;
            atmt atmtVar2 = this.j;
            afox afoxVar2 = new afox(context3, 4);
            afoxVar2.a = account2.name;
            afoxVar2.b = account2.type;
            afoxVar2.b(atmtVar2);
            return new afll(10, MinuteMaidChimeraActivity.q(context3, account2, z2, atmtVar2, afoxVar2.a()), 0, null, -1, -1);
        }
        int i = aflpVar.a;
        if (i == 10) {
            int i2 = aflpVar.b;
            if (i2 == -1) {
                acnp acnpVar = new acnp(aflpVar.c.getExtras());
                this.h = (String) acnpVar.a(MinuteMaidChimeraActivity.h);
                String str = (String) acnpVar.a(MinuteMaidChimeraActivity.j);
                Account account3 = this.f;
                if (account3 != null && !TextUtils.isEmpty(str) && !account3.name.equalsIgnoreCase(str)) {
                    wxa.w(7);
                }
                if (!this.k || !auub.a()) {
                    return new afll(20, UpdateCredentialsChimeraActivity.j(this.b, account3, this.h, false, this.j), 0, null, 0, 0);
                }
                this.g = (String) acnpVar.a(MinuteMaidChimeraActivity.k);
                boolean z3 = this.i;
                atmt atmtVar3 = this.j;
                String str2 = this.h;
                acno acnoVar = FinishSessionChimeraActivity.i;
                Bundle bundle = new Bundle();
                bundle.putBoolean(FinishSessionChimeraActivity.k.a, z3);
                bundle.putParcelable(FinishSessionChimeraActivity.l.a, atmtVar3.a());
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
                return new afll(0, null, -1, putExtras, -1, -1);
            }
            if (i2 == 0) {
                return c(4, "user canceled");
            }
            if (i2 == 2) {
                return c(5, "something went wrong");
            }
        } else if (i == 20) {
            int i3 = aflpVar.b;
            if (i3 == -1) {
                Intent intent = aflpVar.c;
                if (intent != null) {
                    this.l = (String) new acnp(intent.getExtras()).a(a);
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
                return new afll(0, null, -1, new Intent().putExtras(bundle3), -1, -1);
            }
            if (i3 == 0) {
                return c(5, "something went wrong");
            }
        } else if (i == 1001) {
            return c(3, "no network");
        }
        throw new IllegalStateException(String.format("Result not handled with id %d and resultCode %d.", Integer.valueOf(i), Integer.valueOf(aflpVar.b)));
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

    public UpdateCredentialsController(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, boolean z, atmt atmtVar, boolean z2, String str, String str2, String str3) {
        acnt acntVar = new acnt(AppContextProvider.a());
        bsup b = bsup.b(AppContextProvider.a());
        this.b = AppContextProvider.a();
        this.c = acntVar;
        this.d = b;
        this.e = accountAuthenticatorResponse;
        this.f = account;
        this.i = z;
        this.j = atmtVar;
        this.k = z2;
        this.h = str;
        this.g = str2;
        this.l = str3;
    }
}
