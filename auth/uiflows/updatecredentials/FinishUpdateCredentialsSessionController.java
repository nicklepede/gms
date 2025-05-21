package com.google.android.gms.auth.uiflows.updatecredentials;

import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.uiflows.common.UpdateCredentialsChimeraActivity;
import com.google.android.gms.auth.uiflows.controller.Controller;
import com.google.android.gms.chimera.modules.auth.account.base.AppContextProvider;
import defpackage.aano;
import defpackage.aanp;
import defpackage.aant;
import defpackage.adle;
import defpackage.adli;
import defpackage.adpc;
import defpackage.arke;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class FinishUpdateCredentialsSessionController implements Controller {
    private final Context b;
    private final aant c;
    private final AccountAuthenticatorResponse d;
    private final Account e;
    private final String f;
    private final boolean g;
    private final arke h;
    private String i;
    private static final aano a = new aano("token_handle");
    public static final Parcelable.Creator CREATOR = new adpc();

    public FinishUpdateCredentialsSessionController(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, boolean z, arke arkeVar, String str, String str2) {
        aant aantVar = new aant(AppContextProvider.a());
        this.b = AppContextProvider.a();
        this.c = aantVar;
        this.d = accountAuthenticatorResponse;
        this.e = account;
        this.g = z;
        this.h = arkeVar;
        this.f = str;
        this.i = str2;
    }

    private final adle c(int i, String str) {
        Intent putExtra = new Intent().putExtra("errorCode", i).putExtra("errorMessage", str);
        AccountAuthenticatorResponse accountAuthenticatorResponse = this.d;
        if (accountAuthenticatorResponse != null) {
            accountAuthenticatorResponse.onError(i, str);
        }
        return new adle(0, null, 0, putExtra, -1, -1);
    }

    @Override // com.google.android.gms.auth.uiflows.controller.Controller
    public final adle a(adli adliVar) {
        if (adliVar == null) {
            return !this.c.a() ? c(3, "no network") : new adle(10, UpdateCredentialsChimeraActivity.j(this.b, this.e, this.f, false, this.h), 0, null, 0, 0);
        }
        int i = adliVar.a;
        if (i == 10) {
            int i2 = adliVar.b;
            if (i2 == -1) {
                Intent intent = adliVar.c;
                if (intent != null) {
                    this.i = (String) new aanp(intent.getExtras()).a(a);
                }
                Bundle bundle = new Bundle();
                Account account = this.e;
                bundle.putString("authAccount", account.name);
                bundle.putString("accountType", account.type);
                bundle.putString("accountStatusToken", this.i);
                AccountAuthenticatorResponse accountAuthenticatorResponse = this.d;
                if (accountAuthenticatorResponse != null) {
                    accountAuthenticatorResponse.onResult(bundle);
                }
                return new adle(0, null, -1, new Intent().putExtras(bundle), -1, -1);
            }
            if (i2 == 0) {
                return c(5, "something went wrong");
            }
        }
        throw new IllegalStateException(String.format("Result not handled with id %d and resultCode %d.", Integer.valueOf(i), Integer.valueOf(adliVar.b)));
    }

    @Override // com.google.android.gms.auth.uiflows.controller.Controller
    public final String b() {
        return "FinishUpdateCredentialsSessionController";
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.d, 0);
        parcel.writeParcelable(this.e, 0);
        parcel.writeByte(this.g ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.h.a(), 0);
        parcel.writeString(this.f);
        parcel.writeString(this.i);
    }
}
