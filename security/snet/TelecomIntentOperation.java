package com.google.android.gms.security.snet;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class TelecomIntentOperation extends IntentOperation {
    private TelecomTaskService a;
    private Context b;

    public TelecomIntentOperation() {
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        this.b = this;
        this.a = new TelecomTaskService(this.b);
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        String action = intent.getAction();
        if ("android.intent.action.BOOT_COMPLETED".equals(action) || IntentOperation.ACTION_NEW_MODULE.equals(action) || "com.google.android.gms.chimera.container.CONTAINER_UPDATED".equals(action) || "com.google.android.gms.phenotype.com.google.android.gms.security.COMMITTED".equals(action)) {
            TelecomTaskService.e(this.a.a);
        }
    }

    TelecomIntentOperation(Context context, TelecomTaskService telecomTaskService) {
        this.b = context;
        this.a = telecomTaskService;
    }
}
