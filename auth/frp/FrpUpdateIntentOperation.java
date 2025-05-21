package com.google.android.gms.auth.frp;

import android.accounts.Account;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.provider.Settings;
import android.text.TextUtils;
import com.google.android.chimera.IntentOperation;
import defpackage.aboc;
import defpackage.asnd;
import defpackage.asot;
import defpackage.asqh;
import defpackage.byhr;
import defpackage.ejhf;
import defpackage.ips;
import defpackage.uyi;
import defpackage.vbb;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class FrpUpdateIntentOperation extends IntentOperation {
    public static final asot a = vbb.b("FrpUpdateIntentOperation");
    private static final List b = Arrays.asList("com.google.android.gms.auth.GOOGLE_ACCOUNT_CHANGE", "com.google.android.gms.auth.FRP_CONFIG_CHANGED", "android.app.action.RESET_PROTECTION_POLICY_CHANGED", "android.intent.action.MAIN_USER_LOCKSCREEN_KNOWLEDGE_FACTOR_CHANGED");
    private uyi c;
    private aboc d;

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
        ((ejhf) a.j()).B("Received invalid intent action: %s", str);
        return false;
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        this.c = uyi.a(this);
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        List unmodifiableList;
        uyi uyiVar;
        List f;
        if (this.d == null) {
            this.d = new aboc(new byhr(getMainLooper()), getContentResolver(), Settings.Global.getUriFor("device_provisioned"), new CountDownLatch(1));
        }
        asot asotVar = a;
        ((ejhf) asotVar.h()).B("Intent received: %s", intent);
        if (!c(intent.getAction())) {
            ((ejhf) asotVar.j()).B("Invalid intent received: %s", intent);
            return;
        }
        if (!this.c.g()) {
            ((ejhf) asotVar.j()).x("FRP is not supported for this device / user");
            return;
        }
        if (!b(this)) {
            aboc abocVar = this.d;
            ContentResolver contentResolver = abocVar.a;
            Uri uri = abocVar.b;
            contentResolver.registerContentObserver(uri, true, abocVar);
            try {
                ((ejhf) asotVar.h()).B("Blocking wait for %s", String.valueOf(uri));
                abocVar.c.await();
            } catch (InterruptedException e) {
                ((ejhf) ((ejhf) a.i()).s(e)).x("Error waiting for content provider change");
            }
            abocVar.a.unregisterContentObserver(abocVar);
        }
        if (asqh.g() && (f = (uyiVar = this.c).f()) != null) {
            uyiVar.i(f);
            return;
        }
        List e2 = this.c.e();
        if (e2 != null) {
            if (!Objects.equals(intent.getAction(), "com.google.android.gms.auth.FRP_CONFIG_CHANGED")) {
                ((ejhf) a.h()).x("No need to update account challenges.");
                return;
            }
            ((ejhf) a.h()).x("Using app restriction data to update FRP challenges.");
            uyi uyiVar2 = this.c;
            int i = ips.a;
            uyiVar2.k(e2, false);
            return;
        }
        asot asotVar2 = a;
        ((ejhf) asotVar2.h()).x("No FRP data present in app restriction, using current Google accounts.");
        List h = asnd.h(this, getPackageName());
        uyi uyiVar3 = this.c;
        ArrayList arrayList = new ArrayList(h.size());
        Iterator it = h.iterator();
        while (true) {
            if (!it.hasNext()) {
                unmodifiableList = DesugarCollections.unmodifiableList(arrayList);
                break;
            }
            String d = this.c.d(((Account) it.next()).name);
            if (TextUtils.isEmpty(d)) {
                ((ejhf) asotVar2.i()).x("Critical error: found account with no accountId");
                unmodifiableList = Collections.EMPTY_LIST;
                break;
            }
            arrayList.add(d);
        }
        int i2 = ips.a;
        uyiVar3.k(unmodifiableList, true);
    }

    FrpUpdateIntentOperation(uyi uyiVar, aboc abocVar) {
        this.c = uyiVar;
        this.d = abocVar;
    }
}
