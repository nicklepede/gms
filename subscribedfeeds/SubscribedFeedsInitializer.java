package com.google.android.gms.subscribedfeeds;

import android.accounts.Account;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import defpackage.apzs;
import defpackage.athr;
import defpackage.auid;
import defpackage.aura;
import defpackage.ausn;
import defpackage.bsup;
import defpackage.dhgf;
import defpackage.dhgr;
import defpackage.eluo;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class SubscribedFeedsInitializer extends apzs {
    public static final ausn a = ausn.b("SubscribedFeeds", auid.SUBSCRIBED_FEEDS);

    private final boolean e(PackageManager packageManager, ComponentName componentName, boolean z) {
        int i = true != z ? 2 : 1;
        if (packageManager.getComponentEnabledSetting(componentName) == i) {
            return false;
        }
        ((eluo) ((eluo) a.h()).ai(11063)).N("Setting %s to %d", componentName, i);
        if (componentName.getPackageName().equals(athr.a().getPackageName())) {
            aura.L(componentName, i);
        } else {
            aura.I(this, componentName, i);
        }
        return true;
    }

    @Override // defpackage.apzs
    protected final void b(Intent intent, int i) {
        dhgr.a(this);
        boolean z = false;
        for (Account account : bsup.b(this).p("com.google")) {
            dhgf.c(this, account);
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
        if (((e(packageManager, componentName2, true) || (e(packageManager, componentName, true) | z)) || (i & 2) != 0) && dhgf.d()) {
            ContentResolver.requestSync(null, "subscribedfeeds", Bundle.EMPTY);
        }
    }
}
