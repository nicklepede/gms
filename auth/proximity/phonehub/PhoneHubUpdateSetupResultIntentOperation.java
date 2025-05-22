package com.google.android.gms.auth.proximity.phonehub;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.auad;
import defpackage.eqgl;
import java.util.concurrent.ExecutionException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class PhoneHubUpdateSetupResultIntentOperation extends IntentOperation {
    public static final /* synthetic */ int a = 0;
    private static final auad b = new auad("ProximityAuth", "PhoneHubUpdateSetupResultIntentOperation");

    public static Intent a(String str, int i, int i2, String str2, boolean z, String str3) {
        Intent intent = new Intent();
        intent.putExtra("accountName", str);
        intent.putExtra("cameraRollResult", i);
        intent.putExtra("notificationResult", i2);
        intent.putExtra("deviceId", str2);
        intent.putExtra("setupCompleted", z);
        intent.putExtra("accountName", str);
        intent.putExtra("cdmAssociationId", str3);
        return intent;
    }

    private static final void b(eqgl eqglVar) {
        try {
            eqglVar.get();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            b.m("Thread interrupted while updating feature state.", new Object[0]);
        } catch (ExecutionException e) {
            b.n("Failed to update feature state.", e, new Object[0]);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0103  */
    @Override // com.google.android.chimera.IntentOperation
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onHandleIntent(android.content.Intent r12) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.proximity.phonehub.PhoneHubUpdateSetupResultIntentOperation.onHandleIntent(android.content.Intent):void");
    }
}
