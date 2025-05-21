package com.google.android.gms.auth.uiflows.removeaccount;

import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.auth.uiflows.addaccount.WrapperControlledChimeraActivity;
import com.google.android.gms.auth.uiflows.controller.Controller;
import com.google.android.gms.chimera.modules.auth.account.base.AppContextProvider;
import defpackage.adle;
import defpackage.adli;
import defpackage.adpb;
import defpackage.arka;
import defpackage.arxo;
import defpackage.asnd;
import defpackage.fkio;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class GetAccountRemovalAllowedController implements Controller {
    public static final Parcelable.Creator CREATOR = new adpb();
    private final Context a = AppContextProvider.a();
    private final AccountAuthenticatorResponse b;
    private final Account c;
    private final boolean d;
    private final String e;

    public GetAccountRemovalAllowedController(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, boolean z, String str) {
        this.b = accountAuthenticatorResponse;
        this.c = account;
        this.d = z;
        this.e = str;
    }

    private final adle c(boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("booleanResult", z);
        if (!z) {
            Log.w("Auth", String.format(Locale.US, "[RemoveAccount, GetAccountRemovalAllowedController] account removal is forbidden.", new Object[0]));
        }
        AccountAuthenticatorResponse accountAuthenticatorResponse = this.b;
        if (accountAuthenticatorResponse != null) {
            accountAuthenticatorResponse.onResult(bundle);
        }
        return new adle(0, null, -1, new Intent().putExtras(bundle), -1, -1);
    }

    private final adle d() {
        boolean z = true;
        if (!this.d) {
            return c(true);
        }
        if (fkio.c()) {
            Context context = this.a;
            if (asnd.h(context, context.getPackageName()).size() != 1) {
                z = false;
            }
        }
        Context context2 = this.a;
        String str = this.e;
        arxo arxoVar = ConfirmAccountDeletionChimeraActivity.h;
        return new adle(20, new Intent().setClassName(context2, "com.google.android.gms.auth.login.ConfirmAccountDeletionActivity").putExtra("caller", str).putExtra("isLastAccount", z), 0, null, -1, -1);
    }

    @Override // com.google.android.gms.auth.uiflows.controller.Controller
    public final adle a(adli adliVar) {
        if (adliVar == null) {
            Context context = this.a;
            Intent a = arka.a(context, this.c);
            return a != null ? new adle(10, WrapperControlledChimeraActivity.b(context, false, null, a), 0, null, -1, -1) : d();
        }
        int i = adliVar.a;
        if (i == 10) {
            int i2 = adliVar.b;
            if (i2 == -1) {
                return d();
            }
            if (i2 == 0) {
                return c(false);
            }
        } else if (i == 20) {
            int i3 = adliVar.b;
            if (i3 == -1) {
                return c(true);
            }
            if (i3 == 0) {
                return c(false);
            }
        }
        throw new IllegalStateException(String.format("Result not handled with id %d and resultCode %d.", Integer.valueOf(i), Integer.valueOf(adliVar.b)));
    }

    @Override // com.google.android.gms.auth.uiflows.controller.Controller
    public final String b() {
        return "GetAccountRemovalAllowedController";
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, 0);
        parcel.writeParcelable(this.c, 0);
        parcel.writeByte(this.d ? (byte) 1 : (byte) 0);
        parcel.writeString(this.e);
    }
}
