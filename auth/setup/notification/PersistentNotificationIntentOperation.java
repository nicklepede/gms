package com.google.android.gms.auth.setup.notification;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.chimera.modules.auth.account.base.AppContextProvider;
import defpackage.afdu;
import defpackage.afdv;
import defpackage.aued;
import defpackage.auid;
import defpackage.aumn;
import defpackage.ausn;
import defpackage.eluo;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
@Deprecated
/* loaded from: classes2.dex */
public class PersistentNotificationIntentOperation extends IntentOperation {
    public static final /* synthetic */ int a = 0;
    private static final String b = "PersistentNotificationIntentOperation";
    private static final ausn c = ausn.b(b, auid.AUTH_ACCOUNT_DATA);

    private static afdu a(Context context) {
        return new afdu(aued.f(context), new aumn(context));
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        char c2;
        String action = intent.getAction();
        int hashCode = action.hashCode();
        if (hashCode != 798292259) {
            if (hashCode == 855344238 && action.equals("com.google.android.gms.auth.setup.notification.CANCEL")) {
                c2 = 1;
            }
            c2 = 65535;
        } else {
            if (action.equals("android.intent.action.BOOT_COMPLETED")) {
                c2 = 0;
            }
            c2 = 65535;
        }
        if (c2 != 0) {
            if (c2 != 1) {
                return;
            }
            if (intent.hasExtra("tag") || intent.hasExtra("id")) {
                a(this).b(intent.getStringExtra("tag"), intent.getIntExtra("id", 0));
                return;
            } else {
                ((eluo) c.j()).x("ACTION_CANCEL_NOTIFICATION intent found without tag or id.");
                return;
            }
        }
        afdu a2 = a(this);
        Map<String, ?> all = afdu.a().getAll();
        if (all.isEmpty()) {
            return;
        }
        LinkedList linkedList = new LinkedList();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String[] split = entry.getKey().split(":", 2);
            int intValue = Integer.valueOf(split[0]).intValue();
            String str = split[1];
            afdv c3 = afdv.c(AppContextProvider.a(), (String) entry.getValue());
            long currentTimeMillis = System.currentTimeMillis();
            long b2 = currentTimeMillis - c3.b();
            if (b2 > c3.a()) {
                ((eluo) afdu.a.h()).B("Not showing expired notification with tag: %s", str);
                linkedList.add(entry.getKey());
            } else {
                c3.l(currentTimeMillis);
                c3.k(c3.a() - b2);
                a2.c(str, intValue, c3);
            }
        }
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            String[] split2 = ((String) it.next()).split(":", 2);
            a2.b(split2[1], Integer.valueOf(split2[0]).intValue());
        }
    }
}
