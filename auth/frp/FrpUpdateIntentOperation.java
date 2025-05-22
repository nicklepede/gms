package com.google.android.gms.auth.frp;

import android.accounts.Account;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.provider.Settings;
import android.text.TextUtils;
import com.google.android.chimera.IntentOperation;
import defpackage.adoc;
import defpackage.auqx;
import defpackage.ausn;
import defpackage.auub;
import defpackage.caqj;
import defpackage.eluo;
import defpackage.iri;
import defpackage.wui;
import defpackage.wxb;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class FrpUpdateIntentOperation extends IntentOperation {
    public static final ausn a = wxb.b("FrpUpdateIntentOperation");
    private static final List b = Arrays.asList("com.google.android.gms.auth.GOOGLE_ACCOUNT_CHANGE", "com.google.android.gms.auth.FRP_CONFIG_CHANGED", "android.app.action.RESET_PROTECTION_POLICY_CHANGED", "android.intent.action.MAIN_USER_LOCKSCREEN_KNOWLEDGE_FACTOR_CHANGED");
    private wui c;
    private adoc d;

    public FrpUpdateIntentOperation() {
    }

    public static synchronized void a(Context context, String str) {
        synchronized (FrpUpdateIntentOperation.class) {
            if (true == "android.intent.action.BOOT_COMPLETED".equals(str)) {
                str = "com.google.android.gms.auth.FRP_CONFIG_CHANGED";
            }
            Intent startIntent = c(str) ? IntentOperation.getStartIntent(context, FrpUpdateIntentOperation.class, str) : null;
            if (startIntent != null) {
                context.startService(startIntent);
            }
        }
    }

    public static boolean b(Context context) {
        return Settings.Global.getInt(context.getContentResolver(), "device_provisioned", 0) == 1;
    }

    private static boolean c(String str) {
        if (str != null && b.contains(str)) {
            return true;
        }
        ((eluo) a.j()).B("Received invalid intent action: %s", str);
        return false;
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        this.c = wui.a(this);
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        List unmodifiableList;
        wui wuiVar;
        List f;
        if (this.d == null) {
            this.d = new adoc(new caqj(getMainLooper()), getContentResolver(), Settings.Global.getUriFor("device_provisioned"), new CountDownLatch(1));
        }
        ausn ausnVar = a;
        ((eluo) ausnVar.h()).B("Intent received: %s", intent);
        if (!c(intent.getAction())) {
            ((eluo) ausnVar.j()).B("Invalid intent received: %s", intent);
            return;
        }
        if (!this.c.g()) {
            ((eluo) ausnVar.j()).x("FRP is not supported for this device / user");
            return;
        }
        if (!b(this)) {
            adoc adocVar = this.d;
            ContentResolver contentResolver = adocVar.a;
            Uri uri = adocVar.b;
            contentResolver.registerContentObserver(uri, true, adocVar);
            try {
                ((eluo) ausnVar.h()).B("Blocking wait for %s", String.valueOf(uri));
                adocVar.c.await();
            } catch (InterruptedException e) {
                ((eluo) ((eluo) a.i()).s(e)).x("Error waiting for content provider change");
            }
            adocVar.a.unregisterContentObserver(adocVar);
        }
        if (auub.g() && (f = (wuiVar = this.c).f()) != null) {
            wuiVar.i(f);
            return;
        }
        List e2 = this.c.e();
        if (e2 != null) {
            if (!Objects.equals(intent.getAction(), "com.google.android.gms.auth.FRP_CONFIG_CHANGED")) {
                ((eluo) a.h()).x("No need to update account challenges.");
                return;
            }
            ((eluo) a.h()).x("Using app restriction data to update FRP challenges.");
            wui wuiVar2 = this.c;
            int i = iri.a;
            wuiVar2.k(e2, false);
            return;
        }
        ausn ausnVar2 = a;
        ((eluo) ausnVar2.h()).x("No FRP data present in app restriction, using current Google accounts.");
        List h = auqx.h(this, getPackageName());
        wui wuiVar3 = this.c;
        ArrayList arrayList = new ArrayList(h.size());
        Iterator it = h.iterator();
        while (true) {
            if (!it.hasNext()) {
                unmodifiableList = DesugarCollections.unmodifiableList(arrayList);
                break;
            }
            String d = this.c.d(((Account) it.next()).name);
            if (TextUtils.isEmpty(d)) {
                ((eluo) ausnVar2.i()).x("Critical error: found account with no accountId");
                unmodifiableList = Collections.EMPTY_LIST;
                break;
            }
            arrayList.add(d);
        }
        int i2 = iri.a;
        wuiVar3.k(unmodifiableList, true);
    }

    FrpUpdateIntentOperation(wui wuiVar, adoc adocVar) {
        this.c = wuiVar;
        this.d = adocVar;
    }
}
