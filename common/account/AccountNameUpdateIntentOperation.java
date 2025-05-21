package com.google.android.gms.common.account;

import android.content.Intent;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.auth.AccountChangeEvent;
import defpackage.arni;
import defpackage.asnd;
import defpackage.unx;
import defpackage.uoh;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class AccountNameUpdateIntentOperation extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        arni e = asnd.e(this);
        SharedPreferences.Editor edit = e.edit();
        Map all = e.getAll();
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : all.entrySet()) {
            if (!((String) entry.getKey()).startsWith("x-client-auth:") && !((String) entry.getKey()).startsWith("selected_account_type:")) {
                Object value = entry.getValue();
                if (value instanceof String) {
                    String str = (String) value;
                    if (!TextUtils.isEmpty(str)) {
                        Set set = (Set) hashMap.get(str);
                        if (set == null) {
                            set = new HashSet();
                            hashMap.put(str, set);
                        }
                        set.add((String) entry.getKey());
                    }
                } else {
                    Log.e("AccountUtils", "Invalid account name: ".concat(String.valueOf(String.valueOf(value))));
                }
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            try {
                Iterator it = uoh.j(this, 0, (String) entry2.getKey()).iterator();
                while (true) {
                    if (it.hasNext()) {
                        AccountChangeEvent accountChangeEvent = (AccountChangeEvent) it.next();
                        if (accountChangeEvent.d == 4) {
                            String str2 = accountChangeEvent.f;
                            Iterator it2 = ((Set) entry2.getValue()).iterator();
                            while (it2.hasNext()) {
                                edit.putString((String) it2.next(), str2);
                            }
                        }
                    }
                }
            } catch (IOException unused) {
            } catch (unx unused2) {
            }
        }
        edit.commit();
    }
}
