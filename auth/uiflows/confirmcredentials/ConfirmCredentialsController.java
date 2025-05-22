package com.google.android.gms.auth.uiflows.confirmcredentials;

import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.R;
import com.google.android.gms.auth.uiflows.controller.Controller;
import com.google.android.gms.auth.uiflows.minutemaid.MinuteMaidChimeraActivity;
import com.google.android.gms.chimera.modules.auth.account.base.AppContextProvider;
import defpackage.acnt;
import defpackage.afjk;
import defpackage.afjo;
import defpackage.afld;
import defpackage.afll;
import defpackage.aflp;
import defpackage.afox;
import defpackage.atmt;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class ConfirmCredentialsController implements Controller {
    public static final Parcelable.Creator CREATOR = new afld();
    private final Context a;
    private final acnt b;
    private final AccountAuthenticatorResponse c;
    private final Account d;
    private final boolean e;
    private final atmt f;

    public ConfirmCredentialsController(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, boolean z, atmt atmtVar) {
        acnt acntVar = new acnt(AppContextProvider.a());
        this.a = AppContextProvider.a();
        this.b = acntVar;
        this.c = accountAuthenticatorResponse;
        this.d = account;
        this.e = z;
        this.f = atmtVar;
    }

    private final afll c(boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("booleanResult", z);
        AccountAuthenticatorResponse accountAuthenticatorResponse = this.c;
        if (accountAuthenticatorResponse != null) {
            accountAuthenticatorResponse.onResult(bundle);
        }
        return new afll(0, null, true != z ? 0 : -1, new Intent().putExtras(bundle), -1, -1);
    }

    private final afll d(int i, String str) {
        Intent putExtra = new Intent().putExtra("errorCode", i).putExtra("errorMessage", str);
        AccountAuthenticatorResponse accountAuthenticatorResponse = this.c;
        if (accountAuthenticatorResponse != null) {
            accountAuthenticatorResponse.onError(i, str);
        }
        return new afll(0, null, 0, putExtra, -1, -1);
    }

    @Override // com.google.android.gms.auth.uiflows.controller.Controller
    public final afll a(aflp aflpVar) {
        if (aflpVar == null) {
            if (!this.b.a()) {
                Context context = this.a;
                return new afll(1001, afjo.c.a(context, new afjk(this.e, false, 0, context.getString(R.string.common_no_network), context.getString(R.string.auth_error_no_network), this.f)), 0, null, -1, -1);
            }
            Context context2 = this.a;
            afox afoxVar = new afox(context2, 4);
            Account account = this.d;
            afoxVar.a = account.name;
            afoxVar.b = account.type;
            atmt atmtVar = this.f;
            afoxVar.b(atmtVar);
            return new afll(10, MinuteMaidChimeraActivity.q(context2, account, this.e, atmtVar, afoxVar.a()), 0, null, -1, -1);
        }
        int i = aflpVar.a;
        if (i == 10) {
            int i2 = aflpVar.b;
            if (i2 == -1) {
                return c(true);
            }
            if (i2 == 0) {
                return c(false);
            }
            if (i2 == 2) {
                return d(5, "something went wrong");
            }
        } else if (i != 1001) {
            throw new IllegalStateException(String.format("Result not handled with id %d and resultCode %d.", Integer.valueOf(i), Integer.valueOf(aflpVar.b)));
        }
        return d(3, "no network");
    }

    @Override // com.google.android.gms.auth.uiflows.controller.Controller
    public final String b() {
        return "ConfirmCredentialsController";
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.c, 0);
        parcel.writeParcelable(this.d, 0);
        parcel.writeByte(this.e ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.f.a(), 0);
    }
}
