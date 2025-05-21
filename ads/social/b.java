package com.google.android.gms.ads.social;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import defpackage.fjwt;
import java.net.HttpCookie;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
final class b {
    public final SharedPreferences a;
    public final SharedPreferences b;
    private final Context c;

    public b(Context context) {
        this.c = context;
        this.a = context.getSharedPreferences("social.account_doritos", 0);
        this.b = context.getSharedPreferences("social.account_gaialess_doritos", 0);
    }

    final String a(String str, a aVar) {
        a aVar2 = a.GAIALESS_DORITOS;
        String string = aVar == aVar2 ? this.b.getString(str, null) : this.a.getString(str, null);
        if (string != null) {
            List<HttpCookie> parse = HttpCookie.parse(string);
            if (parse.size() == 1 && parse.get(0).getName().equals("DSID")) {
                HttpCookie httpCookie = parse.get(0);
                if (!httpCookie.hasExpired()) {
                    return httpCookie.toString();
                }
                if (aVar == aVar2) {
                    this.b.edit().remove(str).commit();
                } else {
                    this.a.edit().remove(str).commit();
                }
            }
        }
        return null;
    }

    final boolean b(Account[] accountArr) {
        for (Account account : accountArr) {
            String str = account.name;
            if (!TextUtils.isEmpty(str)) {
                if (fjwt.j()) {
                    boolean m = com.google.android.gms.ads.identifier.settings.b.c(this.c).m();
                    String a = a(str, a.DORITOS_WITH_GAIA);
                    String a2 = a(str, a.GAIALESS_DORITOS);
                    if (!m) {
                        if (!TextUtils.isEmpty(a) && !TextUtils.isEmpty(a2)) {
                        }
                        return true;
                    }
                    if (TextUtils.isEmpty(a2)) {
                        return true;
                    }
                } else if (TextUtils.isEmpty(a(str, a.DORITOS_WITH_GAIA))) {
                    return true;
                }
            }
        }
        return false;
    }
}
