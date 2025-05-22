package com.google.android.gms.auth.account.be.legacy;

import android.accounts.Account;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.util.Log;
import com.google.android.chimera.ContentProvider;
import com.google.android.gms.chimera.modules.auth.account.base.AppContextProvider;
import defpackage.asxe;
import defpackage.auio;
import defpackage.auwq;
import defpackage.auwr;
import defpackage.bsup;
import defpackage.bsxr;
import defpackage.bsxv;
import defpackage.ekww;
import defpackage.eluo;
import defpackage.fmyw;
import defpackage.wmv;
import defpackage.wmy;
import defpackage.wwh;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class AccountChimeraContentProvider extends ContentProvider {
    private bsup a;
    private asxe b;

    @Override // com.google.android.chimera.ContentProvider
    public final Bundle call(String str, String str2, Bundle bundle) {
        Object obj;
        int length;
        int i;
        int callingUid = Binder.getCallingUid();
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            this.b.f(callingUid);
            Bundle bundle2 = new Bundle();
            String str3 = null;
            if (!"get_accounts".equals(str)) {
                if (!"clear_password".equals(str)) {
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                    throw new IllegalArgumentException(String.format("Unsupported method [%s]  or argument [%s] .", str, str2));
                }
                Account account = (Account) bundle.getParcelable("clear_password");
                Log.i("Auth", String.format(Locale.US, "[AccountChimeraContentProvider] Calling clearPassword on account by uid: %d", Integer.valueOf(callingUid)));
                if (fmyw.d()) {
                    wmv wmvVar = (wmv) wmv.a.b();
                    if (fmyw.g() && !wmvVar.r(account, null) && fmyw.f()) {
                        ((eluo) wmvVar.b.i()).x("Failed to clear LST in app data. Clearing password in AccountManager anyway.");
                        wmvVar.c.g(account);
                    }
                    if (!fmyw.f()) {
                        wmvVar.c.g(account);
                    }
                    obj = wmvVar.d.get();
                    ((wmy) obj).a(account);
                } else {
                    this.a.g(account);
                }
                return null;
            }
            auwq b = auwr.b(getContext());
            String[] n = b.n(callingUid);
            if (n != null && (length = n.length) != 0) {
                str3 = n[0];
                if (length != 1) {
                    int i2 = Integer.MAX_VALUE;
                    for (String str4 : n) {
                        try {
                            ApplicationInfo e = b.e(str4, 0);
                            if (e != null && (i = e.targetSdkVersion) < i2) {
                                str3 = str4;
                                i2 = i;
                            }
                        } catch (PackageManager.NameNotFoundException e2) {
                            e2.toString();
                        }
                    }
                }
            }
            bundle2.putParcelableArray("accounts", ((wwh) wwh.a.b()).f(callingUid) ? this.a.p(str2) : this.a.q(str2, str3));
            AppContextProvider.a();
            ekww ekwwVar = bsxv.a;
            bsxr.a(auio.AUTH_ACCOUNT_BASE_GET_ACCOUNTS);
            return bundle2;
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    @Override // com.google.android.chimera.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.chimera.ContentProvider
    public final String getType(Uri uri) {
        return "text/plain";
    }

    @Override // com.google.android.chimera.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.chimera.ContentProvider
    public final boolean onCreate() {
        Context context = getContext();
        asxe d = asxe.d(context);
        this.a = bsup.b(context);
        this.b = d;
        return true;
    }

    @Override // com.google.android.chimera.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.chimera.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }
}
