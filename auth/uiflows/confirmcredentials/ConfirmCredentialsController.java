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
import defpackage.aant;
import defpackage.adjd;
import defpackage.adjh;
import defpackage.adkw;
import defpackage.adle;
import defpackage.adli;
import defpackage.adoq;
import defpackage.arke;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class ConfirmCredentialsController implements Controller {
    public static final Parcelable.Creator CREATOR = new adkw();
    private final Context a;
    private final aant b;
    private final AccountAuthenticatorResponse c;
    private final Account d;
    private final boolean e;
    private final arke f;

    public ConfirmCredentialsController(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, boolean z, arke arkeVar) {
        aant aantVar = new aant(AppContextProvider.a());
        this.a = AppContextProvider.a();
        this.b = aantVar;
        this.c = accountAuthenticatorResponse;
        this.d = account;
        this.e = z;
        this.f = arkeVar;
    }

    private final adle c(boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("booleanResult", z);
        AccountAuthenticatorResponse accountAuthenticatorResponse = this.c;
        if (accountAuthenticatorResponse != null) {
            accountAuthenticatorResponse.onResult(bundle);
        }
        return new adle(0, null, true != z ? 0 : -1, new Intent().putExtras(bundle), -1, -1);
    }

    private final adle d(int i, String str) {
        Intent putExtra = new Intent().putExtra("errorCode", i).putExtra("errorMessage", str);
        AccountAuthenticatorResponse accountAuthenticatorResponse = this.c;
        if (accountAuthenticatorResponse != null) {
            accountAuthenticatorResponse.onError(i, str);
        }
        return new adle(0, null, 0, putExtra, -1, -1);
    }

    @Override // com.google.android.gms.auth.uiflows.controller.Controller
    public final adle a(adli adliVar) {
        if (adliVar == null) {
            if (!this.b.a()) {
                Context context = this.a;
                return new adle(1001, adjh.c.a(context, new adjd(this.e, false, 0, context.getString(R.string.common_no_network), context.getString(R.string.auth_error_no_network), this.f)), 0, null, -1, -1);
            }
            Context context2 = this.a;
            adoq adoqVar = new adoq(context2, 4);
            Account account = this.d;
            adoqVar.a = account.name;
            adoqVar.b = account.type;
            arke arkeVar = this.f;
            adoqVar.b(arkeVar);
            return new adle(10, MinuteMaidChimeraActivity.q(context2, account, this.e, arkeVar, adoqVar.a()), 0, null, -1, -1);
        }
        int i = adliVar.a;
        if (i == 10) {
            int i2 = adliVar.b;
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
            throw new IllegalStateException(String.format("Result not handled with id %d and resultCode %d.", Integer.valueOf(i), Integer.valueOf(adliVar.b)));
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
