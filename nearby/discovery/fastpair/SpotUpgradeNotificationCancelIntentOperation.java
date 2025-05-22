package com.google.android.gms.nearby.discovery.fastpair;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.nearby.discovery.service.DiscoveryChimeraService;
import defpackage.chhz;
import defpackage.ciqy;
import defpackage.citr;
import defpackage.ekvl;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class SpotUpgradeNotificationCancelIntentOperation extends IntentOperation {
    private chhz a;

    public SpotUpgradeNotificationCancelIntentOperation() {
    }

    public static Intent a(Context context, String str) {
        Intent startIntent = IntentOperation.getStartIntent(context, SpotUpgradeNotificationCancelIntentOperation.class, "com.google.android.gms.nearby.discovery.fastpair.SPOT_UPGRADE_NOTIFICATION_CANCEL");
        ekvl.y(startIntent);
        return startIntent.putExtra("notification_id", citr.d).putExtra("tag", str);
    }

    @Override // android.content.ContextWrapper
    protected final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        if (this.a == null) {
            this.a = new chhz(context);
        }
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (intent == null || !Objects.equals(intent.getAction(), "com.google.android.gms.nearby.discovery.fastpair.SPOT_UPGRADE_NOTIFICATION_CANCEL")) {
            ciqy.a.g().B("SpotPairing - Unsupported intent: %s", intent);
            return;
        }
        if (!intent.hasExtra("notification_id")) {
            ciqy.a.g().x("SpotPairing - Missing notification ID to cancel.");
            return;
        }
        int intExtra = intent.getIntExtra("notification_id", 0);
        String stringExtra = intent.getStringExtra("tag");
        if (stringExtra == null) {
            ciqy.a.g().x("SpotPairing - Invalid notification tag to cancel.");
            return;
        }
        ciqy.a.d().x("SpotPairing - Canceling Upgrade to SPOT notification.");
        this.a.e(stringExtra, intExtra);
        if (intent.hasExtra("com.google.android.gms.nearby.discovery.EXTRA_ACCOUNT_KEY")) {
            startService(DiscoveryChimeraService.a(this).setAction("com.google.android.libraries.bluetooth.fastpair.fmd.ACTION_SPOT_UPGRADE_NOTIFICATION_DISMISSED").putExtra("com.google.android.gms.nearby.discovery.EXTRA_ACCOUNT_KEY", intent.getByteArrayExtra("com.google.android.gms.nearby.discovery.EXTRA_ACCOUNT_KEY")));
        }
    }

    SpotUpgradeNotificationCancelIntentOperation(chhz chhzVar) {
        this.a = chhzVar;
    }
}
