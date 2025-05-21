package com.google.android.gms.nearby.discovery.fastpair;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.nearby.discovery.service.DiscoveryChimeraService;
import defpackage.cfao;
import defpackage.cgiv;
import defpackage.cglo;
import defpackage.eiig;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class SpotUpgradeNotificationCancelIntentOperation extends IntentOperation {
    private cfao a;

    public SpotUpgradeNotificationCancelIntentOperation() {
    }

    public static Intent a(Context context, String str) {
        Intent startIntent = IntentOperation.getStartIntent(context, SpotUpgradeNotificationCancelIntentOperation.class, "com.google.android.gms.nearby.discovery.fastpair.SPOT_UPGRADE_NOTIFICATION_CANCEL");
        eiig.x(startIntent);
        return startIntent.putExtra("notification_id", cglo.d).putExtra("tag", str);
    }

    @Override // android.content.ContextWrapper
    protected final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        if (this.a == null) {
            this.a = new cfao(context);
        }
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (intent == null || !Objects.equals(intent.getAction(), "com.google.android.gms.nearby.discovery.fastpair.SPOT_UPGRADE_NOTIFICATION_CANCEL")) {
            cgiv.a.g().B("SpotPairing - Unsupported intent: %s", intent);
            return;
        }
        if (!intent.hasExtra("notification_id")) {
            cgiv.a.g().x("SpotPairing - Missing notification ID to cancel.");
            return;
        }
        int intExtra = intent.getIntExtra("notification_id", 0);
        String stringExtra = intent.getStringExtra("tag");
        if (stringExtra == null) {
            cgiv.a.g().x("SpotPairing - Invalid notification tag to cancel.");
            return;
        }
        cgiv.a.d().x("SpotPairing - Canceling Upgrade to SPOT notification.");
        this.a.e(stringExtra, intExtra);
        if (intent.hasExtra("com.google.android.gms.nearby.discovery.EXTRA_ACCOUNT_KEY")) {
            startService(DiscoveryChimeraService.a(this).setAction("com.google.android.libraries.bluetooth.fastpair.fmd.ACTION_SPOT_UPGRADE_NOTIFICATION_DISMISSED").putExtra("com.google.android.gms.nearby.discovery.EXTRA_ACCOUNT_KEY", intent.getByteArrayExtra("com.google.android.gms.nearby.discovery.EXTRA_ACCOUNT_KEY")));
        }
    }

    SpotUpgradeNotificationCancelIntentOperation(cfao cfaoVar) {
        this.a = cfaoVar;
    }
}
