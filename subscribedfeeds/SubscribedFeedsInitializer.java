package com.google.android.gms.subscribedfeeds;

import android.accounts.Account;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import defpackage.anya;
import defpackage.arfc;
import defpackage.asej;
import defpackage.asng;
import defpackage.asot;
import defpackage.bqna;
import defpackage.devc;
import defpackage.devo;
import defpackage.ejhf;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class SubscribedFeedsInitializer extends anya {
    public static final asot a = asot.b("SubscribedFeeds", asej.SUBSCRIBED_FEEDS);

    private final boolean e(PackageManager packageManager, ComponentName componentName, boolean z) {
        int i = true != z ? 2 : 1;
        if (packageManager.getComponentEnabledSetting(componentName) == i) {
            return false;
        }
        ((ejhf) ((ejhf) a.h()).ah(11060)).N("Setting %s to %d", componentName, i);
        if (componentName.getPackageName().equals(arfc.a().getPackageName())) {
            asng.L(componentName, i);
        } else {
            asng.I(this, componentName, i);
        }
        return true;
    }

    @Override // defpackage.anya
    protected final void b(Intent intent, int i) {
        devo.a(this);
        boolean z = false;
        for (Account account : bqna.b(this).p("com.google")) {
            devc.c(this, account);
        }
        PackageManager packageManager = getPackageManager();
        e(packageManager, new ComponentName(this, "com.google.android.gms.subscribedfeeds.GcmReceiverService"), true);
        e(packageManager, new ComponentName(this, "com.google.android.gms.subscribedfeeds.GmsSubscribedFeedsProvider"), true);
        ComponentName componentName = new ComponentName(this, "com.google.android.gms.subscribedfeeds.SyncService");
        ComponentName componentName2 = new ComponentName(this, "com.google.android.gms.subscribedfeeds.GmsFeedsSyncService");
        try {
            z = e(packageManager, new ComponentName("com.google.android.gsf", "com.google.android.gsf.subscribedfeeds.SubscribedFeedsSyncAdapterService"), false);
        } catch (IllegalArgumentException unused) {
        }
        if (((e(packageManager, componentName2, true) || (e(packageManager, componentName, true) | z)) || (i & 2) != 0) && devc.d()) {
            ContentResolver.requestSync(null, "subscribedfeeds", Bundle.EMPTY);
        }
    }
}
