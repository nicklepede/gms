package com.google.android.gms.nearby.discovery.fastpair;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.nearby.discovery.service.DiscoveryChimeraService;
import defpackage.chkb;
import defpackage.ciqy;
import defpackage.ftey;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class ValidatorIntentOperation extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        char c;
        chkb chkbVar = ciqy.a;
        chkbVar.f().B("FastPair: received validator intent %s", intent.getAction());
        String action = intent.getAction();
        if (action == null) {
            return;
        }
        int hashCode = action.hashCode();
        if (hashCode == -1121173732) {
            if (action.equals("com.google.android.gms.nearby.discovery.ACTION_VALIDATOR_SEND_EVENT_MESSAGE")) {
                c = 1;
            }
            c = 65535;
        } else if (hashCode != -867080949) {
            if (hashCode == 400507124 && action.equals("com.google.android.gms.nearby.discovery.ACTION_VALIDATOR_REQUEST_TEST_SERVICE_CONNECTION")) {
                c = 2;
            }
            c = 65535;
        } else {
            if (action.equals("com.google.android.gms.nearby.discovery.ACTION_VALIDATOR_PAIR")) {
                c = 0;
            }
            c = 65535;
        }
        if (c == 0) {
            startService(DiscoveryChimeraService.a(this).setAction("com.google.android.gms.nearby.discovery.ACTION_VALIDATOR_PAIR").putExtras(intent));
            return;
        }
        if (c == 1) {
            startService(DiscoveryChimeraService.a(this).setAction("com.google.android.gms.nearby.discovery.ACTION_VALIDATOR_SEND_EVENT_MESSAGE").putExtras(intent));
        } else if (c != 2) {
            chkbVar.g().B("FastPair: Invalid external intent, action=%s", action);
        } else if (ftey.an()) {
            startService(DiscoveryChimeraService.a(this).setAction("com.google.android.gms.nearby.discovery.ACTION_VALIDATOR_REQUEST_TEST_SERVICE_CONNECTION").putExtras(intent));
        }
    }
}
