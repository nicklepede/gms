package com.google.android.gms.checkin;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.chimera.IntentOperation;
import com.google.android.chimera.WakefulBroadcastReceiver;
import defpackage.anrr;
import defpackage.antd;
import defpackage.arxo;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class CheckinIntentOperation extends IntentOperation {
    private static final arxo a = antd.a("CheckinIntentOperation");

    /* JADX WARN: Removed duplicated region for block: B:19:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static void a(android.content.Context r18, boolean r19, int r20, boolean r21, boolean r22, android.content.Intent r23) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.checkin.CheckinIntentOperation.a(android.content.Context, boolean, int, boolean, boolean, android.content.Intent):void");
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        a.h("onHandleIntent, %s", intent);
        try {
            Bundle bundleExtra = intent.getBundleExtra("config_flags_bundle");
            if (bundleExtra == null) {
                bundleExtra = new Bundle();
            }
            new anrr(this, bundleExtra).a();
        } finally {
            WakefulBroadcastReceiver.completeWakefulIntent(intent);
        }
    }
}
