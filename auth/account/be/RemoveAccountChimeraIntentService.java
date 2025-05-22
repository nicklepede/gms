package com.google.android.gms.auth.account.be;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import com.google.android.gms.framework.tracing.wrapper.TracingIntentService;
import defpackage.ekvl;
import defpackage.wmz;
import defpackage.xca;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class RemoveAccountChimeraIntentService extends TracingIntentService {
    public RemoveAccountChimeraIntentService() {
        super("RemoveAccountIntentService");
    }

    public static Intent b(Context context, Account account) {
        Intent intent = new Intent();
        ekvl.y(context);
        return intent.setClassName(context, "com.google.android.gms.auth.account.be.RemoveAccountIntentService").putExtra("account", account).setData(Uri.parse("intent://com.google.android.gms.auth.account.be.RemoveAccountChimeraIntentService?accountName=".concat(String.valueOf(account.name))));
    }

    @Override // com.google.android.gms.framework.tracing.wrapper.TracingIntentService
    protected final void a(Intent intent) {
        Account account = (Account) intent.getParcelableExtra("account");
        if (account == null) {
            Log.wtf("Auth", String.format(Locale.US, "[RemoveAccountChimeraIntentService] account was not provided.", new Object[0]));
        } else {
            wmz.a(((xca) xca.a.b()).b, account);
        }
    }
}
